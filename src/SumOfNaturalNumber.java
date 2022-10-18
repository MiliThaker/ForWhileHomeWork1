import java.util.Scanner;
public class SumOfNaturalNumber {
    //main method to generate result sum of natural number
    public static void main(String[] args) {
        //declaring variables
        int number, i=1, sum = 0;
        //creating object to print any number
        Scanner scanner=new Scanner(System.in);
        System.out.println("Entre any Value: ");
        number=scanner.nextInt();
        //logic using while for result
        while (i<=number){
            sum=sum+i;
            i++;
        }
        //printing the result
        System.out.println("The sum of the natural numbers from 1 to "+number+" = "+sum);
    }
}
