package com.suman.ashish.service;

import org.springframework.stereotype.Service;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

@Service
public class LogicalServiceImpl implements LogicalService{

    @Override
    public String getStringSolution(String id, String str) {
        switch (id){
            //Reverse a string
            case "1":
                String str1= "";
                if(str != null){
                    for(int i=str.length()-1;i>=0;i--){
                        str1+=str.charAt(i);
                    }
                    return str1;
                }

            //Number of occurrence of words in string
            case "2":
                Map<Character,Integer> map= new LinkedHashMap<>();
                String s="";
                if(str != null){
                    for(int i=0;i<str.length();i++){
                        if(map.containsKey(str.charAt(i)))
                            map.put(str.charAt(i),map.get(str.charAt(i))+1);
                        else
                            map.put(str.charAt(i),1);
                    }
                }
                for(Map.Entry<Character,Integer> m: map.entrySet())
                    s+= m.getKey()+"-"+m.getValue()+"\n";
                return s;

        }
        return null;
    }

    @Override
    public String getNumberSolution(String id, Integer no) {

        return null;
    }

    @Override
    public List<Integer> getArraySolution(String id, List arr) {
        switch (id){
            //Largest common substring of a given array of strings
            case "1" :
                

        }
        return null;
    }
}
