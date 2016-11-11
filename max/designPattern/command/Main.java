package max.designPattern.command;

public class Main 
{

	public static void main(String[] args) 
	{
		RemoteControl remote = new RemoteControl();
		
		GarageDoor door = new GarageDoor();
		HotTub tub = new HotTub();
		Light light = new Light();
		Stereo stereo = new Stereo();
		
		GarageDoorOpenCommand garageOpen = new GarageDoorOpenCommand(door);
		GarageDoorCloseCommand garageClose = new GarageDoorCloseCommand(door);
		HotTubOnCommand tubOn = new HotTubOnCommand(tub);
		HotTubOffCommand tubOff = new HotTubOffCommand(tub);
		LightOnCommand lightOn = new LightOnCommand(light);
		LightOffCommand lightOff = new LightOffCommand(light);
		StereoOnCommand stereoOn = new StereoOnCommand(stereo);
		StereoOffCommand stereoOff = new StereoOffCommand(stereo);
		
		remote.setCommand(0, garageOpen, garageClose);
		remote.setCommand(1, tubOn, tubOff);
		remote.setCommand(2, lightOn, lightOff);
		remote.setCommand(3, stereoOn, stereoOff);
		
		System.out.println(remote.toString());
		
		remote.onButtonPressed(0);
		remote.offButtonPressed(2);
		remote.undoButtonPressed();
	}
}
