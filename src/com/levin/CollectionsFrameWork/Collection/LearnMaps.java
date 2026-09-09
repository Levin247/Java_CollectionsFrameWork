package com.levin.CollectionsFrameWork.Collection;

import java.util.*;

public class LearnMaps
{
    public static void main(String[] args)
    {
        //List<Integer> list = new ArrayList<>();

        Map<String , String> map = new HashMap<>();

        map.put("us" , "United States");
        map.put("in" , "India");
        map.put("en" , "England");
        map.putIfAbsent("in" , "India2");

        System.out.println(map.containsKey("in"));
        System.out.println(map.containsKey("us"));

        System.out.println(map);

        System.out.println(map.get("in"));
        System.out.println(map.get("en"));
        System.out.println(map.getOrDefault("sen" , "Others"));


        Set<String> keys = map.keySet();

        ArrayList<String> keys1 = new ArrayList<>(map.keySet());
        System.out.println(keys1);

        System.out.println(keys);

        Set<Map.Entry<String , String>> entries = map.entrySet();


        for(Map.Entry<String , String> entry : entries)
        {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }

    }
}
