package service;

abstract class TimeService implements Service {

	private boolean joined = false;

	public void clear() {

	}

	public void joined() {

	}

	public boolean isJoined() {
		return false;
	}

	public abstract boolean isServiceTime(int hour);

	public void checkService(Record record) {

	}

	public abstract String getServiceCode();

	public int calcUnitPrice(Record record, int unitPrice) {
		return 0;
	}

	public abstract int getDiscount();

	public int calcBasicCharge(int basicCharge) {
		return 0;
	}

	public abstract int getBasicCharge();

}
