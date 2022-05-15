package lesson3;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] wordsList = new String[]{"apple", "orange", "lemon", "banana", "apricot", "avocado", "broccoli", "carrot", "cherry", "garlic", "grape"};
        String yesORno = "yes";

        System.out.println(" ");
        System.out.println("let's play a game ;)");
        while (!yesORno.equals("no")) {
            int resoult = 0;
            String word=wordsList[(int) (Math.random() * wordsList.length)];
            //System.out.println(Arrays.toString(wordChar));

            while (resoult==0) {


                System.out.println("Inter your guess...");

                String myWord = scan.nextLine();

                char[] wordChar = word.toCharArray();
                char[] myWordChar = myWord.toCharArray();
                char[] reserv = new char[wordsList.length - 1];
                int minRang;
                int lastElement = 0;

                // определим ранг наименьшего из массивов...
                if (wordChar.length > myWordChar.length) {
                    minRang = myWordChar.length - 1;
                } else {
                    minRang = wordChar.length - 1;
                }

                for (int i = 0; i <= minRang; i++) {

                    if (myWordChar[0]==wordChar[0] & myWordChar.length==1){
                        System.out.println("you are on the right way))");
                    }
                    if (myWordChar[i] == wordChar[i]) {
                        reserv[i] = wordChar[i];

                    } else {
                        for (int j = i; j <((wordsList.length - 1)); j++) {
                            reserv[j] = '#';
                        }
                        System.out.println("you guessed only these letters:");

                        System.out.println(Arrays.toString(reserv));

                        break;
                    }
                    lastElement = 0+i;
                }
                if (lastElement==(wordChar.length-1)) {  //reserv[lastElement] == wordChar[wordChar.length-1]
                    System.out.println("you won!!!");
                    resoult=1;
                }
                //System.out.println(Arrays.toString(reserv));

            }
            System.out.println("Do you want to play again?");
            yesORno=scan.nextLine();
            /*while (!yesORno.equals("yes") || !yesORno.equals("no")){
                System.out.println("I didn't understand, please try again...");
                System.out.println("Do you want to play again?");
                yesORno=scan.nextLine();*/
        }
    }
}
