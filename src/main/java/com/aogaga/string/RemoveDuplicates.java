package com.aogaga.string;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;

public class RemoveDuplicates {

  public static void main(String [] args){

  }
  public String removeDuplicates(String str) {
    List<Character> set = new ArrayList<Character>();
    StringBuilder sb = new StringBuilder();

    for (int i = 0; i < str.length(); i++){
      char x = str.charAt(i);
      if(!set.contains(x)){
        set.add(x);
      }
    }


    for(Character x : set){
      sb.append(x);
    }

  return sb.toString();

  }
}
