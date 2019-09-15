package why.gender.gap; 

public class Job {

private String name; 

private boolean isCoversBasicNeeds; 

private boolean isFunOrInteresting; 

private boolean isLikeReallyTough; 

private boolean isYouWillMakeAShitTonOfMoney; 

public Job(String name, boolean isCoversBasicNeeds, boolean isFunOrInteresting, boolean isLikeReallyTough, boolean isYouWillMakeAShitTonOfMoney) {

this.name = name; 

this.isCoversBasicNeeds = isCoversBasicNeeds; 

this.isFunOrInteresting = isFunOrInteresting; 

this.isLikeReallyTough = isLikeReallyTough; 

this.isYouWillMakeAShitTonOfMoney = isYouWillMakeAShitTonOfMoney; 
}


public String getName(){
	return this.name; 
}

public boolean isCoversBasicNeeds(){
	return this.isCoversBasicNeeds; 
}

public boolean isFunOrInteresting(){
	return this.isFunOrInteresting; 
}

public boolean isLikeReallyTough(){
	return this.isLikeReallyTough; 
}

public boolean isYouWillMakeAShitTonOfMoney(){
	return this.isYouWillMakeAShitTonOfMoney; 
}

public String toString() { 
    return this.name;
} 
}