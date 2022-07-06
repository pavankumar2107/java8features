package com.java8.other;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class CompareMap {
    public static void main(String[] args) {
        Map<String, String> asiaCapital1 = new HashMap<String, String>();
        asiaCapital1.put("Japan", "Tokyo");
        asiaCapital1.put("South Korea", "Seoul");

        Map<String, String> asiaCapital2 = new HashMap<String, String>();
        asiaCapital2.put("South Korea", "Seoul");
        asiaCapital2.put("Japan", "Tokyo");

        Map<String, String> asiaCapital3 = new HashMap<String, String>();
        asiaCapital3.put("Japan", "Tokyo");
        asiaCapital3.put("China", "Beijing");

        System.out.println(asiaCapital1.equals(asiaCapital2));
        System.out.println(asiaCapital1.equals(asiaCapital3));
        System.out.println(areEqual(asiaCapital1,asiaCapital2));


        Map<String, String[]> asiaCity1 = new HashMap<String, String[]>();
        asiaCity1.put("Japan", new String[] { "Tokyo", "Osaka" });
        asiaCity1.put("South Korea", new String[] { "Seoul", "Busan" });

        Map<String, String[]> asiaCity2 = new HashMap<String, String[]>();
        asiaCity2.put("South Korea", new String[] { "Seoul", "Busan" });
        asiaCity2.put("Japan", new String[] { "Tokyo", "Osaka" });

        System.out.println(areEqualWithArrayValue(asiaCity1,asiaCity2));

    }

    private static boolean areEqual(Map<String, String> first, Map<String, String> second) {
        if (first.size() != second.size()) {
            return false;
        }

        return first.entrySet().stream()
                .allMatch(e -> e.getValue().equals(second.get(e.getKey())));
    }

    private static boolean areEqualWithArrayValue(Map<String, String[]> first, Map<String, String[]> second) {
        if (first.size() != second.size()) {
            return false;
        }

        return first.entrySet().stream()
                .allMatch(e -> Arrays.equals(e.getValue(), second.get(e.getKey())));
    }
}
