package Controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import org.omg.CORBA.DynAnyPackage.Invalid;

import java.io.IOException;

public class MainFormController {
    public TextField txtName;
    public PasswordField txtPassword;
    public Label labId;

    public void AdminOnClick(ActionEvent actionEvent) throws IOException {
        if(txtName.getText().equals("admin")&& txtPassword.getText().equals("1234")){
            Parent root = FXMLLoader.load(getClass().getResource("/View/AdminChack.fxml"));
            Stage stage= (Stage)((Node)actionEvent.getSource()).getScene().getWindow();
            Scene scene=new Scene(root);
            stage.setScene(scene);
            stage.show();
        }else {
            labId.setText("Username or Password invalid..!");
            txtName.setText("");
            txtPassword.setText("");
        }
    }

    public void ReceptionistOnClick(ActionEvent actionEvent) throws IOException {
        if(txtName.getText().equals("reception")&& txtPassword.getText().equals("5678")){
            Parent root = FXMLLoader.load(getClass().getResource("/View/Chack.fxml"));
            Stage stage= (Stage)((Node)actionEvent.getSource()).getScene().getWindow();
            Scene scene=new Scene(root);
            stage.setScene(scene);
            stage.show();
        }else{
            labId.setText("Username or Password invalid..!");
            txtName.setText("");
            txtPassword.setText("");
        }
    }

    public void PackagesOnClick(ActionEvent actionEvent) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("/View/Deatile.fxml"));
        Stage stage= (Stage)((Node)actionEvent.getSource()).getScene().getWindow();
        Scene scene=new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
}
