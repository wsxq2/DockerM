
package top.wsxq2.dockerm.model.docker.container;


public class Ulimit {


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Ulimit.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        if (sb.charAt((sb.length() - 1)) == ',') {
            sb.setCharAt((sb.length() - 1), ']');
        } else {
            sb.append(']');
        }
        return sb.toString();
    }

}
