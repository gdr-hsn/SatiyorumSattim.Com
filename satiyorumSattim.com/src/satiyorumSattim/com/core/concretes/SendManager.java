package satiyorumSattim.com.core.concretes;

import satiyorumSattim.com.core.abstracts.SendService;

public class SendManager implements SendService {

	@Override
	public void sendService(String mail) {
		// TODO Auto-generated method stub
		System.out.println(mail+" adresine do�rulama linkini g�nderdik");
	}

	@Override
	public boolean getIsClickToLink() {
		// TODO Auto-generated method stub
		return true;
	}
	


}
