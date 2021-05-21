package satiyorumSattim.com.business.concretes;

import satiyorumSattim.com.dataAccess.abstracts.CustomerDao;

public class SignInWithManager {
	private CustomerDao customerDao;
	
	public SignInWithManager(CustomerDao customerDao) {
		super();
		this.customerDao = customerDao;
	}

	public void signIn(String mail, String password) {
		// TODO Auto-generated method stub
		if(mail.isEmpty()||password.isEmpty()) {
			System.out.println("Eksik bilgi!!!");
		}
		else {
			for(int i=0;i<customerDao.getAll().size();i++){
				if(customerDao.getAll().get(i).getMail()!=mail||customerDao.getAll().get(i).getPassword()!=password) {
					System.out.println("Mail ve ya Þifrenizi kontrol ediniz");
					return;
				}
				
				
			}
			System.out.println("Giriþ Baþarýlý");
		}
		
	}
}
