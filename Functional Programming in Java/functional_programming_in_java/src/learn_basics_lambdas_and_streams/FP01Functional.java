package learn_basics_lambdas_and_streams;

import java.util.Arrays;
import java.util.List;

public class FP01Functional {
    public static void main(String[] args){
        List<Integer> numbers = Arrays.asList(12,32,43,21,78,65,42,90,87);
        // printNumbersFunctional(numbers);
        printEvenNumbersFunctional(numbers);

    }

    public static void printNumbersFunctional(List<Integer> numbers){
        /**
         * numbers.stream().forEach(FP01Functional::printNumber); 
         * Above syntax is called method reference => Here we have the className and its static method printNumber
         * For using stream() method, our method needs to be static, so that we can call it directly on the class
         * Without stream, we will get a list of numbers but stream() changes it to a stream
         */
        
        numbers.stream().forEach(System.out::println); 
        /*
        * No need for an additional printNumber method. Simply call the println on System.out
        */
    }

    /**
     * Wew don't actually need the below method.
     * It was used for just explaining the syntax for using stream()
     * @param number
     */
    /* public static void printNumber(int number) {
        System.out.println(number);
    } */

    public static void printEvenNumbersFunctional(List<Integer> numbers){
        numbers.stream()
            // .filter(FP01Functional::isEven) //filter() filters based on boolean returned by isEven() method
            .filter(number->isEven(number)) //Lambda expression: similar to arrow function of JS
            .forEach(System.out::println);
    }

    public static boolean isEven(int number){
        return number%2==0;
    }
}
