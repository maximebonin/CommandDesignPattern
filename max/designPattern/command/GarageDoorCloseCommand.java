package max.designPattern.command;

public class GarageDoorCloseCommand implements Command 
{
	private GarageDoor m_GarageDoor;
	
	public GarageDoorCloseCommand(GarageDoor p_Door)
	{
		this.m_GarageDoor = p_Door;
	}
	
	@Override
	public void execute() 
	{
		this.m_GarageDoor.close();
	}
	
	public void undo()
	{
		this.m_GarageDoor.open();
	}

}
