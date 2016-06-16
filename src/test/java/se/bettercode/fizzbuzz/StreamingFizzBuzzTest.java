package se.bettercode.fizzbuzz;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import static org.junit.Assert.assertEquals;
import static se.bettercode.fizzbuzz.StreamingFizzBuzz.fizzBuzz;

public class StreamingFizzBuzzTest {

  @Test
  public void canIStreamIt() {
    List<Integer> integers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16);
    List<String> expected = Arrays.asList("1", "2", "Fizz", "4", "Buzz", "Fizz", "7", "8", "Fizz", "Buzz", "11",
        "Fizz", "13", "14", "FizzBuzz", "16");
    List<String> result = fizzBuzz(integers).collect(Collectors.toList());
    assertEquals(expected, result);
  }
}
