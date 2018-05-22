public class StringBuilderEx {
  public static void main(String[] args) {
    StringBuilder sbe = new StringBuilder("surprise").insert(3, "!!!");
    System.out.println(sbe);
  }
}
