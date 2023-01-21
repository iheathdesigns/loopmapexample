import java.util.HashMap;
import java.util.Scanner;

public class CarDealerHW {

	public static void main(String[] args) {
		
			
		HashMap<String, String> carModels = new HashMap<>();
		
		carModels.put("AMG S 63", "Mercedes Benz");
		carModels.put("765", "McLaren");
		carModels.put("Aventador SVJ", "Lamborghini");
		carModels.put("760 i", "BMW");
		carModels.put("Vanquish", "Aston Martin");
		carModels.put("Roma", "Ferarri");
		
		Scanner input = new Scanner(System.in);
		System.out.println("What car are you searching for?");
		String modelName = input.nextLine();
		
		if(carModels.containsKey(modelName)) {
			System.out.println("Oh, you're looking for a " + modelName + "? Our " + carModels.get(modelName) + " selection is right over here...");
			
		} else {
			System.out.println("We don't have that model in stock.");
		}
	}

}
