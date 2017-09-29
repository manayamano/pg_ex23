package service;

public class ServiceCollection implements Service {
	
	private Service[] services = { new DayService ( ) , new FamilyService ( ) };

	public void clear() {

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
