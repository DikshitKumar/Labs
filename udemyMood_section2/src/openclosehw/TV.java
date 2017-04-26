package openclosehw;

public class TV implements Device{

	@Override
	public void turnOn() {
		SwitchToFavoriteChannel();
		System.out.println("TV has been turned on");
	}

	private void SwitchToFavoriteChannel() {
		System.out.println("Switched to your favorite Channel");		
	}

	@Override
	public void turnOff() {
		turnOnTVAlarm();
		System.out.println("TV has been turned off");		
	}

	private void turnOnTVAlarm() {
		System.out.println("TV Alarm set for you to wake up in the morning");		
	}

	@Override
	public String toString() {
		return "TV";
	}
	
}
