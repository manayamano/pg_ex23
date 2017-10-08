package service;

import static org.junit.Assert.*;

import org.junit.Test;

public class DayServiceTest {

	@Test
	public void testIsServiceTime() {
		DayService service = new DayService();
		assertFalse(service.isServiceTime(4));
		assertTrue(service.isServiceTime(8));
	}

	@Test
	public void testCheckService() {
		DayService service = new DayService();
		Record record = new Record("2 E1");
		service.checkService(record);
		assertTrue(service.isJoined());
	}

	@Test
	public void testCalcUnitPrice() {
		DayService service = new DayService();
		Record record = new Record("2 E1");
		service.checkService(record);
		record = new Record("5 2004/06/05 17:50 010 090-1234-9999");
		assertEquals(15,service.calcUnitPrice(record, 20));
		record = new Record("5 2004/06/05 18:50 010 090-1234-9999");
		assertEquals(20,service.calcUnitPrice(record, 20));
	}

	@Test
	public void testCalcBasicCharge() {
		DayService service = new DayService();
		Record record = new Record("2 E1");
		service.checkService(record);
		assertEquals(1200,service.calcBasicCharge(1000));
		service = new DayService();
		record = new Record("2 C1");
		service.checkService(record);
		assertEquals(1000,service.calcBasicCharge(1000));


	}

}
