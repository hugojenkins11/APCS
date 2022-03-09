// Blonde Himbos: Hugo Jenkins + Boary, Micheal Kamela, Jun Hong Wang
// APCS pd6
// HW 72: So So Fast
// 2022-03-08
// time spent:

public class FastSelect {
  /*
  * Preconds: there are less than or y elements in the array and there are not repeating values
  * Postconds: returns the yth smallest element
  * Algo:
  1) Partition the array at position y+1
  2) Iterate through the array to the left of the pivot index and find the greatest value
  * O(n)
  * Worst Case: You are searching for the greatest value in the array
  * Best Case: You are searching for the smallest value in the array
  */
  public static int fastSelect(int[] arr, int y) {
    Mysterion.partition(arr, 0, arr.length-1, y-1);
    int max = arr[0];
    for (int i = 1; i < y; i++) {
      if (arr[i] > max) {
        max = arr[i];
      }
    }
    return max;
  }

  public static void main(String[] args) {
    int[] arr1 = {8,21,17,69,343};
    int[] arr2 = {3,0,16,599,2,234,23,4,231,12,432,24};
    int[] arr3 = {1,28,33,4982,37};
    int[] arr4 = {5,4,17,9000,6};
    int[] arr5 = {3,0,16,599,1024};

    System.out.println(fastSelect(arr5, 1));
    System.out.println(fastSelect(arr5, 2));
    System.out.println(fastSelect(arr5, 3));
    System.out.println(fastSelect(arr5, 4));
    System.out.println(fastSelect(arr5, 5));

    for (int i = 1; i < arr2.length -1; i++) {
      System.out.println(fastSelect(arr2, i));
    }
  }
}
