package com.wizardom.Arrays.Easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/**
 * @author Ibekason Alexander Onyebuchi
 */

/*
Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.

You may assume that each input would have exactly one solution, and you may not use the same element twice.

You can return the answer in any order.

link : https://leetcode.com/problems/two-sum/
 */

public class TwoSum {

    static List<Integer> getTwoSum(int[] arr, int target) {
        List<Integer> result = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            int num = arr[i];
            for (int j = 1; j < arr.length; j++) {
                num = arr[i];
                if (j != i) {
                    num += arr[j];
                    if (num == target) {
                        result.add(i);
                        result.add(j);
                        break;
                    }
                }
            }
            if (num == target) break;

        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(getTwoSum(new int[]{2, 7, 9, 30}, 39));
        // [2, 3]

    }
}
