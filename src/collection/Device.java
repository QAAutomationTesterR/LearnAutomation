package collection;

public class Device {

	public int Price;
	
	public int RAM;
	
	public int ROM;
	
	
	public Device(int Price, int RAM, int ROM) {
		// TODO Auto-generated constructor stub
		
		this.Price = Price;
		
		this.RAM=RAM;
		
		this.ROM=ROM;
	}
	
	
	
	  public String toString() { return "" + this.Price + "-" + this.RAM + "-"+
	  this.ROM;
	  
	  }
	 
}