//feedback

/*
Great work boaz!
*/


// Prints a crowd cheering output.
public class Cheers {
        public static void main(String[] args) {
            String str = args[0], strAnOrA, strTemp;
            int num = Integer.parseInt(args[1]);
	    int length = str.length();
            for (int i = 0; i < length; i++) {
                if (str.charAt(i) == 'A' || str.charAt(i) == 'E' || str.charAt(i) == 'F' || str.charAt(i) == 'H' ||str.charAt(i) == 'I' || str.charAt(i) == 'L' || str.charAt(i) == 'M' || str.charAt(i) == 'N' ||str.charAt(i) == 'O' || str.charAt(i) == 'R' ||str.charAt(i) == 'S' || str.charAt(i) == 'X') {
                        strAnOrA = "an ";
                }
                else {
                        strAnOrA = "a ";
                }
                strTemp= str.charAt(i) + "";
                System.out.println("Give me " + strAnOrA + strTemp.toUpperCase() +": " +  strTemp.toUpperCase() +"!");
            }
          System.out.println("What does that spell?");
            for (int i = 0; i < num; i++)
          System.out.println(str.toUpperCase() + "!!!");
        }
}
