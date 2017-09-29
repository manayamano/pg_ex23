package service;

public class DayService extends TimeService {

	private static final int START_TIME = 8;

	private static final int END_TIME = 17;

	private static final String SERVICE_CODE = "E1";

	private static final int BASIC_CHARGE = 200;

	public boolean isServiceTime(int hour) {
		return false;
	}

	public String getServiceCode() {
		return null;
	}

	public int getDiscount() {
		return 0;
	}

	public int getBasicCharge() {
		return 0;
	}

}
