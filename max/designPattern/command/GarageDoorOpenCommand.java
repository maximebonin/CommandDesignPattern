package max.designPattern.command;

public class GarageDoorOpenCommand implements Command 
{
	private GarageDoor m_GarageDoor;
	
	public GarageDoorOpenCommand(GarageDoor p_Door)
	{
		this.m_GarageDoor = p_Door;
	}
	
	@Override
	public void execute() 
	{
		this.m_GarageDoor.open();
	}
	
	public void undo()
	{
		this.m_GarageDoor.close();
	}
}
