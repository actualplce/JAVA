class AccountingInstance {	
	public double valueOfSupply;
	public double vatRate;					//인스턴스(new)로 활용할거면 static 빼야됨.
	public double expenseRate;					
	public void print() {
		System.out.println("Value of supply : " + valueOfSupply);
		System.out.println("VAT : " + getVAT());
		System.out.println("Total : " + getTotal()); 
		
		System.out.println("Expense : " + getExpense()); 
		System.out.println("Income : " + getIncome());
		
		
	}

	public double getIncome() {
		return valueOfSupply  - getExpense();
	}

	public double getExpense() {
		return valueOfSupply * expenseRate;
	}

	public double getTotal() {
		return valueOfSupply +getVAT();
	}

	public double getVAT() {
		return valueOfSupply * vatRate;
	}
	
}
public class AccountingClassAppInstance {

	public static void main(String[] args) { 
		
		AccountingInstance a1 = new AccountingInstance(); //클래스'Accounting'의 인스턴스 생성(new)
		a1.valueOfSupply = 10000.0;
		a1.vatRate = 0.1;
		a1.expenseRate = 0.3;
		a1.print();
		
	//	a1.valueOfSupply = Double.parseDouble(args[0]);

		
		double[] divideRates = new double[3]; 
		divideRates[0]=0.5;
		divideRates[1]=0.3;
		divideRates[2]=0.2;
		
			
		int i=0;
		while(i < divideRates.length) {	//우리는 3번반복
			System.out.println("Divider: "+ (i+1));	//Divider: 0,1,2	
			System.out.println("DivideRate: "+divideRates[i]);
			System.out.println("Earinigs: "+ a1.getIncome()*divideRates[i]);
			//DivideRate: 0.5,0.3,0.2
			i++;
		}		
			
			
		AccountingInstance a2 = new AccountingInstance(); //클래스'Accounting'의 인스턴스 생성(new)
		a2.valueOfSupply = 50000.0;
		a2.vatRate = 0.12;
		a2.expenseRate = 0.2;
		a2.print();
		
		
		divideRates = new double[3];
		divideRates[0]=1.0;
		divideRates[1]=0.0;
		divideRates[2]=0.0;
		
			
		i=0;
		while(i < divideRates.length) {	//우리는 3번반복
			System.out.println("Divider: "+ (i+1));	//Divider: 0,1,2	
			System.out.println("DivideRate: "+divideRates[i]);
			System.out.println("Earinigs: "+ a2.getIncome()*divideRates[i]);
			//DivideRate: 0.5,0.3,0.2
			i++;
		}
	}

	

}
