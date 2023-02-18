package Controller;


import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;

public class RegisterCoustomerController {
    public TextField Nametxt;
    public TextField IDtxt;
    public TextField Telephonetxt;
    public TextField Addresstxt;
    public TextField emailtxt;
    public TextField ChackInDay;
    public TextField ChackInTime;
    public TextField ChackOutDay;
    public TextField ChackOutTime;
    public RadioButton chineseMeales;
    public RadioButton locleMeales;
    public RadioButton frenchMeals;
    public ToggleGroup Meals;
    public RadioButton singleRoom;
    public RadioButton doubleRoom;
    public RadioButton tripleRoom;
    public RadioButton quadRoom;
    public ToggleGroup Rooms;

    static ObservableList<Coustomer> coustomers= FXCollections.observableArrayList();
    public void regiestationBackOnAction(ActionEvent actionEvent) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("/View/Chack.fxml"));
        Stage stage= (Stage)((Node)actionEvent.getSource()).getScene().getWindow();
        Scene scene=new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    public void ConFromOnAction(ActionEvent actionEvent) throws IOException {
        URL resource = getClass().getResource("/View/Successfull.fxml");
        Parent load = FXMLLoader.load(resource);
        Scene scene = new Scene(load);
        Stage stage = new Stage();
        stage.setScene(scene);
        stage.show();

        String name=Nametxt.getText();
        String ID = IDtxt.getText();
        String TelNo= Telephonetxt.getText();
        String address=Addresstxt.getText();
        String eMail= emailtxt.getText();
        String meals="French Meals";
        if(chineseMeales.isSelected()){
            meals="Chines Meals";
        }else if (locleMeales.isSelected()){
            meals="Local Meals";
        }
        String rooms="Single Room";
        if(doubleRoom.isSelected()){
            rooms="Double Room";
        }else if(tripleRoom.isSelected()){
            rooms="Triple Room";
        }else if(quadRoom.isSelected()){
            rooms="Quad Room";
        }
        coustomers.add(new Coustomer(name,ID,TelNo,address,eMail,meals,rooms));

    }

    public void logOutOnAction(ActionEvent actionEvent) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("/View/MainForm.fxml"));
        Stage stage= (Stage)((Node)actionEvent.getSource()).getScene().getWindow();
        Scene scene=new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    public void DataViewOnAction(ActionEvent actionEvent) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("/View/DataTable.fxml"));
        Stage stage= (Stage)((Node)actionEvent.getSource()).getScene().getWindow();
        Scene scene=new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
}
