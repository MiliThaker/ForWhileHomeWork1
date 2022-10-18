import java.util.Scanner;
public class FactorialNumber {
    public static long findfactorial(int number){
        //declare variable
        long fact=1;
        //logic to find the factorial
        for(int i=1;i<=number;i++){
            fact=fact*i;
        }
        return fact;
    }
    public static void main(String[] args) {
    //declare variables
        int number=0;
        long result=0;
        //create scanner class object to take input
        Scanner scanner=new Scanner(System.in);
        System.out.println("Entre any Value: ");
        number=scanner.nextInt();
        //print output of the result
        result=findfactorial(number);
        System.out.print("Factorial of given number is: "+result);


    }
}
