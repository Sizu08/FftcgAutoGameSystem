package menu;
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.Pane;
import javafx.fxml.FXMLLoader;
import java.util.ArrayList;
import fmodel.*;
import builder.*;


public class Main extends Application{
	
	public static Stage primaryStage;
	public static Pane mainMenu;
	
	@Override
	public void start(Stage primaryStage) {
		
		Main.primaryStage = primaryStage;
		
		try {
			
			BorderPane root = (BorderPane)FXMLLoader.load(getClass().getResource("Main.fxml"));
			Main.mainMenu = root;
			Scene scene = new Scene(root,1280,720);
			//scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			primaryStage.setScene(scene);
			primaryStage.show();
			
		} catch(Exception e) {
			
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		
		launch(args);
	}
	
	public void test() throws Exception{
		
		BorderPane root = (BorderPane)FXMLLoader.load(getClass().getResource("Builder.fxml"));
		primaryStage.getScene().setRoot(root);
	}
	
}