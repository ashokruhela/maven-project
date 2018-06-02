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
   * Returns greeting message
   * @param someone
   * @return hello message
   */
  public final String greet( final String someone) {
      return String.format("Hello, %s!", someone);
  }
}
