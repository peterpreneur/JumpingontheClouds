package JumpingontheClouds;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.IntStream;

class Result {

	/*
	 * Complete the 'jumpingOnClouds' function below.
	 *
	 * The function is expected to return an INTEGER. The function accepts
	 * INTEGER_ARRAY c as parameter.
	 */

	// public static int jumpingOnClouds(List<Integer> c) {
	public static void main(String[] args) {
		List<Integer> c = new ArrayList<>();
		
		//Enter number of steps/Array indexes
		Scanner in = new Scanner(System.in);
		int size = in.nextInt();
		
		//Enter steps based on number of steps above
		for (int i=0; i < size; i++) {
			c.add(in.nextInt());
		}		
		System.out.println(c.toString());

        int count = -1;	
        for (int j = 0; j < size; j++, count++) {
            if ((j < size-2) && (c.get(j+2) == 0)) j++;
        }
        System.out.println(count);		
	}
}
