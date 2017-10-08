package invoice;

import java.io.IOException;

import service.Record;
import service.Service;
import service.ServiceCollection;

public class Main {

	private static final int INITIAL_BASIC_CHARGE = 1000;

	private static final int INITIAL_CALL_UNIT_PRICE = 20;

	private static final char RC_OWNER_INFO = '1';

	private static final char RC_SERVICE_INFO = '2';

	private static final char RC_CALL_LOG = '5';

	private static final char RC_SEPARATOR = '0';

	public static void main(String[] args) throws IOException {

		ServiceCollection service = new ServiceCollection();
		RecordReader reader = new RecordReader();
		InvoiceWriter writer = new InvoiceWriter();
		Invoice invoice = new Invoice();

		Record record;
		char recordCode;
		record = reader.read();
		while((record = reader.read()) != null){
			recordCode = record.getRecordCode();
			switch (recordCode) {
			case RC_OWNER_INFO:
				invoice.setOwnerTelNumber(record.getOwnerTelNumber());
				break;
			case RC_SERVICE_INFO:
				service(service, record);
				break;
			case RC_CALL_LOG:
				call(invoice, service, record);
				break;
			case RC_SEPARATOR:
				separate(invoice, service, writer);
				break;
			}
		}
		writer.close();
		reader.close();
	}

	private static void service(Service service, Record record) {
		service.checkService(record);
	}

	private static void call(Invoice invoice, Service service, Record record) {
		int unitPrice = service.calcUnitPrice(record, INITIAL_CALL_UNIT_PRICE);
		invoice.addCallCharge(unitPrice * record.getCallMinutes());

	}

	private static void separate(Invoice invoice, Service service, InvoiceWriter writer) throws IOException {
		int basicCharge = service.calcBasicCharge(INITIAL_BASIC_CHARGE);
		invoice.setBasicCharge(basicCharge);
		writer.write(invoice);
		invoice.clear();
		service.clear();
	}

}
