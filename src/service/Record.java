package service;

public class Record {

	private static final int RI_OF_OWNER_TEL_NUMBER = 2;

	private static final int RI_OF_SERVICE_CODE = 2;

	private static final int RI_SZ_SERVICE_CODE = 2;

	private static final int RI_OF_SERVICE_OPTION = 5;

	private static final int RI_OF_CALL_START_TIME = 13;

	private static final int RI_SZ_HOUR = 2;

	private static final int RI_OF_CALL_MINUTE = 19;

	private static final int RI_SZ_CALL_MINUTE = 3;

	private static final int RI_OF_CALL_NUMBER = 23;

	private String record;

	public Record(String record) {

	}

	public String toString() {
		return null;
	}

	public char getRecordCode() {
		return 0;
	}

	public String getOwnerTelNumber() {
		return null;
	}

	public String getServiceCode() {
		return null;
	}

	public String getServiceOption() {
		return null;
	}

	public int getStartHour() {
		return 0;
	}

	public int getCallMinutes() {
		return 0;
	}

	public String getCallNumber() {
		return null;
	}

}
