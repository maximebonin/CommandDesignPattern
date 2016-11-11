package max.designPattern.command;

public class HotTubOffCommand implements Command 
{
	private HotTub m_Tub;
	
	public HotTubOffCommand(HotTub p_Tub)
	{
		this.m_Tub = p_Tub;
	}
	
	@Override
	public void execute()
	{
		this.m_Tub.turnOff();
	}

	@Override
	public void undo()
	{
		this.m_Tub.turnOn();
	}
}
