package se.bettercode.fizzbuzz;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamingFizzBuzz {

  /**
   * Each argument must be a integer
   */
  public static void main(String[] args) {
    List<Integer> integers = new ArrayList<>();
    for (String argument : args) {
      integers.add(Integer.parseInt(argument));
    }
    fizzBuzz(integers);
  }

  public static void fizzBuzz(List<Integer> integers) {
    final String result = integers.stream()
        .map(StreamingFizzBuzz::numberToFizzBuzz)
        .collect(Collectors.joining("\n"));
    System.out.println(result);
  }

  // TODO: Inline this in the stream?
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
