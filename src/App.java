import java.util.Random;
import java.util.Scanner;

public class App {



    Scanner in = new Scanner(System.in);
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        App main = new App();
        main.requestNumbers();
    }


    public void requestNumbers(){
        System.out.println("ELIGE CUANTOS NÚMEROS SE GENERAN: ");
        int number = in.nextInt();

        int[] numbers = new int[number];
        Random rand = new Random();

        for(int x=0; x<(number); x++){
            int n = rand.nextInt(number);
            
            numbers[x] = n;
        }

             
    }
}
