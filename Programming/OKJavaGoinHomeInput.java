import javax.swing.JOptionPane;

import org.opentutorials.iot.DimmingLights;
import org.opentutorials.iot.Elevator;
import org.opentutorials.iot.Lighting;
import org.opentutorials.iot.Security;

public class OKJavaGoinHomeInput {

	public static void main(String[] args) {
		
		String id= args[0];	//debug할땐 configuration ""로 
		String bright = args[1];
		//가져올값은 double(실수)인데, 구문속요소는 String이야.
		//검색 ㄱㄱ
		
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
		
		//밝기조절램프
		DimmingLights moodLamp = new DimmingLights(id+"moodLamp");
		moodLamp.setBright(Double.parseDouble(bright));
		moodLamp.on();
		
	}

}
