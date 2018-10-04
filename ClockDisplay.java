package ClockChallenge;

public class ClockDisplay 
{
	private NumberDisplay Hours;
	private NumberDisplay Minutes;
	private NumberDisplay Seconds;
	private String displayString;
	
	/*public ClockDisplay()
	{
		Hours = new NumberDisplay(14);
		Minutes = new NumberDisplay(59);
		Seconds = new NumberDisplay(59);
		
		updateTime();
	}*/
	
	
	// ClockDisplay Constructor
	public ClockDisplay(int hour, int minute, int second)
	{
		Hours = new NumberDisplay(13);
		Minutes = new NumberDisplay(60);
		Seconds = new NumberDisplay(60);
		
		setTime(hour, minute, second);
	}
	
	
	//allows for the seconds and minutes to tick over to the new time once at the limit
	public void timer() 
	{
		Seconds.tick();
	        
	    if (Seconds.getValue() == 0) 
	    {
	    	Minutes.tick();
	            
	        	if (Minutes.getValue() == 0)
	        	{
	        		Hours.tick();
	        		
	        		if(Hours.getValue() == 0)
	        		{
	        			Hours.tick();
	        		}
	        	}
	    }		
	        
	    updateTime();
	 }
	
	// sets the input values into NumberDisplay
	public void setTime(int hour, int minute, int second)
	{
		Hours.setValue(hour);
		Minutes.setValue(minute);
		Seconds.setValue(second);
		
		updateTime();
	}
	
	//this returns the display
	public String getTime()
	{
		return displayString;
	}
	
	//this shows the overall time displayed
	 private void updateTime() 
	 {
	        displayString = Hours.getDisplayValue() + ":" + Minutes.getDisplayValue() + ":" + Seconds.getDisplayValue();
	        System.out.println(displayString);
	 }
	
}
