# 1. concurrency Basics

| Concurrency Type | Switching Decision | Number of Processors |
| ------------- |:-------------:| -----:|
|Pre-emptive multitasking (threading) | The operating system decides when to switch tasks external to Python | 1 |
|Cooperative multitasking (asyncio) | The tasks decide when to give up control | 1 |
|Multiprocessing (multiprocessing) | The processes all run at the same time on different processors | Many |

# 3. parallel 并行计算 vs distributed 分布式计算 vs cloud 云计算
1. Concurrent: Happening over the same time interval. In the “olden days” when Unix was young there was **one CPU and all processes that were running at any given time were given “slices” of processor time**. They were concurrent but not parallel. There is **no communication** between nor coordination of these procresses.  
2. Parallel: Executing at the same time. Parallel computation by definition **1 computer requires multiple CPUs**. In this situation more than one concurrent process can be simultaneously executing. Same as concurrent processing, there is **no communication** between nor coordination of these procresses.  
3. Distributed: Multiple programs execute concurrently and **communicate** with each other to collectively perform a computation. The essence of distributed computing is that an overall computation is “distributed” over multiple processes that perform the overall computational task using communication between the processes. distributed computing divides a single task among multiple computers that are connected via a network to achieve the task faster than using an individual computer.  
4. cloud: cloud computing provides hardware, software and other infrastructure resources over the internet. Cloud computing helps to access hardware and software resources remotely via the network. It provides advantages such as easy resource sharing, cost reduction, scalability, and platform independence.   



CPU-bound

I/O-bound
