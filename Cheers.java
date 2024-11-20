// Prints a crowd cheering output.
public class Cheers {
        public static void main(String[] args) {
	    // Replace this comment with your code

            String cheersWord = args[0];
            int repet = Integer.parseInt(args[1]);

            for(int i=0; i<cheersWord.length(); i++){

                if(cheersWord.charAt(i) == 'A' || cheersWord.charAt(i) == 'E'|| cheersWord.charAt(i) == 'F'|| cheersWord.charAt(i) == 'H'|| cheersWord.charAt(i) == 'H'|| cheersWord.charAt(i) == 'I'|| cheersWord.charAt(i) == 'L'|| cheersWord.charAt(i) == 'M'|| cheersWord.charAt(i) == 'N'|| cheersWord.charAt(i) == 'O'|| cheersWord.charAt(i) == 'R'|| cheersWord.charAt(i) == 'S'|| cheersWord.charAt(i) == 'X') {
                System.out.println("Give me an "+ cheersWord.charAt(i)+": "+cheersWord.charAt(i)+"!");
                }
                else System.out.println("Give me a "+ cheersWord.charAt(i)+": "+cheersWord.charAt(i)+"!");
            }
            System.out.println("What does that spell?");

            int j=0;
            while (j<repet) {
                System.out.println(cheersWord+"!!!");
                j++;
            }
        }
}