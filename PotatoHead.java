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
	private boolean hasCostume;
	private boolean hasPhone;
	// add one instance variable

	// default constructor
	public PotatoHead()
	{
		// initialize ***ALL*** instance variables
		hasGlasses = false;
		haveArms = false;
		hasEyes = false;
		armNum = 0;
		eyeNum = 0;
		eyeColor = "unknown";
		hasMustache = false;
		hasCostume = true;
		hasPhone = false;
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
		output =  "Glasses: " + hasGlasses;
		output += "\nArms: " + haveArms;
		output += "\nNumber of arms: " + armNum;
		output += "\nNumber of eyes: "+ eyeNum;
		output =  "\nEyes: " + hasEyes;
		output += "\nMustache: " + hasMustache;
		output += "\nCostume: " + hasCostume;
		output += "\nPhone:   " + hasPhone;

		return output;
	}
}