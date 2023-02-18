package Controller;

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

public class UpdateMealController {
    public TextField addMealsID;
    public RadioButton addLocalMeale;
    public RadioButton addChineseMeals;
    public RadioButton addFrenchMeals;
    public ToggleGroup meals;
    public TextField deleteMealID;
    public RadioButton deleteLocalMeal;
    public RadioButton deleteChineseMeal;
    public RadioButton deleteFrenchMeale;
    public ToggleGroup deleteMeals;

    public void mealsOkOnAction(ActionEvent actionEvent) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("/View/AdminChack.fxml"));
        Stage stage= (Stage)((Node)actionEvent.getSource()).getScene().getWindow();
        Scene scene=new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    public void addOnAction(ActionEvent actionEvent) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("/View/AddMealsTable.fxml"));
        Stage stage= (Stage)((Node)actionEvent.getSource()).getScene().getWindow();
        Scene scene=new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    public void editOnAction(ActionEvent actionEvent) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("/View/DataTable.fxml"));
        Stage stage= (Stage)((Node)actionEvent.getSource()).getScene().getWindow();
        Scene scene=new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    public void deleteOnAction(ActionEvent actionEvent) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("/View/DataTable.fxml"));
        Stage stage= (Stage)((Node)actionEvent.getSource()).getScene().getWindow();
        Scene scene=new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
}
