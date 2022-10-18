import java.util.Scanner;
public class PalindromeNumber
{
    public static void main(String[] args)
    {
        int num, rev=0, rem, temp;
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a Number: ");
        num = scan.nextInt();
        temp = num;
        while(temp!=0)
        {
            rem = temp%10;
            rev = (rev*10) + rem;
            temp = temp/10;
        }
        if(num==rev)
            System.out.println("It is a Palindrome Number.");
        else
            System.out.println("It is not a Palindrome Number.");
    }
}