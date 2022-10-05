import java.util.ArrayList;
import java.util.Scanner;

public class ZeroToLast {

    static void ZeroLast(int[] arr,int n) {



        int temp[] = new int[n];
        int k=0;
        for (int i=0;i<n;i++){
            if (arr[i]!=0){
                temp[k]=arr[i];
                k++;
            }
        }

        while (k<n){
            temp[k]=0;
            k++;
        }
        for(int i=0;i<n;i++)
        {
            System.out.print(temp[i]+" ");
        }
    }



    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();


        int arr[] = new int[n];

        for (int i = 0; i < n; i++) {

            arr[i] = sc.nextInt();
        }

        ZeroLast(arr,n);


    }
}


