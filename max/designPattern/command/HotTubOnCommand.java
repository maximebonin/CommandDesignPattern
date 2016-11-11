package max.designPattern.command;

public class HotTubOnCommand implements Command
{
	private HotTub m_Tub;
	
	public HotTubOnCommand(HotTub p_Tub)
	{
		this.m_Tub = p_Tub;
	}
	
	@Override
	public void execute() 
	{
		this.m_Tub.turnOn();
	}

	@Override
	public void undo()
	{
		this.m_Tub.turnOff();
	}
}
