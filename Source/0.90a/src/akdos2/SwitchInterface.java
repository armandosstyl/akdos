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
public class SwitchInterface
{
    private String inputField;
    private String passWord;
    
    public SwitchInterface (String inputField)
    {
        this.inputField = inputField;
    }
    
    /**
     * Changes the inputField variable for this instance
     * @param newInput the new value assigned to inputField
     */
    
    public void setInput (String newInput)
    {
        inputField = newInput;
    }
    
    /**
     * Displays the initial welcome screen
     */
    
    public void getWelcome()
    {
        System.out.println("");
        System.out.println("AkDOS       v0.22");
        System.out.println("");
        System.out.println("Welcome!");
        System.out.println("");
        System.out.println("Type in your USERNAME to connect to the "
                            + "secure network.");
        System.out.println("");
        System.out.println("To transmit an emergency signal, type: 'distress'");
        System.out.println("To ping an administrator, type: 'ping admin'");
        System.out.println("To shut down at any point, type: 'q'");
        System.out.println("");
    }
    
    /**
     * The failed distress signal code
     * @return sets the main method's inputField variable to a default value
     * @throws InterruptedException 
     */
    
    public String getDistress() throws InterruptedException
    {
        Scanner dis = new Scanner(System.in);
        
        System.out.print("Please enter the letter (A-Z) corresponding to the " 
                + "\nsector you are located in, followed by the number (1-9): ");
        dis.nextLine();

        System.out.println("");
        Thread.sleep(1000);
        System.out.println("Establishing connection to host...");
        Thread.sleep(2000);
        System.out.println("Error! Cannot reach host.");
        Thread.sleep(2000);
        System.out.println("Error! Cannot reach host.");
        Thread.sleep(2000);
        System.out.println("Error! Cannot reach host.");
        return ("0");
    }
    
    /**
     * The pinging administrator code
     * @return sets the main method's inputField variable to a default value
     * @throws InterruptedException 
     */
    
    public String getPing() throws InterruptedException
    {
        System.out.println("Pinging administrator...");
        Thread.sleep(1000);
        System.out.println(".....................");
        Thread.sleep(2000);
        System.out.println("Your IP address is the following:");
        Thread.sleep(500);
        System.out.println("85.73.68.7");
        Thread.sleep(500);
        System.out.println("");
        System.out.println("Establishing connection...");
        Thread.sleep(1000);
        System.out.println(".....................");
        Thread.sleep(500);
        System.out.println("Connection Established!");
        System.out.println("Your location and IP address have been"
            + " logged.");
        return "0";
    }
    
    /**
     * Asks the user to input the password of the default username
     * @return A boolean value to allow moving on from the first to the second
     *         switch statement
     */
    
    public boolean getPass()
    {
        System.out.print("Please enter password for user \"Antigoni\": ");
        Scanner pass = new Scanner (System.in);
        String passField = pass.nextLine();
        
        if (passField.equals("drakolimni_1911"))
        {
            return true;
        }
        System.out.println("Incorrect password!");    
        return false;
    }
    
    /**
     * Logging in process screen
     * @throws InterruptedException 
     */
    
    public void getLogIn() throws InterruptedException
    {
        System.out.println("");
        System.out.println("Logging in...");
        Thread.sleep(3000);
        System.out.println("");
        Thread.sleep(1000);
        System.out.print("....");
        Thread.sleep(700);
        System.out.print(".......");
        Thread.sleep(1000);
        System.out.print("...........");
        Thread.sleep(500);
        System.out.println("..................");
    }
    
    /**
     * Welcome screen to logged-in user and displays options
     * @return sets main method's inputField variable to a default value
     */
    
    public String getOptions()
    {
        System.out.println("");
        System.out.println("");
        System.out.println("=======================================================");
        System.out.println("Welcome to the Aegis kai Doru secure network,"
            + " Antigoni.");
        System.out.println("=======================================================");
        System.out.println("");
        System.out.println("");
        System.out.println("List of options:");
        System.out.println("");
        System.out.println("* Search");
        System.out.println("* List");
        System.out.println("* Relics");
        System.out.println("");
        System.out.println("Type 'm' for menu");
        System.out.println("Type 'q' to quit");
        System.out.println("");
        return ("0");
    }
}
