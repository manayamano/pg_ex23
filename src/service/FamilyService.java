package service;

public class FamilyService implements Service {

	private static final int TEL_NUMBER = 2;

	private static final String SERVICE_CODE = "C1";

	private static final int BASIC_CHARGE = 100;

	private boolean joined = false;

	private String[] telNumbers = new String[TEL_NUMBER];

	private int telNumberCount = 0;

	public void clear() {

	}

	public void appendFamilyTelNumber(String telNumber) {

	}

	public boolean isJoined() {
		return false;
	}

	public boolean isFamilyTelNumber(String telNumber) {
		return false;
	}

	public void checkService(Record record) {

	}

	public int calcUnitPrice(Record record, int unitPrice) {
		return 0;
	}

	public int calcBasicCharge(int basicCharge) {
		return 0;
	}

}
