package openclosehw;

public class Person {

	public static void main(String[] args) {
		
		TV bedrromTV = new TV();
		SurroundSoundSystem bedroomsystem = new SurroundSoundSystem();
		
		RemoteControl remoteControl = RemoteControl.getInstance();
		remoteControl.connectToDevice(bedrromTV);
		remoteControl.clickOnButon();
		
		remoteControl.connectToDevice(bedroomsystem);
		remoteControl.clickOnButon();
		
		remoteControl.clickOffButon();
		
		remoteControl.connectToDevice(bedrromTV);
		remoteControl.clickOffButon();
		
	}

}
