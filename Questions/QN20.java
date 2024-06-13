package Questions;

public class QN20 {
    public static void main(String[] args) {
          // Given array
          int[] num = {1, 5, 7, 9, -1, 10, 40, 4, 49};

          // Find maximum, minimum, and sum
          int max = findMaximum(num);
          int min = findMinimum(num);
          int sum = findSum(num);
  
          // Output results
          System.out.println("Maximum number in the array: " + max);
          System.out.println("Minimum number in the array: " + min);
          System.out.println("Sum of all numbers in the array: " + sum);
      }
  
      // Function to find maximum number in the array
      public static int findMaximum(int[] arr) {
          int max = arr[0];
          for (int i = 1; i < arr.length; i++) {
              if (arr[i] > max) {
                  max = arr[i];
              }
          }
          return max;
      }
  
      // Function to find minimum number in the array
      public static int findMinimum(int[] arr) {
          int min = arr[0];
          for (int i = 1; i < arr.length; i++) {
              if (arr[i] < min) {
                  min = arr[i];
              }
          }
          return min;
      }
  
      // Function to find sum of all numbers in the array
      public static int findSum(int[] arr) {
          int sum = 0;
          for (int num : arr) {
              sum += num;
          }
          return sum;
    }
}
