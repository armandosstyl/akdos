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
package akdos2;

import java.util.Scanner;

/**
 *
 * @author Armando
 */
public class AkDOS2 {

/**
 * The main method, which sets up the main switch statement to handle user
 * interface, and calls the proper methods and objects.
 * @param args
 * @throws InterruptedException 
 */
    
    public static void main(String[] args) throws InterruptedException
    {
        Scanner in = new Scanner(System.in);
        
        String inputField = "0"; // For user input
        String tempField = "0"; // Used if necessary to switch user input to all lower case
        
        boolean access = false; // To password-control access to the second switch statement
        boolean killOptions = false; // To keep the second switch statement in a loop
        
        
        SwitchInterface si = new SwitchInterface ("0"); // Constructs an instance of SwitchInterface 
        Entries entries = new Entries(); // Constructs an instance of Entries
        
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
                case "a-da 0609":            // Default username
                    access = si.getPass(); // calls the accessor for checking the password
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
                    case "search":
                        System.out.print("Search term >: ");
                        Entries.setSearchName(in.nextLine());   // Sets the searchName variable in the Entries class
                        
                        System.out.println("");
                        Entries.findName();     // Looks up the specified search term
                        System.out.println("");
                        inputField = "0";       // Sets the inputField back to default value to start the loop all over
                        break;
                    case "list":
                        System.out.println("");
                        Entries.listCat();      // Lists all categories associated with entries
                        System.out.println("");
                        inputField = "0";       // Sets the inputField back to default value to start the loop all over
                        break;
                    case "relics":
                        System.out.println("");
                        Entries.listRelics();   // Lists all entries whose category is set to 'Relic'
                        System.out.println("");
                        System.out.print("Enter relic name >:");
                        
                        Entries.setRelicName(in.nextLine());    // Changes the variable relicName in Entries method, to user's input
                        System.out.println("");
                        Entries.findRelic();    // Looks up the specified search term
                        System.out.println("");
                        
                        inputField = "0";       // Sets the inputField back to default value to start the loop all over
                        break;
                    case "m":
                        inputField = si.getOptions();   // Displays the logged in menu again
                        break;
                    case "q":
                        System.exit(0);     // Kills the application
                        break;
                    default:
                        System.out.print(">: ");
                        tempField = in.nextLine();
                        inputField = tempField.toLowerCase();
                        break;
                }
            }
    }
    
}
