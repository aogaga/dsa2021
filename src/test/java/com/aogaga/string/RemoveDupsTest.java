package com.aogaga.string;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class RemoveDupsTest {

  @Test
  void removeDups() {
    RemoveDups rd = new RemoveDups();

    assertEquals("[a, b, c]", rd.removeDups("aabbcc"));
  }
}