import java.util.Scanner;

public class FibonacciSeries {
    //main program for to approach FibonacciSeries
    public static void main(String[] args) {
        //declaring variables
        int a=1,b=1,c=0,i;
        //using scanner to print output for value and result fibonacci sequence
        Scanner scanner=new Scanner(System.in);
        System.out.print("Entre any value: ");
        i=scanner.nextInt();
        System.out.print("Fibonacci Series: " +a+" "+b+" ");
        //logic
        c=a+b;
        i=i-2;
        //while logic to print sequence
        while (i>0){
            System.out.print(c+" ");
            a=b;
            b=c;
            c=a+b;
            i--;
        }
    }


    }

