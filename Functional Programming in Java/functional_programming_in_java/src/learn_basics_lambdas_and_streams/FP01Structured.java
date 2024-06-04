package learn_basics_lambdas_and_streams;

import java.util.List;

public class FP01Structured {
    public static void main(String[] args){
        List<Integer> numbers = List.of(12,32,543,32,51,78,31,98,52);
        printNumbersStructured(numbers);

    }

    public static void printNumbersStructured(List<Integer> numbers){
        for(int number: numbers){
            System.out.println(number);
        }
    }
}
