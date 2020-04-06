package com.codurance.max_sub_array;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import static org.junit.jupiter.api.Assertions.assertEquals;
//Problem
//  This problem was asked by Amazon.
//
// Given an array of numbers, find the maximum sum of any contiguous
// subarray of the array.
//
// For example, given the array [34, -50, 42, 14, -5, 86],
// the maximum sum would be 137, since we
// would take elements 42, 14, -5, and 86.
//
// Given the array [-5, -1, -8, -9], the maximum sum would be 0,
// since we would not take any elements.
//
// Do this in O(N) time.

public class MaxSubArrayShould {
  @ParameterizedTest
  @MethodSource("arraySum")
  void return_sum_of_highest_sub_array(int[] array, int number) {
    MaxSubArray maxSubArray = new MaxSubArray();
    assertEquals(number, maxSubArray.maxSub(array));
  }


  public static Object[] arraySum(){
    return new Object[][]{
            {new int[]{}, 0},
            {new int[]{1, -3, 2, -5, 7, 6, -1, -4, 11, -23}, 19 },
            {new int[]{-70, -59, -10, 20, 110, -300}, 130}
    };
  }
}
