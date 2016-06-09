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

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Generates an ArrayList for all 'Entry' elements in the database.
 * @author Armando
 */

public class Entries
{
    /**
     * The String variable used by the method findName() to locate an entry's name,
     * category, or entry no., in the arraylist.
     */
    private static String searchName;
    /**
     * Similar to the searchName String variable, used in the method findRelic.
     */
    private static String relicName;
    
    /**
     * Initialization of the ArrayList 'e'.
     */
    
    public static ArrayList<entry> e = new ArrayList<entry>();
    
    /**
     * Adds each entry element to the ArrayList e: entry(String name, String category, String entryNo,
            String description, String description1, String description2, 
            String description3, String description4).
     */
    
    Entries()
    {  
        e.add(new entry("Vrihi", "Vampires", "V-AG 1106", "From the ancient Greek term vrihos, roar. A lost clan of Vampires from ancient Athens.", 
                "Rumored to have all disappeared with the Roman conquest of the city.", 
                "Their mythical powers supposedly involved time manipulation, and", 
                "the ability to infest with their emotional state, large parts of the", 
                "local populace."));
        
        e.add(new entry("Ventrue", "Vampires", "V-UN 0101", "A clan of power-hungry, dominating Vampires. They rule their undead society of", 
                "monsters, calling themselves 'Lords' or 'Undefeated'. Vampiric apocrypha places them in Rome, Carthage, and even Troy.", 
                "Last documented contact with one of these Vampires was made near the end of the 1950s. No further mention of them from ", 
                "our sources in vampire society. They appear to be all but gone from Athens.", 
                ""));
        
        e.add(new entry("Daeva", "Vampires", "V-UN 0097", "Hedonistic monsters, they consider themselves the Serpents from the Garden of Eden. They savour spending time ", 
                "around people, tempting them to do unspeakable things for the sake of want and desire.", 
                "Last documented contact with one of these Vampires was made near the end of the 1950s. No further mention of them from ", 
                "A recurring theme in their mythology is Ishtar, Lilith, and the owl demons of Babylon. By engaging them, we risk", 
                "having our agents defecting in servitude of these succubi."));
        
        e.add(new entry("Gangrel", "Vampires", "V-UN 0098", "Even other vampires seem to think of the Gangrel as Savages, part werewolves part Vampires with various", 
                "violent tendencies. Those we have encountered seem to wear these insults like badges of honour. We would have", 
                "suffered great losses at their fleshcrafting hands and claws, if not for the recent, suspicious change of", 
                "events. First the Ventrue disappear, now these monsters fall out of favour with whomever is the vampire", 
                "'Prince' these days. Others increasingly refer to them as 'Metics'."));
        
        e.add(new entry("Mekhet", "Vampires", "V-UN 0099", "The Shadows, as they like to refer to themselves, are a formidable rival the Aegis kai Doru", 
                "comes the closest (as we can come with monsters) to respecting. Their archives and collections of relics rival ours.", 
                "If they were to discover our underground base in Pendeli, they would undoubtedly attempt to infiltrate us and steal", 
                "our secrets. Do not trust them, even as they convince you of their scholarly characters, and do not trust your own shadows", 
                "around them"));
        
        e.add(new entry("Nosferatu", "Vampires", "V-UN 0100", "The true monsters among monsters. All agents who have previously engaged one of them, has subsequently required extensive", 
                "leave and intensive psychiatric treatment. Their origins are ancient, descending from the ancient Nosophoroi of classical Athens. Despite", 
                "their horrific appearance, other 'clans' seem to respect them and grant them titles of honour in politics and vampire religion.", 
                "We can confirm they maintain an underground hub of tunnels and catacombs, with entrances (at the very least) located in Plato's prison,", 
                "the Byzantine church at the end of Ermou Street, and quite likely here in Pendeli somewhere."));
        
        e.add(new entry("Vampire", "Vampires", "V-UN 0001", "Undead monsters who invade the bodies of recently deceased humans, claiming their former identity and memories", 
                "as theirs. They subsist on human blood, flesh, and/or 'souls' (or 'life force', for lack of a better term). They organize in worldwide sects called", 
                "'covenants' and appear to adhere to a system of lineage called the 'clan' system. Unless killed, they survive for eternity and like parasites, they", 
                "attempt to infiltrate and manipulate mortal institutions. Fatal weaknesses include: sunlight, fire, wooden stakes, decapitation, holy symbols.", 
                "They have always been here, like a dark shadow that followed us out of the Garden or away from Atlantis."));
        
        e.add(new entry("Striges", "Vampires", "V-UN 1037", "Inconclusive data. The vampires talk about them alot, as if these 'Striges' hold some ancient grudge against", 
                "them. Historical research only mentions a type of demon.", "", "", ""));
        
        e.add(new entry("Hermann R.", "Vampires", "V-OD 0389",
                "Supposedly an undead psychiatrist and second-in-command to the Ordo Dracul leader in Athens. Encounters with Dr. R. have been unnerving for our agents,", 
                "to say the least. His communication with us has nonetheless provided us with considerable insight on the behaviour and weaknesses of supernaturals. The",
                "Inner Circle seems to consider him and the rest of the so-called Dragons as our unlikely allies for now. Agents report that he has been seen frequenting",
                "Vathis Square.",
                ""));
        
        e.add(new entry("Daedalus", "Agents", "O-HU 0000",
                "In Eden (some might call it Atlantis instead), we, the Guardians of the Labyrinth, served as the great artificers among the enlightened Men and Women.",
                "We were led by Daedalus, the greatest of our order, and we built the Great Labyrinths. Some to contain hubristic magick, others to contain monsters.",
                "One Labyrinth failed, the one Pandora watched over, and darkness sprung forth: shapeshifters and other monsters. Panicked, magician turned against magician,",
                "and all against us. Some fled to the lands beyond Eden, others to the lands above. Eventually, no memory of the paradise we had left behind remained.",
                "On that day, Daedalus disappeared forever. We still hunt down what escaped our Labyrinths. That is our mission and our burden..."));
        
        e.add(new entry("Antigoni", "Agents", "A-DA 0609", "Status: Decommisioned", 
                "",
                "A promising, talented former agent of AkD. Decommisioned on suspicion of collaboration with Vampires (due to questionably high life expectancy)",
                "Suspected substance abuse. Notes available in the Archives.",
                "Notable cases: Black Rose [A-DA 0611], The Renfield Project, St. George, Hammer of the Witch"));
        
        e.add(new entry("Melanthos", "Agents", "A-DA 0611", "Status: Missing", 
                "",
                "An agent of note from the turn of last century. Went missing in the late 1920s, during early inquiries on what would",
                "become the St. George project.",
                "Notable cases: St. George [early stages], Hammer of the Witch, Akritas Project [early stages]"));
        
        e.add(new entry("Inner Circle", "Agents", "[REDACTED]", "Status: [REDACTED]", 
                "",
                "Error: Database corruption",
                "Please contact the administrator.",
                ""));
        
        e.add(new entry("Ioannis Kapodistrias", "Agents", "A-DA 0019",
                "Though only an associate member, Kapodistrias was instrumental in our organization's later return to Greece. We have in our", 
                "archives several conflicting accounts of his relationship with secret societies, including the Freemasons. As Governon,",
                "he assisted our agents in their dealings with the state, the authorities, and the captains of influential Greek families.",
                "While his death was carried out by the Mavromichalis clan, an account from that time also mentions the involvement of an",
                "obscure line of Vampires from the Lancea et Sanctum, who opposed his introduction of Greece's first modern quarantine system."));
        
        e.add(new entry("Aegis Kai Doru", "Organization", "O-HU 0001",
                "Before the Great Flood, we served as the Guardians of the Labyrinth in Atlantis (or Mu, or Lemuria). We were what stood between", 
                "humans and the darkness. Then the Lost Continent sank into the Shadows... Our agents have not forgotten their ancient duty, and stand",
                "vigilant against the hordes of monsters. We collect, examine, investigate, and experiment, to aid us in our battle against magicians and",
                "lycanthropes. We are bound together by the rulings and direction of an Inner Circle, located here in Athens, Greece. Always be mindful",
                "of your duties, agent."));
        
        e.add(new entry("Thule Society", "Organization", "O-HU 0049",
                "", 
                "Error: Database corruption",
                "Please contact the administrator.",
                "",
                ""));
        
        e.add(new entry("Malleus Maleficarum", "Organization", "O-HU 0003",
                "Also known as 'the Inquisition' or 'the Shadow Congregation'. They seem to be tied to the Catholic Church, although they are apparently", 
                "not the only ones (see Lancea Et Sanctum). They are what remains of the medieval Inquisition, continuing their hunt against witches,",
                "vampires, and demons. At least three holy orders exist in their ranks: the 'Order of St. Longinus', the 'Order of St. Ambrose', and the",
                "'Brotherhood of St. Athanasius'.",
                "Bishop Ambrogio Baudolino seems to be a person of interest."));
        
        e.add(new entry("Lucifuge", "Organization", "O-HU 0666",
                "", 
                "Error: Database corruption",
                "Please contact the administrator.",
                "",
                ""));
        
        e.add(new entry("Cheiron Group", "Organization", "O-HU 0044",
                "A European multinational corporation, with expanding operations around the world. Though our research is inconclusive, they seem to be", 
                "investigating the supernatural. Their expansion, from a small European pharmaceutical company founded in 1904, to a global conglomerate,",
                "is suspicious at the very least. Subsidiaries have already began infiltrating the Greek market.",
                "",
                ""));
        
        e.add(new entry("Organization X", "Organization", "O-HU 0081",
                "A small hunter organization, with ties to its earlier namesake from the Greek Civil War (1946-1949). They have made continuous requests", 
                "to access our archives in Pendeli, all of which we turned down. As an organization staffed by individuals of all political and ideological",
                "backgrounds, we cannot condone to any co-operation with the instigators of political violence in this country. Recently, requests have given",
                "way to blatant threats, a result of their underestimation of our power. Agents of Aegis kai Doru have already deciphered their patterns of",
                "hierarchy: 'X' is governed by a Triumvirate that was alive and influential in the Organization since its inception."));
        
        e.add(new entry("Distress Signal", "Logs", "L-DS 0101",
                "SOS SOS SOS!!!!!", 
                "To our brothers and sisters of Aegis Kai Doru in Europe.",
                "Our headquarters in Pendeli have been compromised. We have evacuated the Inner Circle from the city.",
                "Please send immediate awefpoiwqej XXXXXXXX",
                "[Draft Saved, not sent]"));
        
        e.add(new entry("Invictus", "Vampires", "O-VA 0001",
                "From what we gather, they are a secret society of Vampires dedicated to keeping their existence secret from humans.", 
                "These so-called 'Invictus' appear to control large sections of the Western world's governments and large businesses,",
                "so we advise our agents to proceed with caution and discretion. In Athens, they seem to control the Vampire Prince",
                "Kallikrates.",
                ""));
        
        e.add(new entry("Lancea Et Sanctum", "Vampires", "O-VA 0006",
                "", 
                "Error: Database corruption",
                "Please contact the administrator.",
                "",
                ""));
        
        e.add(new entry("Ordo Dracul", "Vampires", "O-VA 0004",
                "A secret society of vampire scholars, dedicated to the improvement of their kind even above the superhuman levels", 
                "afforded to vampires. They are led by an undead Phanariot that goes by the name Petros Kallimachis. The Inner Circle",
                "has advised restraint in our encounters with these particular monsters.",
                "",
                ""));
        
        e.add(new entry("Clan", "Vampires", "V-UN 2065",
                "A lineage of Vampires, sharing the same blood and basic characteristics and powers. In the present day,", 
                "five large clans are recognized: Daeva, Gangrel, Mekhet, Nosferatu, and Ventrue.",
                "",
                "",
                ""));
        
        e.add(new entry("Covenant", "Vampires", "V-UN 2066",
                "Vampiric sects, secret societies, and/or orders. Examples include the: Invictus, Lancea Et Sanctum, and the Ordo", 
                "Dracul.",
                "",
                "",
                ""));
        
        e.add(new entry("Pentacle", "Magicians", "O-MA 0055",
                "An alliance of five, large magical orders, dating back to the Middle Ages. We only know them by name: the Adamantine", 
                "Arrow, the Guardians, the Mysterium, the Silver Ladder, and the Council of Free Magicians.",
                "",
                "",
                ""));
        
        e.add(new entry("Seers", "Magicians", "O-MA 0062",
                "Power-hungry magicians who rival the vampires of the Invictus in their desire to control our world. They claim to be", 
                "receiving their directions from the Gods.",
                "",
                "",
                ""));
        
        e.add(new entry("Tremere", "Vampires", "V-UN 3820",
                "Unknown if they are the same as the Sons of Phobos. They seem to be vampiric magicians, the product of an unholy union", 
                "between these two abominations. The Tremere exist in small numbers, if they even exist at all in any given city.",
                "",
                "",
                ""));
        
        e.add(new entry("Case Report - Black Rose", "Logs", "L-CR 0039",
                "Digitized excerpt from the report of agent A-DA 0609, on operation Black Rose and the missing agent A-DA 0611:", 
                "So far, I have failed to locate agent A-DA0611. Though my superiors have advised that we cease looking for the missing agent,",
                "I feel honour-bound to report that I will do no such thing in the foreseeable future. The leadership of Aegis Kai Doru knows",
                "of my personal ties with agent A-DA 0611, and thus understands why I will not stop looking, even if it requires of me more than",
                "a single lifetime of investigation. Let the chips fall where they may."));
        
        e.add(new entry("Tribes", "Lycanthropes", "L-UN 0171",
                "Groups of lycanthropes, or werewolves, based on the spirit totem they choose to follow. Each spirit totem represents", 
                "some primordial, shapeshifting deity who descent from a mythical 'Father of the Wolf Gods'. Lycanthropes also seem to",
                "also organize around packs, lunar phases (which gift each werewolf with an archetype such as 'The Warrior' or 'The",
                "Shaman'), and Lodges.",
                ""));
        
        e.add(new entry("Idigam", "Lycanthropes", "L-UN 0689",
                "Chthonic spirits and enemies of the lycanthropes, these are symbolisms that existed before our world was fully formed.", 
                "These Idigam seem to be an enemy of all reality, so we must dread the day that we might have to collaborate with those",
                "who pushed us out of Eden, for the benefit of all reality.",
                "",
                ""));
        
        e.add(new entry("Adrastea's Talisman", "Relics", "R-PR 0119",
                "Location: E-2", 
                "Adrastea was a minor deity personifying the human instinct for vengeance. This particular relic was supposedly crafted",
                "in Byzantine times, by a blind pagan jeweler, at the request of the mother of a girl plagued by 'vaskania' (the 'evil",
                "eye'). The girl was dying by the charms of an envious witch, but the charm still needed the blessing of a holy man. Only a",
                "pious Orthodox priest agreed to bless it, an act for which he was excommunicated and lynched by his own flock."));
        
        e.add(new entry("Finger of the Kalikantzaros", "Relics", "R-RV 1630",
                "Location: E-2", 
                "A stiff, curled-up finger of a Kalikantzaros. The claw on the tip of the finger is sharp and filthy. Whenever in the",
                "presence of fairies or other Kalikantzaroi, the tightly-shut finger extends and points towards the general direction",
                "in which the supernatural is hiding.",
                ""));
        
        e.add(new entry("Eye of the Graeae", "Relics", "R-RV 0200",
                "Location: E-2", 
                "A quartz crystal the size, and shape, of a human eyeball. Rumored to be the eye shared by the Graeae of antiquity,",
                "stange colors constantly swirl within its depths -suggesting the iris and pupil of some strange, ancient monster.",
                "Replacing one's eyeball with the crystal reveals the location of an object or person its new owner is seeking.",
                ""));
        
        e.add(new entry("Skeleton Key", "Relics", "R-PW 0061",
                "Location: D-4", 
                "A small silver, tarnished key whose teeth are shaped and grooved in such a way as to suggest human dentition, with the",
                "bow adorned with a detailed design of a human skull. The Skeleton Key is rumored to open any door, for a price. The Key",
                "is rumored to have at least once opened a gateway to another world (or dimension).",
                ""));
        
        e.add(new entry("Blood of the ancient Vrihi", "Relics", "R-UN 0935",
                "Location: Missing", 
                "A vial of the mystically preserved blood of a truly ancient Vampire from the lost clan of the Vrihi. The vial has never",
                "been opened, and no account on similar relics survives, so we cannot know for certain what its properties are.",
                "",
                ""));
        
        e.add(new entry("Aegis Talisman", "Relics", "R-PR 2083",
                "Location: D-3", 
                "According to legend, this talisman was made out of a piece from a shield Zeus crafted to fight against Echidna, Typhon,",
                "and their offspring, when they assaulted Mount Olympus. The talisman has been used by our agents before, at times of grave",
                "danger. Our experience is that it protects its wielder from all mundane and supernatural threats.",
                ""));
    }
    
