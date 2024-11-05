public class reviewDriver
{
    public static void main(String[] args) {
        System.out.println(Review.sentimentVal("happily"));
        System.out.println(Review.sentimentVal("terrible"));
        System.out.println(Review.sentimentVal("cold"));
        
        System.out.println(Review.sentimentVal("joy"));
        System.out.println(Review.sentimentVal("super"));
        System.out.println(Review.sentimentVal("tragic"));
        
        System.out.println(Review.totalSentiment("downlowReview.txt"));
        System.out.println(Review.starRating("downlowReview.txt"));
        System.out.println(Review.totalSentiment("SimpleReview.txt"));
        System.out.println(Review.starRating("SimpleReview.txt"));
        
        System.out.println(Review.fakeReview("SimpleReview.txt"));
        System.out.println(Review.positiveReview("SimpleReview.txt"));
        System.out.println(Review.negativeReview("SimpleReview.txt"));
    }
}