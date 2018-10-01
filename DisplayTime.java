package ClockChallenge;

import java.util.Scanner;

public class DisplayTime 
{	
	static Scanner kboard = new Scanner (System.in);
	
	
	public static void main(String[] args) 
	{
		/*int choice;
	
			System.out.println("Press 1 for 24 hour Clock, 2 for 12 hour clock, 3 to exit: ");
			choice = kboard.nextInt();
	
				if ( choice == 1)
				{*/
					ClockDisplay clock = new ClockDisplay();
					clock.timer();
				/*}
	
				if ( choice == 2)
				{
					ClockDisplay clock = new ClockDisplay();
					clock.timer();
				}*/
		
	}
}
