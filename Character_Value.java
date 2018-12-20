import java.util.Scanner;
public class Character_Value {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input the character");
        char ch = scanner.next().charAt(0);
        if (ch >= 65 && ch <= 90) {
            System.out.println("Capital");
        } else if (ch >= 48 && ch <= 57) {
            System.out.println("digit");
        } else if (ch >= 97 && ch <= 122) {
            System.out.println("small");
        } else {
            System.out.println("special");
        }
    }

    }

