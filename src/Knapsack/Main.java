package Knapsack;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Random;

public class Main {
	private static ArrayList<Item> availableItems = new ArrayList<Item>();
	private static Random randomGenerator = new Random();
	private static Sack sack = new Sack();
	private static ArrayList<Sack> sackList = new ArrayList<Sack>();

	public static void main(String[] args) {
		generateItems();
		generateSacks();
		showItems();
		System.out.println();
		showSacks();
	}

	private static void generateItems() {
		int numberOfItems = 4 + randomGenerator.nextInt(3);
		for (int i = 0; i <= numberOfItems; i++) {
			Item item = new Item();			
			availableItems.add(item);
			
		}
		// Sort availableItems on density
		availableItems.sort(Item.ItemDensityComparator);
	}
	



	private static void showItems() {
		for (Item item : availableItems){
			System.out.println("ItemID : "+ item.getItemID()+  "  Value : "+ item.getValue() +" and weight : "+ item.getWeight() + 
					" and value/weight (density) : "+ String.format("%.3f", item.getDensity()) );
		}		
	}
		
	private static void generateSacks() {
		int numberOfSacks = 3;
		for (int i = 0; i < numberOfSacks; i++) {
			Sack sack = new Sack();		
			sackList.add(sack);
		}
	}
	

	private static void showSack() {
		System.out.println("Weight capacity : "+ sack.getCapacity() 
			+ " and weightLoaded : " + sack.getWeightLoaded()
			+ " and valueLoaded : "+  sack.getValueLoaded());
	}

	private static void showSacks() {
		int totalCapacity = 0;
		int totalWeight = 0;
		int totalValue = 0;

		for (Sack sack : sackList){
			System.out.println("SackID : "+ sack.getSackID() + "  Weight capacity : "+ sack.getCapacity() 
			+ " and weightLoaded : " + sack.getWeightLoaded()
			+ " and valueLoaded : "+  sack.getValueLoaded());
			totalCapacity +=sack.getCapacity(); 
			totalWeight +=sack.getWeightLoaded();
			totalValue +=sack.getValueLoaded();		
		}
		System.out.println("\nTotal weight capacity : "+ totalCapacity);
		System.out.println("Total weight packed : "+ totalWeight);
		System.out.println("Total value packed : "+ totalValue);
	}

}
