module top.wsxq2.dockerm {
    requires javafx.fxml;
    requires org.controlsfx.controls;
    requires java.net.http;
    requires com.google.gson;
    requires slf4j.api;


    opens top.wsxq2.dockerm.controller to javafx.fxml;

    exports top.wsxq2.dockerm;
    requires logback.classic;
    requires jcip.annotations;
    requires commons.lang3;
    requires org.apache.commons.io;
    requires java.prefs;
}