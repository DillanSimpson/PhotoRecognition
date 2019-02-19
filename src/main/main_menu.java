package main;

import javafx.application.*;
import javafx.stage.*;
import javafx.scene.*;
import javafx.scene.control.*;
import java.util.*;
import javafx.scene.layout.*;
import javafx.scene.text.*;


public class main_menu extends Application {

	
	public static void main(String args[]) {
		launch(args);
	}
	
	@Override
	public void start(Stage primaryStage) throws Exception {
		
		//Objects for inner scene
		StackPane stackpane = new StackPane();
		VBox vbox = new VBox();
		Text text = new Text();
		Button takepic = new Button();
		
		//Setters for stage/scene
		primaryStage.setTitle("Image Recognition");
		primaryStage.show();
		
		//Create Scene
		Scene scene = new Scene(stackpane, 500,700);
		primaryStage.setScene(scene);
		scene.getStylesheets().add("/FrontEnd/MainMenu.css");
		
		//Inside Scene Setters
		text.setText("Image Recognition");
		takepic.setText("Picture");
		takepic.setId("button");
		
		//Add to pane
		vbox.getChildren().add(text);
		vbox.getChildren().add(takepic);
		stackpane.getChildren().add(vbox);
		
		
		
	}

}
