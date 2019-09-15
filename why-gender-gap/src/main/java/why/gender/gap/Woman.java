package why.gender.gap; 

import java.util.*;

import why.gender.gap.rules.*;

class Woman extends Human {
	
	public Woman() {
		this.DEFAULT_JOB = new Job("House wife", false, false, true, false); 
		
		this.rules = Arrays.asList(
			new R001CoversBasicNeeds(), 
			new R002IsInterestingOrFun(), 
			new R003IsNotExcessivelyHard()
		); 
	}
	

}