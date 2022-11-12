package my.home.streams.task1;

import java.util.ArrayList;

import java.util.List;
import java.util.OptionalDouble;
import java.util.Random;


public class Main {
    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<>();

        Random random = new Random();

        System.out.println("List of random numbers: ");
        random.ints(50, 1, 20).forEach(nums::add);
        System.out.println(nums);


        System.out.println("List without repeating numbers: ");
        nums.stream().distinct().forEach(i -> System.out.print(i + ", "));
        System.out.println("");

        System.out.println("Range: ");
        nums.stream().filter(i -> i % 2 == 0).filter(i -> i > 7 && i < 17).forEach(i -> System.out.print(i + ", "));
        System.out.println("");

        System.out.println("multiply each element and output the first four elements");
        nums.stream().map(i -> i * 2).limit(4).forEach(i -> System.out.print(i + ", "));
        System.out.println("");

        long counter = nums.stream().count();
        System.out.println("amount of elements = " + counter);


        OptionalDouble average = nums.stream().mapToInt(i -> i.intValue()).average();

        System.out.println("Average = " + average.getAsDouble());

    }
}