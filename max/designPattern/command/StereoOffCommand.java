package max.designPattern.command;

public class StereoOffCommand implements Command
{
	private Stereo m_Stereo;
	
	public StereoOffCommand(Stereo p_Stereo)
	{
		this.m_Stereo = p_Stereo;
	}

	@Override
	public void execute()
	{
		this.m_Stereo.turnOff();
	}

	@Override
	public void undo()
	{
		this.m_Stereo.turnOn();
	}
}
