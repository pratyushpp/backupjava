import java.util.Random;
import java.util.Scanner;

public class Guess{

    public static void main(String[] args) {
        Random random = new Random();
        int number;
        number = random.nextInt(50);
        Scanner s1 = new Scanner(System.in);
        System.out.println("Enter the random nuber to be guessed");
        int gues = s1.nextInt();
        if (gues > number) {
            System.out.println("number guessed is more than original number");
        } else if (gues == number) {
            System.out.println("number guessed is equal to the original number");

        } else {


            System.out.println("number guessed is than than original number");
        }
    }


    }

