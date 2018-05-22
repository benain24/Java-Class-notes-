public class SwitchStatementReview {
  public static void main(String[] args) {
    int [] months = {4, 7, 10, 12};
    String bdaymonths;

    switch (months) {
      case 1: bdaymonths = "January";
              break;
      case 2: bdaymonths = "February";
              break;
      case 3: bdaymonths = "March";
              break;
      case 4: bdaymonths = "April";
              break;
      case 5: bdaymonths = "May";
              break;
      case 6: bdaymonths = "June";
              break;
      case 7: bdaymonths = "July";
              break;
      case 8: bdaymonths = "August";
              break;
      case 9: bdaymonths = "September";
              break;
      case 10: bdaymonths = "October";
              break;
      case 11: bdaymonths = "November";
              break;
      case 12: bdaymonths = "December";
              break;
    }
    System.out.println(bdaymonths.length);
  }
}
