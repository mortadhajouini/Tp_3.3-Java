package application;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Text;

public class AddBookControlor implements Initializable {

    @FXML
    private Button idaddtable;

    @FXML
    private Button idexporter;

    @FXML
    private GridPane idgrid;

    @FXML
    private Button idimporter;

    @FXML
    private Text idmail;

    @FXML
    private TextField idmaillabel;

    @FXML
    private Text idnom;

    @FXML
    private TextField idnomlabel;

    @FXML
    private Text idprenom;

    @FXML
    private TextField idprenomlabel;

    @FXML
    private Button idquitter;

    @FXML
    private Button idsupp;

    @FXML
    private TableView<Person> idtable;

    @FXML
    private TableColumn<Person, String> idtablemail;

    @FXML
    private TableColumn<Person, String> idtablenom;

    @FXML
    private TableColumn<Person, String> idtableprenom;
    
    private DataClass data;


	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		idtableprenom.setCellValueFactory(new PropertyValueFactory("prenom"));
		idtablenom.setCellValueFactory(new PropertyValueFactory("nom"));
		idtablemail.setCellValueFactory(new PropertyValueFactory("adresse"));	
        data= new DataClass();
        

 

	}
	@FXML
	public void addColumn(ActionEvent e) {
		idtable.getItems().add(new Person(idprenomlabel.getText(),idnomlabel.getText(),idmaillabel.getText()));
		
	}
	public void Del(ActionEvent e) {
		idtable.getItems().remove(idtable.getSelectionModel().getSelectedItem());
		
	}
	public void exit(ActionEvent e) {
		Platform.exit();		
	}
	public void Import(ActionEvent e) {
		for(Person p:data.getImportList())
    		idtable.getItems().add(p);
	}
	public void Export(ActionEvent e) {
		data.setexportList(idtable.getItems());
	}
	
}
