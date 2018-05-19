package fmodel;

import java.util.ArrayList;

public class Card {

	String name;
	String set;
	String number;
	int power;
	String job;
	Type type;
	Rarity rarity;
	public ArrayList<Category> categories;
	Element element;
	int cost;
	int id;
	
	public String imagepath;
	
	public Card(String _name, String _set, String _number, int _power, String _job, Type _type, Rarity _rarity, 
			ArrayList<Category> _categories, Element _element, int _cost, int _id){
		name = _name;
		set = _set;
		number = _number;
		power = _power;
		job = _job;
		type = _type;
		rarity = _rarity;
		categories = _categories;
		element = _element;
		cost = _cost;
		id = _id;
		
		imagepath = "c:/resources/opus" + set + "/" + number + ".png";
		
	}
	
	public String toString(){
		return name;
	}
	
}
