package com.aogaga.string;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class StringSegmentationTest {

  @BeforeEach
  void setUp() {
  }

  @Test
  void canSegmentString() {
    StringSegmentation ss = new StringSegmentation();

    List<String> dictionary = new ArrayList<>();
    dictionary.add("apple");
    dictionary.add("pear");
    dictionary.add("pier");
    dictionary.add("pie");

    assertEquals(true, ss.canSegmentString("applepie", dictionary));
    assertEquals(false, ss.canSegmentString("applepeer", dictionary));
  }

@Test
  void canSegMentStringv2(){
    List<String> dictionary = new ArrayList<>();
    dictionary.add("hello");
    dictionary.add("hell");
    dictionary.add("on");
    dictionary.add("now");

    StringSegmentation ss = new StringSegmentation();
    assertEquals(true, ss.canSegmentString("hellonow", dictionary));
  }
}