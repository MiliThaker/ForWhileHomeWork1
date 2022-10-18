public class DevidedbyThreeandFive {
    //main method to declare result to find out number which can device by 3 n 5 out 1 to 100
    public static void main(String args[]) {
        //creating objet to print result the number which devices by 3 out 1 to 100
        System.out.println("\nDivided by 3: ");
        //logic
        for (int i=1; i<100; i++) {
            if (i%3==0)
                System.out.print(i +", ");
        }
//creating objet to print result the number which devices by 5 out 1 to 100
        System.out.println("\n\nDivided by 5: ");
        //logic
        for (int i=1; i<100; i++) {
            if (i%5==0) System.out.print(i +", ");
        }
//creating objet to print result the number which devices by 3 and 5 out 1 to 100
        System.out.println("\n\nDivided by 3 & 5: ");
        //logic
        for (int i=1; i<100; i++) {
            if (i%3==0 && i%5==0) System.out.print(i +", ");
        }
        System.out.println("\n");
    }
}
