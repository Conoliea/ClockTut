package ClockChallenge;

import java.util.Scanner;

public class DisplayTime 
{	
	static Scanner kboard = new Scanner (System.in);
	
	//driver for displaying the time 24hour and 12 hour.
	public static void main(String[] args) 
	{
					
					ClockDisplay clock = new ClockDisplay(12, 59, 59);
					clock.timer();
		
	}
}
