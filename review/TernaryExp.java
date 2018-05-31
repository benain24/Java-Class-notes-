public class TernaryExp {

  public static void main(String[] args) {

    String answer, name = "Benahi";
    boolean isBenahin = name.equals("Benahin") ? true : false;
    //                    condition        true exp   false expression

    answer = isBenahin ? "Benahin" : "not Benahin";

    System.out.println(name + " is " + answer); 
    /* this is another way to condition check

    for example : if-else way to check

    if (name.equals("Benahin")) {
    return "Benahin";
    } else {
    return "not Benahin";
    }*/
  }
}
