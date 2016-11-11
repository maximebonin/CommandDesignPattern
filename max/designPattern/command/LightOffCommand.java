package max.designPattern.command;

public class LightOffCommand implements Command 
{
	private Light m_Light;
	
	public LightOffCommand(Light p_Light)
	{
		this.m_Light = p_Light;
	}

	@Override
	public void execute()
	{
		this.m_Light.turnOff();
	}

	@Override
	public void undo()
	{
		this.m_Light.turnOn();
	}
}
