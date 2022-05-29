package lesson1;
import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner riad = new Scanner(System.in);


        System.out.println("print a=");
        float a = riad.nextInt();
        System.out.println("print b=");
        float b = riad.nextInt();
        System.out.println("print c=");
        float c = riad.nextInt();
        System.out.println("print d=");
        float d = riad.nextInt();


        float calc = a*(b+(c/d));
        System.out.println("calculation");





        System.out.println("result="+calc);
    }



}