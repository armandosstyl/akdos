# AkDOS 0.90a
Release notes and installation guide for **AkDOS 0.90a**
Please note: The build provided here was tested using the *Java Runtime Environment (JRE) 1.8.0_91*
on Windows 10 x64. Please ensure that you have the latest version of the JRE (or JDK) and let me know
if AkDOS works on other platforms (Linux, Mac, or Win x86).

## Installation

### Requirements
Please make sure you have the **Java Runtime Environment (JRE) version 1.8.0_91+** installed on your computer.
[You can find the JRE here](http://www.oracle.com/technetwork/java/javase/downloads/jre8-downloads-2133155.html "Download JRE")

### Step-by-step guide

Create a folder and copy **AkDOS.jar** there.

Right-click on AkDOS.jar and select Create Shortcut from the dropdown menu.

Right-click on the shortcut created and select Properties from the dropdown menu.

Add the following commands in the text box next to **Target:** java -jar at the **beginning** of the text box.

e.g. "java -jar C:\[the location of the folder you created]\AkDOS.jar"

Click on OK to close the Shortcut Properties window.

Double-click on the AkDOS Shortcut.

AkDOS should now be running fine. The default username is *A-DA 0609* and the password is *drakolimni_1911*.

## Release Notes
The following release notes apply only to **AkDOS 0.90a**:

+ Finished a working rudimentary user interface for AkDOS
+ Created dummy interactions to simulate in-game events (such as `ping admin` that in our game
will notify the new administrators of the Aegis kai Doru secure network of the protagonists'
meddling)
+ Created methods for password-protecting access to the secure network
+ Implemented constructors and accessors for entries on the Aegis kai Doru database

### Future features
The following features will be implemented in future versions of the program, hopefully
before we hit the big 1.0:
+ Hacking mini-game
+ Input for character's Attribute and Skill ratings that will influence the outcome of the hacking
effort
+ Internal dice roller for characters and the NPC system administrator
+ Terminal chat
+ Randomly occurring supernatural events and interactions with NPCs, entities (such as the God Machine,
ghosts, spirits etc.) who may manifest through the terminal

## Issues, Suggestions etc.
To report issues, make suggestions, feature requests, or anything else related to the project,
please file an issue through github

