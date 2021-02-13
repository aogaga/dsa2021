package com.aogaga.string;

public class StrReverse {
  public String reverseWords (String str) {
    StringBuilder sb = new StringBuilder();

    String [] words = str.split(" ");
      int len = words.length -1;
      for(int i = len;  i > 0; i--){
       sb.append(words[i]);
        sb.append(" ");

      }

      sb.append(words[0]);

      System.out.println(sb.toString());
      return sb.toString();
  }

  }
