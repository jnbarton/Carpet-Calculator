public class CarpetCalculator
{ // declare instance variables
 private double length;
 private double width;
 private double unitCost;
 private double laborCost;
 private double jobCost;
 private static double RunningTotal= 0;  //static variable 
 
 public CarpetCalculator()  //default constructor
 {length= 0;
  width = 0;
  unitCost = 0;
  laborCost = 0;
  jobCost = 0;}
  
 public CarpetCalculator(double L, double W, double U, double LC, double J) //overloaded constructor
 {length= L;
  width = W;
  unitCost = U;
  laborCost = LC;
  jobCost = J;}
   
public static void setRunningTotal(double RT)  //mutator
{RunningTotal = RT;}

public static double getRunningTotal()  //accessor
{return RunningTotal;}	

public double getArea()
{return length * width;}

public String toString()
{return "length: " + length + " width: " + width + " unitCost: " + unitCost + " laborCost: "
 + laborCost + " jobCost: " + jobCost;}
 
 }
