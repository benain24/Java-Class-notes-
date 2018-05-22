public class DefaultValues {

  private String brand;
  private boolean empty;
  private byte b;
  private int a;
  private short s;
  private long l;
  private double d;
  private float f;
  private char c;

  public static void main(String[] args) {

    DefaultValues wbe = new DefaultValues();
    System.out.print("Empty = " + wbe.empty);
    System.out.print(", Brand = " + wbe.brand);
    System.out.print(", Byte = " + wbe.b);
    System.out.print(", Int = " + wbe.a);
    System.out.print(", Short = " + wbe.s);
    System.out.print(", Long = " + wbe.l);
    System.out.print(", Double = " + wbe.d);
    System.out.print(", Float = " + wbe.f);
    System.out.print(", Char = " + wbe.c);


  }

}
