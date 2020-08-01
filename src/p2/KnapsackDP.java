package p2;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class KnapsackDP {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub

		int n; // number of input
		int W;
		int recCall; // number for rec called
		ArrayList<Integer> wList = new ArrayList<>();
		ArrayList<Integer> vList = new ArrayList<>();
		 BufferedReader wReader = null;
		 BufferedReader vReader = null;

		String wFile, vFile;
		if (args.length != 4) {
			//printUsage();
			return;
		}

		try {
			n = Integer.parseInt(args[0]);
			W = Integer.parseInt(args[1]);

		} catch (Exception e) {
		//	printUsage();
			return;
		}

		wFile = args[2];
		vFile = args[3];

		try {
			// txt file to ArrayList to Array
			Scanner wScan = new Scanner(new File(wFile));
			while (wScan.hasNext())
				wList.add(wScan.nextInt());

			
			
			
			Scanner vScan = new Scanner(new File(vFile));
			while (vScan.hasNext())
				vList.add(vScan.nextInt());

			// knapsack(n, capacity,wList, vList);

		} catch (Exception ex) {
			System.out.println(ex.toString());
		}

		// checking if its a right input
		System.out.println("input: w.txt \n" + wList);
		System.out.println("input: v.txt \n" + vList);
		System.out.println("number of item: " + n + " capacity: " + W);

		// System.out.println("Knapsack value is " + knapSack(n, W, w, v.length - 1));			
			
	}

}