    /**
     * Searches the ArrayList e, to locate the String value assigned to variable searchName
     * resultFound checks if any of the first three parameters of all entries match searchName.
     */
    
    static void findName()
    {
        boolean resultFound = false;
        
        for (int i = 0; i < e.size(); i++)
        {
            if (e.get(i).getName().equalsIgnoreCase(searchName))
            {
                System.out.println(e.get(i).toString());
                resultFound = true;
            }
            else if (e.get(i).getEntry().equalsIgnoreCase(searchName))
            {
                System.out.println(e.get(i).toString());
                resultFound = true;
            }
            else if (e.get(i).getCategory().equalsIgnoreCase(searchName))
            {
                System.out.println(e.get(i).getName());
                resultFound = true;
            }
        }
        if (resultFound == false)
            {
                System.out.println("No results found.");
            }
    }
    
    /**
     * Lists each of the categories present in the entry elements of the ArrayList once.
     */
    
    static void listCat()
    {
        ArrayList<String> listCat = new ArrayList<String>();
        for (int i = 0; i < e.size(); i++)
        {
            if (!listCat.contains(e.get(i).getCategory()) && !e.get(i).getCategory().equalsIgnoreCase("Relics"))
            {
                listCat.add(e.get(i).getCategory());
            }
        }
        System.out.println("");
        System.out.println("List of categories available in databse: ");
        System.out.println(Arrays.toString(listCat.toArray()));
    }
    
