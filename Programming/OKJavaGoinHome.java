import org.opentutorials.iot.Elevator;
import org.opentutorials.iot.Lighting;
import org.opentutorials.iot.Security;

public class OKJavaGoinHome {

	public static void main(String[] args) {
		
		String id="Java apt 1303";
		//Elevator call
		Elevator myElevator = new Elevator(id);
		//elevator��� ������Ÿ�Կ� myele~��� �����̸�
		myElevator.callForUp(1); //�� �ö󰥰ǵ� 1������ ��������.
		
		//Security off
		Security mySecurity = new Security(id);
		mySecurity.off();
		
		//Light on
		Lighting hallLamp = new Lighting(id +" / Hall lamp");
		hallLamp.on();
		Lighting floorLamp = new Lighting(id+"floor Lamp");
		floorLamp.on();
		
		
		
	}

}
