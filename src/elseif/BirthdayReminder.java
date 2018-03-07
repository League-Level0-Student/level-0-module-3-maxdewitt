
//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

package elseif;

import javax.swing.JOptionPane;

public class BirthdayReminder {

	public static void main(String[] args) {
	
		// 1. correct the birthdays for your family below
		String momsBirthday = "January 24th";
		String dadsBirthday = "June 9th";
		String myBirthday = "December 20";

		// 2. Find out which birthday the user wants and and store their response in a variable
	     String whatbirthday = JOptionPane.showInputDialog("What birthday do you choose?");
		// 3. Print out what the user typed
	System.out.println(whatbirthday);	
		// 4. if user asked for "mom" 
	if (whatbirthday.equalsIgnoreCase("mom")) {
		System.out.println(momsBirthday);
	}
			//print mom's birthday
		// 5. if user asked for "dad"
	else if (whatbirthday.equalsIgnoreCase("dad")) {
		System.out.println(dadsBirthday);
	}
			// print dad's birthday
		// 6. if user asked for your name
			// print myBirthday
	else if (whatbirthday.equalsIgnoreCase("max")) {
		System.out.println(myBirthday);
	}
		//7. otherwise print "Sorry, i don't remember that person's birthday!"
	else {
		System.out.println("I dont remember that person's birthday!");
	}
	} 
}
