package javaFXApplication;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;

public class ViewController implements Initializable{

    @FXML
    private TableView<?> tabla;

    @FXML
    private TableColumn<?, ?> tabla_ID;

    @FXML
    private TableColumn<?, ?> Tabla_Vezeteknev;

    @FXML
    private TableColumn<?, ?> Tabla_Keresztnev;

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
    	
    }

}
