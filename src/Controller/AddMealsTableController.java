package Controller;

import com.jfoenix.controls.JFXTextField;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.ToggleGroup;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.control.cell.TextFieldTableCell;
import javafx.stage.Stage;

import java.io.IOException;

public class AddMealsTableController {
    public RadioButton localRbt;
    public ToggleGroup meal;
    public RadioButton chinesesRbt;
    public RadioButton frenchRbt;
    public JFXTextField mealPlane;
    public JFXTextField price;
    public TableView tableView;
    public TableColumn mC;
    public TableColumn mP;
    public TableColumn pr;

    static ObservableList<Meals> meals= FXCollections.observableArrayList();

    public void initialize(){
        mC.setCellValueFactory(new PropertyValueFactory<>("catogary"));
        mP.setCellValueFactory(new PropertyValueFactory<>("plane"));
        pr.setCellValueFactory(new PropertyValueFactory<>("price"));

        tableView.setItems(AddMealsTableController.meals);

        tableView.setEditable(true);
        mC.setCellFactory(TextFieldTableCell.forTableColumn());
        mC.setOnEditCommit(new EventHandler<TableColumn.CellEditEvent>() {
            @Override
            public void handle(TableColumn.CellEditEvent event) {
                ((Meals)event.getTableView().getItems().get(event.getTablePosition().getRow())).setCatogary((String) event.getNewValue());
            }
        });

        mP.setCellFactory(TextFieldTableCell.forTableColumn());
        mP.setOnEditCommit(new EventHandler<TableColumn.CellEditEvent>() {
            @Override
            public void handle(TableColumn.CellEditEvent event) {
                ((Meals)event.getTableView().getItems().get(event.getTablePosition().getRow())).setPlane((String) event.getNewValue());
            }
        });

        pr.setCellFactory(TextFieldTableCell.forTableColumn());
        pr.setOnEditCommit(new EventHandler<TableColumn.CellEditEvent>() {
            @Override
            public void handle(TableColumn.CellEditEvent event) {
                ((Meals)event.getTableView().getItems().get(event.getTablePosition().getRow())).setPrice((String) event.getNewValue());
            }
        });

    }

    public void addOnAction(ActionEvent actionEvent) {
       String ml="Local Meals";
       if(chinesesRbt.isSelected()){
           ml="Chinese Meals";
       }else if(frenchRbt.isSelected()){
           ml="French Meals";
       }
       String mealsPlane=mealPlane.getText();
       String mealsPrice=price.getText();

       meals.add(new Meals(ml,mealsPlane,mealsPrice));



    }

    public void deleteOnAction(ActionEvent actionEvent) {
        int selectedId=tableView.getSelectionModel().getSelectedIndex();
        tableView.getItems().remove(selectedId);
    }

    public void BackOnAction(ActionEvent actionEvent) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("/View/UpdateMeal.fxml"));
        Stage stage= (Stage)((Node)actionEvent.getSource()).getScene().getWindow();
        Scene scene=new Scene(root);
        stage.setScene(scene);
        stage.show();

    }
}
