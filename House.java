
public class House extends Building{
	private String name,ownerName,Address;
	House(String name,int length,int breadth,int height,int noOfFloors,String CostToBuild)
	{
		super( length, breadth, height, noOfFloors, CostToBuild);
		this.name=name;
		
	}
	void setOwnerName(String ownerName)
	{
		this.ownerName=ownerName;
	}
	void setAddress(String Address)
	{
		this.Address=Address;
	}
	String getOwnerName()
	{
		return ownerName;
	}
  String getAddress()
  {
	  return Address;
  }
  void printAllDetails()
  {
	  System.out.println(name+" "+ ownerName + " "+ Address );
	  super.printAllDetails();
	  
  }

}
