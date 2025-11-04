// Demonstrates the Collatz conjecture.
public class Collatz {
	public static void main(String args[]) {
	    int n = Integer.parseInt(args[0]), temp,tempChecker, count;
		String mode = args[1]; 
		boolean flag = true, isCorrect = true;
		for (int i = 1; i <= n; i++) {
			temp = i;
			count = 1;
			if (mode.equals("v"))
				System.out.print(temp + " ");
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
				if (tempChecker == temp)
					isCorrect =false;
			}
			if (mode.equals("v"))
				System.out.println("(" + count + ")");
		}
		if (isCorrect) {
		System.out.println("Every one of the first " + n + " hailstone sequences reached 1.");
		}
	}
}
