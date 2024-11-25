import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("How many numbers do you want to input?");
        int num = sc.nextInt();
        Cal cal = new Cal(num);
        System.out.println("Total calculated value :  " + cal.totalValue());
    }
}