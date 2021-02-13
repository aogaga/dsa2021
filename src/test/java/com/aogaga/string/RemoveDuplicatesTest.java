package com.aogaga.string;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class RemoveDuplicatesTest {

  @Test
  void removeDuplicates() {
      RemoveDuplicates rd = new RemoveDuplicates();
      assertEquals("We lovJa", rd.removeDuplicates("We love Java"));
      assertEquals("World He", rd.removeDuplicates("World Hello"));
      assertEquals("To bernt", rd.removeDuplicates("To be or not to be"));
      assertEquals("You aremzing", rd.removeDuplicates("You are amazing"));
  }
}