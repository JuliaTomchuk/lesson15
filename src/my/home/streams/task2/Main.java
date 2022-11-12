package my.home.streams.task2;

import java.util.List;

public class Main {
    public static void main(String[] args) {


        List<String> names = List.of("Dave", "Kate", "Matt", "Julia", "Ann", "Jorge", "adrian", "Harvey", "julia");

        names.forEach(System.out::println);

        long counter = names.stream().filter(s -> s.compareToIgnoreCase("julia") == 0).count();
        System.out.println("number of people with my name: " + counter);
        System.out.println("Names start with A or a ");
        names.stream().filter(s -> s.startsWith("A") || s.startsWith("a")).forEach(s -> System.out.print(s + ","));

    }
}
