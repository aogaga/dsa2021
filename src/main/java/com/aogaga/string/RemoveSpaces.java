package com.aogaga.string;

import java.util.HashMap;
import java.util.HashSet;

public class RemoveSpaces {

  public HashSet<String> getMap(){
    HashSet<String> map =  new HashSet<String>();
    map.add("/t");
    map.add(" ");
    map.add("\n");
    return map;
  }
  public String removeWhiteSpaces(String str){
    StringBuilder sb = new StringBuilder();
    String [] map = str.split(" ");

    for (int i = 0; i < map.length; i++){
      if (!getMap().contains(map[i])){
        sb.append(map[i]);
      }
    }

    return sb.toString();
  }


}
