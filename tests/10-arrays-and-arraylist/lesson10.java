import java.util.Scanner;

public class lesson10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();
        String [] arr = line.split(" ");
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            int v = Integer.parseInt(arr[i]);
            if(max < v){
                max = v;
            }
        }
    System.out.println(max);
    }
}
