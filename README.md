# Java RMI Test

(1) Open a terminal and add the appropriate version of the JDK to your path.
	`set PATH=%PATH%;"C:\Program Files\Java\jdk1.7.0_67\bin"`
(2) Run the RMI Compiler `rmic rmictest.RMIDemoFunct` from the .\bin folder to produce the stub class.
(3) Run `rmiregistry`
(4) Open a new terminal in the .\bin folder and run the server `java rmitest.RMIDemoServer`
(5) Open a new terminal in the .\bin folder and run the client `java rmitest.RMIDemoClient 3.14 2.71`