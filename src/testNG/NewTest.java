package testNG;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

//If we do have multipe @Tests means,beforemethod and aftermethod annotation will occur in betweeen the tests

public class NewTest {
  @Test
  public void test() {
	  
	  System.out.println("One- Test");
  }
  @BeforeMethod
  public void beforeMethod() {
	  
	  System.out.println("One- BeforeMethod");
  }

  @AfterMethod
  public void afterMethod() {
	  
	  System.out.println("One- afterMethod");
  }

  @BeforeClass
  public void beforeClass() {
	  
	  System.out.println("One- beforeClass");
  }

  @AfterClass
  public void afterClass() {
	  
	  System.out.println("One- afterClass");
  }

  @BeforeTest
  public void beforeTest() {
	  
	  System.out.println("One- beforeTest");
  }

  @AfterTest
  public void afterTest() {
	  
	  System.out.println("One- AfterTest");
  }

  @BeforeSuite
  public void beforeSuite() {
	  
	  System.out.println("One- beforeSuite");
  }

  @AfterSuite
  public void afterSuite() {
	  
	  System.out.println("One- afterSuite");
  }

}
