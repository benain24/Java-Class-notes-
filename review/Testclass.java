Exam 808: Java SE 8
1. Given:
import java.util.ArrayList;
import java.util.List;
public class JavaSETest {
    public static void main(String[] args) {
        List<Integer> elements = new ArrayList<>();
        elements.add(10);
        int firstElmnt = elements.get(1);
        System.out.println(firstElmnt);
} }
What is the result?
A) null
B) 10
C)0

D) An IndexOutOfBoundsException is thrown at runtime.

2. Given the code fragment:
// Line n1
switch (cardVal) {
    case 4: case 5: case 6:
    case 7: case 8:
        System.out.println("Hit");
        break;
    case 9: case 10: case 11:
        System.out.println("Double");
        break;
    case 15: case 16:
        System.out.println("Surrender");
        break;
    default:
System.out.println("Stand");
Which two code fragments can be inserted at Line n1, independently, enable to print Stand?
A) int cardVal = 6; B) int cardVal = 10; C) int cardVal = 14; D) int cardVal = 18;
}


3. Given:
abstract class Writer {
    public static void write() {
        System.out.println("Writing...");
    }
}
class Author extends Writer {
    public static void write() {
        System.out.println("Writing book");
} }
public class Programmer extends Writer {
    public static void write() {
        System.out.println("Writing code");
    }
    public static void main(String[] args) {
        Writer w = new Programmer();
        w.write();
} }
What is the result?

A) Writing...

B) Writing book C) Writing code D) Compilation fails.
4. Given:
class SuperClass {
    SuperClass(int x) {
        System.out.println("Super");
    }
}

//because of the static keyword, java will run Writer in Writer w = new Programmer(); and Programmer() w/o static keyword


public class SubClass extends SuperClass {
    SubClass() {
// Line n1
        System.out.println("Sub 2");
    }
}
Which statement, when inserted at Line n1, enables the code to compile?
A) this(10);

B) super(10);

C) SuperClass(10);
D) super.SuperClass (10);

5. Given the code fragment:
public class TestClass {
    public static void main(String[] args) {
        List<String> items = new ArrayList<>();
        items.add("Pen");
        items.add("Pencil");
        items.add("Box");
        for (String i : items) {
            if (i.indexOf("P") == 0) {
} }
}
    continue;
} else {
    System.out.print(i+" ");
}
What is the result?
A) Pen Pencil Box B) Pen Pencil
C) Box
D) Compilation fails.
6. Which access modifier makes a member available only to classes within the same package or subclasses?
A) private

B) protected

C) public
D) package-private

7. Given the code fragment:
public class Test {
    public static void main(String[] args) {
        int x = 10;
        int y = 2;
        try {
            for (int z = 2; z >= 0; z--) {
                int ans = x / z;
                System.out.print(ans+ " ");
            }
        } catch (Exception e1) {
            System.out.println("E1");
        } catch (ArithmeticException e1) {
            System.out.println("E2");
} }
}
What is the result?
A) E1
B) E2

C)5 10 E1

D) Compilation fails.
8. Given the code fragment:
  StringBuilder s1 = new StringBuilder("Java");
  String s2 = "Love";
  s1.append(s2);
  s1.substring(4);
  int foundAt = s1.indexOf(s2);
  System.out.println(foundAt);
What is the result?
A) -1
B)3
C)4
D) A StringIndexOutOfBoundsException is thrown at runtime.
Answers:
1) D
2) CandD 3) A
4) B
5) C
6) B
7) D
8) C
