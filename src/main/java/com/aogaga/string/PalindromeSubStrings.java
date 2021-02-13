package com.aogaga.string;

import java.util.HashSet;

public class PalindromeSubStrings {

  public  int findAllPalindromeSubstrings(String input) {
    int end = 0;
    int result = 0;
    int start = 0;


    while(end < input.length()){

      String tempStr = input.substring(start, end);

      if(isPalindrone(tempStr)){
         result++;
         end++;
      }else{
        start++;
      }


    }

    return result;
  }


  public boolean isPalindrone(String str){
    String z = "";

    for(int i = 0; i < str.length(); i++){
      z = str.charAt(i) + z;
    }

    return z.equals(str);
  }

  public  int findAllPalindromeSubstringsV2(String input){
    HashSet<String> map = new HashSet<>();

    for(int i  =0; i < input.length(); i++){

      for(int j = i; j < input.length(); j++ ){

        String s = input.substring(i, j+1);
        if(isPalindrone(s) && s.length() > 0){
          System.out.println(s);
          map.add(s);
        }
      }
    }


    return map.size();
  }
}
