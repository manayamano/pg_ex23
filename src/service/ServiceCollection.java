package service;

public class ServiceCollection implements Service {

	private Service[] services = { new DayService ( ) , new FamilyService ( ) };

	public void clear() {
		for(Service service : services) {
			service.clear();
		}
	}

	public void checkService(Record record) {
		for(Service service : services) {
			service.checkService(record);
		}
	}

	public int calcUnitPrice(Record record, int unitPrice) {
		for(Service service : services) {
			unitPrice = service.calcUnitPrice(record, unitPrice);
		}
		return unitPrice;
	}

	public int calcBasicCharge(int basicCharge) {
		for(Service service : services) {
			basicCharge = service.calcBasicCharge(basicCharge);
		}
		return basicCharge;
	}

}
