package satiyorumSattim.com.dataAccess.concretes;

import java.util.ArrayList;
import java.util.List;

import satiyorumSattim.com.dataAccess.abstracts.CustomerDao;
import satiyorumSattim.com.entities.conretes.Customer;

public class HibernateCustomerDao implements CustomerDao{
	
	ArrayList<Customer> customers=new ArrayList<Customer>();
	
	
	@Override
	public void add(Customer customer) {
//!!!!!!!!!!!!!!Diyelim ki bunlar hibernate DataAccess kodlarý!!!!!!!!!!!!Öyle varsayalým...
		
		this.customers.add(customer);
		
	}

	@Override
	public void delete(Customer customer) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void upDate(Customer customer) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Customer getCustomer() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArrayList<Customer> getAll() {
		ArrayList<Customer> customersIn=new ArrayList();
		//!!!!!!!!!!!!!!Diyelim ki bunlar hibernate DataAccess kodlarý!!!!!!!!!!!!Öyle varsayalým...
		
	   for(int i=0;i<this.customers.size();i++) {
		   customersIn.add(this.customers.get(i));
		}
		return customersIn;
		
	}

}
