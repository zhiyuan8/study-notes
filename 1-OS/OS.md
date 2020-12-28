# Basics for OS
info from [Tutorialspoint](https://www.tutorialspoint.com/operating_system/index.htm)

# 1. Operating System Definition
An operating system is a program that acts as an interface between the user and the computer hardware and controls the execution of all kinds of programs.
![OS](/img/1-OS.png)

# 2. Operating System Types
### 1. Batch operating system
The users of a batch operating system do not interact with the computer directly. Each user prepares his job on an off-line device and submits it to the computer operator. To speed up processing, jobs with similar needs are batched together and run as a group.
Disadvantages:
*  Lack of interaction between the user and the job.
*  CPU is often idle, because the speed of the mechanical I/O devices is slower than the CPU.
* Difficult to provide the desired priority.

### 2. Time-sharing operating systems
Time-sharing is a technique which enables many people, located at various terminals, to use a particular computer system at the same time. in Time-Sharing Systems, the objective is to **minimize response time**.
Disadvantages:
* Problem of reliability.
* Question of security and integrity of user programs and data.

### 3. Distributed operating System
Distributed systems use multiple central processors to serve multiple real-time applications and multiple users. Data processing jobs are distributed among the processors accordingly.
* With resource sharing facility, a user at one site may be able to use the resources available at another.
* If one site fails in a distributed system, the remaining sites can potentially continue operating.

### 4. Network operating System
A Network Operating System runs on a server and provides the server the capability to manage data, users, groups, security, applications, and other networking functions. The primary purpose of the network operating system is to allow shared file and printer access among multiple computers in a network, typically a local area network (LAN), a private network or to other networks.
Examples of network operating systems include Microsoft Windows Server 2008, UNIX, *Linux*, *Mac OS X* 
The advantages of network operating systems are as follows:  
*	Centralized servers are highly stable.
*	Security is server managed.
The disadvantages of network operating systems are as follows −
*	High cost of buying and running a server.
*	Regular maintenance and updates are required.

Real Time operating System
A real-time system is defined as a data processing system in which the time interval required to process and respond to inputs is so small that it controls the environment. A real-time operating system must have well-defined, fixed time constraints, otherwise the system will fail. For example, Scientific experiments, medical imaging systems, industrial control systems, weapon systems, robots, air traffic control systems, etc.

# 3. Operating system service (what did OS do for file)
### service 1: Program execution
1.	Loads a program into **memory**.
2.	Executes the program.
3.	Handles program's execution.
4.	Provides a mechanism for process **synchronization**.
5.	Provides a mechanism for process **communication**.
6.	Provides a mechanism for **deadlock** handling.

### service 2: I/O operations
I/O operation means read or write operation with any file or any specific I/O device. Operating system provides the access to the required I/O device when required.

### [IMPORTANT] service 3: File System manipulation
1.	Program needs to read a file or write a file.  
2.	The operating system gives the **permission** to the program for operation on file.  
3.	Permission varies from read-only, read-write, denied and so on.  
4.	Operating System provides an interface to the user to create/delete files.  
5.	Operating System provides an interface to the user to create/delete directories.  
6.	Operating System provides an interface to create the **backup** of file system.  

### service 4: Communication
1.	Two processes often require data to be transferred between them
2.	Both the processes can be on one computer or on different computers, but are connected through a computer network.
3.	Communication may be implemented by two methods, either by **Shared Memory** or by **Message Passing**.

### service 5: Error Detection
An error may occur in CPU, in I/O devices or in the memory hardware.
The OS manages all kinds of resources using schedulers.
CPU scheduling algorithms are used for better utilization of CPU.

### service 6: Resource Allocation
1.	The OS manages all kinds of resources using schedulers.
2.	CPU scheduling algorithms are used for better utilization of CPU.

# 4. Operating System Scheduling Algorithm
### First-Come, First-Served (FCFS) Scheduling
Based on FIFO queue, poor performance

### Shortest-Job-Next (SJN) Scheduling
Best approach to **minimize waiting time**.
Easy to implement in Batch systems where *required CPU time is known* in advance.
Impossible to implement in interactive systems where required CPU time is not known.
The processer should know in advance how much time process will take.

### Priority Scheduling
Priority can be decided based on memory requirements, time requirements or any other resource requirement.

### Round Robin(RR) Scheduling
Each process is provided a fix time to execute, it is called a quantum.
Once a process is executed for a given time period, it is preempted and other process executes for a given time period.
![Round Robin](/img/1-2-round-robin.png)

### Multiple-Level Queues Scheduling
Multiple-level queues are not an independent scheduling algorithm. Multiple queues are maintained for processes with common characteristics.
*	Each queue can have its own scheduling algorithms.
*	Priorities are assigned to each queue.
For example, **CPU-bound jobs can be scheduled in one queue and all I/O-bound jobs in another queue**. The Process Scheduler then alternately selects jobs from each queue and assigns them to the CPU based on the algorithm assigned to the queue.
