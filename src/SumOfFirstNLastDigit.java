import java.util.Scanner;
public class SumOfFirstNLastDigit {
    public static void main(String[] args) {
        int num,num1,firstdigit=0,lastdigit;
        Scanner scanner=new Scanner(System.in);
        System.out.println("Entre any number");
        num=scanner.nextInt();
        lastdigit=num%10;
        while (num!=0){

            num1=num%10;
           firstdigit=num1;
            num=num/10;
        }
        System.out.println("First Digit of Number is: "+ firstdigit);
        System.out.println("Last Digit of Number is: "+ lastdigit);
        System.out.println("Sum of First and Last Digit: "+(firstdigit+lastdigit));
    }
}
