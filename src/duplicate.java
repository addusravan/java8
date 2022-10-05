import java.util.*;

public class duplicate {


     static  void dup(int arr[]){


         Set<Integer>ss=new HashSet<>();
         for (int i = 0; i< arr.length; i++) {

             ss.add(arr[i]);


         }

         for(int k:ss) {

             System.out.println(k);

         }
     }
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int arr[] = new int[n];

        for (int i = 0; i < n; i++) {

            arr[i] = sc.nextInt();
        }

        dup(arr);


    }
}
