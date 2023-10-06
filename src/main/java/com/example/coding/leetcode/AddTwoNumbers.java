package com.example.coding.leetcode;

import java.util.LinkedList;
import java.util.stream.Collectors;

public class AddTwoNumbers {


    public static void main(String[] args) {

        LinkedList<Integer> l1= new LinkedList();
        l1.add(2);
        l1.add(4);
        l1.add(3);
        LinkedList<Integer> l2= new LinkedList();
        l2.add(5);
        l2.add(6);
        l2.add(4);

        AddTwoNumbers obj = new AddTwoNumbers();
        System.out.println(obj.addTwoNumbers(l1, l2));
        System.out.println(obj.addTwoNumbers1(l1, l2));

    }
    public String addTwoNumbers(LinkedList<Integer> l1, LinkedList<Integer> l2) {
        StringBuilder sl1 = new StringBuilder();
        StringBuilder sl2 = new StringBuilder();
        sl1.append(l1.stream().map(i-> i.toString()).collect(Collectors.joining("")));
        sl2.append(l2.stream().map(i-> i.toString()).collect(Collectors.joining("")));
        sl1 = sl1.reverse();
        sl2 = sl2.reverse();

        Integer r = Integer.valueOf(sl1.toString()) + Integer.valueOf(sl2.toString());
        StringBuilder sb = new StringBuilder(r.toString());
        return sb.reverse().toString();
    }

    public LinkedList addTwoNumbers1(LinkedList<Integer> l1, LinkedList<Integer> l2) {
        StringBuilder sl1 = new StringBuilder();
        StringBuilder sl2 = new StringBuilder();
        sl1.append(l1.stream().map(i-> i.toString()).collect(Collectors.joining("")));
        sl2.append(l2.stream().map(i-> i.toString()).collect(Collectors.joining("")));
        sl1 = sl1.reverse();
        sl2 = sl2.reverse();

        Integer r = Integer.valueOf(sl1.toString()) + Integer.valueOf(sl2.toString());
        StringBuilder sb = new StringBuilder(r.toString());
        char[] chars =sb.reverse().toString().toCharArray();
        LinkedList<Integer> result = new LinkedList<>();
        for (char c:chars) {
            result.add(Integer.valueOf(String.valueOf(c)));
        }
        return result;
    }
}
