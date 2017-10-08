package service;

import static org.junit.Assert.*;

import org.junit.Test;

public class RecordTest {

	@Test
	public void testToString() {
		Record record = new Record("1 090-1234-0001");
		assertEquals("1 090-1234-0001",record.toString());
	}

	@Test
	public void testGetRecordCode() {
		Record record = new Record("1 090-1234-0001");
		assertEquals('1',record.getRecordCode());
	}

	@Test
	public void testGetOwnerTelNumber() {
		Record record = new Record("1 090-1234-0001");
		assertEquals("090-1234-0001",record.getOwnerTelNumber());
	}

	@Test
	public void testGetServiceCode() {
		Record record = new Record("2 C1 090-1234-0002");
		assertEquals("C1",record.getServiceCode());
	}

	@Test
	public void testGetServiceOption() {
		Record record = new Record("2 C1 090-1234-0002");
		assertEquals("090-1234-0002",record.getServiceOption());
	}

	@Test
	public void testGetStartHour() {
		Record record = new Record("5 2004/06/04 03:34 003 090-1234-0002");
		assertEquals(3,record.getStartHour());
		record = new Record("5 2004/06/04 13:34 003 090-1234-0002");
		assertEquals(13,record.getStartHour());
	}

	@Test
	public void testGetCallMinutes() {
		Record record = new Record("5 2004/06/04 03:34 003 090-1234-0002");
		assertEquals(3,record.getCallMinutes());
		record = new Record("5 2004/06/04 13:34 113 090-1234-0002");
		assertEquals(113,record.getCallMinutes());
	}

	@Test
	public void testGetTelNumber() {
		Record record = new Record("5 2004/06/04 03:34 003 090-1234-0002");
		assertEquals("090-1234-0002",record.getCallNumber());
	}

}
