package p2;

public class ShuffleRec {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String stringx, stringy, stringz;
		
		if((args.length < 3 && args.length > 0) 
				|| (args.length != 0 && args[2].length() != args[0].length()+args[1].length())) {
			printUsage();
			return;
		}
		
	}

	private static void printUsage() {
		// TODO Auto-generated method stub
		System.out.println("...invalid input");
		System.out.println("");
	}

}
