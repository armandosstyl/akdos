# AkDOS 1.00
Release notes and installation guide for **AkDOS 1.00**
Please note: The build provided here was tested using the *Java Runtime Environment (JRE) 1.8.0_111* on Kubuntu 16.10 x64 and Windows 10 x64. Please ensure that you have the latest version of the JRE (or JDK) and let me know if AkDOS works on other platforms (Linux x86, Win x86, or Mac).

## Installation

### Requirements
AkDOS 1.00 requires the **Java Runtime Environment (JRE) version 1.8.0_111+** to run. On Windows, this was bundled using Launch4j.

If you receive any errors regarding the JRE or the Java Virtual Machine while running this program, *or are running Linux*, try installing the JRE manually and running the application again.

[You can find the JRE here](http://www.oracle.com/technetwork/java/javase/downloads/jre8-downloads-2133155.html "Download JRE")

### Step-by-step guide

1. Create a folder where you wish to extract the zipped file

2. Extract the downloaded zipped file inside the folder you created

3. (Linux instructions): Run the AkDOS.jar file in the terminal, with the starting arguments *java -jar*.

4. (Windows instructions): Double-click on akdos.exe

AkDOS should now be running fine. The default username is *AKD-A 0609* and the password is *drakolimni_1911*. Character ratings for hacking attempt can be inserted through the *storyteller* command in the login screen, and starting the attempt requires the *load /usb* command.

## Release Notes
The following release notes apply only to **AkDOS 1.00a**:

+ Added hacking function. Users can enter their character's attribute and skill ratings to initiate hacking on the terminal.
+ Implemented native dice roller for the hacking attempt.
+ Simplified menus, requiring only the first letter of a menu option for menu options like [T]his.
+ Switched from object-based database entries to XML-based. AkDOS.xml can be edited and is game line agnostic.
+ Some code cleaning up.

### Future features
The following features will be implemented in future versions of the program:
+ Terminal chat
+ Randomly occurring supernatural events and interactions with NPCs, entities (such as the God Machine,
ghosts, spirits etc.) who may manifest through the terminal
+ Implement a GUI resembling the VtM: Bloodlines terminal more faithfully

## Issues, Suggestions etc.
To report issues, make suggestions, feature requests, or anything else related to the project, please file an issue through github

