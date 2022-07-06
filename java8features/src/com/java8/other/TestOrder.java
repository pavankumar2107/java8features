package com.java8.other;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class TestOrder {
    public static void main(String[] args) {
        List<DepartmentSummary> dtList = new ArrayList<DepartmentSummary>();
        DepartmentSummary d1 = new DepartmentSummary("DFW", "Customer Care", 2);
        DepartmentSummary d2 = new DepartmentSummary("ABQ", "Customer Operations", 2);
        DepartmentSummary d3 = new DepartmentSummary("PHX", "Finance", 1);
        DepartmentSummary d4 = new DepartmentSummary("AWR", "Hospital", 1);
        DepartmentSummary d5 = new DepartmentSummary("MNC", "Auto", 0);
        DepartmentSummary d6 = new DepartmentSummary("DER", "Govt", 0);
        DepartmentSummary d7 = new DepartmentSummary("MPC", "Business", 0);
        DepartmentSummary d8 = new DepartmentSummary("JHU", "Airlines", 0);
        DepartmentSummary d9 = new DepartmentSummary("JLU", "Steel", 0);

        dtList.add(d6);
        dtList.add(d1);
        dtList.add(d5);
        dtList.add(d9);
        dtList.add(d4);
        dtList.add(d3);
        dtList.add(d7);
        dtList.add(d8);
        dtList.add(d2);
        System.out.println("Before sort:" + dtList);
//        List<DepartmentSummary> sortedList = dtList.stream().sorted(Comparator.comparing(DepartmentSummary::getDeptName)).collect(Collectors.toList());
//        System.out.println("After sort:" + sortedList);

        Comparator<DepartmentSummary> comparator = (o1, o2) -> {
            if (o1.getSortingOrder() == 2 || o2.getSortingOrder() == 2 || o1.getSortingOrder() == 1 || o2.getSortingOrder() == 1)
                return 1;
            else return o1.getDeptName().compareTo(o2.getDeptName());

        };
        List<DepartmentSummary> sortedList =  dtList.stream().sorted(Comparator.comparing(DepartmentSummary::getSortingOrder).reversed()).sorted(comparator).collect(Collectors.toList());
//        Collections.sort(sortedList, comparator);
        System.out.println("==================================================================");
        System.out.println("After sort:" + sortedList);

    }
}

