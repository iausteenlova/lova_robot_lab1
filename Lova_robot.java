package LaveRobotProject;

public class Lova_robot {
	int LovalID;  
	 String Lova_container;
	 private boolean Power_button;
	 private boolean Emergency_terminate;
	 private boolean Reset_button;
	 
	 public Lova_robot() {		
		 Power_button = false;
		 Emergency_terminate = false;
		 Reset_button = true;		
	 }
	 
	 public void reset()
	    {
	        if(Reset_button == false)
	        {
	        	Power_button = false;
	        	Reset_button = true;
	        	 ShowLova_container();
	        }
	        else
	        {
	            System.out.println("You can't move a lova robot which is not power on.");
	        }

	    }
	    public void powerOn() {
	        if(Power_button)
	        {
	        	Reset_button = true;
	        	ShowLova_container();
	        }
	        else
	        {
	            System.out.println("You can't operate a lova robot the is not  power on.");
	        }

	    }
	    public void terminate_alloperation() {
	        if(Power_button)
	        {
	        	Power_button = false;
	        	Reset_button = false;
	        	Emergency_terminate = true;
	        	ShowLova_container();
	        }
	        else
	        {
	            System.out.println("You can't stop a lova robot which is not started.");
	        }

	    }
	    
	    public String ShowLova_container()
	    {
	        if (Reset_button)
	        {
	        	Lova_container = "started";
	        }
	        else if(Power_button)
	        {
	        	Lova_container = "Operate";
	        }
	        else if(Emergency_terminate)
	        {
	        	Lova_container = "stopped";
	        }
	        System.out.println("The lova robot is " + this.Lova_container);
	        return Lova_container;
	    }

}
