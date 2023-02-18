package Controller;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.control.cell.TextFieldTableCell;
import javafx.stage.Stage;

import java.io.IOException;

public class AddRoomTableController {

    public TableView addRoomTable;
    public TableColumn room;
    public TableColumn price;
    public TextField roomName;
    public TextField roomPrice;


    static ObservableList<Room> rooms=FXCollections.observableArrayList();

    public void initialize(){
        room.setCellValueFactory(new PropertyValueFactory<>("Room"));
        price.setCellValueFactory(new PropertyValueFactory<>("Price"));

        addRoomTable.setItems(AddRoomTableController.rooms);

        addRoomTable.setEditable(true);
        room.setCellFactory(TextFieldTableCell.forTableColumn());
        room.setOnEditCommit(new EventHandler<TableColumn.CellEditEvent>() {
            @Override
            public void handle(TableColumn.CellEditEvent event) {
                ((Room)event.getTableView().getItems().get(event.getTablePosition().getRow())).setRoom((String) event.getNewValue());
            }
        });
        addRoomTable.setEditable(true);
        price.setCellFactory(TextFieldTableCell.forTableColumn());
        price.setOnEditCommit(new EventHandler<TableColumn.CellEditEvent>() {
            @Override
            public void handle(TableColumn.CellEditEvent event) {
                ((Room)event.getTableView().getItems().get(event.getTablePosition().getRow())).setPrice((String) event.getNewValue());
            }
        });
    }


   

    public void backOnAction(ActionEvent actionEvent) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("/View/UpdateRoom.fxml"));
        Stage stage= (Stage)((Node)actionEvent.getSource()).getScene().getWindow();
        Scene scene=new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    public void addOnAction(ActionEvent actionEvent) {
        String name =room.getText();
        String pr=price.getText();
        rooms.add(new Room(name,pr));


    }
}
