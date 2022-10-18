import java.util.Scanner;
public class MultiplicationAnyNumber {
    //main method to declare the result for multiplication table using scanner
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        //creating object to print any number and table
        System.out.print("Entre any Number: ");
        int num=scanner.nextInt();
        System.out.println("Multiplication Table for "+num+" is::");
        //logic for multiplication
        for(int i=1;i<=10;i++){
            System.out.println(""+num+" X "+i+" = "+(num*i));
        }
    }
}
