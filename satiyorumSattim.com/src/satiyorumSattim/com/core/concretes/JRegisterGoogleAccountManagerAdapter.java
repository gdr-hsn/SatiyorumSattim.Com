package satiyorumSattim.com.core.concretes;

import satiyorumSattim.com.JRegisterGoogleAccountManager;
import satiyorumSattim.com.core.abstracts.RegisterService;

public class JRegisterGoogleAccountManagerAdapter implements RegisterService{

	@Override
	public void RegisterSystem() {
		
		// TODO Auto-generated method stub
		JRegisterGoogleAccountManager jSignInGoogleAccountManager=new JRegisterGoogleAccountManager();
		
		if(!jSignInGoogleAccountManager.account()) {
			System.out.println("Bu hesapla kayýt olamazsýnýz");
		}
		else {
			System.out.println("Teþekkürler.Google hesabýnýzla kayýt baþarýlý");
		}
	}

}
