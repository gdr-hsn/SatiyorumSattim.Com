package satiyorumSattim.com.business.abstracts;

import satiyorumSattim.com.entities.conretes.Customer;

public interface ICustomerService {
void registerCustomer(Customer customer);
void signInCustomer(String mail,String password);
void RegisterInGoogleCustomer();
void SignInGoogleCustomer();

}

