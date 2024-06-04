package learn_basics_lambdas_and_streams;

import java.util.Arrays;
import java.util.List;

public class Exercises {
    public static void main(String[] args){
        List<String> courses = Arrays.asList("Spring", "Spring boot", "API", "Microservices", "AWS", "PCF", "Azure", "Docker", "Kubernetes");
        printCourses(courses);
    }

    public static void printCourses(List<String> courses){
        System.out.println("Printing all courses:");
        courses.stream().forEach(System.out::println);

        System.out.println("\nPrinting courses containing Spring:");
        courses.stream()
            .filter(course->course.contains("Spring"))
            .forEach(System.out::println);

            System.out.println("\nPrinting courses having 4 or more letters:");
            courses.stream()
                .filter(course->course.length()>=4)
                .forEach(System.out::println);

    }
}
