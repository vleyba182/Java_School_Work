//This extends the Generic Contact CLass
	//Set basic default value
				super(fName, lName, phNo);
	
	//zero arguments constructor
		public FamilyContact(){	
	}
	
	public String toString(){
		return "Family Contact" + "\n" + this.firstName + " " + this.lastName + "\n" + "Relationship: "+ relType  + "\n" +  this.phone.toString();