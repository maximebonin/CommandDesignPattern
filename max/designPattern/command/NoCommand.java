package max.designPattern.command;

// This class makes nothing at all ; just prevents null

public class NoCommand implements Command 
{

	@Override
	public void execute()
	{		
	}

	@Override
	public void undo()
	{		
	}

}
