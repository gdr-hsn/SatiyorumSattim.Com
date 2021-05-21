package satiyorumSattim.com.core.concretes;

import satiyorumSattim.com.JSignInGoogleAccountManager;
import satiyorumSattim.com.core.abstracts.SignInService;
import satiyorumSattim.com.entities.conretes.Customer;

public class JSignInGoogleAccountManagerAdapter implements SignInService{

@Override
public void SignInSystem() {
	// TODO Auto-generated method stub
	JSignInGoogleAccountManager jSignInGoogleAccountManager=new JSignInGoogleAccountManager();
	
	 if( !jSignInGoogleAccountManager.sign()) {
			System.out.println("Google giriþi baþarýsýz");
		}
		else {
			System.out.println("Google giriþi baþarýlý");

		}
}

}
