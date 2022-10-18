import java.util.Scanner;
//main class crated to generate armstrong number
 public class ArmstrongNumber {
     //main method
        public static void main(String[] args) {
            //declaring variables
            int num, temp, totalDigit=0, res=0, rem, pow, i;
            Scanner scan = new Scanner(System.in);
// code to to print to entre the number using scanner
            System.out.print("Enter the Number: ");
            num = scan.nextInt();
            temp = num;
            //for logic using while
            while(num>0)
            {
                num = num/10;
                totalDigit++;
            }
            num = temp;
            while(num>0)
            {
                rem = num%10;
                pow = 1;
                i = 0;
                while(i<totalDigit)
                {
                    pow = pow*rem;
                    i++;
                }
                res = res + pow;
                num = num/10;
            }
            //using if else to be declare the number armstrong number or not
            if(res==temp)
                System.out.println("\nArmstrong Number");
            else
                System.out.println("\nNot an Armstrong Number.");
        }
    }

