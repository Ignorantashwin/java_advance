import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Print the greeting below.
    
      Scanner sc = new Scanner(System.in);
     String line = sc.nextLine();
     String[] arr = line.split(" ");
     int max = Integer.MIN_VALUE;
     for (int i = 0; i < arr.length; i++) {
        int v = Integer.parseInt(arr[i]);
        if (max < v) {
            max = v;
        }
     }
 System.out.println(max);
       
}
}