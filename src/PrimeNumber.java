import java.util.Scanner;
public class PrimeNumber {
    //main program to approach result value of prime number
    public static void main(String[] args) {
        //declaring variables
        int num,i,total=0;
        //using scanner to print the number
        Scanner scanner=new Scanner(System.in);
        System.out.println("Entre a Number ");
        num=scanner.nextInt();
        //using for method for logic to print prime number
        for (i=2;i<num;i++){
            if(num%i==0){
                total++;
                break;
            }
        }
        //using if else method to check the number is prime or not and print the output
            if(total==0)
                System.out.println("\nIt is a Prime Number");
            else System.out.println("\nIt is not a Prime Number");
        }
    }

