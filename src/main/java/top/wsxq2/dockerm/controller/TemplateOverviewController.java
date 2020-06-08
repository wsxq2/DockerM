package top.wsxq2.dockerm.controller;

import javafx.fxml.FXML;
import javafx.scene.image.ImageView;
import javafx.scene.text.Text;
import top.wsxq2.dockerm.model.portainer.Template;
import top.wsxq2.dockerm.util.StringUtil;

public class TemplateOverviewController {
    @FXML
    private Text titleT;
    @FXML
    private Text descriptionT;
    @FXML
    private Text categoriesT;

    @FXML
    private ImageView logoIV;

    public void setItem(Template template) {
//        System.out.println(template);
        titleT.setText(template.getTitle());
        descriptionT.setText(template.getDescription());
        categoriesT.setText(StringUtil.defaultIfEmpty(template.getCategories()));
//        logoIV.setImage(new Image(StringUtils.isEmpty(template.getLogo()) ? MainApp.class.getResource
//        ("/images/Docker" +
//                ".png").toExternalForm() :
//                template.getLogo()));
    }


}
