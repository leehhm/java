package sec03.exam05;

public class SmartTelevisionExample {

	public static void main(String[] args) {
		SmartTelevision tv = new SmartTelevision();
		
		RemoteControl rc = tv;
		Searchable searchable = tv;
		
		tv.turnOn();
		tv.setVolume(5);
		tv.search("Google");
		tv.turnOff();
		
		System.out.println("-----------");
		rc.turnOn();
		rc.turnOff();
		searchable.search("NAVER");
	}
}