import java.util.Scanner;

public class smallestnumber {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);

        System.out.println("enter the first number");
        int num1 = sc.nextInt();

        System.out.println("enter the second number");
        int num2 = sc.nextInt();

        System.out.println("enter the third number");
        int num3 =sc.nextInt();

        int smallest = num1;
        if(num2<smallest){
smallest = num2;
        }
if(num3 <smallest){
smallest = num3;
}

System.out.println("The smallest number is " + smallest );
    }



}
