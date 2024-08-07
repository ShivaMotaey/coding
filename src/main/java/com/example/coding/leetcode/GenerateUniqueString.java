package com.example.coding.leetcode;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Arrays;

/*
Write a java program to accept a variable x. x can be any number from 1 to 230-1.

Generate a file with x number of lines and each line consist of a string that is unique with 100 characters long

Limitation: This java program needs to run with only 10M of ram.
*/

public class GenerateUniqueString {

    public static void main(String[] args) throws IOException {
        GenerateUniqueString generator = new GenerateUniqueString();
        generator.generateStrings(50, "D:\\temp-folders\\unique-string.txt");
    }

    public void generateStrings(int x, String path) throws IOException {
        byte[] bytes = new byte[100];
        Arrays.fill(bytes, (byte) 'a');

        byte[] crlf = new byte[] {'\r', '\n'};

        FileOutputStream fileOutputStream = new FileOutputStream(path);

        for (int i = 0; i < x; i++) {
            fileOutputStream.write(bytes);
            fileOutputStream.write(crlf);
            fileOutputStream.flush();

            for (int j = 0; j < 100; j++) {
                bytes[j]++;
                if (bytes[j] <= 'z') {
                    break;
                } else {
                    bytes[j] = 'a';
                }
            }
        }

        fileOutputStream.close();
    }
}
