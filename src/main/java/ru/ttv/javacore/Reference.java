package ru.ttv.javacore;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

class Reference {
    private HashMap<String,HashSet<String>> ref = new HashMap<>();

    void add(String surname, String phoneNumber){
        if(surname == null){
            return;
        }
        if(ref.containsKey(surname)){
            ref.get(surname).add(phoneNumber);
        }else{
           HashSet<String> phones = new HashSet<>();
           phones.add(phoneNumber);
           ref.put(surname,phones);
        }
    }

    String get(String surname){
        if(ref.containsKey(surname)){
            HashSet<String> phones = ref.get(surname);
            return Arrays.toString(phones.toArray());
        }else{
            return "";
        }
    }
}
