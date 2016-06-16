
public class GovernmentBuilding extends Building {
private String name;
GovernmentBuilding(String name)
{
	this.name=name;
}
GovernmentBuilding(String name,int length,int breadth,int height,int noOfFloors,String CostToBuild)
{	
	super(length,breadth,height,noOfFloors,CostToBuild);
	this.name=name;
}
String getName()
{
	return name;
}
void printAllDetails()
{
	System.out.println(name);
	super.printAllDetails();

}

}
