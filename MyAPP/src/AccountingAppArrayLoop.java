
public class AccountingAppArrayLoop {

	public static void main(String[] args) { 
		
		double valueOfSupply = Double.parseDouble(args[0]);
		double vatRate = 0.1;
		double VAT = valueOfSupply * vatRate;
		double Total = valueOfSupply +VAT;
		double expenseRate=0.3;
		
		double expense = valueOfSupply * expenseRate;
		double income = valueOfSupply  - expense;

		System.out.println("Value of supply : " + valueOfSupply);// ���ް�
		System.out.println("VAT : " + VAT); // ���� ������ �� ��, ����
		System.out.println("Total : " + Total); // �Һ��ڰ� 11000won
		
		System.out.println("Expense : " + expense); // 30%�� ����̶��ϸ�,
		System.out.println("Income : " + income); // ���� �� ���� ��ü-���

		double[] divideRates = new double[3]; 
		divideRates[0]=0.5;
		divideRates[1]=0.3;
		divideRates[2]=0.2;
		
			
		int i=0;
		while(i < divideRates.length) {	//�츮�� 3���ݺ�
			System.out.println("Divider: "+ (i+1));	//Divider: 0,1,2	
			System.out.println("DivideRate: "+divideRates[i]);
			System.out.println("Earinigs: "+ income*divideRates[i]);
			//DivideRate: 0.5,0.3,0.2
			i++;
		}
	}

}
