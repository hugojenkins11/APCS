// Team Gnocchi -- Hugo Jenkins (Boary), Ryan Lau (Jon), and Brian Kang (Vivian)
// APCS pd6
// L06 -- Read/Review/Expand
// 2022-02-11f
// time spent: .5hrs

import java.util.Scanner;
import java.io.File;
import java.util.HashMap;
import java.util.ArrayList;
import java.util.Random;
import java.io.*;


public class Activity5 {
  public static void main(String[] args) {
    String text = textToString("GreatGatsby.txt");
    
  }

  public static String textToString(String fileName) {
      String temp = "";
      try {
          Scanner input = new Scanner(new File(fileName));

          // add 'words' in the file to the string, separated by a single space
          while (input.hasNext()) {
              temp = temp + input.next() + " ";
          }
          input.close();

      } catch (Exception e) {
          System.out.println("Unable to locate " + fileName);
      }
      // make sure to remove any additional space that may have been added at the end
      // of the string.
      return temp.trim();
  }

}
