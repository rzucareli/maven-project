package com.example;

/**
 * This is a class.
 */
public class Greeter {

  /**
   * This is a constructor.
   */
  public Greeter() {

  }

  /**
   * Greetings to someone.
   * @param someone name of the person
   * @return greeting message
   */
  public final String greet(final String someone) {
    return String.format("Hello, %s!", someone);
  }
}
