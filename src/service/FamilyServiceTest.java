package service;

import static org.junit.Assert.*;

import org.junit.Test;

public class FamilyServiceTest {

	@Test
	public void testIsFamilyNumber() {
		Record record = new Record("2 C1 090-1234-0002");
		FamilyService service = new FamilyService();
		service.checkService(record);
		record = new Record("2 C1 090-1234-0003");
		service.checkService(record);
		assertTrue(service.isFamilyTelNumber("090-1234-0003"));
	}

	@Test
	public void testCheckService() {
		Record record = new Record("2 C1 090-1234-0002");
		FamilyService service = new FamilyService();
		service.checkService(record);
		assertTrue(service.isJoined());
	}

	@Test
	public void testCalcUnitPrice() {
		Record record = new Record("2 C1 090-1234-0002");
		FamilyService service = new FamilyService();
		service.checkService(record);
		assertTrue(service.isFamilyTelNumber("090-1234-0002"));
		assertFalse(service.isFamilyTelNumber("090-1234-0001"));
	}

	@Test
	public void testCalcBasicCharge() {
		Record record = new Record("2 C1 090-1234-0002");
		FamilyService service = new FamilyService();
		service.checkService(record);
		assertEquals(1100, service.calcBasicCharge(1000));
		record = new Record("2 E1 090-1234-0002");
		service = new FamilyService();
		service.checkService(record);
		assertEquals(1000, service.calcBasicCharge(1000));

	}

}
