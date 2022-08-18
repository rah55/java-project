package bank.controller;

import java.io.IOException;
import java.util.regex.Pattern;

import bank.model.*;

public class Controller {
	//CHECKING USERNAME
	public boolean checkUsername(Model m)
			throws IOException {
		String username= m.getAccHName();
		
		if(Pattern.matches("[a-zA-Z]{5,10}", username))
		{
			return true;
		}
		else {
			throw new IOException("username can only alphabets and digits ");
		}
	}
	//FOR CHECKING PASSWORD
	public boolean checkPassword(Model m) throws IOException {
		String password= m.getAccPass();
		
		if(Pattern.matches("[a-zA-Z0-9@#]{6,}",password))
		{
			return true;
		}
		else {
			throw new IOException("password can have more than 6 chars ");
		}
	}
	//CHECKING DEPOSIT DETAILS
	public boolean toDeposit(Model m,String pwd)
			throws IOException{
		
		String password=m.getAccPass();
		if(pwd.equals(password)) {
			return true;
		}
		else {
			throw new IOException("wrong password");
		}	
	}
	//CHECKING WITHDRAW DETAILS
	public boolean toWithdraw(Model m,String pwd,int withdrawAmt) throws IOException{
		
		String password=m.getAccPass();
		int accbal =m.getAccBal();
		if(pwd.equals(password)) {
			if(accbal>withdrawAmt) {
				return true;
			}
			else {
				throw new IOException("Not Enough Balance");
			}
		}
		else {
			throw new IOException("wrong password");
		}
		
		
	}
}
