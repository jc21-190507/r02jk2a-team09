import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Kadai06Test extends Kadai06 {

	@Test
	void get2ndMax() {

		Kadai06 k6= new Kadai06();
		int a[] = {4,2,1,7,6};
		assertEquals(6 , k6.get2ndMax(a));

		int b[] = {3,56,21,8,63,13,88,42,99,35};
		assertEquals(88 , k6.get2ndMax(b));

	}

}
