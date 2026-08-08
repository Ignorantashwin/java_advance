import java.util.Scanner;

public class lesson3 {
    public static void main(String[] args){
        Scanner sc = new Scanner (System.in);

        int height = sc.nextInt();
        int width = sc.nextInt();
        int area = height * width;
        System.out.print(area);
    }
    
}
