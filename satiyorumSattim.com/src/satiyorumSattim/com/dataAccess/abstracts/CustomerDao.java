package satiyorumSattim.com.dataAccess.abstracts;

import java.util.ArrayList;
import java.util.List;

import satiyorumSattim.com.entities.conretes.Customer;

public interface CustomerDao {
void add(Customer customer);
void delete(Customer customer);
void upDate(Customer customer);
Customer getCustomer();
ArrayList <Customer> getAll();


}
