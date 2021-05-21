package satiyorumSattim.com.business.concretes;

import satiyorumSattim.com.core.abstracts.RegexService;
import satiyorumSattim.com.core.abstracts.SendService;
import satiyorumSattim.com.dataAccess.abstracts.CustomerDao;
import satiyorumSattim.com.entities.conretes.Customer;

public class RegisterWithManager {
	private RegexService regexService;
	private CustomerDao customerDao;
	private SendService sendService;
	
	public RegisterWithManager(RegexService regexService, CustomerDao customerDao, SendService sendService) {
		super();
		this.regexService = regexService;
		this.customerDao = customerDao;
		this.sendService = sendService;
	}



	public void register(Customer customer) {
		// TODO Auto-generated method stub
		
		if(
				customer.getFirstName().isEmpty()||
				customer.getLastName().isEmpty()||
				customer.getMail().isEmpty()||
				customer.getPassword().isEmpty()
		 ) {
				System.out.println("Eksik Bilgi Giri�i!");
			
	        }
		else {
			
			
			if(customer.getPassword().length()<6) {
				System.out.println("Parola en az 6 karakterden olu�mal�");
			}
			else {
			if(!(this.regexService.RegexSystem(customer.getMail()))) {
				System.out.println("Ge�erli bir email giriniz!");

			}
			else {
				
				for(int i=0;i<customerDao.getAll().size();i++){
					if(customerDao.getAll().get(i).getMail()==customer.getMail()) {
						System.out.println("Zaten b�yle bir mail kay�tl�!");
					return;
					}
					
					
				}
				if(!(customer.getFirstName().length()>=2&&customer.getLastName().length()>=2)) {
					
					System.out.println("Ad Soyad en az 2 karakterden olu�mal�d�r!");
				}
				else {
					sendService.sendService(customer.getMail());
					if(!sendService.getIsClickToLink()) {
						System.out.println("Do�rulama yap�n�z!");
					}
					else {
						customerDao.add(customer);
						System.out.println("Aram�za ho�geldin "+customer.getFirstName());
					}
				}
				
			}
			}
		}
		
	}
}
