package service;

import static org.junit.Assert.*;

import org.junit.Test;

public class ServiceCollectionTest {

	@Test
	public void testCalcBasicCharge() {
		ServiceCollection service = new ServiceCollection();
		Record record = new Record("2 C1 090-1234-0002");
		service.checkService(record);
		 record = new Record("2 C1 090-1234-0003");
		service.checkService(record);
		assertEquals(1100,service.calcBasicCharge(1000));
		record = new Record("2 E1");
		service.checkService(record);
		assertEquals(1300,service.calcBasicCharge(1000));
	}

	@Test
	public void testCalcUnitPrice() {
		ServiceCollection service = new ServiceCollection();
		Record record = new Record("2 C1 090-1234-0002");
		service.checkService(record);
		 record = new Record("2 C1 090-1234-0003");
		service.checkService(record);
		record = new Record("2 E1");
		service.checkService(record);
		record = new Record("5 2004/06/04 03:34 003 090-1234-0002");
		assertEquals(10, service.calcUnitPrice(record, 20));
		record = new Record("5 2004/06/04 13:50 010 090-1234-9999");
		assertEquals(15, service.calcUnitPrice(record, 20));
		record = new Record("5 2004/06/04 13:50 010 090-1234-0002");
		assertEquals(7, service.calcUnitPrice(record, 20));

	}

}
