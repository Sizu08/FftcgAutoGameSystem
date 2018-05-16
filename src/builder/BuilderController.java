package builder;
import javafx.application.Application;
import javafx.stage.Stage;
import menu.Main;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.Pane;
import javafx.fxml.FXMLLoader;
import java.util.ArrayList;
import fmodel.*;


public class BuilderController {
	
	/*
	@Override
	public void start(Stage primaryStage) {
		try {
			//BorderPane root = (BorderPane)FXMLLoader.load(getClass().getResource("Builder.fxml"));
			//Scene scene = new Scene(root,1280,720);
			//scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			//primaryStage.setScene(scene);
			//primaryStage.show();
			
			
			
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	*/
	public void test(){
		Main.primaryStage.getScene().setRoot(Main.mainMenu);
	}
	/*
	public static void initialize(String[] args){
		
		ArrayList<Card> cardList = new ArrayList<>();
		cardList.add(new Card("Auron","1", "001", 1));
		cardList.add(new Card("Auron","1", "002", 2));
		cardList.add(new Card("Red Mage","1", "003", 3));
		cardList.add(new Card("Ifrit","1", "004", 4));
		cardList.add(new Card("Warrior of Light","1", "005", 5));
		
		launch(args);
		for(Card card:cardList){
			System.out.println(card);
		}
		
	}*/
}