// hacktoberfest 2018
public class PotatoHead
{
	// create instance variables
	private boolean hasEyes;
	private String eyeColor;
	private boolean hasMustache;
	private String eyes;
	// add one instance variable

	// default constructor
	public PotatoHead()
	{
		// initialize ***ALL*** instance variables
		hasEyes = false;
		eyeColor = "unknown";
		hasMustache = false;
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

	// void setEyeColor(String someColor)
	// MUTATOR METHOD - change an instance variable's value
	public void setEyeColor(String someColor)
	{
		eyeColor = someColor;
	}

	// String toString()
	// method to access ***ALL*** instance variables
	// you should be adding your new instance variable here
	// ACCESSOR METHOD
	public String toString()
	{
		String output;
		output =  "Eyes: " + eyes;
		output += "\nMustache: " + mustache;
		output += "\nCostume: " + costume;
		return output;
	}
}
