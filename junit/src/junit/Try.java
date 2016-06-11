package junit;

import org.testng.annotations.Test;

import junit.framework.TestCase;

public class Try {
	@Test
	public class MyTest extends TestCase {
		private int count = 0;
		int i=0;
		public void test1() {
		count++;
		i=1;
		assertEquals(1, count);
		}
		public void test2() {
			count++;
			assertEquals(1, count);
			System.out.println(i);
			}

	}

}
