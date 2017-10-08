package invoice;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class InvoiceWriter {

	BufferedWriter writer;

	public InvoiceWriter() throws IOException {
		File file = new File("C:\\Users\\mana\\git\\pg_ex21\\src\\invoice.dat");
		FileWriter filewriter = new FileWriter(file);
		writer = new BufferedWriter(filewriter);
	}

	public InvoiceWriter(Writer writer) {

	}

	public void write(Invoice invoice) throws IOException {
		writer.write("1 " + invoice.getOwnerTelNumber() + "\n");
		writer.write("5 " + invoice.getBasicCharge() + "\n");
		writer.write("7 " + invoice.getCallCharge() + "\n");
		writer.write("9 ====================\n");
	}

	public void close() throws IOException {
		writer.close();
	}

}
