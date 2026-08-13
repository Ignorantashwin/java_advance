import java.util.Scanner;
public class lesson13 {
    static class Animal{
        protected String name;

        public Animal(String name){
            this.name = name;
        }

        public String greet(String name){
            return name + " says hello";
        }
    }

    static class Dog extends Animal{
        public Dog(String name){
            super(name);
        }
        @Override
        public String greet(String name){
         return name + " says woof";
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        Animal d = new Dog(name);
        System.out.println(d.greet(name));
        sc.close();
    }
}
