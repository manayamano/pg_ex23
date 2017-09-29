package service;

public class NightService extends TimeService {

	private static final int START_TIME = 23;

	private static final int END_TIME = 5;

	private static final String SERVICE_CODE = "E2";

	private static final int BASIC_CHARGE = 500;

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
