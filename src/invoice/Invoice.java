package invoice;

public class Invoice {

	private String ownerTelNumber = null;

	private int basicCharge = 0;

	private int callCharge = 0;

	public void clear() {
		ownerTelNumber = null;
		basicCharge = 0;
		callCharge = 0;
	}

	public void setOwnerTelNumber(String ownerTelNumber) {
		this.ownerTelNumber = ownerTelNumber;
	}

	public String getOwnerTelNumber() {
		return ownerTelNumber;
	}

	public void setBasicCharge(int basicCharge) {
		this.basicCharge = basicCharge;
	}

	public int getBasicCharge() {
		return basicCharge;
	}

	public void addCallCharge(int callCharge) {
		this.callCharge += callCharge;
	}

	public int getCallCharge() {
		return callCharge;
	}

}
