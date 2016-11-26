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

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "entry")
@XmlAccessorType (XmlAccessType.FIELD)
public class Entry 
{
	private String id;
	private String cat;
	private String name;
	private String text;
	
	public String getId() {
		return id;
	}
	public void setId(String id)
        {
		this.id = id;
	}
        public String getCat()
        {
            return cat;
        }
        public void setCat(String cat)
        {
            this.cat = cat;
        }
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getText() {
		return text;
	}
	public void setText(String text) {
		this.text = text;
	}
        public String getString()
        {
            return "==== " + name + " ====" + "\nCategory: " + cat
                + "\nEntry ID: " + id + "\n" + "\n" + text;
        }
}
