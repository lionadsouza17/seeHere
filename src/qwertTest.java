import static org.junit.Assert.*;

import org.junit.Test;



public class qwertTest {

	@Test
	public void test() {
		qwert q=new qwert(1000);
		q.deposit(800);
		assertEquals(1800,q.getBal());
	}

}
