package LaveRobotProject;

import java.util.HashSet;

public class lova_Collect {
	int Vending_machineID;  
	 String Item_details;
	 String Fulfilled;
	 String Unfulfilled;
	 int OrderID; 
	public lova_Collect(int Vending_machineID,String Item_details,String Fulfilled,String Unfulfilled,int OrderID) {
		this.Vending_machineID= Vending_machineID;
		this.Item_details= Item_details;
		this.Fulfilled=Fulfilled;
		this.Unfulfilled=Unfulfilled;
		this.OrderID =OrderID;		
	}
	public static void Select_Item() {
		
		 HashSet<lova_Collect> setList=new HashSet<lova_Collect>();
			//Creating lova_Collects 
			 lova_Collect b1=new lova_Collect(101,"Item1","Yes","None",3);  
			 lova_Collect b2=new lova_Collect(102,"Item2","Yes","None",4);  
			 lova_Collect b3=new lova_Collect(103,"Item3","Yes","None",8); 
			 //Adding lova_Collect 
			 setList.add(b1);
			 setList.add(b2);
			 setList.add(b3);
			 
			 for(lova_Collect b:setList){  
				 System.out.println(b.Vending_machineID+" "+b.Item_details+" "+b.Fulfilled+" "+b.Unfulfilled+" "+b.OrderID);
			 	}
	}
}
