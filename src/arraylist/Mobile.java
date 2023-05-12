package arraylist;

public class Mobile {

	public int Price;
	
	public int storage;
	
	public int processor;
	
	
	
	  public String toString() { 
		  return "" + this.Price +"-" + this.storage+"-" +this.processor;
		 // return "" + this.Price ;
	  
	  }
	 
	

	public Mobile(int Price, int storage, int processor) {
		// TODO Auto-generated constructor stub
		
		this.Price = Price;
		
		this.storage = storage;
		
		this.processor = processor;
	}

}
