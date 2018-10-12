// hacktoberfest 2018
public class PotatoHead
{
	// create instance variables
	private boolean hasGlasses;
	private boolean haveArms;
	private boolean hasEyes;
	private int armNum;
	private int eyeNum;
	private String eyeColor;
	private boolean hasMustache;
	private boolean hasHair;
	private boolean hasPhone;
	private boolean hasShoes;
	private boolean hasArms;
  	private boolean hasCostume;
	private String costume;
	private String someCostume;
	private String someColor;
	private String shirtcolor;
	private boolean hasshirt;

  // add one instance variable

	/** default constructor
  */
	public PotatoHead()
	{
		// initialize ***ALL*** instance variables
		hasGlasses = false;
		haveArms = false;
		hasEyes = false;
		armNum = 0;
		eyeNum = 0;
		eyeColor = "false";
		hasMustache = false;
		hashair = true;
		hasnose = true;
		numberOfEyes = 0;
		eyeColor = "unknown";
		hasMustache = false;
		hasShoes = false;
		costume = "unknown";
		hasCostume = true;
		hasPhone = true;
		hasArms = true;
		hasshirt = true;
		shirtcolor = 0;
	}

	/*
	VARIOUS ACCESSOR AND MUTATOR METHODS IN ALPHABETICAL ORDER
	*/


	//mutator method for adding eyes
	public void addEye(int num)
	{
		eyeNum += num;
	}

	// accesor method for number of arms
	public int getNumOfArms()
	{
		return armNum;
	}

	// accesor method for arms
	public boolean hasArms()
	{
		return haveArms;
	}
	// String getEyeColor()
	// accessor method for eye color
	public String getEyeColor()
	{
		return eyeColor;
	}
	public String getshirtcolor()
	{
		return shirtcolor;
	}

	// accessor method for hasShoes
	public boolean getHasShoes()
	{
		return hasShoes;
	}

	// accessor method for number of eyes
	public int getNumOfEyes()
	{
		return eyeNum;

	}


	// accessor method for eye color
	public String getEyeColor()
	{
		return eyeColor;
	}

	/**
	accessor method for glasses
	@return hasGlasses boolean for whether or not the potato head has glasses
	**/
	public boolean haveGlasses()
	{
		return hasGlasses;
	}

	// accessor method for having arms
	public boolean getHasArms()
	{
		return hasArms
	}

	// void setEyeColor(String someColor)
	// MUTATOR METHOD - change an instance variable's value
	public void setEyeColor(String someColor)
	{
		eyeColor = someColor;

	}
	public void setshirtcolor(String someColor)
	{
		shirtcolor = someColor;
	}


	/**
		Mutator method to change the potatohead's costume
		@param someCostume String that gets set to the potatohead's costume
	*/
	public void setCostume(String someCostume)
	{
		costume = someCostume;
	}


	public void takeEye(int num)
	{
		if(eyeNum>=1)
		{
			eyeNum -= num;
		}
		else
		{
			System.out.println("Sorry, but this Potatohead has no eyes to take away!");
		}
	}


	/**
	mutator method to put on or take off glasses
	@param wantGlasses boolean to add glasses or take them off
	**/
	public void setHasGlasses(boolean wantGlasses)
	{
		hasGlasses = wantGlasses;
	}

	/**
		mutator method to have or not have nose
		@param wantnose boolean to add nose or take it off
	**/
	public void setHasnose(boolean wantnose)
		{
			hasnose = wantnose;
	}

	/** String toString()
	method to access ***ALL*** instance variables
	you should be adding your new instance variable here
	ACCESSOR METHOD
  @return a string that describes the object state with all instance variables
  */
	public String toString()
	{
		String output;
    output =  "Eyes: " + hasEyes;
		output +=  "\nEye Color: " + eyeColor;
		output += "\nMustache: " + hasMustache;
		output += "\nShoes: " + hasShoes;
    output += "\nCostume: " + hasCostume;
		output += "\nCostume: " + costume;
		output += "\nGlasses: " + hasGlasses;
		output += "\nNumber of eyes: "+ eyeNum;
		output += "\nPhone:   " + hasPhone+"\n\n";
		output += "\nhair: " + hair;
		output += "\nGlasses: " + glasses;
		output += "\nNose: " + nose;
		output += "\nNumber of eyes: "+ eyeNum;
		output += "\nPhone:   " + hasPhone;
		output += "\nArms: " + hasArms;
		output += "\nShirt:   " +hasshirt;
		output += "\nshirtcolor:   " +shirtcolor;
		return output;
	}
}
