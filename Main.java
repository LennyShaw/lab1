//import java.util.*;
/*
 * IT-2660 - Lab 1
 * Student Name: Lenny Shaw
 */

public class Main {
  public static void main(String[] args) {
    System.out.println("hello, world!");

    Lab1 lab = new Lab1();
    System.out.println(lab.increment(1));

    //create array
    System.out.print("The order of the array is: ");
    int[] nums ={5, 9, 3, 12, 7, 3, 11, 5};
    int a = 1;
    int b =5;
    //print array
    int i = 0;
    while(i < nums.length){
      System.out.print(nums[i]+ " ");
      i++;
    }
    System.out.println();
    //print array in reverse
    System.out.print("The reverse order of the array is: ");
    for (int j = nums.length -1; j >= 0; j--){
      System.out.print(nums[j] + " ");
    }
    //print first and last number in array
    System.out.println();
    System.out.println("First number in array: "+nums[0]);
    System.out.println("Last number in array: "+nums[nums.length-1]);
    //calling out methods
    Lab1 lab1 = new Lab1();
    System.out.println("The max value between A and B is: " + lab1.max( a, b));
    System.out.println("The min value between A and B is: " + lab1.min(a,b));
    System.out.println("The average of the array is: " + lab1.average(nums));
    System.out.println("The sum of the array is: " + lab1.sum(nums));
    System.out.println("The max value of the array is: " + lab1.maxloop(nums));
    System.out.println("The min value of the array is: "+lab1.minloop(nums));
  }
}     

// Add all of the methods here
class Lab1 {
  public int increment(int num) {
    return ++num;
  }
  //max
  public int max(int a, int b){
    if (a>b){
      return a;
    } else {
      return b;
    }
  }
  //min
  public int min(int a, int b){
    if (a<b){
      return a;
    } else{
      return b;
    }
  }
  //sum
  public int sum(int[] nums){
    int total = 0;
    for (int num : nums){
      total += num;
    }
    return total;
  }
  //average
  public int average(int[] nums){
    int total = 0;
    for (int num : nums){
      total += num;
    }
    return total / nums.length;
  }
  //max (for loop)
  public int maxloop(int[] nums){
    int maxval = nums[0];
    for (int i = 1; i < nums.length; i++){
      if (nums[i]> maxval){
        maxval = nums[i];
      }
    }
    return maxval;
  }
  //min (for loop)
  public int minloop(int[] nums){
    int minval = nums[0];
    for (int i =1; i <nums.length; i++){
      if (nums [i] < minval){
        minval = nums[i];
      }
    }
    return minval;
  }
}