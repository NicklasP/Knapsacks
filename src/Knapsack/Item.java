package Knapsack;
import java.util.Random;

public class Item {
	
	private int value;
	private int weight;
	private Random randomGenerator = new Random();
	private int itemID;
	private static int itemIDCounter = 0;
	
	//Standard constructor with fields
	public Item(int value, int weight) {
		this.value = value;
		this.weight = weight;
		this.itemID = itemIDCounter;
		itemIDCounter++;
	}
	
	//Random item generator
	public Item() {
		this.value = 1 + randomGenerator.nextInt(9);
		this.weight = 1 + randomGenerator.nextInt(7);
		this.itemID = itemIDCounter;
		itemIDCounter++;
	}
	

	public float getDensity(){
		return (float)value/weight;
	}
	
	public int getValue() {
		return value;
	}
	public int getItemID() {
		return itemID;
	}
	public void setValue(int value) {
		this.value = value;
	}
	public int getWeight() {
		return weight;
	}
	public void setWeight(int weight) {
		this.weight = weight;
	}
}


