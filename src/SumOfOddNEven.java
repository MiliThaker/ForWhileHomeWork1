import java.util.Scanner;
public class SumOfOddNEven {
    //main method to declare the result sum of odd and even number
    public static void main(String[] args) {
        //declaring variables
        int num,i,evensum=0,oddsum=0;
        //creating object to print out put of to entre any number
        Scanner scanner=new Scanner(System.in);
        System.out.println("Please Entre any Number: ");
        num=scanner.nextInt();
        //logic
        for (i=1;i<=num;i++)
        {
            if (i % 2 == 0) {
                evensum = evensum + i;
            }
            else
            {
                oddsum = oddsum + i;
            }
        }
        //print result
            System.out.println("The Sum of Even Numbers "+num+" = "+evensum);
            System.out.println("The sum of Odd Numbers "+num+" = "+oddsum);
        }

}