import java.util.Scanner;

public class reversenumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
System.out.println("enter the number");

int number = sc.nextInt();

int reversenumber  = 0;

while (number !=0){
int digit =number% 10;
reversenumber = reversenumber *10 +digit;
number = number /10;

System.out.println("reversed number:" + reversenumber);
}




    }


}
