import static org.junit.Assert.*;

import org.junit.Test;



public class qwertTest {

	@Test
	public void test() {
		qwert q=new qwert(1000);
		q.deposit(900);
		assertEquals(1900,q.getBal());
	}

}
