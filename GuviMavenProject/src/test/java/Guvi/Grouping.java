package Guvi;

import org.testng.annotations.Test;

public class Grouping {
 
  @Test (groups = { "smoke" })
 
  public void Car1() {
 
   System.out.println("Batch Car - Test car 1");
 
  }
 
  @Test (groups = {"smoke"} )
 
  public void Car2() {
 
   System.out.println("Batch Car - Test car 2");
 
  }
 
  @Test (groups = { "regression", "smoke" })
 
  public void Scooter1() {
 
   System.out.println("Batch Scooter - Test scooter 1");
 
  }
 
  @Test (groups = { "regression" })
 
  public void Scooter2() {
 
   System.out.println("Batch Scooter - Test scooter 2");
 
  }
 
  @Test (groups = {"Car",  "Sedan Car"} )
 
  public void Sedan1() {
 
   System.out.println("Batch Sedan Car - Test sedan 1");
 
  }
 
}