public class FamilyContact extends Contact {		public static enum RelationType {SISTER, BROTHER, FATHER, MOTHER, OTHER};		//Declare an instance of RelationType
	//Set basic default value	RelationType relType = null;		//Constructor	public FamilyContact(String fName, String lName, Phone_Number phNo) {		//call super class
				super(fName, lName, phNo);	}
	
	//zero arguments constructor
		public FamilyContact(){	
	}		//The parameter type would have to be something like RelationType.SISTER or RelationType.BROTHER etc	public void setRelationType(RelationType type){		this.relType = type;	}
	
	public String toString(){
		return "Family Contact" + "\n" + this.firstName + " " + this.lastName + "\n" + "Relationship: "+ relType  + "\n" +  this.phone.toString();	}	}