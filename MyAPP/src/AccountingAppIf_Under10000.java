
public class AccountingAppIf_Under10000 {

	public static void main(String[] args) {
		
		double valueOfSupply = Double.parseDouble(args[0]);
		double vatRate = 0.1;
		double VAT = valueOfSupply * vatRate;
		double Total = valueOfSupply +VAT;
		double expenseRate=0.3;
		double divideRate1 = 0.5;
		double divideRate2 = 0.3;
		double divideRate3 = 0.2;
		double expense = valueOfSupply * expenseRate;
		double income = valueOfSupply  - expense;

		double divide1 ;
		double divide2 ;
		double divide3 ;
		
		if(income>10000) {
			divide1=income*0.5;
			divide2=income*0.3;
			divide3=income*0.2;
		}else {
			divide1=income*1.0;
			divide2=income*0;
			divide3=income*0;
		}
		
		
		
		System.out.println("Value of supply : " + valueOfSupply);// ���ް�
		System.out.println("VAT : " + VAT); // ���� ������ �� ��, ����
		System.out.println("Total : " + Total); // �Һ��ڰ� 11000won
		
		System.out.println("Expense : " + expense); // 30%�� ����̶��ϸ�,
		System.out.println("Income : " + income); // ���� �� ���� ��ü-���
		System.out.println("Divide1: "+ divide1);
		System.out.println("Divide2: "+ divide2);
		System.out.println("Divide3: "+ divide3);
		
		
	}

}
