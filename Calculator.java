/*
program to perform calculations
between two numbers 
by creating objects and calling the methods
*/

public class Calculator
{

  public Calculator()
  {

  }
  //adding two variables a and b
  public int add(int a,int b)
  {
    //returning the value a+b
    return (a+b);
  
}

  //substracting two variables a and b
public int substract(int a,int b)
{
  
    //returning the value a-b
 return (a-b);
}
  //multiplying the variables 
 public int multiply(int a, int b)
 {
   
    //returning the value a*b
   return a*b;
 }
  //dividing a and b
 public int divide(int a,int b)
 {
   
    //returning the value a/b
   return a/b ;
 }
  //modulus method
public int modulo(int a,int b)
{
  
    //returning the value a%b
  return a%b ;
}
public static void main(String[] args)

{
  /*Creating an object and  calling the methods with the instance*/
  Calculator myCalculator = new Calculator();
  System.out.println(myCalculator.add(5,7));
  System.out.println(myCalculator.substract(45,11));
    System.out.println(myCalculator.multiply(5,5));
  System.out.println(myCalculator.divide(45,5));
  

}
}
