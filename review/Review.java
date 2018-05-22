public class Review {
  String s;
  short sh;
  int i;
  long l;
  float f;
  double d;
  char c;
  boolean b;

  public static void main(String[] args) {
    Review defaultvalue = new Review();
    System.out.println("The default value for String variable is: " + defaultvalue.s);
    System.out.println("The default value for Short variable is: " + defaultvalue.sh);
    System.out.println("The default value for Int variable is: " + defaultvalue.i);
    System.out.println("The default value for Long variable is: " + defaultvalue.l);
    System.out.println("The default value for Float variable is: " + defaultvalue.f);
    System.out.println("The default value for Double variable is: " + defaultvalue.d);
    System.out.println("The default value for Char variable is: " + defaultvalue.c);
    System.out.println("The default value for Boolean variable is: " + defaultvalue.b);
  }
}
