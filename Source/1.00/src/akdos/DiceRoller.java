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

import java.util.Random;

public class DiceRoller
{
    private int attr;
    private int skill;
    private int mod;
    private final int sides = 10;
    
    private int pool;
        
    private int rollResult;
    private int succ;
    private static int rollCount = 0;
    private boolean botch;
    private Random roller;
    
    public DiceRoller(int newAttr, int newSkill, int newMod)
    {
        attr = newAttr;
        skill = newSkill;
        mod = newMod;
        
        pool = newAttr + newSkill + newMod - rollCount;
        
        roller = new Random();
        botch = false;
    }
    
    public void rollDice()
    {
        if (pool <= 0)
        {
            rollResult = roller.nextInt(sides) + 1;
            if (rollResult == 10)
            {
                this.succ++;
            }
            else if (rollResult == 1)
            {
                botch = true;
            }
            
            System.out.print("Result on chance roll: " + this.rollResult);
            System.out.println("");
        }
        else
        {
            for (int i = 1; i <= pool; i++)
            {
                rollResult = roller.nextInt(sides) + 1;
                System.out.print("Result on roll: " + this.rollResult);
                System.out.println("");
                
                if (rollResult == 10)
                {
                    this.succ++;
                    i--;
                }
                else if (rollResult >= 8)
                {
                    this.succ++;
                }
            }
        }
        rollCount++;
    }
    
    public int getSucc()
    {
        return this.succ;
    }
    
    public boolean getBotch()
    {
        return this.botch;
    }
    
    public int getRollCount()
    {
        return rollCount;
    }
}
