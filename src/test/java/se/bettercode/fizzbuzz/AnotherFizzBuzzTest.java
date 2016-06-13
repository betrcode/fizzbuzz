package se.bettercode.fizzbuzz;

import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.assertEquals;
import static se.bettercode.fizzbuzz.Solutions.CORRECT_FIZZ_BUZZ;

public class AnotherFizzBuzzTest {

  private AnotherFizzBuzz anotherFizzBuzz = new AnotherFizzBuzz();
  private ByteArrayOutputStream out = new ByteArrayOutputStream();

  @Test
  public void anotherFizzBuzz() {
    anotherFizzBuzz.anotherFizzBuzz(new PrintStream(out));
    assertEquals(CORRECT_FIZZ_BUZZ, out.toString());
  }

}
