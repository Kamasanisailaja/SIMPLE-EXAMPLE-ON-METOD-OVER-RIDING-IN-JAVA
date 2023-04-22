    /*OVER RIDING IN JAVA*/

import java.util.*;
 class Mbu
{
  void display()
 {
   System.out.println("it contains many departments");
 }
}
class Csse extends Mbu
{
  void display()

{
  super.display();
  System.out.println("one of our branch is CsSE");
}
 void good()
{
  System.out.println("it is best dept");
}

}
class A extends Csse
{
  void display()
 {
   System.out.println("We belongs to CSsE A");
}
 void good()
{
  System.out.println("our is the best Section");
}
 
}
class Svec
{
 public static void main(String args[])
 {
   Csse a=new Csse();
   a.display();
   a.good();
   A b=new A();
   b.display();
   b.good();
  }
}