package invoice;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

import service.Record;

public class RecordReader {

	private BufferedReader reader;

	public RecordReader() {
		try {
			this.reader = new BufferedReader(new FileReader(""));
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

	}

	public RecordReader(Reader reader) {

	}

	public Record read() throws IOException {
		return new Record(this.reader.readLine());
	}

	public void close() {

	}

}
