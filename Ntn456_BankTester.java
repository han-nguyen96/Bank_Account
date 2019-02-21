class Ntn456_BankTester{
	public static void main(String[] args){
		Ntn456_BankAccount a = new Ntn456_BankAccount("Savings");
		Ntn456_BankAccount b = new Ntn456_BankAccount("Checking");

		a.setBalance(10250.67);
		b.setBalance(217.38);

		a.depositMoney(100);
		System.out.println(a.getBalance());

		b.withdrawMoney(220);

		System.out.println(b.getBalance());
		
	}
}