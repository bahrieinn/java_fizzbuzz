// FizzBuzz rules
// Counting from 1 - 100
// Print 'Fizz' for multiples of 3
// Print 'Buzz' for multiples of 5
// Print 'FizzBuzz' for multiples of both
// Print the actual number everywhere else

public class fizzbuzz {
  public static void main(String[] args){
    for (int i = 1; i < 101; i++ ){
      if ( (i % 15) == 0 ) {
        System.out.println("FizzBuzz");
      } else if ( (i % 3) == 0 ) {
        System.out.println("Fizz");
      } else if ( (i % 5) == 0) {
        System.out.println("Buzz");
      } else {
        System.out.println(i);
      }
    }
  }
}