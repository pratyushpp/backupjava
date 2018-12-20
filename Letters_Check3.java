import java.util.Scanner;
public class Letters_Check3
{


    public static void main(String[] args) {
        String text;
        Scanner s1 = new Scanner(System.in);
        System.out.println("enter the text");
        text = s1.nextLine();
        for (int index = 0; index < text.length(); index++) {
            char letters = text.charAt(index);
            if (letters != 'a' && letters != 'e' && letters != 'i' && letters != 'o' && letters != 'u') {
                System.out.println(letters + " is a consonat");
            } else {
                System.out.println(letters + " is a vowel");
            }
        }

        }
    }



