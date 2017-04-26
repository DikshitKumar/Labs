
public class AccountReceivable {
	
	private Accounting transaction;
	
	public AccountReceivable(Accounting aTransaction) {
		transaction = aTransaction;
	}

	public void postPayment() {
		transaction.chargeCustomer();
	}
	
	public void sendInvoice() {
		transaction.prepareInvoice();
	}
}
