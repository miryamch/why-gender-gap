package why.gender.gap; 
import why.gender.gap.rules.*;

import java.util.*; 

class Man extends Human {

	public Man(){
		this.DEFAULT_JOB = new Job("Free loader living with mum", false, false, false, false); 
		
		this.rules = Arrays.asList(
			new R001CoversBasicNeeds(), 
			new R002IsInterestingOrFun(), 
			new R003IsNotExcessivelyHard().or(new R004WillMakeYouAShitTonOfMoney())
		);
	}

}