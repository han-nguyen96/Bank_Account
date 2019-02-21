class Ntn456_BankAccount{
	private double Balance;
	private String AccountName;

	Ntn456_BankAccount(String name){
		this.Balance=0;
		this.AccountName=name;
	}

	public void depositMoney(double deposit){
		if (deposit <0)
		{
			System.out.println("Invalid Entry! Please try again.");
		}
		this.Balance= this.Balance + deposit;
		System.out.println("Thanks for depositing $"+deposit+"!");
	}

	public void withdrawMoney(double withdrawal){
		if (withdrawal > this.Balance)
		{
			System.out.println("The balance for "+AccountName+" is insufficiently funded to withdraw $"+withdrawal+".");
		}
		else if(withdrawal<0)
		{
			System.out.println("Invalid Entry! Please try again.");
		}
		else
		{
			this.Balance = this.Balance-withdrawal;
			System.out.println("Thanks for withdrawing $"+withdrawal+"! Your new balance is" + Balance);
		}
		
	}

	public String getBalance(){
		//System.out.println("The balance for "+AccountName+" is $"+Balance);
		String strBalance;
		strBalance= String.valueOf(Balance);
		String AccBal;
		AccBal= this.AccountName+" balance is $"+strBalance;
		return AccBal;
	}

	public void setBalance(double init_Balance)
	{
		this.Balance=init_Balance;
	}
}

