package ClockChallenge;

public class NumberDisplay 
{
	private int limit;
	private int value;	
	
	
	//NumberDisplay Timer
	public NumberDisplay(int timeLimit)
	{
		value = 0;
		limit = timeLimit;
	}
	
	// this allows the timer to tick over the threshold to allow for a new time to be displayed
	public void tick()
    {
        value = (value + 1) % limit;;
    }
	
	// this allows the other classes to use the new value
	public int getValue()
	{
		return(value);
	}
	
	//allows the time to be displayed as 00:00:00 -- hh/mm/ss
	public String getDisplayValue() 
	{
        if (value < 10)
       	{
       		return "0" + value;
       	}	
        
       	else
       		return "" + value;
    }	
	
	
	// this sets the value to the new value taken from the users time input
	public void setValue(int newValue)
	{
		if ((newValue < limit) && (newValue > 0))
		{
			value = newValue;
		}
	}
}
