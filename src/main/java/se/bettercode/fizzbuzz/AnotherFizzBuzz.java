package se.bettercode.fizzbuzz;

import java.io.PrintStream;
import java.util.function.IntConsumer;
import java.util.stream.IntStream;

public class AnotherFizzBuzz {

  /**
   * The only thing that is better here is the use of IntStream.rangeClosed
   * compared to a for (int i=0; ...)
   */
  public void anotherFizzBuzz(PrintStream out) {
    FizzBuzzConsumer fizzBuzzConsumer = new FizzBuzzConsumer(out);
    IntStream.rangeClosed(1, 100).forEach(fizzBuzzConsumer);
  }

  class FizzBuzzConsumer implements IntConsumer {

    private PrintStream out;

    FizzBuzzConsumer(PrintStream out) {
      this.out = out;
    }

    @Override
    public void accept(int value) {
      if (value % 3 == 0 && value % 5 == 0) {
        out.print("FizzBuzz");
      } else if (value % 3 == 0) {
        out.print("Fizz");
      } else if (value % 5 == 0) {
        out.print("Buzz");
      } else {
        out.print(value);
      }
      out.println();
    }
  }

}
