/*
 * Copyright (C) 2016 Armandos Stylianakis
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package akdos;

import java.io.File;
import java.util.Scanner;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

public class AkDOS {

/**
 * The main method, which sets up the main switch statement to handle user
 * interface, and calls the proper methods and objects.
 * @param args
 * @throws InterruptedException
 * @throws JAXBException
 */
    
    public static void main(String[] args) throws InterruptedException, JAXBException
    {
        Scanner in = new Scanner(System.in);
        
        String inputField = "0"; // For user input
        String tempField = "0"; // Used if necessary to switch user input to all lower case
        
        int att = 0; // Attribute rating for hacking dice pool
        int skill = 0; // Skill rating for hacking dice pool
        int mod = 0; // Dice modifiers for hacking dice pool
        
        boolean access = false; // To password-control access to the second switch statement
        boolean killOptions = false; // To keep the second switch statement in a loop
        
        
        SwitchInterface si = new SwitchInterface ("0"); // Constructs an instance of SwitchInterface 
        
        JAXBContext jaxbContext = JAXBContext.newInstance(Entries.class);
	Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
	Entries entries = (Entries) jaxbUnmarshaller.unmarshal( new File("akdos.xml") );
        
        si.getWelcome(); // Welcome screen
        
        /**
         * Switch statement inside a 'while' loop, to carry out the functions of the
         * initial menu (before logging in)
         */
        
        while (access == false)
        {
            switch (inputField)
            {
                case "distress":
                    inputField = si.getDistress(); // Calls up the accessor for the 'distress signal'
                    break;
                case "ping admin":
                    inputField = si.getPing(); // Calls up the accessor for pinging administrator
                    break;
                case "akd-a 0609":            // Default username
                    access = si.getPass(); // calls the accessor for checking the password
                    inputField = "0";
                    break;
                case "storyteller":     // Insert character ratings for hacking attempt
                    System.out.print("Insert character's Intelligence rating (1-5): ");
                    att = si.setRatings();
                    System.out.print("Insert character's Computer rating (1-5, -3 for unskilled): ");
                    skill = si.setRatings();
                    System.out.print("Insert any dice modifiers: ");
                    mod = si.setRatings();
                    
                    inputField = "0";
                    break;
                case "load /usb":       // Hacking attempt
                    DiceRoller roller = new DiceRoller(att,skill,mod);
                    roller.rollDice();
                    
                    int succ = roller.getSucc();
                    
                    System.out.print("Total successes: " + roller.getSucc());
                    System.out.print("");
                    
                    if (roller.getBotch() == true)
                    {
                        si.getHackBotch();
                        Thread.sleep(5000);
                        System.exit(0);
                    }
                    else if (succ >= 1)
                    {
                        access = si.getHackSucc();
                    }
                    else
                    {
                        si.getHackFail();
                    }
                    
                    inputField = "0";
                    break;
                case "q":
                    System.exit(0);     // kills the application
                    break;
                default:
                    System.out.print(">: ");
                    tempField = in.nextLine();
                    inputField = tempField.toLowerCase();
                    break;
            }
        }

            si.getLogIn();          // accesses the successful log in screen
            
            inputField = si.getOptions();   // Lists options and sets inputField to the default '0'
            while (killOptions == false)    // Loop with unused variable, to maintain the switch statement running
            {
                switch (inputField)
                {
                    case "s":
                        
                        System.out.print("Search term (Name, Category, or ID) >: ");
                        entries.searchEntries(in.nextLine());
                        
                        inputField = "0";       // Sets the inputField back to default value to start the loop all over
                        break;
                    case "l":
                        System.out.println("");
                        
                        entries.listCat();
                        
                        System.out.println("");
                        inputField = "0";       // Sets the inputField back to default value to start the loop all over
                        break;
                    case "r":
                        System.out.println("");
                        entries.searchEntries("Relic");
                        
                        inputField = "0";       // Sets the inputField back to default value to start the loop all over
                        break;
                    case "o":
                        System.out.println("");
                        entries.searchEntries("Log");
                        
                        inputField = "0";       // Sets the inputField back to default value to start the loop all over
                        break;
                    case "m":
                        inputField = si.getOptions();   // Displays the logged in menu again
                        break;
                    case "q":
                        System.exit(0);     // Kills the application
                        break;
                    default:
                        System.out.print("\n(type 'm' to get options) >: ");
                        tempField = in.nextLine();
                        inputField = tempField.toLowerCase();
                        break;
                }
            }
    }
    
}
