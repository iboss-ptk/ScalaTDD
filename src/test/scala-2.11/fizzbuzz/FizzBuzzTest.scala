package fizzbuzz

import org.scalatest.{Matchers, FunSuite}

/**
  * Created by ibosz on 11/4/59.
  */
class FizzBuzzTest extends FunSuite with Matchers {

  test("test hello") {
    (new FizzBuzz).hello shouldBe "hello"
  }

}
