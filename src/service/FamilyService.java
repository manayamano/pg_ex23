package service;

public class FamilyService implements Service {

	private static final int TEL_NUMBER = 2;

	private static final String SERVICE_CODE = "C1";

	private static final int BASIC_CHARGE = 100;

	private boolean joined = false;

	private String[] telNumbers = new String[TEL_NUMBER];

	private int telNumberCount = 0;

	public void clear() {
		joined = false;
		telNumberCount = 0;
	}

	public void appendFamilyTelNumber(String telNumber) {
		telNumbers[telNumberCount++] = telNumber;
	}

	public boolean isJoined() {
		return joined;
	}

	public boolean isFamilyTelNumber(String telNumber) {
		for(int i=0; i<telNumberCount; i++) {
			if(telNumbers[i].equals(telNumber)) {
				return true;
			}
		}
		return false;
	}

	public void checkService(Record record) {
		if(SERVICE_CODE.equals(record.getServiceCode())) {
			joined = true;
			appendFamilyTelNumber(record.getServiceOption());
		}
	}

	public int calcUnitPrice(Record record, int unitPrice) {
		if(isFamilyTelNumber(record.getCallNumber())) {
			unitPrice /= 2;
		}
		return unitPrice;
	}

	public int calcBasicCharge(int basicCharge) {
		if(isJoined()) {
			basicCharge += BASIC_CHARGE;
		}
		return basicCharge;
	}

}
