import java.util.Scanner;

public class numberpattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k,i,j;
        System.out.println("enter the number of rows you want");
    k = sc.nextInt();
        for(i=k;i>=1;i--)
        {
            for(j=k;j>=1;j--)
            {
                System.out.print(i>j?i:j);
            }
            System.out.println();














}}}