    /**
     * Sets a new searchName
     * @param newSearchName the user's input assigned as the new value of searchName
     */
    
    static void setSearchName(String newSearchName)
    {
        searchName = newSearchName;
    }
    
    /**
     * Sets a new relicName
     * @param newRelicName the user's input assigned as the new value of relicName
     */
    
    static void setRelicName (String newRelicName)
    {
        relicName = newRelicName;
    }
    
    /**
     * Lists all entry elements in the ArrayList whose category is set to 'Relics'.
     */
    
    static void listRelics()
    {
        ArrayList<String> listRel = new ArrayList<String>();
        for (int i = 0; i < e.size(); i++)
        {
            if (!listRel.contains(e.get(i).getName()) && e.get(i).getCategory().equalsIgnoreCase("Relics"))
            {
                listRel.add(e.get(i).getName());
            }
        }
        System.out.println("");
        System.out.println("List of relics available in Pendeli: ");
        System.out.println(Arrays.toString(listRel.toArray()));
    }
    
    /**
     * Similar to findName method, but for entry elements with category set to 'Relics'.
     */
    
    static void findRelic()
    {
        boolean relicFound = false;
        
        for (int i = 0; i < e.size(); i++)
        {
            if (e.get(i).getName().equalsIgnoreCase(relicName))
            {
                System.out.println(e.get(i).toString());
                relicFound = true;
            }
            else if (e.get(i).getEntry().equalsIgnoreCase(relicName))
            {
                System.out.println(e.get(i).toString());
                relicFound = true;
            }
        }
        if (relicFound == false)
            {
                System.out.println("No results found.");
            }
    }
}
