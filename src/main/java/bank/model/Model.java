package bank.model;


public class Model {
	private int accNum;
	private int accBal;
	private String accHName;
	private String accPass;
	
	
	public int getAccNum() {
		return accNum;
	}

	public void setAccNum(int accNum) {
		this.accNum = accNum;
	}

	public int getAccBal() {
		return accBal;
	}

	public void setAccBal(int accBal) {
		this.accBal = accBal;
	}

	public String getAccHName() {
		return accHName;
	}

	public void setAccHName(String accHName) {
		this.accHName = accHName;
	}

	public String getAccPass() {
		return accPass;
	}

	public void setAccPass(String accPass) {
		this.accPass = accPass;
	}

	public void depositAmount(int amount) {
		this.accBal +=amount;
	}
	
	public void withdrawAmount(int amount) {
		this.accBal -=amount;
	}
	
	@Override
	public String toString() {
		return "Model [accNumber=" + accNum + ", accBalance=" + accBal + ", accHolderName=" + accHName
				+ ", accPassword=" + accPass + "]";
	}
	
	
}