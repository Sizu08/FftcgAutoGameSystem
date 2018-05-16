package fmodel;

//import java.util.ArrayList;

public class Card {

	String name;
	String set;
	String number;
	String imagepath;
	int id;
	
	public Card(String _name, String _set, String _number, int _id){
		name = _name;
		set = _set;
		number = _number;
		id = _id;
		
		imagepath = "c:/resources/opus" + set + "/" + number + ".png";
		
	}
	
	public String toString(){
		return imagepath;
	}
	
}
