package webinares.profileModul.week4.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamExamples {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("One");
        list.add("Two");
        list.add("Three");
        list.add("Four");
        list.add("Five");
        list.add("Six");
        list.add("Seven");
        list.add("Eight");
        list.add("Nine");
        list.add("Ten");

//        list.stream(); - получить стрим

        //Потребитель (Consumer)

        List<String> myPlaces = List.of("Nepal, Pokhara", "Nepal, Kathmandu",  "India, Delhi", "USA, New York", "Africa, Nigeria");
        myPlaces.stream()
                .filter((place) -> place.startsWith("Nepal"))
//                .map((place) -> place.toUpperCase())
                .map(String::toUpperCase)
                .sorted()
                .forEach(System.out::println);


        IntStream.of(50, 60, 70, 80, 90, 100, 110, 120, 200).filter(x -> x > 90).map(x -> x + 100)
                .limit(3).forEach(System.out::println);

    }

}
