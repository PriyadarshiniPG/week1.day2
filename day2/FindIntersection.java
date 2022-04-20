package week1.day2;

import java.util.Arrays;

public class FindIntersection {
	public static void main(String[] args) {

		int[] first = { 3, 2, 11, 4, 6, 7 };
		int[] second = { 1, 2, 8, 4, 9, 7 };

		for (int i = 0; i < first.length; i++) {

			for (int j = 0; j < second.length; j++) {
				if (first[i] == second[j]) 
				//if(Arrays.equals(first, second))
					{
					System.out.println(first[i]);
				}
			}
		}

	}
}