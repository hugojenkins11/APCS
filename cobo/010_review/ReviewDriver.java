public class ReviewDriver {
  public static void main(String[] args) {
    /*
    System.out.println(Review.sentimentVal("apple"));
    System.out.println(Review.sentimentVal("nice"));
    System.out.println(Review.sentimentVal("quickly"));
    System.out.println(Review.sentimentVal("ryan"));

    double num = Review.sentimentVal("warm");
    String word = Review.sentimentVal(0.5);
    double x = Review.sentimentVal("good", "bad");
    */

    System.out.println(Review.totalSentiment("SimpleReview.txt"));
  }
}
