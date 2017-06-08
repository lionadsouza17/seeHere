import static org.junit.Assert.*;

import org.junit.Test;

import newww.qwert;

public class qwertTest {

	@Test
	public void test() {
		qwert q=new qwert(1000);
		q.deposit(600);
		assertEquals(1600,q.getBal());
	}

}
