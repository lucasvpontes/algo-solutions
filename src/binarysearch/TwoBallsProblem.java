package binarysearch;

public class TwoBallsProblem {
  public static void main(String[] args) {
    boolean[] arr = new boolean[]{false, false, false, false, false, true, true, true, true};
    System.out.println(twoBallsProblem(arr));
  }

  public static int twoBallsProblem(boolean[] arr) {
    int jmpAmount = (int) Math.floor(Math.sqrt(arr.length));
    int i = jmpAmount;

    for (; i < arr.length; i += jmpAmount) {
      if (arr[i]) {
        break;
      }
    }

    i -= jmpAmount; // that is used to remove the

    for (int j = 0; j <= jmpAmount && i < arr.length; i++, j++) {
      if (arr[i]) {
        return i;
      }
    }

    return -1;
  }
}
