# Java RMI Test

This is a simple example of how to utilize RMI using Java. Currently it supports calculating the sum of two doubles.
The address is hard coded to be `localhost`, meaning that the client and server programs must run on the same computer.
See the instructions below to run the client and server programs on different computers.

Thanks to ZaneAcademy for the excellent video tutorial: https://www.youtube.com/watch?v=3fq4AdaiGFA

(1) Open a terminal and add the appropriate version of the JDK to your path.
	`set PATH=%PATH%;"C:\Program Files\Java\jdk1.7.0_67\bin"`

(2) Run the RMI Compiler `rmic rmitest.RMIDemoFunct` from the .\bin folder to produce the stub class for the client.

(3) Run `rmiregistry`

(4) Open a new terminal in the .\bin folder and run the server `java rmitest.RMIDemoServer`

(5) Open a new terminal in the .\bin folder and run the client `java rmitest.RMIDemoClient 3.14 2.71`

# Across the Network

Getting this example to operate across a local network is simple. Start by getting the code on both computers. Then change `localhost` in the `RMIDemoClient.java` file to be the IP address of the server.

## Server side

(1) Open a terminal and run `rmiregistry`

(2) Open a new terminal and run `java rmitest.RMIDemoServer`

## Client side

(1) Run the RMI Compiler `rmic rmitest.RMIDemoFunct` to produce the stub class for the client.

(2) Run `java rmitest.RMIDemoClient 3.14 2.71`
