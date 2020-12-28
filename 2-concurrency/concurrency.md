# Basics for concurrency
info from [RealPython](https://realpython.com/python-concurrency/)
info from [Educative.io](https://www.educative.io/courses/python-concurrency-for-senior-engineering-interviews/NEm20mBZZy6)
info from [Tutorialspoint](https://www.tutorialspoint.com/concurrency_in_python/concurrency_in_python_quick_guide.htm)

# 1. concurrency Basics

There are 3 concurrency methods
| Concurrency Type | Switching Decision | Number of Processors |
| ------------- |:-------------:| -----:|
|Pre-emptive multitasking (threading) | The operating system decides when to switch tasks | 1 |
|Cooperative multitasking (asyncio) | The tasks themselves decide when to give up control | 1 |
|Multiprocessing (multiprocessing) | The processes all run at the same time on different processors | Many |
In preemptive multitasking, the operating system preempts a program to allow another waiting task to run on the CPU.
Cooperative Multitasking involves well-behaved programs voluntarily giving up control back to the scheduler so that another program can run. A malicious program can bring the entire system to a halt by busy-waiting or running an infinite loop and not giving up control.  

# 2. program vs process vs thread
**Program**: A program is a set of instructions and associated data that resides on the disk and is loaded by the operating system to perform a task. An **executable file** or a **python script** file are examples of programs.  
A process is a program in execution.
A thread is the smallest unit of execution in a process which simply executes instructions serially. ** A process can have multiple threads**
**_ Processes don't share any resources amongst themselves whereas threads share the resources including memory _**

# 3. concurrent , parallel 并行计算 vs distributed 分布式计算 vs cloud 云计算
1. Concurrent: Happening over the same time interval. In the “olden days” when Unix was young there was **one CPU and all processes that were running at any given time were given “slices” of processor time**. They were concurrent but not parallel. There is **no communication** between nor coordination of these procresses.  

2. parallel: Executing at the same time. Parallel computation by definition **1 computer requires multiple CPUs**. In this situation more than one concurrent process can be simultaneously executing. Same as concurrent processing, there is **no communication** between nor coordination of these procresses.  

Concurrency vs parallel:  
A concurrent system need not be parallel, whereas a parallel system is indeed concurrent. If there is 1 CPU, it is concurrent because each task gets a slice of CPU time to execute and move forward.
![Concurrency vs Parallel](/img/6-concurrency.png)

3. Distributed: Multiple programs execute concurrently and **communicate** with each other to collectively perform a computation. The essence of distributed computing is that an overall computation is “distributed” over multiple processes that perform the overall computational task using communication between the processes. distributed computing divides a single task among multiple computers that are connected via a network to achieve the task faster than using an individual computer.  

4. cloud: cloud computing provides hardware, software and other infrastructure resources over the internet. Cloud computing helps to access hardware and software resources remotely via the network. It provides advantages such as easy resource sharing, cost reduction, scalability, and platform independence.   

# 4. Latency vs Throughout
Throughput is defined as the ** rate of doing work ** or how much work gets done per unit of time.    
Latency is defined as the ** time required to complete a task ** or produce a result.  
The throughput in this example can be defined as the number of files processed by the program in a minute. Latency can be defined as the total time taken to completely process all the files. As you observe, in a multithreaded implementation throughput will go up and latency will go down. More work gets done in less amount of time. In general, the two have an inverse relationship.

# 5. Atomicity, atomic 原子操作


# 6. Race Condition
A race condition occurs when ** two or more threads can access shared data and they try to change it at the same time ** . Because the thread scheduling algorithm can swap between threads at any time, you don't know the order in which the threads will attempt to access the shared data. Therefore, the result of the change in data is dependent on the thread scheduling algorithm, i.e. both threads are "racing" to access/change the data.

