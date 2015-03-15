import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import java.awt.*;
	
public class sceneController implements Initializable  {
	@FXML //  fx:id="myButton"
	private Button myButton; // Value injected by FXMLLoader
	
	public static void main(String[] args) {
		
		System.out.println("Hello!");
	}

		@Override
		public void initialize(URL location, ResourceBundle resources) {
			// TODO Auto-generated method stub
			assert myButton != null : "fx:id=\"myButton\" was not injected: check your FXML file 'simple.fxml'.";

		    // initialize your logic here: all @FXML variables will have been injected
		}

		public void showGreeting(ActionEvent event){ 
			System.out.println("Hello!");
		}
}
