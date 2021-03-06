package GUI;

import javafx.event.ActionEvent;
import java.net.URL;
import java.util.ResourceBundle;


import javafx.application.Platform;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.TextField;
import javafx.scene.control.TreeItem;
import javafx.scene.control.TreeView;

public class FXMLDocumentController  implements Initializable{
	
	@FXML
	ScreensControll er mycontroller;
	
	@FXML
	private Label label; 
	@FXML
	private ComboBox combo;
	
	@FXML
	private TextField text;
	
	@FXML
	private Button btn1;
	
	@FXML
	TreeView <String> treeview;
	
	TreeItem <String> root = new TreeItem<>("Json Store");
	
	
	ObservableList<String> listaCombo = FXCollections.observableArrayList();


	@FXML
	private void verItem(ActionEvent event) {
		String itemSeleccionado = combo.getValue().toString();
		text.setText(itemSeleccionado);
		
	}
	
	
	@FXML
	private void Exit(ActionEvent event) {
		Platform.exit();	
	}
	
	
	@FXML
	private void creaStore(ActionEvent event) {
		Parent VentanaCrear = FXMLLoader.load(getClass().getResource("/GUI/ScreenCrear.fxml"));
		Scene EscenaCrear = new Scene(VentanaCrear);
		
		primaryStage.setScene(scene);
		primaryStage.show();
		
	}
	
	@Override
	public void initialize(URL url, ResourceBundle rb) {
		TreeItem <String>  prueba = new TreeItem<>("Prueba");
		root.getChildren().add(prueba);
		treeview.setRoot(root);
		
		
		
		
		
	}

}
