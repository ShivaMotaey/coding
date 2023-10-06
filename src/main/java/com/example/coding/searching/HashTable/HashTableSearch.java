package com.example.coding.searching.HashTable;

import java.util.HashMap;
import java.util.Map;

public class HashTableSearch {
    public static void main(String[] args) {
        Map<String, Integer> studentGrades = new HashMap<>();
        studentGrades.put("Alice", 90);
        studentGrades.put("Bob", 85);
        studentGrades.put("Charlie", 78);
        studentGrades.put("David", 92);

        String targetStudent = "Bob";

        if (studentGrades.containsKey(targetStudent)) {
            int grade = studentGrades.get(targetStudent);
            System.out.println("Hash Table Search Result: " + targetStudent + "'s grade is " + grade);
        } else {
            System.out.println("Hash Table Search Result: " + targetStudent + " not found");
        }
    }
}
