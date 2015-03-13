# LandscapingScreen
This is my IA for Comp Sci, I am having trouble creating the buttons. I am using Eclipse and linking Javafx Scene Builder to it. 
<?xml version="1.0" encoding="UTF-8"?>

<?import javafx.scene.control.*?>
<?import java.lang.*?>
<?import javafx.scene.layout.*?>

<AnchorPane maxHeight="-Infinity" maxWidth="-Infinity" minHeight="-Infinity" minWidth="-Infinity" prefHeight="306.0" prefWidth="453.0" xmlns="http://javafx.com/javafx/8" xmlns:fx="http://javafx.com/fxml/1" fx:controller="Scene.sceneController">
   <children>
      <CheckBox layoutX="212.0" layoutY="152.0" mnemonicParsing="false" text="Mulch " />
      <CheckBox layoutX="229.0" layoutY="176.0" mnemonicParsing="false" text="OPTION1" />
      <CheckBox layoutX="229.0" layoutY="193.0" mnemonicParsing="false" text="OPTION2" />
      <CheckBox layoutX="229.0" layoutY="210.0" mnemonicParsing="false" text="OPTION3" />
      <CheckBox layoutX="229.0" layoutY="227.0" mnemonicParsing="false" text="OPTION4" />
      <CheckBox layoutX="14.0" layoutY="158.0" mnemonicParsing="false" text="TREE" />
      <CheckBox layoutX="31.0" layoutY="175.0" mnemonicParsing="false" text="OPTION1" />
      <CheckBox layoutX="31.0" layoutY="244.0" mnemonicParsing="false" text="OPTION5" />
      <CheckBox layoutX="31.0" layoutY="192.0" mnemonicParsing="false" text="OPTION2" />
      <CheckBox layoutX="31.0" layoutY="209.0" mnemonicParsing="false" text="OPTION3" />
      <CheckBox layoutX="31.0" layoutY="227.0" mnemonicParsing="false" text="OPTION4" />
      <CheckBox layoutX="115.0" layoutY="155.0" mnemonicParsing="false" text="Flowers" />
      <CheckBox layoutX="132.0" layoutY="240.0" mnemonicParsing="false" text="OPTION5" />
      <CheckBox layoutX="132.0" layoutY="223.0" mnemonicParsing="false" text="OPTION4" />
      <CheckBox layoutX="132.0" layoutY="206.0" mnemonicParsing="false" text="OPTION3" />
      <CheckBox layoutX="132.0" layoutY="189.0" mnemonicParsing="false" text="OPTION2" />
      <CheckBox layoutX="132.0" layoutY="172.0" mnemonicParsing="false" text="OPTION1" />
      <CheckBox layoutX="328.0" layoutY="148.0" mnemonicParsing="false" text="Shrubs " />
      <CheckBox layoutX="354.0" layoutY="189.0" mnemonicParsing="false" text="OPTION2" />
      <CheckBox layoutX="354.0" layoutY="172.0" mnemonicParsing="false" text="OPTION1" />
      <CheckBox layoutX="354.0" layoutY="240.0" mnemonicParsing="false" text="OPTION5" />
      <CheckBox layoutX="354.0" layoutY="206.0" mnemonicParsing="false" text="OPTION3" />
      <CheckBox layoutX="354.0" layoutY="223.0" mnemonicParsing="false" text="OPTION4" />
      <TextField layoutX="70.0" layoutY="24.0" />
      <Label layoutX="31.0" layoutY="28.0" text="Budget" />
      <Button layoutX="89.0" layoutY="70.0" mnemonicParsing="false" onAction="#showGreeting" text="Button" />
   </children>
</AnchorPane>

//sceneController 
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
