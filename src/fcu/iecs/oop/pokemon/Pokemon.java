package fcu.iecs.oop.pokemon;

public class Pokemon {
 private final String name;
 private  int  cp ;

 
 public Pokemon(String name ,int cp)
 {
  this.name = name;
  this.cp = cp;
 }
 
 public String Pname()
 {
  return name;
  
 }
 
 public int count()
 {
  
  return cp;
  
 }
 
 public void addcp(int cp)
 {
  
  this.cp+= cp;
  
 }


}