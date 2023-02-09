import java.util.Random;
import java.util.Scanner;

import models.Sorts;

public class App {


    Sorts<Integer> sort = new Sorts<Integer>();

    Scanner in = new Scanner(System.in);
    public static void main(String[] args) throws Exception {
        App main = new App();
        main.requestNumbers();



    }

    public void printArr(Integer[] numbers, String type){
        System.out.println("================================");
        System.out.println(type);
        System.out.println("================================");
        for(int i=0 ; i<(numbers.length-1);i++){
            System.out.println(numbers[i]);
        }
    }



    public void requestNumbers(){
        System.out.println("ELIGE CUANTOS NÚMEROS SE GENERAN: ");
        int number = in.nextInt();

        Integer[] numbers = new Integer[number];
        Random rand = new Random();

        for(int x=0; x<(number); x++){
            int n = rand.nextInt(number);
            
            numbers[x] = n;
        }
        quick(numbers);
        gnome(numbers);
        merge(numbers);
        radix(numbers);
        bubble(numbers);
    }
    

    public void quick(Integer[] numbers){
        sort.quickSort(numbers,0, (numbers.length-1));

    }

    public void gnome(Integer[] numbers){
        sort.gnomeSort(numbers);
    }

    public void merge(Integer[] numbers){
        sort.mergeSort(numbers,0, (numbers.length-1));
    }
   
    public void radix(Integer[] numbers){
        sort.RadixSort(numbers);
    }

    public void bubble(Integer[] numbers){
        sort.bubbleSort(numbers);
    }
}
