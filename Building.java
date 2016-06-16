
public class Building {
	//dimensions are in feet and cost is in INR

	int length,breadth,height,noOfFloors;
	String costToBuild;
	private String colorOfPaint,flooring;
	int noOfRooms;
	Building(){this(0,0,0,0,"Price not available");}
	Building(int length,int breadth,int height,int noOfFloors,String costToBuild)
	{
		this.length=length;
		this.breadth=breadth;
		this.height=height;
		this.noOfFloors=noOfFloors;
		this.costToBuild= costToBuild;
	}
 void setColorOfPaint(String colorOfPaint)
 {
	 this.colorOfPaint=colorOfPaint;
 }
 void setFlooring(String flooring)
 {
	 this.flooring=flooring;
 }
 String getColorOfPaint()
 {
	 return colorOfPaint;
 }
 String getFlooring()
 {
	 return flooring;
 }
 
 void printAllDetails()
 {
	 System.out.println(length + " "+ breadth+ " " +" "+ height +" "+ noOfFloors+" " + costToBuild+ " "  +colorOfPaint +" "+ flooring );
	 
	 
 }
}
