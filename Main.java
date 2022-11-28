package LaveRobotProject;
import java.util.*; 

public class Main {

	public static void main(String[] args) {
		
		System.out.println("Scenario 1");
		Lova_robot nova1 = new Lova_robot ();
        nova1.reset();
        System.out.println("++++++++++++++++++++++>> Start printing Items <<++++++++++++++++++++++\n");
        nova1.ShowLova_container();
        lova_Collect.Select_Item();
        System.out.println("++++++++++++++++++++++>> Stop printing Items <<++++++++++++++++++++++\n");
        nova1.powerOn();        
        nova1.terminate_alloperation();   
        nova1.ShowLova_container(); 
        System.out.println("");

        System.out.println("Scenario 2");
        Lova_robot nova2 = new Lova_robot();
        nova2.ShowLova_container();;
        nova2.powerOn();
        nova2.terminate_alloperation();
        nova2.ShowLova_container();;
        System.out.println("");

        System.out.println("Scenario 3");
        Lova_robot nova3 = new Lova_robot();
        nova3.ShowLova_container();;
        nova3.reset();
        nova3.ShowLova_container();;
        nova3.terminate_alloperation();
        nova3.ShowLova_container();;
        nova3.powerOn();
        nova3.terminate_alloperation();
		
		
		
		 //HashSet<lova_Collect> setList=new HashSet<lova_Collect>();
		//Creating lova_Collects 
		// lova_Collect b1=new lova_Collect(101,"Item1","Yes","None",3);  
		// lova_Collect b2=new lova_Collect(102,"Item2","Yes","None",4);  
		// lova_Collect b3=new lova_Collect(103,"Item3","Yes","None",8); 
		 //Adding lova_Collect 
		// setList.add(b1);
		 //setList.add(b2);
		// setList.add(b3);
		 
		// for(lova_Collect b:setList){  
		//	 System.out.println(b.Vending_machineID+" "+b.Item_details+" "+b.Fulfilled+" "+b.Unfulfilled+" "+b.OrderID);
		// 	}
		 
	}
	
}
