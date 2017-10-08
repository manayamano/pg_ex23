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
			this.reader = new BufferedReader(new FileReader("C:\\Users\\mana\\git\\pg_ex21\\src\\pg_ex21\\record.log"));
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

	}

	public RecordReader(Reader reader) {

	}

	public Record read() throws IOException {
		String line;
		if((line = this.reader.readLine()) != null) {
			return new Record(line);
		}
		return null;
	}

	public void close() throws IOException {
		reader.close();
	}

}
