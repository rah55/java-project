package First.bank;


//importing packages
import java.util.Scanner;
import static java.lang.System.*;
import bank.controller.*;
import bank.model.*;

public class App 
{
  public static void main( String[] args )
  {
      Controller c=new Controller();   	//CONTROLLER OBJECT FOR VALIDATING THE DATA
      Model m = new Model();              //MODEL OBJECT FOR PASSING THE DATA
      Scanner sc=new Scanner(System.in);
      out.println("\t\t\t------WELCOME TO UNION BANK OF INDIA------");
      out.println("Enter account Holder Name");
      String accHolderName=sc.next();
      m.setAccHName(accHolderName);
      try
      {
      	
      	if(c.checkUsername(m)) 			//VALIDATING USERNAME
      	{
      		  out.println("Enter Password for your account ");
      	        String accPassword=sc.next();
      	        m.setAccPass(accPassword);
      	        try {
      	        	    if(c.checkPassword(m))	//VALIDATING THE PASSWORD
      	        		{
      	        			out.println("Enter account number ");
      	        	        int accNumber = sc.nextInt();
      	        	        m.setAccNum(accNumber);
      	        	        out.println("Enter Minimum balance");
      	        	        int accBalance=sc.nextInt();
      	        	        m.setAccBal(accBalance);
      	        	        out.println("------YOUR DETAILS------");
      	                    out.println(m.toString());
      	                    
      	                    //BANKING OPERATIONS
      	                   int op=0;
      	                    while(op<3)
      	                    {
      	                    	out.println("Select Operation");
      	                    	out.println(" Press 1 for Deposit" );
      	                    	out.println("   Press 2 for Withdraw" );
      	                    	out.println("   Press 3 for Exit");
      	                   op=sc.nextInt();
      	                    switch(op) {
      	                    //DEPOSIT METHOD
      	                    case 1->
      	                    {
      	                    	out.println("Enter password to deposit");
      	                    	String pwd=sc.next();
      	                    	try {
      	                    		if(c.toDeposit(m, pwd)) 
      	                    		{
      	                    		out.println("Enter amount to deposit");
      	                    		int newAmt=sc.nextInt();
      	                    		m.depositAmount(newAmt);
      	                    		out.println("your account balance is :"+m.getAccBal());	
      	                    		}
      	                    	}
      	                    	catch(Exception e)
      	                    	{
      	                    		out.println(e.getMessage());
      	                    	}
      	                    	
      	                    }
      	                    //WITHDRAW METHOD
      	                    case 2->
      	                    
      	                    {
      	                    	out.println("Enter password to withdraw");
      	                    	String pwd=sc.next();
      	                    	out.println("Enter amount to withdraw");
  	                    		int newAmt=sc.nextInt();
  	                    		try {
  	                    			if(c.toWithdraw(m, pwd, newAmt)) {
  	                    				m.withdrawAmount(newAmt);
  	                    				out.println("Withdraw successfull \nyour account balance is : "+m.getAccBal());
  	                    			}
  	                    		}
  	                    		catch(Exception e) {
  	                    			out.println(e.getMessage());
  	                    		}
      	                    }
      	                    	default->System.exit(0);
      	                    
      	                    }
      	                    }
      	        		}
      	        }
      	        catch(Exception e) {
      	        	out.println(e.getMessage());
      	        }
      	}
      }
      catch(Exception e)
      {
      	out.println(e.getMessage());
      	System.exit(0);
      }
      sc.close();
  }
}