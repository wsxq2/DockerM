#!/usr/bin/env bash
set -uo pipefail
IFS=$'\n\t'


set +x
shopt -s expand_aliases

alias httpc='http -b --pretty all'

PORTAINER_URL=":9000"
USERNAME="admin"
PASSWORD="TWNX31004"

AUTH="Authorization: Bearer $(httpc POST $PORTAINER_URL/api/auth Username="$USERNAME" Password="$PASSWORD" | sed -n -r 's/[ ]*"jwt": "(.*)"/\1/p')"

function invoke() {
    httpc ${1:-GET} $PORTAINER_URL/api/${2:-endpoints} "$AUTH"
}

function invokeDocker() {
    httpc ${1:-GET} $PORTAINER_URL/api/endpoints/1/docker/${2:-containers} "$AUTH"
}

function main() {
    declare -A paths=(['Container']='containers/json?all=1' ['Image']='images/json?all=1' ['Volume']='volumes' ['Network']='networks')
    for i in ${!paths[@]}; do
        dir="${i,}overview"
        if [[ ! -d $dir ]]; then
            mkdir $dir
        fi
        invokeDocker GET ${paths[$i]} | handle_s >${dir}/${i}Overview.json
    done
}

function handle_s() {
    input="${1:-$(</dev/stdin)}"
    spaces=$(echo "$input" | egrep -o '^\s+{$' | head -1)
    #echo ,$spaces,
    declare -i spaces_len=${#spaces}
    spaces="${spaces:0:$((spaces_len-1))}"

    echo -n "$input" | sed -r -n -e "/^$spaces\{$/,/^$spaces\}, $/{p};/^$spaces\}, $/q" |sed -r "s/$spaces//; s/^\}, $/}/"
    #sed -r -n -e '/^    \{$/,/^    \}, $/{p};/^    \}, $/q' |sed -r 's/^    //;s/^\}, $/}/'
}



function test_() {
    invokeDocker GET volumes |handle_s
}
#test_
main









