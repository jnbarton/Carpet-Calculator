public class TestCarpetCalculator
{public static void main(String[] args)
  {CarpetCalculator CD = new CarpetCalculator();  //object created with default constructor
   CarpetCalculator Overloaded = new CarpetCalculator(3.4, 5.6, 7.8, 9.9, 1.1); //constructor
   CarpetCalculator.setRunningTotal(89.0);  //set RunningTotal, a static method, use class
	System.out.println(CD); //automatically uses toString method if set
	System.out.println(Overloaded); //automatically uses toString method if set
	System.out.println("Running Total is: " +CarpetCalculator.getRunningTotal());
	CD.setRunningTotal(500 + CarpetCalculator.getRunningTotal());
	System.out.println("Running Total is: " +CarpetCalculator.getRunningTotal());
	}}