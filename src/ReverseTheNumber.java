import java.util.Scanner;
public class ReverseTheNumber {
    public static void main(String[] args) {
        int num=0;
        int reverse=0;
        System.out.println("Entre any Five Digits: ");
        Scanner scanner=new Scanner(System.in);

        num=scanner.nextInt();
        while (num!=0){
            reverse=reverse*10;
            reverse=reverse+num%10;
            num=num/10;

        }
        System.out.println("Number Reversed: " +reverse);


    }
}