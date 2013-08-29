# Radius Installation/Eclipse How-To
## Required Software
1. Java JDK 1.6 or better (http://www.oracle.com/technetwork/java/javase/downloads/index.html)
2. Apache Ant (http://ant.apache.org/bindownload.cgi)
3. Windows (Optional) - cygwin (http://cygwin.com/install.html)
4. Mac Only - jarbundler (http://informagen.com/JarBundler/)
5. Eclipse (http://www.eclipse.org/downloads/)

# Get Source
Clone the repository with your favorite git client.

`git clone https://github.com/soyabi/ReplicatorG.git`

## Build ReplicatorG Application
1. Run `dist-all.sh` to build executables for Windows/Linux/OSX
2. Run `dist-windows.sh` for Windows only.
3. Run `ant jar` to build jar file for importing into Radius MakerBot Agent Project.

## Eclipse Project Import
1. Extract eclipse.tgz
	- This file contains `.classpath` and `.project` files.
2. Eclipse Package Explorer
	- Right-Click and Select "Import…"
	- "Existing Projects…"
	- "Select Root Directory" and browse to where you cloned the repo.
	- Make sure "ReplicatorG" is checked in the "Projects" area.
	- Click "Finish"
	
## Create Symlink
Running ReplicatorG from command line or Eclipse requires a symlink for the application to pickup `machine/` and `drivers` directories.

- Linux/OSX: `ln -s . replicatorg`
- Windows: `mklink replicatorg .`

## Eclipse Run/Debug Configuration
1. Run->Run Configurations
2. Select "Java Application" and create a new configuration.
3. Select "Main Tab"
	- Name: ReplicatorG-Radius
	- Main Class: replicatorg.app.Base
4. Select "Arguments Tab"
 	- VM Arguments: -Djava.library.path=${workspace_loc:ReplicatorG}/build/macosx/dist/
 	- Replace the "macosx" with "linux" or "windows"
5. Click "Apply"
6. Click "Run" - This will launch ReplicatorG.
7. To Debug, use the Run, Debug Configurations and select the previously created run configuration. Then click the debug button.
8. The ReplicatorG-Radius Run configuration will now be available as targets in the debug toolbar and run toolbar buttons. 