package Controller;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.control.cell.TextFieldTableCell;
import javafx.stage.Stage;

import java.io.IOException;

public class DataTableController {
    public TableColumn TableName;
    public TableColumn TableID;
    public TableColumn TableTelNo;
    public TableColumn TableAddress;
    public TableColumn TableEMail;
    public TableColumn TableMeals;
    public TableColumn TableRooms;
    public TableView tableView;

    public void initialize(){
        TableName.setCellValueFactory(new PropertyValueFactory<>("name"));
        TableID.setCellValueFactory(new PropertyValueFactory<>("ID"));
        TableTelNo.setCellValueFactory(new PropertyValueFactory<>("telNo"));
        TableAddress.setCellValueFactory(new PropertyValueFactory<>("address"));
        TableEMail.setCellValueFactory(new PropertyValueFactory<>("eMail"));
        TableMeals.setCellValueFactory(new PropertyValueFactory<>("meals"));
        TableRooms.setCellValueFactory(new PropertyValueFactory<>("room"));

        tableView.setItems(RegisterCoustomerController.coustomers);

        tableView.setEditable(true);
        TableName.setCellFactory(TextFieldTableCell.forTableColumn());
        TableName.setOnEditCommit(new EventHandler<TableColumn.CellEditEvent>() {
            @Override
            public void handle(TableColumn.CellEditEvent event) {
                ((Coustomer)event.getTableView().getItems().get(event.getTablePosition().getRow())).setName((String) event.getNewValue());
            }
        });
        TableID.setCellFactory(TextFieldTableCell.forTableColumn());
        TableID.setOnEditCommit(new EventHandler<TableColumn.CellEditEvent>() {
            @Override
            public void handle(TableColumn.CellEditEvent event) {
                ((Coustomer)event.getTableView().getItems().get(event.getTablePosition().getRow())).setID((String) event.getNewValue());
            }
        });
        TableTelNo.setCellFactory(TextFieldTableCell.forTableColumn());
        TableTelNo.setOnEditCommit(new EventHandler<TableColumn.CellEditEvent>() {
            @Override
            public void handle(TableColumn.CellEditEvent event) {
                ((Coustomer)event.getTableView().getItems().get(event.getTablePosition().getRow())).setTelNo((String) event.getNewValue());
            }
        });
        TableAddress.setCellFactory(TextFieldTableCell.forTableColumn());
        TableAddress.setOnEditCommit(new EventHandler<TableColumn.CellEditEvent>() {
            @Override
            public void handle(TableColumn.CellEditEvent event) {
                ((Coustomer)event.getTableView().getItems().get(event.getTablePosition().getRow())).setAddress((String) event.getNewValue());
            }
        });
        TableEMail.setCellFactory(TextFieldTableCell.forTableColumn());
        TableEMail.setOnEditCommit(new EventHandler<TableColumn.CellEditEvent>() {
            @Override
            public void handle(TableColumn.CellEditEvent event) {
                ((Coustomer)event.getTableView().getItems().get(event.getTablePosition().getRow())).seteMail((String) event.getNewValue());
            }
        });
        TableMeals.setCellFactory(TextFieldTableCell.forTableColumn());
        TableMeals.setOnEditCommit(new EventHandler<TableColumn.CellEditEvent>() {
            @Override
            public void handle(TableColumn.CellEditEvent event) {
                ((Coustomer)event.getTableView().getItems().get(event.getTablePosition().getRow())).setMeals((String) event.getNewValue());
            }
        });
        TableRooms.setCellFactory(TextFieldTableCell.forTableColumn());
        TableRooms.setOnEditCommit(new EventHandler<TableColumn.CellEditEvent>() {
            @Override
            public void handle(TableColumn.CellEditEvent event) {
                ((Coustomer)event.getTableView().getItems().get(event.getTablePosition().getRow())).setRoom((String) event.getNewValue());
            }
        });
    }

    public void deleteOnAction(ActionEvent actionEvent) {

        int selected=tableView.getSelectionModel().getSelectedIndex();
        tableView.getItems().remove(selected);
    }

    public void backOnAction(ActionEvent actionEvent) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("/View/RegisterCoustomer.fxml"));
        Stage stage= (Stage)((Node)actionEvent.getSource()).getScene().getWindow();
        Scene scene=new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    public void roomOnAction(ActionEvent actionEvent) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("/View/UpdateRoom.fxml"));
        Stage stage= (Stage)((Node)actionEvent.getSource()).getScene().getWindow();
        Scene scene=new Scene(root);
        stage.setScene(scene);
        stage.show();

    }

    public void mealsOnAction(ActionEvent actionEvent) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("/View/UpdateMeal.fxml"));
        Stage stage= (Stage)((Node)actionEvent.getSource()).getScene().getWindow();
        Scene scene=new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
}
