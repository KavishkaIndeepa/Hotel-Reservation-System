package Controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;

public class SuccessfullController {

    public Label NameID;
    public Label PhoneNoID;
    public Label RoomID;
    public Label TokenID;
    public Label EmailID;


    public void OkOnAction(ActionEvent actionEvent) {
        Node node = (Node) actionEvent.getSource();
        Stage stage1 = (Stage) node.getScene().getWindow();
        stage1.close();


    }
}
