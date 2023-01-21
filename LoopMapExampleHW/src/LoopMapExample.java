import java.util.ArrayList;
import java.util.Scanner;
import java.util.Collections;

public class LoopMapExample {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		ArrayList<Integer> numbers = new ArrayList<>();
		
		for(int i=0; i<5; i++) {
			System.out.println("Enter a number");
			numbers.add(input.nextInt());
		}
		
		System.out.println(numbers);
		
		int numberSum = 0;
		
		for(int number : numbers) {
			numberSum += number;
		}
		
		System.out.println("The sum of all the numbers combined is " + numberSum);
		
		int numberProduct = 1;
		
		for(int number : numbers) {
			numberProduct *= number;
		}
		System.out.println("The product of each number multiplied is " + numberProduct);
		
		System.out.println("The smallest number is " + (Collections.min(numbers)));
		System.out.println("The largest number is " + (Collections.max(numbers)));
	}

}
