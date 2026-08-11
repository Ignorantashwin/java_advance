
import java.util.HashSet;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Print the greeting below.
    
      Scanner sc = new Scanner(System.in);
      String[] words = sc.nextLine().split(" ");
      HashSet<String> set = new HashSet<>();
      for(String w : words){
        set.add(w);
      }
     System.out.println(set.size());
}
}