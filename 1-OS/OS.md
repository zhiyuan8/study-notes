# Basics for OS
info from [Tutorialspoint](https://www.tutorialspoint.com/operating_system/index.htm)
***

## 1.	Operating System Definition
An operating system is a program that acts as an interface between the user and the computer hardware and controls the execution of all kinds of programs.

## 2. Operating System Types
#### 1. Batch operating system
The users of a batch operating system do not interact with the computer directly. Each user prepares his job on an off-line device and submits it to the computer operator. To speed up processing, jobs with similar needs are batched together and run as a group.
Disadvantages:
* Lack of interaction between the user and the job.
* CPU is often idle, because the speed of the mechanical I/O devices is slower than the CPU.
* Difficult to provide the desired priority.

#### 2. Time-sharing operating systems
Time-sharing is a technique which enables many people, located at various terminals, to use a particular computer system at the same time. in Time-Sharing Systems, the objective is to *minimize response time*.

#### 3. Distributed operating System
Distributed systems use multiple central processors to serve multiple real-time applications and multiple users. Data processing jobs are distributed among the processors accordingly.
* With resource sharing facility, a user at one site may be able to use the resources available at another.
* If one site fails in a distributed system, the remaining sites can potentially continue operating.

#### 4. Network operating System
A Network Operating System runs on a server and provides the server the capability to manage data, users, groups, security, applications, and other networking functions. The primary purpose of the network operating system is to allow shared file and printer access among multiple computers in a network, typically a local area network (LAN), a private network or to other networks.
Examples of network operating systems include Microsoft Windows Server 2008, UNIX, Linux, Mac OS X…  
The advantages of network operating systems are as follows:  
(1)	Centralized servers are highly stable.
(2)	Security is server managed.
(3)	Upgrades to new technologies and hardware can be easily integrated into the system.
The disadvantages of network operating systems are as follows −
(1)	High cost of buying and running a server.
(2)	Regular maintenance and updates are required.

Real Time operating System
A real-time system is defined as a data processing system in which the time interval required to process and respond to inputs is so small that it controls the environment. A real-time operating system must have well-defined, fixed time constraints, otherwise the system will fail. For example, Scientific experiments, medical imaging systems, industrial control systems, weapon systems, robots, air traffic control systems, etc.

2. Operating system service
Program execution
1.	Loads a program into memory.
2.	Executes the program.
3.	Handles program's execution.
4.	Provides a mechanism for process synchronization.
5.	Provides a mechanism for process communication.
6.	Provides a mechanism for deadlock handling.

I/O operations
I/O operation means read or write operation with any file or any specific I/O device.
Operating system provides the access to the required I/O device when required.

[IMPORTANT] File System manipulation
File management steps:
1.	Program needs to read a file or write a file.
2.	The operating system gives the permission to the program for operation on file.
3.	Permission varies from read-only, read-write, denied and so on.
4.	Operating System provides an interface to the user to create/delete files.
5.	Operating System provides an interface to the user to create/delete directories.
6.	Operating System provides an interface to create the backup of file system.

Communication
1.	Two processes often require data to be transferred between them
2.	Both the processes can be on one computer or on different computers, but are connected through a computer network.
3.	Communication may be implemented by two methods, either by Shared Memory or by Message Passing.

Error Detection
An error may occur in CPU, in I/O devices or in the memory hardware.
The OS manages all kinds of resources using schedulers.
CPU scheduling algorithms are used for better utilization of CPU.

Resource Allocation
1.	The OS manages all kinds of resources using schedulers.
2.	CPU scheduling algorithms are used for better utilization of CPU.

2.	Memory Management
Memory management refers to management of Primary Memory or Main Memory. Main memory is a large array of bytes where each byte has its own address.
Main memory provides a fast storage that can be accessed directly by the CPU. For a program to be executed, it must in the main memory. An Operating System does the following activities for memory management −
Keeps tracks of primary memory, i.e., what part of it are in use by whom, what part are not in use.
In multiprogramming, the OS decides which process will get memory when and how much.
Allocates the memory when a process requests it to do so.
De-allocates the memory when a process no longer needs it or has been terminated.

Processor Management
In multiprogramming environment, the OS decides which process gets the processor when and for how much time. This function is called process scheduling. An Operating System does the following activities for processor management −
Keeps tracks of processor and status of process. The program responsible for this task is known as traffic controller.
Allocates the processor (CPU) to a process.
De-allocates processor when a process is no longer required.

Device Management
An Operating System manages device communication via their respective drivers. It does the following activities for device management −
•	Keeps tracks of all devices. Program responsible for this task is known as the I/O controller.
•	Decides which process gets the device when and for how much time.
•	Allocates the device in the efficient way.
•	De-allocates devices.

File Management
A file system is normally organized into directories for easy navigation and usage. These directories may contain files and other directions.
An Operating System does the following activities for file management −
•	Keeps track of information, location, uses, status etc. The collective facilities are often known as file system.
•	Decides who gets the resources.
•	Allocates the resources.
•	De-allocates the resources.

Operating System Scheduling Algorithm
First-Come, First-Served (FCFS) Scheduling
Based on FIFO queue, poor performance

Shortest-Job-Next (SJN) Scheduling
Best approach to minimize waiting time.
Easy to implement in Batch systems where required CPU time is known in advance.
Impossible to implement in interactive systems where required CPU time is not known.
The processer should know in advance how much time process will take.

Priority Scheduling
Priority can be decided based on memory requirements, time requirements or any other resource requirement.

Round Robin(RR) Scheduling
Each process is provided a fix time to execute, it is called a quantum.
Once a process is executed for a given time period, it is preempted and other process executes for a given time period.

