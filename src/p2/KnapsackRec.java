package p2;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Scanner;
import java.io.BufferedReader;
import java.io.File;
import java.util.Iterator;

public class KnapsackRec {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n; // number of input
		int W;
		ArrayList<Integer> wList = new ArrayList<>();
		ArrayList<Integer> vList = new ArrayList<>();

		String wFile;
		if (args.length != 4) {
			printUsage();
			return;
		}

		try {
			n = Integer.parseInt(args[0]);
			W = Integer.parseInt(args[1]);

		} catch (Exception e) {
			printUsage();
			return;
		}

		wFile = args[2];
		try {

			// Scan file
			Scanner wScan = new Scanner(new File(wFile));
			// Add elements to the list
			while (wScan.hasNext())
				wList.add(wScan.nextInt());

			wList.toArray(new Integer[0]);

			// Scan file
			Scanner vScan = new Scanner(new File(wFile));
			// Add elements to the list
			while (vScan.hasNext())
				vList.add(vScan.nextInt());

			vList.toArray(new Integer[0]);

//			Scanner vScan = new Scanner(new File(vFile));
//			while (vScan.hasNext())
//				vList.add(vScan.nextInt());

			// knapsack(n, capacity,wList, vList);

		} catch (Exception ex) {
			System.out.println(ex.toString());
		}

		// checking if its a right input
		System.out.println("input: w.txt \n" + wList);
		System.out.println("input: v.txt \n" + vList);
		System.out.println("number of item: " + n + " capacity: " + W);

		//System.out.println("Knapsack value is " + knapSack(n, W, w, v.length - 1));

	}


		static void printknapSack(int W, int wt[], int val[], int n) {
			int i, w;
			int K[][] = new int[n + 1][W + 1];

			// Build table K[][] in bottom up manner
			for (i = 0; i <= n; i++) {
				for (w = 0; w <= W; w++) {
					if (i == 0 || w == 0)
						K[i][w] = 0;
					else if (wt[i - 1] <= w)
						K[i][w] = Math.max(val[i - 1] + K[i - 1][w - wt[i - 1]], K[i - 1][w]);
					else
						K[i][w] = K[i - 1][w];
				}
			}

			// stores the result of Knapsack
			int res = K[n][W];
			System.out.println(res);

			w = W;
			for (i = n; i > 0 && res > 0; i--) {

				// either the result comes from the top
				// (K[i-1][w]) or from (val[i-1] + K[i-1]
				// [w-wt[i-1]]) as in Knapsack table. If
				// it comes from the latter one/ it means
				// the item is included.
				if (res == K[i - 1][w])
					continue;
				else {

					// This item is included.
					System.out.print(wt[i - 1] + " ");

					// Since this weight is included its
					// value is deducted
					res = res - val[i - 1];
					w = w - wt[i - 1];
				}
			}
	}

	private static void printUsage() {
		// TODO Auto-generated method stub
		System.out.println("...invalid input");
		System.out.println("Example: n(num of item) W(capacity) w.txt v.txt");

	}

}
