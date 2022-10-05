import java.util.Scanner;

public class LargestNumber {



      public static int largest(int arr[]){

          int maxi=Integer.MIN_VALUE;
          int secondmax=Integer.MIN_VALUE;
          for(int i=0;i< arr.length;i++){
              maxi=Math.max(maxi,arr[i]);
          }

          for(int i=0;i< arr.length;i++){
             if(arr[i]!=maxi && secondmax<arr[i]){
                 secondmax=arr[i];

             }
          }
          System.out.println(secondmax);

          return secondmax;
      }


      public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int arr[] = new int[n];

        for (int i = 0; i < n; i++) {

            arr[i] = sc.nextInt();
        }

        largest(arr);


    }
}