package com.example.coding.leetcode;

import java.util.LinkedList;
import java.util.stream.Collectors;


//https://leetcode.com/problems/add-two-numbers/
public class AddTwoNumbers {


//    You are given two non-empty linked lists representing two non-negative integers. The digits are stored in reverse order, and each of their nodes contains a single digit. Add the two numbers and return the sum as a linked list.
//
//    You may assume the two numbers do not contain any leading zero, except the number 0 itself.
//
//
//
//            Example 1:
//
//
//    Input: l1 = [2,4,3], l2 = [5,6,4]
//    Output: [7,0,8]
//    Explanation: 342 + 465 = 807.
//    Example 2:
//
//    Input: l1 = [0], l2 = [0]
//    Output: [0]
//    Example 3:
//
//    Input: l1 = [9,9,9,9,9,9,9], l2 = [9,9,9,9]
//    Output: [8,9,9,9,0,0,0,1]
//
//
//    Constraints:
//
//    The number of nodes in each linked list is in the range [1, 100].
//            0 <= Node.val <= 9
//    It is guaranteed that the list represents a number that does not have leading zeros.


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
