
import static org.junit.Assert.*;


import org.junit.After;

import org.junit.Before;
import org.junit.Test;

public class AccountTest {
	Account c;

	
	@Before
	public void setUp() throws Exception {
		c = new Account(1122,20000,4.5);
	}

	@After
	public void tearDown() throws Exception {
		c = null;
	}
	@Test(expected = InsufficientFundsException.class)
	public final void testWithdraw() throws InsufficientFundsException{
		c.deposit(30000);
		assertEquals("$20000 Expected, actual is $30000",(long)c.getBalance(),(long)30000);
		c.withdraw(2000);
	}
	@Test
	public final void testDeposit(){
		int x = 0;
		while (x < 20){
			c.deposit(20000000);
		}
		
	}

	
	}


