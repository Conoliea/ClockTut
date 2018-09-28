package ClockChallenge;

public class ClockDisplay 
{
	private NumberDisplay Hours;
	private NumberDisplay Minutes;
	private NumberDisplay Seconds;
	private String displayString;
	
	public ClockDisplay()
	{
		Hours = new NumberDisplay(24);
		Minutes = new NumberDisplay(60);
		Seconds = new NumberDisplay(60);
		
		updateTime();
	}
	
	public ClockDisplay(int hour, int minute, int second)
	{
		Hours = new NumberDisplay(24);
		Minutes = new NumberDisplay(60);
		Seconds = new NumberDisplay(60);
		
		setTime(hour, minute, second);
	}
	
	public void timer() 
	{
		Seconds.tick();
	        
	    if (Seconds.getValue() == 0) 
	    {
	    	Minutes.tick();
	            
	        	if (Minutes.getValue() == 0)
	        	{
	        		Hours.tick();
	        	}
	    }
	        
	    updateTime();
	 }
	
	public void setTime(int hour, int minute, int second)
	{
		Hours.setValue(hour);
		Minutes.setValue(minute);
		Seconds.setValue(second);
		
		updateTime();
	}
	
	public String getTime()
	{
		return displayString;
	}
	
	 private void updateTime() 
	 {
	        displayString = Hours.getDisplayValue() + ":" + Minutes.getDisplayValue() + ":" + Seconds.getDisplayValue();
	        System.out.println(displayString);
	 }
	
	public static void main(String[] args) 
	{
		ClockDisplay clock = new ClockDisplay();
        clock.timer();
	}
	
}
