package binarysearch;

import java.util.Random;
public class BinarySearch {

  public static void main(String[] args) {

    Random random = new Random();
    int number = random.nextInt(1, 10);
    System.out.println("generated number: " + number);
    int[] n = new int[]{1, 2, 3, 4, 5, 9};
    int low = 0;
    int high = n.length;
    boolean exists = false;

    while (high > low) {
      int mid = low + (high - low) / 2;
      int v = n[mid];


      if (v == number) {
        System.out.println("position: " + mid);
        exists = true;
        break;
      }

      if (v > number) {
        high = mid;
      } else {
        low = mid + 1;
      }
    }

    if(!exists)
      System.out.println("position: null");
  }
}
