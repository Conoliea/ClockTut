package ClockChallenge;

public class NumberDisplay 
{
	private int limit;
	private int value;	
	
	public NumberDisplay(int timeLimit)
	{
		value = 0;
		limit = timeLimit;
	}
	
	public void tick()
    {
        value = (value + 1);
    }
	
	public int getValue()
	{
		return(value);
	}
	
	public String getDisplayValue() 
	{
        if (value < 10)
       	{
       		return "0" + value;
       	}	 	
       	else
       		return "" + value;
    }	
	
	public void setValue(int newValue)
	{
		if ((newValue < limit) && (newValue > 0))
		{
			value = newValue;
		}
	}
}
