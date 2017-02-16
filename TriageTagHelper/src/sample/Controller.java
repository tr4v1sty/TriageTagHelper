package sample;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

public class Controller {

    @FXML
    Button chcHDbutton;
    @FXML
    Button secDeskButton;
    @FXML
    Button facilitiesButton;
    @FXML
    Button idmButton;
    @FXML
    Button deploymentButton;
    @FXML
    Button tableauButton;
    @FXML
    Button reverseLogistics;
    @FXML
    Button gstButton;

    @FXML
    Button corpInfraOpsButton;
    @FXML
    Button salesAppsButton;
    @FXML
    Button itAppsButton;
    @FXML
    Button avvcButton;

    @FXML
    Label tagLabel;

    public void handlechcHDbutton(){
        tagLabel.setText("helpdesk, servicedesk, CHC-HD, request or incident, cat, service offering (ex: IT Messaging - Corporate Email)");
    }
    public void handlesecDeskButton(){
        tagLabel.setText("Security Desk, IT Physec - XXXX, request or incident, location (NORCAL, AMER, LATAM, EMEA, APAC)");
    }
    public void handlefacilitiesButton(){
        tagLabel.setText("facilities, MPK, triage");
    }

    public void handleidmButton(){
        tagLabel.setText("Identity Management, Identity Management - XXXXX");
    }

    public void handledeploymentButton(){tagLabel.setText("deployment, itlogistics, and the building tag");}
    public void handletableauButton(){tagLabel.setText("nexus, nxs-access or nxs-support");}
    public void handlereverseLogisticsButton(){tagLabel.setText("reverse logistics, itlogistics");}
    public void handlegstButton(){tagLabel.setText("GST, print support");}

    public void handleCorpInfraOpsButton(){tagLabel.setText("CorpInfraOps");}
    public void handlesalesAppsButton(){tagLabel.setText("salesapps");}
    public void handleitAppsButton(){tagLabel.setText("itapps");}
    public void handleavvcButton(){tagLabel.setText("AV-VC");}
}
