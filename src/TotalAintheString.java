import java.util.Scanner;
public class TotalAintheString {
    //min method
    public static void main(String[] args) {
        //declaring variables
       String str;
       char ch, a;
       int x,i,y=0;
       //creating object to print your string
       Scanner scanner=new Scanner(System.in);
        System.out.println("Please Entre your String: ");
       str=scanner.nextLine();
       //creating object to print te number of the character
        System.out.println("Entre any character to find how many number of the given character is present in your String:  " );
        ch=scanner.next().charAt(0);
        //logic
        x=str.length();
        for(i=0;i<x;i++){
            a=str.charAt(i);
            if(ch==a) y++;
        }
        //print the fresult
        System.out.println("Total number of selected character is:: "+y);
           }
}
