package learn_basics_lambdas_and_streams;

import java.util.Arrays;
import java.util.List;

public class FP01Functional {
    public static void main(String[] args){
        List<Integer> numbers = Arrays.asList(12,32,43,21,78,65,42,90,87);
        printNumbersFunctional(numbers);

    }

    public static void printNumbersFunctional(List<Integer> numbers){
        /**
         * numbers.stream().forEach(FP01Functional::printNumber); 
         * Syntax for method reference => Here we have the className and its static method printNumber
         */
        
        numbers.stream().forEach(System.out::println); 
        /*
        * No need for an additional printNumber method. Simply call the println on System.out
        */
    }

    public static void printNumber(int number) {
        System.out.println(number);
    }
}
