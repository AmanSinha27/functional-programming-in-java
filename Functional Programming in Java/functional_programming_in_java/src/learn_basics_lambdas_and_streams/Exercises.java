package learn_basics_lambdas_and_streams;

import java.util.Arrays;
import java.util.List;

public class Exercises {
    public static void main(String[] args){
        List<String> courses = Arrays.asList("Spring", "Spring boot", "API", "Microservices", "AWS", "PCF", "Azure", "Docker", "Kubernetes");
        // printCourses(courses);
        printLengthOfStrings(courses);

        // List<Integer> numbers = Arrays.asList(1,3,12,13,5, 7, 9, 11, 18);
        // printSquareOfNumbers(numbers);

    }

    // public static void printCourses(List<String> courses){
    //     System.out.println("Printing all courses:");
    //     courses.stream().forEach(System.out::println);

    //     System.out.println("\nPrinting courses containing Spring:");
    //     courses.stream()
    //         .filter(course->course.contains("Spring"))
    //         .forEach(System.out::println);

    //         System.out.println("\nPrinting courses having 4 or more letters:");
    //         courses.stream()
    //             .filter(course->course.length()>=4)
    //             .forEach(System.out::println);

    // }

    // public static void printSquareOfNumbers(List<Integer> numbers){
    //     numbers.stream()
    //         .map(number->number*number)
    //         .forEach(System.out::println);
    // } 

    public static void printLengthOfStrings(List<String> courses) {
        courses.stream()
            .map(course->course + " " + course.length())
            .forEach(System.out::println);
    }
}
