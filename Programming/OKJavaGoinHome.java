import org.opentutorials.iot.Elevator;
import org.opentutorials.iot.Lighting;
import org.opentutorials.iot.Security;

public class OKJavaGoinHome {

	public static void main(String[] args) {
		
		String id="Java apt 1303";
		//Elevator call
		Elevator myElevator = new Elevator(id);
		//elevator라는 데이터타입에 myele~라는 변수이름
		myElevator.callForUp(1); //나 올라갈건데 1층으로 엘베보내.
		
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
