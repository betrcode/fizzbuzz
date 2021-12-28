package se.bettercode.fizzbuzz;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamingFizzBuzz {

  /**
   * Each argument must be a integer
   */
  public static void main(String[] args) {
    final List<Integer> integers = Arrays.stream(args)
        .map(Integer::parseInt)
        .collect(Collectors.toList());
    printFizzBuzz(integers);
  }

  public static void printFizzBuzz(List<Integer> integers) {
    System.out.println(fizzBuzz(integers).collect(Collectors.joining("\n")));
  }

  public static Stream<String> fizzBuzz(List<Integer> integers) {
    return integers.stream()
        .map(StreamingFizzBuzz::numberToFizzBuzz);
  }

  private static String numberToFizzBuzz(Integer i) {
    if (i % 3 == 0 && i % 5 == 0) {
      return "FizzBuzz";
    } else if (i % 3 == 0) {
      return "Fizz";
    } else if (i % 5 == 0) {
      return "Buzz";
    } else {
      return String.valueOf(i);
    }

  }

}
