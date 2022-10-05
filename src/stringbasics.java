import java.util.Arrays;
import java.util.Scanner;

public class stringbasics {


    public static String SortString(String str)
    {
        char c[] = str.toCharArray();
        Arrays.sort(c);
        return new String(c);
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); //System.in is a standard input stream
        System.out.print("Enter a string1: ");
        String str = sc.nextLine();              //reads string
      str.split("-");

      System.out.println(str);
    }

}