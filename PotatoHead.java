// hacktoberfest 2018
public class PotatoHead
{
	// create instance variables
	private boolean hasGlasses;
	private boolean hasEyes;
	private String eyeColor;
	private boolean hasMustache;
	private boolean hasCostume;
	// add one instance variable

	// default constructor
	public PotatoHead()
	{
		// initialize ***ALL*** instance variables
		hasGlasses = false;
		hasEyes = false;
		eyeColor = "unknown";
		hasMustache = false;
		hasCostume = true;
	}

	/*
	VARIOUS ACCESSOR AND MUTATOR METHODS IN ALPHABETICAL ORDER
	*/

	// String getEyeColor()
	// accessor method for eye color
	public String getEyeColor()
	{
		return eyes;
	}
	
	//accessor method for glasses
	public boolean haveGlasses()
	{
		return hasGlasses;
	}
	
	// void setEyeColor(String someColor)
	// MUTATOR METHOD - change an instance variable's value
	public void setEyeColor(String someColor)
	{
		eyeColor = someColor;
	}
	
	//mutator method to put on or take off glasses
	public void setHasGlasses(boolean wantGlasses)
	{
		hasGlasses = wantGlasses;
	}
	// String toString()
	// method to access ***ALL*** instance variables
	// you should be adding your new instance variable here
	// ACCESSOR METHOD
	public String toString()
	{
		String output;


		output =  "Glasses: " + glasses;
		output =  "\nEyes: " + hasEyes;
		output += "\nMustache: " + hasMustache;
		output += "\nCostume: " + hasCostume;

		return output;
	}
}
