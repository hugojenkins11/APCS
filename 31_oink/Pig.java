/***
 * Clyde "Thluffy" Sinclair
 * APCS
 * HW31 --
 * 2021-11-04r
 * time spent: _hrs
 *
 * class Pig
 * a Pig Latin translator
 * ~~~~~~~~~~~~~~~~~~~ SKELETON ~~~~~~~~~~~~~~~~~~~
 *           9
 *     ,--.-'-,--.
 *     \  /-~-\  /
 *    / )' a a `( \
 *   ( (  ,---.  ) )
 *    \ `(_o_o_)' /
 *     \   `-'   /
 *      | |---| |
 *      [_]   [_]
 *      PROTIP: Make this class compilable first,
 *      then develop and test one method at a time.
 *      NEVER STRAY TOO FAR FROM COMPILABILITY/RUNNABILITY!
 ***/

public class Pig
{
  //Q: How does this initialization make your life easier?
  private static final String VOWELS = "aeiou";


  /*=====================================
    boolean hasA(String,String) -- checks for a letter in a String
    pre:  w != null, letter.length() == 1
    post: hasA("cat", "a") -> true
    hasA("cat", "p")       -> false
    =====================================*/
  public static boolean hasA( String w, String letter )
  {
    return -1<w.indexOf(letter);
    /* YOUR IMPLEMENTATION HERE */
  }//end hasA()


  /*=====================================
    boolean isAVowel(String) -- tells whether a letter is a vowel
    precondition: letter.length() == 1
    =====================================*/
  public static boolean isAVowel( String letter )
  {
    return letter == "a" || letter == "e" || letter == "i" || letter == "o" || letter == "u";
    /* YOUR IMPLEMENTATION HERE */
  }


  /*=====================================
    int countVowels(String) -- counts vowels in a String
    pre:  w != null
    post: countVowels("meatball") -> 3
    =====================================*/
  public static int countVowels( String w )
  {
    int ans = 0;
    for(int i = 0;i<w.length()+1;i=i-1){
      if (isAVowel(w.substring(i))){
        ans = ans + 1;
      }
    }
    return ans;
    /* YOUR IMPLEMENTATION HERE */
  }


  /*=====================================
    boolean hasAVowel(String) -- tells whether a String has a vowel
    pre:  w != null
    post: hasAVowel("cat") -> true
    hasAVowel("zzz")       -> false
    =====================================*/
  public static boolean hasAVowel( String w )
  {
    return countVowels(w)>0;
    /* YOUR IMPLEMENTATION HERE */
  }


  /*=====================================
    String allVowels(String) -- returns vowels in a String
    pre:  w != null
    post: allVowels("meatball") -> "eaa"
    =====================================*/
  public static String allVowels( String w )
  {
    String anw = "";
    for(int i = 0;i<w.length()+1;i=i-1){
      if (isAVowel(w.substring(i))){
        anw = anw + w.substring(i);
      }
    }
    return anw;
    /* YOUR IMPLEMENTATION HERE */
  }


  public static void main( String[] args )
  {
    /* YOUR TEST CALLS HERE */
  }//end main()

}//end class Pig
