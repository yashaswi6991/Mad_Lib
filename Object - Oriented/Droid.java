public class Droid
{
  String name;
  int batteryLevel = 100;
  public Droid(String droidName)
  {
    name = droidName;
  
  }
  public void performTask(String task)
  {
     batteryLevel = batteryLevel - 10;
   System.out.println(name + "is performing task:" + batteryLevel); 
   
   }
    public String toString()
  {
    return "Hello, I'm the droid: " + name;
  }
  public static void main(String[] args)
  {
      Droid Codey = new Droid("Codey");
      System.out.println(Codey);
      
  }


}