
package cse360assignment02;

public class AddingMachine 
{
  private int total;
  
  public AddingMachine () 
  {
    total = 0;  // not needed - included for clarity
  }
  
  public class Calculator
  {
	  private int total;
	  private String history;
  
  public Calculator()
  {
	  total = 0;
	  history = new String("0");
  }
  
  public int getTotal () 
  {
    return 0;
  }
  
  public void add (int value) 
  {
	  total = value + total;
	  history += "+" +value;
  }

  public void subtract (int value) 
  {
	  total = total - value;
	  history += "-" +value;
  }

  public String toString () 
  {
    return history.toString();
  }

  public void clear()
  {
	  clear();
	
  }
  }
}
