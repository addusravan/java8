import java.util.Scanner;

public class armstrong {

    static void armstrong(int n) {
        int sum = 0;
        int p=n;
        while (n > 0) {
            int k = n % 10;
            sum = sum + (k * k * k);
            n = n / 10;
        }



        if (sum == p) {


                System.out.print("its arm");
            } else {
                System.out.print(sum + "------" + n);
                System.out.print("its  not arm");
            }

        }




    public static void main(String[] args) {
     Scanner sc=new Scanner(System.in);
     int n=sc.nextInt();

     armstrong(n);

    }


}
