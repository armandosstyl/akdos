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

/**
 * 
 * @author Armando
 */
public class entry
{
    // Made final, check for errors.
    private final String name;
    private final String category;
    private final String entryNo;
    private final String description;
    private final String description1;
    private final String description2;
    private final String description3;
    private final String description4;
    
    /**
     * Constructor for objects of type entry
     * @param name the entry's name
     * @param category the entry's category
     * @param entryNo the entry's unique id number
     * @param description first line of the entry's description
     * @param description1 second line of the entry's description
     * @param description2 third line of the entry's description
     * @param description3 fourth line of the entry's description
     * @param description4 final line of the entry's description
     */
    
    public entry(String name, String category, String entryNo,
            String description, String description1, String description2, 
            String description3, String description4)
    {
        this.name = name;
        this.category = category;
        this.entryNo = entryNo;
        this.description = description;
        this.description1 = description1;
        this.description2 = description2;
        this.description3 = description3;
        this.description4 = description4;
    }
    
    /**
     * Accessor method for an entry's name
     * @return entry's name
     */
    
    public String getName()
    {
        return name;
    }
    
    /**
     * Accessor method for an entry's category
     * Relics are treated differently
     * @return entry's category
     */
    
    public String getCategory()
    {
        return category;
    }
    
    /**
     * Accessor method for an entry's unique id number
     * @return entry's entry number
     */
    
    public String getEntry()
    {
        return entryNo;
    }
    
    /**
     * Accessor method for an entry's line of description
     * @return line of description text
     */
    
    public String getDesc()
    {
        return description;
    }
    
    public String getDesc1()
    {
        return description1;
    }
    
    public String getDesc2()
    {
        return description2;
    }
    
    public String getDesc3()
    {
        return description3;
    }
    
    public String getDesc4()
    {
        return description4;
    }
    
    /**
     * Formats the entry object's output
     * @return formatted output of all parameters in an entry
     */
    
    @Override
    public String toString()
    {
        return "==== " + name + " ====" + "\nCategory: " + category
                + "\nEntry no.: " + entryNo + "\n" + "\n" + description + "\n"
                + description1 + "\n" + description2 + "\n" + description3 + "\n"
                + description4;
    }
}
