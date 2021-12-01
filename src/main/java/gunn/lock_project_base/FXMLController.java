package gunn.lock_project_base;

/*
Name; Gavin Gunn
Class; Grade 12 Com Studies
Date; 01/12/21
Assignment#; 3
Description; Lock controller
 */

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class FXMLController implements Initializable {

    @FXML
    private Label lblOut;

    @FXML
    private TextField txtC1;

    @FXML
    private TextField txtC2;

    @FXML
    private TextField txtC3;

    comboLock lock1 = new comboLock(5, 5, 5);

    @FXML
    void btnLock(ActionEvent event) {
        lock1.lock();

    }

    @FXML
    void btnOpen(ActionEvent event) {
        if (lock1.checkCombo(Integer.parseInt(txtC1.getText()), Integer.parseInt(txtC2.getText()), Integer.parseInt(txtC3.getText()))) {
            lblOut.setText("you are go to go it is unlocked");
        } else {
            lblOut.setText("wrong combo");
        }
    }

    @FXML
    void btnSetup(ActionEvent event) {
        lock1.setCombo(Integer.parseInt(txtC1.getText()), Integer.parseInt(txtC2.getText()), Integer.parseInt(txtC3.getText()));
    }

    @FXML
    void btnState(ActionEvent event) {
        lblOut.setText("" + lock1.isLocked());
    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }
}
