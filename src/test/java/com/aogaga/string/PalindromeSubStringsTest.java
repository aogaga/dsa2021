package com.aogaga.string;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class PalindromeSubStringsTest {

  private  PalindromeSubStrings ps;
  @BeforeEach
  void setUp() {
    ps = new PalindromeSubStrings();
  }

  @Test
  void findAllPalindromeSubstrings() {
    assertEquals(7, ps.findAllPalindromeSubstrings("aabbbaa"));
    assertEquals(6, ps.findAllPalindromeSubstrings("xxyyxxy"));
  }


  @Test
  void findAllPalindromeSubstringsV2() {
   assertEquals(7, ps.findAllPalindromeSubstringsV2("aabbbaa"));
   assertEquals(6, ps.findAllPalindromeSubstringsV2("xxyyxxy"));
  }
  @Test
  void isPalindrone() {

    assertEquals(true, ps.isPalindrone("mum"));
  }
}