package top.wsxq2.dockerm.controller;

import com.google.gson.JsonObject;
import javafx.fxml.FXML;
import javafx.scene.text.Text;
import org.apache.commons.io.FileUtils;


public class HostOverviewController extends RightControllerEndpoint {
    @FXML
    private Text hostnameT;
    @FXML
    private Text osInfoT;
    @FXML
    private Text kernelVersionT;
    @FXML
    private Text nCPUT;
    @FXML
    private Text nMemoryT;

    @FXML
    private Text versionT;
    @FXML
    private Text rootDirT;
    @FXML
    private Text storageDriverT;
    @FXML
    private Text loggingDriverT;
    @FXML
    private Text volumePluginsT;
    @FXML
    private Text networkPluginsT;

    @Override
    public void refresh() {
        JsonObject info = callApiUtil.getThingJODocker(endpointID, "info");
        hostnameT.setText(getValue(info, "Name"));
        osInfoT.setText(String.format("%s %s %s", getValue(info, "OSType"),
                getValue(info, "Architecture")
                , getValue(info, "OperatingSystem")));
        kernelVersionT.setText(getValue(info, "KernelVersion"));
        nCPUT.setText(getValue(info, "NCPU"));
        nMemoryT.setText(FileUtils.byteCountToDisplaySize(info.get("MemTotal").getAsLong()));

        storageDriverT.setText(getValue(info, "Driver"));
        loggingDriverT.setText(getValue(info, "LoggingDriver"));
        rootDirT.setText(getValue(info, "DockerRootDir"));
        volumePluginsT.setText(getValue2(info, "Plugins", "Volume"));
        networkPluginsT.setText(getValue2(info, "Plugins", "Network"));

        JsonObject version = callApiUtil.getThingJODocker(endpointID, "version");
        versionT.setText(String.format("%s (API: %s)", getValue(version, "Version"),
                getValue(version, "ApiVersion")));
    }

    private String getValue(JsonObject jsonObject, String key) {
        return jsonObject.get(key).toString().replace("\"", "");
    }

    private String getValue2(JsonObject jsonObject, String key1, String key2) {
        return jsonObject.getAsJsonObject(key1).get(key2).toString().replace("\"", "");
    }
}
