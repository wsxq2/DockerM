package top.wsxq2.dockerm.model.docker.container;

public class Port {
    private String IP;
    private int privatePort;
    private int publicPort;
    private String type;

    public Port(String iP, int privatePort, int publicPort, String type) {
        this.IP = iP;
        this.privatePort = privatePort;
        this.publicPort = publicPort;
        this.type = type;
    }

    public String getIP() {
        return IP;
    }

    public int getPrivatePort() {
        return privatePort;
    }

    public int getPublicPort() {
        return publicPort;
    }

    public String getType() {
        return type;
    }

    @Override
    public String toString() {
        return "Port{" +
                "iP='" + IP + '\'' +
                ", privatePort=" + privatePort +
                ", publicPort=" + publicPort +
                ", type='" + type + '\'' +
                '}';
    }
}
