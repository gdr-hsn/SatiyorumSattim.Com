package satiyorumSattim.com.core.concretes;

import satiyorumSattim.com.JRegexManager;
import satiyorumSattim.com.core.abstracts.RegexService;

public class JRegexManagerAdapter implements RegexService{

	@Override
	public boolean RegexSystem(String eMailInput) {
		// TODO Auto-generated method stub
		JRegexManager jRegex=new JRegexManager();
		return jRegex.isEmailValid(eMailInput);
	}

}
