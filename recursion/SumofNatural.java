import java.util.Scanner;

public class SumofNatural {
    public static int sumNatural(int n){
        if(n==0){
            return 0;
        }
        return n+sumNatural(n-1);

    }
    public static void main (String agrs[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Pls enter the number");
        int n = sc.nextInt();
        System.out.println("sumv of natural number:" + sumNatural(n));
    }
}
