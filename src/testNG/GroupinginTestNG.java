package testNG;

import org.testng.annotations.Test;

public class GroupinginTestNG {

	
	@Test(groups = {"Oppo"})
	public void Oppo()
	{
		
		System.out.println("Oppo Phone is launched - o");
}

	@Test(groups = {"Samsung"})
	public void Samsung()
	{
		
		System.out.println("Oppo Phone is launched- S");
}
	@Test(groups = {"Realme"})
	public void Realme()
	{
		
		System.out.println("Oppo Phone is launched - R");
}

	
	@Test(groups = {"Vivo"})
	public void Vivo()
	{
		
		System.out.println("Oppo Phone is launched- V");
}

	@Test(groups = {"Motorola"})
	public void Motorola()
	{
		
		System.out.println("Oppo Phone is launched- M");
}

	
	
	
}