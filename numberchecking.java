import java.util.Scanner;

public class numberchecking {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int number = sc.nextInt();

        if (number>0){
            System.out.println("positive");

        } else if (number<0) {
            System.out.println("negative");
        } else  {
            System.out.println("zero");
            
        }

    }



}






