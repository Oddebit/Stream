package be.intecbrussel;

import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamExercises {

    public static void main(String[] args) {

        int[] intArray = {28, 6, 95, 11, 11, 57, 64, 2, 26, 43};
        String[] strArray = "1 sentence of 5 words".split(" ");


        IntStream.of(intArray).map(n -> n * 5)
                .filter(n -> n > 50)
                .forEach(System.out::println);

        double[] doubleArray = IntStream.of(intArray).mapToDouble(n -> n/2d)
                .toArray();

        String newString = Stream.of(strArray).limit(2)
                .map(String::toUpperCase)
                .reduce((accumulator, str) -> accumulator + str).toString();
        // Optional[SENTENCETHAT] ??

        int sum = IntStream.of(intArray).skip(2).sum();

        IntStream intStream = Stream.of(strArray).mapToInt(Integer::parseInt);
    }
}
