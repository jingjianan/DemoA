package example1;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;

public class TestNGLearn1 {
	
	@org.testng.annotations.BeforeClass
	public void BeforeClass(){
		System.out.println("---BeforeClass---");
	}
	@Test
	public void Test1(){
		System.out.println("---Test1---");
	}
	@Test
	public void Test2(){
		System.out.println("---Test2---");
	}
	@AfterClass
	public void AfterClass(){
		System.out.println("---AfterClass---");
	}
}
