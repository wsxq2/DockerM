package top.wsxq2.dockerm.model.portainer;

import com.google.gson.annotations.SerializedName;

public class AuthenticateUserResponse {
    @SerializedName(value = "jwt")
    private final String jwt;

    public AuthenticateUserResponse(String jwt) {
        this.jwt = jwt;
    }

    public String getJwt() {
        return jwt;
    }

    @Override
    public String toString() {
        return "AuthenticateUserResponse{" +
                "jwt='" + jwt + '\'' +
                '}';
    }
}
