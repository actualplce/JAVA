
public class AccountingAppArray {

	public static void main(String[] args) { //���ڿ��� �̷�����ִ� �迭 String[]
		//args: String[]�����Կ� �ִ� ���빰�� ������ڴ� ���
		
		double valueOfSupply = Double.parseDouble(args[0]);
		double vatRate = 0.1;
		double VAT = valueOfSupply * vatRate;
		double Total = valueOfSupply +VAT;
		double expenseRate=0.3;
		
		double expense = valueOfSupply * expenseRate;
		double income = valueOfSupply  - expense;
		
		//double divideRate1=0.5;
		//double divideRate2=0.3;
		//double divideRate3=0.2;
		double[] divideRates = new double[3]; //�����������͸� 3���������ִ� ��������
		divideRates[0]=0.5;
		divideRates[1]=0.3;
		divideRates[2]=0.2;
		
		double divide1 = income*divideRates[0];
		double divide2 = income*divideRates[1];
		double divide3 = income*divideRates[2];
		
		
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
