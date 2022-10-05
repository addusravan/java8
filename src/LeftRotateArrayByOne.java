import java.util.ArrayList;
import java.util.Scanner;

public class LeftRotateArrayByOne {


    static void rotateleftbyone(int[] arr,int k){

        ArrayList<Integer>s=new ArrayList<>();

        int f=-1;
        for(int i=0;i<arr.length;i++){
            int j=arr.length-k;

            if(i>=j){
                f++;
                s.add(i,arr[f]);
            }

            else  {
                s.add(i, arr[i + k]);
            }

        }

        System.out.print( s);
    }





    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int k=sc.nextInt();

        int arr[] = new int[n];

        for (int i = 0; i < n; i++) {

            arr[i] = sc.nextInt();
        }

        rotateleftbyone(arr,k);


    }
}
