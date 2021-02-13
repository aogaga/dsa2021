package com.aogaga.string;


import java.util.List;

public class StringSegmentation {


  public boolean canSegmentString(String str, List<String> dictionary){
    int start = 0;
    boolean result = false;
    for(int i = 1; i <=str.length(); i++){
      String s = str.substring(start, i);
      String z = str.substring(i);

      if(dictionary.contains(s) && dictionary.contains(z)){
          result = true;
      }

    }
    return  result;
  }

}
