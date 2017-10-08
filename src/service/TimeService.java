package service;

abstract class TimeService implements Service {

	private boolean joined = false;

	public void clear() {
		joined = false;
	}

	public void joined() {
		joined = true;
	}

	public boolean isJoined() {
		return joined;
	}

	public abstract boolean isServiceTime(int hour);

	public void checkService(Record record) {
		if(record.getServiceCode().equals(getServiceCode())) {
			joined();
		}
	}

	public abstract String getServiceCode();

	public int calcUnitPrice(Record record, int unitPrice) {
		if(isServiceTime(record.getStartHour()) && isJoined()) {
			unitPrice -= getDiscount();
		}
		return unitPrice;
	}

	public abstract int getDiscount();

	public int calcBasicCharge(int basicCharge) {
		if(isJoined()) {
			basicCharge += getBasicCharge();
		}
		return basicCharge;
	}

	public abstract int getBasicCharge();

}
