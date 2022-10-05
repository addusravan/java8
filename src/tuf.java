import java.util.Scanner;



public class tuf {
    static int  NonRepeat(int arr[],int n) {

         int i;
         for (i = 0; i < n; i++) {

              int j;
             for (j = 0; j < n; j++) {

                 if (i != j && arr[i] == arr[j]) {

                     break;
                 }
             }
                 if (j == n) {
                     System.out.println(arr[i]);
                 }


         }


         return -1;
     }

    public static void main(String[] args) {

      int arr[]={4,1,2,1,2,4,5};
       int n=arr.length;
       NonRepeat(arr,n);
    }


}