import java.util.Scanner;
public class Palindrome {
    public static void main(String[] args) {
        int temp, r,s=0, sum = 0;
        Scanner s1 = new Scanner(System.in);
        System.out.println("enter the number");
        int n = s1.nextInt();
        temp = n;
        while (n > 0) {
            r = n % 10;
            sum = (sum * 10) + r;
            n = n / 10;
        }
        if (temp == sum)
        {
            System.out.println( temp + "is palindrome");
            while(temp>0) {
                r = temp % 10;
                temp = temp / 10;
                if (r % 2 == 0) {
                    s = s + r;
                }
            }
                if(s>5)
                {
                    System.out.println("sum of even number is greater than 25");
                }
                else
                {
                    System.out.println("sum of even number is not greater than 25");
                }

        } else {
            System.out.println( temp + "is not a plaindrome");
        }

    }
}


