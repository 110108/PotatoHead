// hacktoberfest 2018
public class PotatoHead
{
	// create instance variables
	private boolean hasEyes;
	private String eyeColor;
	private boolean hasMustache;
	// add one instance variable
	private boolean hasShoes;
	private String costume;
	private String someCostume;
	private String someColor;

	// default constructor
	public PotatoHead()
	{
		// initialize ***ALL*** instance variables
		hasEyes = false;
		eyeColor = "unknown";
		hasMustache = false;
		hasShoes = false;
		costume = "unknown";
	}

	/*
	VARIOUS ACCESSOR AND MUTATOR METHODS IN ALPHABETICAL ORDER
	*/

	// String getEyeColor()
	// accessor method for eye color
	public String getEyeColor()
	{
		return eyeColor;
	}

	// accessor method for hasShoes
	public boolean getHasShoes()
	{
		return hasShoes;
	}

	// void setEyeColor(String someColor)
	// MUTATOR METHOD - change an instance variable's value
	public void setEyeColor(String someColor)
	{
		eyeColor = someColor;
	}

	public void setCostume()
	{
		costume = someCostume;
	}
	// String toString()
	// method to access ***ALL*** instance variables
	// you should be adding your new instance variable here
	// ACCESSOR METHOD
	public String toString()
	{
		String output;
		output =  "Eyes: " + eyeColor;
		output += "\nMustache: " + hasMustache;
		output += "\nShoes: " + hasShoes;
		output += "\nCostume: " + costume;
		return output;
	}
}
