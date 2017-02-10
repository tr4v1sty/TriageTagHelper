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



}
