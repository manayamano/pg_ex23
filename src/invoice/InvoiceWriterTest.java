package invoice;

import java.io.IOException;

import org.junit.Test;

import service.Record;
import service.ServiceCollection;

public class InvoiceWriterTest {

	@Test
	public void testWrite() throws IOException {
		ServiceCollection service = new ServiceCollection();
		InvoiceWriter writer = new InvoiceWriter();
		Invoice invoice = new Invoice();

		Record record = new Record("1 090-1234-0001");
		invoice.setOwnerTelNumber(record.getOwnerTelNumber());

		record = new Record("2 C1 090-1234-0002");
		service.checkService(record);
		record = new Record("2 C1 090-1234-0003");
		service.checkService(record);

		record = new Record("5 2004/06/04 03:34 003 090-1234-0002");
		int unitPrice = service.calcUnitPrice(record, 20);
		invoice.addCallCharge(unitPrice * record.getCallMinutes());
		record = new Record("5 2004/06/04 13:50 010 090-1234-9999");
		unitPrice = service.calcUnitPrice(record, 20);
		invoice.addCallCharge(unitPrice * record.getCallMinutes());

		int basicCharge = service.calcBasicCharge(1000);
		invoice.setBasicCharge(basicCharge);
		writer.write(invoice);
		writer.close();

	}

}
