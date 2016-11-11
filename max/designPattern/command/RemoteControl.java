package max.designPattern.command;

public class RemoteControl 
{
	public final static int NUMBER_BUTTONS = 7;
	
	Command[] m_CommandsOn;
	Command[] m_CommandsOff;
	Command m_Undo;
	
	public RemoteControl()
	{
		this.m_CommandsOn = new Command[NUMBER_BUTTONS];
		this.m_CommandsOff = new Command[NUMBER_BUTTONS];
		
		Command noCommand = new NoCommand();
		this.m_Undo = noCommand;
		
		for(int i = 0 ; i < NUMBER_BUTTONS ; i++) // initialize to fake Commands to prevent null
		{
			this.m_CommandsOn[i] = noCommand;
			this.m_CommandsOff[i] = noCommand;
		}
	}
	
	public void setCommand(int p_Position, Command p_On, Command p_Off)
	{
		this.m_CommandsOn[p_Position] = p_On;
		this.m_CommandsOff[p_Position] = p_Off;
	}
	
	public void onButtonPressed(int p_Position)
	{
		this.m_CommandsOn[p_Position].execute();
		this.m_Undo = this.m_CommandsOn[p_Position];
	}
	
	public void offButtonPressed(int p_Position)
	{
		this.m_CommandsOff[p_Position].execute();
		this.m_Undo = this.m_CommandsOff[p_Position];
	}
	
	public void undoButtonPressed()
	{
		this.m_Undo.undo();
	}
	
	@Override
	public String toString()
	{	
		StringBuffer stringBF = new StringBuffer();
		
		stringBF.append("\n------------- Remote Control ------------\n");
		
		for(int i = 0 ; i < this.m_CommandsOn.length ; i++)
		{
			stringBF.append("[slot "+i+"]: "+ this.m_CommandsOn[i].getClass().getSimpleName() + " " + this.m_CommandsOff[i].getClass().getSimpleName() + "\n");		
		}
		
		return stringBF.toString();
	}
}
