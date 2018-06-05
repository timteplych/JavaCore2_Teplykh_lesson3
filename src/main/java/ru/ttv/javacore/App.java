package ru.ttv.javacore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        String[] masStr = {"Moscow","London", "New York", "Madrid", "Prague", "Berlin","Chicago","London","Milano","New York","Barcelona","Prague"};
        HashSet<String> cities = new HashSet<>();
        HashMap<String,Integer> citiesMap = new HashMap<>();

        for (String aMasStr : masStr) {
            cities.add(aMasStr);
            if (!citiesMap.containsKey(aMasStr)) {
                citiesMap.put(aMasStr, 1);
            } else {
                citiesMap.put(aMasStr, citiesMap.get(aMasStr) + 1);
            }
        }

        System.out.println(cities);
        System.out.println(citiesMap);

        Reference ref = new Reference();
        ref.add("Ivanov","254-23-57");
        ref.add("Ivanov","254-23-57");
        ref.add("Petrov","544-22-14");
        ref.add("Petrov","544-22-15");
        ref.add(null,"0000000000");

        System.out.println(ref.get("Petrov"));
        System.out.println(ref.get("Sidorov"));
        System.out.println(ref.get("Ivanov"));
        System.out.println(ref.get(null));
    }
}
