package max.designPattern.command;

public class LightOnCommand implements Command 
{
	private Light m_Light;
	
	public LightOnCommand(Light p_Light)
	{
		this.m_Light = p_Light;
	}

	@Override
	public void execute()
	{
		this.m_Light.turnOn();
	}

	@Override
	public void undo()
	{
		this.m_Light.turnOff();
	}
}
