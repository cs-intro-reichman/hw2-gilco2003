// Demonstrates the Collatz conjecture.
public class Collatz {
	public static void main(String args[]) {
	    int n = Integer.parseInt(args[0]), temp,tempChecker, count;
		String mode = args[1]; 
		//Hmmm...
		//I used flag to handle the first iteration of the for loop because the while loop would skip 1 otherwise.
		//I used isCorrect and tempChecker to make sure that we don't enter an infinte loop if Collatz was wrong because he might be...
		//temp is used to go over each number between n
		boolean flag = true, isCorrect = true;
		//iterating over numbers 1 to n
		for (int i = 1; i <= n; i++) {
			temp = i;
			//count denotes the number of steps to get to 1
			count = 1;
			if (mode.equals("v"))
				System.out.print(temp + " ");
				//iterating over the steps of the conjecture
			while (temp != 1 || flag && isCorrect) {
				flag = false;
				tempChecker = temp;
				if (temp % 2 == 0)
					temp /= 2;
				else
					temp = temp * 3 + 1;
				count++;
				if (mode.equals("v"))
				System.out.print(temp + " ");
				//making sure the operations actually change the number to make sure no infinte loops are created. 
				if (tempChecker == temp)
					isCorrect =false;
			}
			if (mode.equals("v"))
				System.out.println("(" + count + ")");
		}
		if (isCorrect && (mode.equals("v") || mode.equals("c"))) {
		System.out.println("Every one of the first " + n + " hailstone sequences reached 1.");
		}
	}
}
