package satiyorumSattim.com.business.concretes;

import java.util.ArrayList;

import satiyorumSattim.com.business.abstracts.ICustomerService;
import satiyorumSattim.com.core.abstracts.RegexService;
import satiyorumSattim.com.core.abstracts.SendService;
import satiyorumSattim.com.core.abstracts.SignInService;
import satiyorumSattim.com.core.concretes.JRegisterGoogleAccountManagerAdapter;
import satiyorumSattim.com.core.concretes.JSignInGoogleAccountManagerAdapter;
import satiyorumSattim.com.core.abstracts.RegisterService;
import satiyorumSattim.com.dataAccess.abstracts.CustomerDao;
import satiyorumSattim.com.entities.conretes.Customer;

public class CustomerManager implements ICustomerService{
	
	private RegisterWithManager registerWithManager;
	private SignInWithManager signInWithManager;
	private JRegisterGoogleAccountManagerAdapter jRegisterGoogleAccountManagerAdapter ;
	private JSignInGoogleAccountManagerAdapter jSignInGoogleAccountManagerAdapter ;

	public CustomerManager(RegisterWithManager registerWithManager,SignInWithManager signInWithManager) {
		super();
		this.registerWithManager = registerWithManager;
		this.signInWithManager=signInWithManager;
	}
	

public CustomerManager(JRegisterGoogleAccountManagerAdapter jRegisterGoogleAccountManagerAdapter,JSignInGoogleAccountManagerAdapter jSignInGoogleAccountManagerAdapter ) {
	super();
	this.jRegisterGoogleAccountManagerAdapter = jRegisterGoogleAccountManagerAdapter;
	this.jSignInGoogleAccountManagerAdapter=jSignInGoogleAccountManagerAdapter;
}


	@Override
	public void RegisterInGoogleCustomer() {
		// TODO Auto-generated method stub
		jRegisterGoogleAccountManagerAdapter.RegisterSystem();
		
	}


	@Override
	public void SignInGoogleCustomer() {
		// TODO Auto-generated method stub
		
		jSignInGoogleAccountManagerAdapter.SignInSystem();
		
	}







	@Override
	public void registerCustomer(Customer customer) {
		// TODO Auto-generated method stub
		registerWithManager.register(customer);
	}









	@Override
	public void signInCustomer(String mail, String password) {
		// TODO Auto-generated method stub
		signInWithManager.signIn(mail, password);
	}
	

}
