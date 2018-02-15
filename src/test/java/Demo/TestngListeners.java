package Demo;
import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.Test;

public class TestngListeners {

	
	@Test
	public void test1()
	{
		System.out.println("in test 1 --failed");
		Assert.assertTrue(false);
	}
	
	@Test
	public void test2()
	{
		System.out.println("in test2 ---passed");
		Assert.assertTrue(true);
	}
	
	@Test(enabled=false)
	public void test3()
	{
		System.out.println("in test 3---skipped not counted");
	}
	
	@Test
	public void test4()
	{
		System.out.println("in test 4 - skipped");
		throw new SkipException("Skipping this exception");
	}
	
	
}
