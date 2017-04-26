import java.util.Date;
import java.util.List;


public class CustomerTransaction implements Accounting, Reporting {
	
	Customer cus;
	List<Product> prods;
	
	
	
	public CustomerTransaction(Customer cus, List<Product> prods) {
		this.cus = cus;
		this.prods = prods;
	}

	//Reporting 
	/* (non-Javadoc)
	 * @see Reporting#getName()
	 */
	@Override
	public String getName() {
		return cus.getName();
	}
	
	/* (non-Javadoc)
	 * @see Reporting#getDate()
	 */
	@Override
	public Date getDate() {
		return new Date();
	}
	
	
	/* (non-Javadoc)
	 * @see Reporting#getProductBreakdown()
	 */
	@Override
	public String getProductBreakdown() {
		String productListing = null;
		for (Product prod : prods){
			productListing += prod.getProName();
		}
		return productListing;
	}
	
	/* (non-Javadoc)
	 * @see accounting#prepareInvoice()
	 */
	@Override
	public void prepareInvoice() {
		System.out.println("Invoice Generated..");
	}
	/* (non-Javadoc)
	 * @see accounting#chargeCustomer()
	 */
	@Override
	public void chargeCustomer() {
		System.out.println("Customer bill is :");
	}
	
}
