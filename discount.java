import java.util.Scanner;

public class discount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the purchase amount:");
        double purchaseamount = sc.nextDouble();

        double discount = 0;

        if(purchaseamount < 500){
            discount = 0;
        }
        else if (purchaseamount>= 500 && purchaseamount <= 1000) {
            discount = 10;
        }

        else if (purchaseamount > 1000) {
            discount = 20;
        }

        double discountamount = (purchaseamount * discount)/100;
        double finalamount = purchaseamount - discountamount;

        System.out.println("original purchase amount = " + purchaseamount);
        System.out.println("Discount applied = " + discount+ "%");
        System.out.println("Final payable amount = " + finalamount);



    }


}
