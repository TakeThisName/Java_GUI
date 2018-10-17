package javaFXApplication;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;

public class ViewController implements Initializable{

    @FXML
    private TableView<Szemely> tabla;

    @FXML
    private TableColumn<Szemely, Number> tabla_ID;

    @FXML
    private TableColumn<Szemely, String> Tabla_Vezeteknev;

    @FXML
    private TableColumn<Szemely, String> Tabla_Keresztnev;

    @FXML
    private TextField TextF_Keresztnev;

    @FXML
    private TextField TextF_Veznev;

    @FXML
    private TextField TextF_ID;

    @FXML
    private Button Button_Add;

    @FXML
    void Add_Button(ActionEvent event) {

    }
    
    @Override
    public void initialize(URL location, ResourceBundle resources) {
    	adat_Hozzaad();
    	tablazat_Letrehoz();
    }
    
    private ObservableList<Szemely> adat = FXCollections.observableArrayList();
    
    private void adat_Hozzaad() {
    	Szemely szemely1 = new Szemely(1, "Izé", "Izéke");
    	Szemely szemely2 = new Szemely(2, "Dodó", "Kacsa");
    	Szemely szemely3 = new Szemely(3, "B", "B");
    	
    	adat.add(szemely1);
    	adat.add(szemely2);
    	adat.add(szemely3);
    }
    
    private void tablazat_Letrehoz() {
    	tabla_ID.setCellValueFactory(cellaAdat -> cellaAdat.getValue().idProperty()); // case sensitivity !!!
    	Tabla_Vezeteknev.setCellValueFactory(cellaAdat -> cellaAdat.getValue().vezeteknevProperty());
    	Tabla_Keresztnev.setCellValueFactory(cellaAdat -> cellaAdat.getValue().keresztnevProperty());
    	tabla.setItems(adat);
    	
    	// tablazatVezeteknev.setCellValueFactory(new Cellback<TableColumn.CellDatra)
    }

}
