// Computes an approximation of PI.
public class CalcPi {
	public static void main(String [] args) { 
	    int n = Integer.parseInt(args[0]);
		int div = 1, operator = 1;
		double sum = 0;
		for(int i = 0; i < n; i++) {
			sum += (double)operator / (double)div;
			operator = operator * -1;
			div += 2;
		}
		System.out.println("pi according to Java: " + Math.PI);
		System.out.println("pi, approximated: " + sum * 4);
	}
}
