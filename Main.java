
import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Print the greeting below.
    
      Scanner sc = new Scanner(System.in);
      int[]arr = Arrays.stream(sc.nextLine().split(" ")).mapToInt(Integer :: parseInt).toArray();
      int result = Arrays.stream(arr).filter(n -> n%2==0).map(n -> n*n).sum();
      System.out.println(result);
}
}