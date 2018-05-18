package builder;
import javafx.event.EventHandler;
import menu.Main;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.GridPane;
import javafx.fxml.FXML;
import java.io.FileInputStream;
import java.util.ArrayList;
import fmodel.*;


public class BuilderController {
	
	ArrayList<Card> cardList;
	
	@FXML
	GridPane cardGrid;
	
	@FXML
	private void test(){
		Main.primaryStage.getScene().setRoot(Main.mainMenu);
	}
	
	@FXML
	private void loadCardGrid(){
		
		initialize();
		
		try{
			
			FileInputStream input;
			input = new FileInputStream(cardList.get(0).imagepath);
			
			Image image = new Image(input);
			ImageView iview = new ImageView(image);
			iview.setFitHeight(150);
			iview.setPreserveRatio(true);
			
			FileInputStream input2;
			input2 = new FileInputStream(cardList.get(0).imagepath);
			
			Image image2 = new Image(input2);
			ImageView iview2 = new ImageView(image2);
			iview2.setFitHeight(150);
			iview2.setPreserveRatio(true);
			
			cardGrid.add(iview,0,0);
			cardGrid.add(iview2,1,0);
			
			iview.addEventFilter(MouseEvent.MOUSE_CLICKED, new EventHandler<MouseEvent>(){

				@Override
				public void handle(MouseEvent mouseEvent) {
					System.out.println("test");
				}
				
			});
			
			input.close();
			input2.close();
			
		}
		catch (Exception e){
			e.printStackTrace();
		}
	}

	public void initialize(){
		
		cardList = new ArrayList<>();
		cardList.add(new Card("Auron","1", "001", 1));
		cardList.add(new Card("Auron","1", "002", 2));
		cardList.add(new Card("Red Mage","1", "003", 3));
		cardList.add(new Card("Ifrit","1", "004", 4));
		cardList.add(new Card("Warrior of Light","1", "005", 5));
		cardList.add(new Card("Garland","1", "006", 6));
		cardList.add(new Card("Gadot","1", "008", 8));
		cardList.add(new Card("Ranger","1", "008", 8));
		cardList.add(new Card("Cloud","1", "009", 9));
		
		/*
		for(Card card:cardList){
			System.out.println(card);
		}*/
		
	}
}