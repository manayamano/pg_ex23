package invoice;

import static org.junit.Assert.*;

import java.io.IOException;

import org.junit.Test;

import service.Record;

public class RecordReaderTest {

	@Test
	public void testRead() throws IOException {
		RecordReader reader = new RecordReader();
		Record record = reader.read();
		assertEquals("0 *************************", record.toString());
	}

}
