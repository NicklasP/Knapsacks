package Knapsack;
import java.util.ArrayList;
import java.util.Random;

public class Sack {
	private int sackID;
	private static int sackCounter;
	private int capacity = 0;
	private Random randomGenerator = new Random();
	private ArrayList<Item> contence = new ArrayList<Item>();

	public Sack() {
		this.capacity = 10 + randomGenerator.nextInt(15);
		this.sackID = sackCounter;
		sackCounter++;
	}

	public int getSackID() {
		return sackID;
	}

	public int getWeightLoaded() {
		int weight = 0;
		for (Item x : contence) {
			weight += x.getWeight();
		}
		return weight;
	}
	
	public int getValueLoaded() {
		int value = 0;
		for (Item x : contence) {
			value += x.getValue();
		}
		return value;
	}
	
	public int getCapacity() {
		return capacity;
	}
	
	
public boolean addItem(Item itm){
	boolean addOK = false;
	
	if((capacity - getWeightLoaded()) <= itm.getWeight()){
		contence.add(itm);
		addOK = true;
	}
	return addOK;
}
}


