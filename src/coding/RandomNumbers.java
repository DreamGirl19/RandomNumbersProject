package coding;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class RandomNumbers {

	public static final Integer Arrays = null;

	public static void main(String[] args) {
		int nthNumber;
		try (Scanner scan = new Scanner(System.in)) {
			nthNumber = scan.nextInt();
		}
		RandomNumbers rn = new RandomNumbers();
		List<Integer> randomNumList = rn.getRandomNumbers();
		System.out.println("randomNumList -> "+randomNumList);
		Collections.sort(randomNumList);
		System.out.println("ordered8NumList -> "+randomNumList);
		Integer nthSmallestNum = randomNumList.get(nthNumber-1);
		System.out.println(nthNumber + " Smallest Number :"+nthSmallestNum);		
	}
	
	
	private List<Integer> getRandomNumbers() {
		Random random = new Random();
		int counter = 0;
		List<Integer> list = new ArrayList<Integer>();		
		while(counter < 500) {
			int x = random.nextInt(10000);
			counter++;
			list.add(x);			
		}
		return list;				
	}
		
 }


