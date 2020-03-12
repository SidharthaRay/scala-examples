package com.dsm.assignment

object PrimeNumber {

  def main(args: Array[String]) {
    var primeNumCounter = 0
    for (i <- 1 to 1000) {
      var counter = 0
      for (n <- 1 to i) {
        if (i % n == 0) {
          counter = counter + 1
        }
      }
      if (counter == 2) {
        primeNumCounter += 1
      }
      counter = 0
    }
    println("No. of prime numbers  = " + primeNumCounter)
  }

  def isPrime(num: Int): Boolean = {
    return false
  }
}