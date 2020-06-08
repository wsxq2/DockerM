package top.wsxq2.dockerm.model.portainer;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class TemplateRepository {
    @SerializedName("url")
    @Expose
    private final String url;
    @SerializedName("stackfile")
    @Expose
    private final String stackFile;

    public TemplateRepository(String URL, String stackfile) {
        this.url = URL;
        this.stackFile = stackfile;
    }

    public String getUrl() {
        return url;
    }

    public String getStackFile() {
        return stackFile;
    }

    @Override
    public String toString() {
        return "TemplateRepository{" +
                "URL='" + url + '\'' +
                ", stackfile='" + stackFile + '\'' +
                '}';
    }
}
