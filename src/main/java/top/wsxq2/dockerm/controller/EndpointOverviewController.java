package top.wsxq2.dockerm.controller;

import javafx.fxml.FXML;
import javafx.scene.text.Text;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import top.wsxq2.dockerm.model.portainer.Endpoint;
import top.wsxq2.dockerm.model.portainer.EndpointGroup;
import top.wsxq2.dockerm.model.portainer.EndpointSnapshot;
import top.wsxq2.dockerm.util.CallApiUtil;
import top.wsxq2.dockerm.util.DateUtil;

public class EndpointOverviewController {
    private final Logger logger = LoggerFactory.getLogger(getClass());
    @FXML
    private Text nameText;
    @FXML
    private Text statusText;
    @FXML
    private Text startTimeText;
    @FXML
    private Text groupText;
    @FXML
    private Text containersText;
    @FXML
    private Text runningContainersText;
    @FXML
    private Text stoppedContainersText;
    @FXML
    private Text volumesText;
    @FXML
    private Text imagesText;
    @FXML
    private Text dockerVersionText;
    @FXML
    private Text cpusText;
    @FXML
    private Text memoriesText;
    @FXML
    private Text tagsText;
    @FXML
    private Text urlText;
    @FXML
    private Text typeText;
    private CallApiUtil callApiUtil;

    public void init(CallApiUtil callApiUtil) {
        this.callApiUtil = callApiUtil;
    }

    public void setEndpoint(Endpoint endpoint) {
        assert endpoint != null;
//        logger.debug("endpoint:{}", endpoint);

        nameText.setText(endpoint.getName());
        statusText.setText(endpoint.getStatusString());

        EndpointSnapshot endpointSnapshot = endpoint.getSnapshots()[0];
        assert endpointSnapshot != null;
        startTimeText.setText(DateUtil.format(endpointSnapshot.getTime()));
        runningContainersText.setText(String.valueOf(endpointSnapshot.getRunningContainerCount()));
        stoppedContainersText.setText(String.valueOf(endpointSnapshot.getStoppedContainerCount()));
        containersText.setText(String.valueOf(endpointSnapshot.getRunningContainerCount() + endpointSnapshot.getStoppedContainerCount()));
        volumesText.setText(String.valueOf(endpointSnapshot.getVolumeCount()));
        imagesText.setText(String.valueOf(endpointSnapshot.getImageCount()));
        dockerVersionText.setText(endpointSnapshot.getDockerVersion());
        cpusText.setText(String.valueOf(endpointSnapshot.getTotalCPU()));
        memoriesText.setText(String.valueOf(endpointSnapshot.getTotalMemory()));

        EndpointGroup endpointGroup = callApiUtil.getDataItemById(EndpointGroup.class, endpoint.getGroupId());
        String name = (endpointGroup == null ? "" : endpointGroup.getName());
        groupText.setText(name);

        tagsText.setText(String.join(",", endpoint.getTags()));
        urlText.setText(endpoint.getURL());
        typeText.setText(endpoint.getTypeString());
    }


}
