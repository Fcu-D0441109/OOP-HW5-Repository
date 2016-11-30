package fcu.iecs.oop.pokemon;

import java.util.Random;

public class GYM {
 public static void fight(Pokemon p1, Pokemon p2)
 {
  
  Random a = new Random();
  
  int  choose = a.nextInt(2)+1;
  
  if(choose==1)
  {
   System.out.println("Winner is["+p1.Pname()+"]");
   p1.addcp(500);
  }
  else
  {
   System.out.println("Winner is["+p2.Pname()+"]");
   p2.addcp(500);
  }
  
  
  
 }
 

}