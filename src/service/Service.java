package service;

public abstract interface Service {

	public abstract void clear();

	public abstract void checkService(Record record);

	public abstract int calcUnitPrice(Record record, int unitPrice);

	public abstract int calcBasicCharge(int basicCharge);

}
