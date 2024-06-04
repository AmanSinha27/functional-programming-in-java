package learn_basics_lambdas_and_streams;

import java.util.Arrays;
import java.util.List;

public class FP01Structured {
    public static void main(String[] args){
        List<Integer> numbers = Arrays.asList(12,32,43,21,78,65,42,90,87);
        printNumbersStructured(numbers);
        printEvenNumbersStructured(numbers);
    }

    public static void printNumbersStructured(List<Integer> numbers){
        for(int number: numbers){
            System.out.println(number);
        }
    }

    public static void printEvenNumbersStructured(List<Integer> numbers) {
        for(int number: numbers){
            if(number%2==0){
                System.out.println(number);
            }
        }
    }
}
