import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.Test;

public class TestngListeners {

	
	@Test
	public void test1()
	{
		System.out.println("in test 1");
		Assert.assertTrue(false);
	}
	
	@Test
	public void test2()
	{
		System.out.println("in test 2");
		Assert.assertTrue(true);
	}
	
	@Test(enabled=false)
	public void test3()
	{
		System.out.println("in test 3");
	}
	
	@Test
	public void test4()
	{
		System.out.println("in test 4 - skipping");
		throw new SkipException("Skipping this exception");
	}
	
	
}
