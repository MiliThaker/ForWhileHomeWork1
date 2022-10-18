import java.util.Scanner;
//main class
public class PrintTenNumberUsingRange {
    //main method
    public static void main(String[] args) {
        //using scanner to print output to entre start number,end number and print result of 10 number range
        Scanner scanner=new Scanner(System.in);
        System.out.println("Entre start of the Number");
        int a=scanner.nextInt();
        System.out.println("End of the Number");
        int b= scanner.nextInt();
        System.out.println("Ten numbers between given range:");
        //logic for find range using "for"
        for (int i =a; i<=b;i++){
            System.out.println(i);
        }
        }
    }

