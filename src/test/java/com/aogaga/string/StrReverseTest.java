package com.aogaga.string;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class StrReverseTest {

  private  StrReverse rv;
  @BeforeEach
  void setUp() {
    rv = new StrReverse();
  }

  @Test
  void reverseWords() {
    assertEquals("Java love We", rv.reverseWords("We love Java"));
    assertEquals("Hello World", rv.reverseWords("World Hello"));
    assertEquals("be to not or be To", rv.reverseWords("To be or not to be"));
    assertEquals("amazing are You", rv.reverseWords("You are amazing"));
  }
}