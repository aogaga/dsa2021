package com.aogaga.string;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class RemoveSpacesTest {
  private  RemoveSpaces rs;
  @BeforeEach
  void setUp() {
    rs = new RemoveSpaces();
  }

  @Test
  void removeWhiteSpaces() {
    assertEquals("Allgreektome", rs.removeWhiteSpaces("All greek to me"));
    assertEquals("Allgreektome", rs.removeWhiteSpaces("We love Java"));
    assertEquals("Allgreektome", rs.removeWhiteSpaces("World Hello"));
    assertEquals("Allgreektome", rs.removeWhiteSpaces("To be or not to be"));
    assertEquals("Allgreektome", rs.removeWhiteSpaces("You are amazing"));


  }
}