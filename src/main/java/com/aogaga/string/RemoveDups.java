package com.aogaga.string;

import java.util.HashSet;

public class RemoveDups {

    public String removeDups(String str){
      StringBuilder sb = new StringBuilder();
      HashSet<Character> map = new HashSet<>();

      for (int i = 0; i < str.length(); i++){

        map.add(str.charAt(i));
      }

      return map.toString();
    }


}
