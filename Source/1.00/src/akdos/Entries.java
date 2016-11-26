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

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "entries")
@XmlAccessorType (XmlAccessType.FIELD)
public class Entries 
{
	@XmlElement(name = "entry")
	private List<Entry> entries = null;

	public List<Entry> getEntries() {
		return entries;
	}

	public void setEntries(List<Entry> entries) {
		this.entries = entries;
	}
        
        public void searchEntries(String searchTerm)
        {
            boolean resultFound = false;
            
            for (Entry ent : entries)
            {
                if (ent.getCat().equalsIgnoreCase(searchTerm))
                        {
                            System.out.println(ent.getName());
                            resultFound = true;
                        }
                else if (ent.getName().equalsIgnoreCase(searchTerm))
                {
                    System.out.println(ent.getString());
                    resultFound = true;
                }
                else if (ent.getId().equalsIgnoreCase(searchTerm))
                {
                    System.out.println(ent.getString());
                    resultFound = true;
                }
            }
            if (!resultFound)
            {
                System.out.println("Nothing found!");
            }
        }
        
        public void listCat()
        {
            boolean catsFound = false;
            
            ArrayList<String> listCat = new ArrayList<String>();
            for (Entry ent : entries)
            {
                if (!listCat.contains(ent.getCat()))
                {
                    listCat.add(ent.getCat());
                    catsFound = true;
                }
            }
            
            if (catsFound)
            {
                System.out.println("");
                System.out.println("List of categories available in databse: ");
                System.out.println(Arrays.toString(listCat.toArray()));
            }
            else
            {
                System.out.println("Nothing found!");
            }
        }
}
