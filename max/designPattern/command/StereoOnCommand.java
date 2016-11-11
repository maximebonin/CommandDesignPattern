package max.designPattern.command;

public class StereoOnCommand implements Command 
{
	private Stereo m_Stereo;
	
	public StereoOnCommand(Stereo p_Stereo)
	{
		this.m_Stereo = p_Stereo;
	}

	@Override
	public void execute()
	{
		this.m_Stereo.turnOn();
	}

	@Override
	public void undo()
	{
		this.m_Stereo.turnOff();
	}
}
