package gunn.lock_project_base;

/*
Name; Gavin Gunn
Class; Grade 12 Com Studies
Date; 01/12/21
Assignment#; 3
Description; Lock controller
 */
import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
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

    @FXML
    private ListView lstBox;

    ArrayList<comboLock> list = new ArrayList();  //ArrayList of the custom object   //check

    void listUpdate() {
        //Updates the listBox
        lstBox.getItems().clear();  //clears the list each time so it can be reset from the arrayList
        for (int i = 0; i < list.size(); i++) {
            lstBox.getItems().add("Lock Number: " + i + " Locked: " + list.get(i).isLocked());  //adds each lock to the listbox with i being arraylist index
        }
    }

    @FXML
    void btnAdd(ActionEvent event) {
        list.add(new comboLock(Integer.parseInt(txtC1.getText()), Integer.parseInt(txtC2.getText()), Integer.parseInt(txtC3.getText())));
        listUpdate();
    }

    @FXML
    void btnLock(ActionEvent event) {
        int selectedIndex = lstBox.getSelectionModel().getSelectedIndex(); //gets the select spot from the listBox
        list.get(selectedIndex).lock();
        listUpdate();
    }

    @FXML
    void btnOpen(ActionEvent event) {
        int selectedIndex = lstBox.getSelectionModel().getSelectedIndex(); //gets the select spot from the listBox
        if (list.get(selectedIndex).checkCombo(Integer.parseInt(txtC1.getText()), Integer.parseInt(txtC2.getText()), Integer.parseInt(txtC3.getText()))) {
            lblOut.setText("you are good to go it is unlocked");
        } else {
            lblOut.setText("wrong combo");
        }
        listUpdate();
    }

    @FXML
    void btnSetup(ActionEvent event) {
        int selectedIndex = lstBox.getSelectionModel().getSelectedIndex(); //gets the select spot from the listBox
        list.get(selectedIndex).setCombo(Integer.parseInt(txtC1.getText()), Integer.parseInt(txtC2.getText()), Integer.parseInt(txtC3.getText()));
        listUpdate();
    }

    @FXML
    void btnState(ActionEvent event) {
        int selectedIndex = lstBox.getSelectionModel().getSelectedIndex();  //gets the select spot from the listBox
        lblOut.setText("" + list.get(selectedIndex).isLocked());
        listUpdate();
    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }
}
