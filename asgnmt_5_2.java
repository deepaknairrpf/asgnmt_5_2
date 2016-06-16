
public class asgnmt_5_2 {

	public static void main(String[] args)
	{
		
		GovernmentBuilding VidhanaSoudha = new GovernmentBuilding("VidhanaSoudha",460,460,46,4,"14.8 million");
		Building BurjKhalifa = new Building(1000,1000,2800,163,"10023 Crore");
		House lakshmiNivas=new House("Lakshmi Nivas",60,40,30,3,"75 lakhs");
		lakshmiNivas.setAddress("No.798 1st A Main 7th Sector,2nd Block HSR layout,Bangalore");
		lakshmiNivas.setColorOfPaint("White");
		lakshmiNivas.setFlooring("Granite");
		lakshmiNivas.setOwnerName("Sathee Devi");
		lakshmiNivas.printAllDetails();
		BurjKhalifa.setFlooring("Marble");
		System.out.println("\nBURJ KHALIFA ");
		BurjKhalifa.printAllDetails();
		VidhanaSoudha.setColorOfPaint("Beige");
		VidhanaSoudha.setFlooring("Marble");
		System.out.println("\n");
		VidhanaSoudha.printAllDetails();
	}
	
}
