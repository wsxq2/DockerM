package top.wsxq2.dockerm.model.portainer;

public class EndpointJobRequest {
    private final String image;
    private final String fileContent;

    public EndpointJobRequest(String image, String fileContent) {
        this.image = image;
        this.fileContent = fileContent;
    }

    public String getImage() {
        return image;
    }

    public String getFileContent() {
        return fileContent;
    }

    @Override
    public String toString() {
        return "EndpointJobRequest{" +
                "image='" + image + '\'' +
                ", fileContent='" + fileContent + '\'' +
                '}';
    }
}
