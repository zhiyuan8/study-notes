# Basics Virtual Memory
Memory management refers to management of Primary Memory or Main Memory.
An Operating System does the following activities for memory management:
* Keeps tracks of primary memory, i.e., what part of it are in use by whom, what part are not in use.
* In multiprogramming, the OS decides which process will get memory when and how much.
* Allocates the memory when a process requests it to do so.
* De-allocates the memory when a process no longer needs it or has been terminated.

### 1. Main & Secondary Memory, RAM, MMU
 **Main memory is a large array of bytes where each byte has its own address**.
Main memory provides a fast storage that can be **accessed directly by the CPU**. For a program to be executed, it must in the main memory. 

**Secondary memory refers to storage devices, such as hard drives and solid state drives** (SSD). It may also refer to removable storage media, such as USB flash drives, CDs, and DVDs.
Unlike primary memory, secondary memory is not accessed directly by the CPU. Instead, data accessed from secondary memory is first **loaded into RAM and is then sent to the processor**. The RAM plays an important intermediate role, since it provides much faster data access speeds than secondary memory. By loading software programs and files into primary memory, computers can process data much more quickly.

**RAM random access memory: RAM is the main memory.** It is much faster to read from and write to than other kinds of storage, such as a hard disk drive (HDD), solid-state drive (SSD) or optical drive. Random Access Memory is volatile. That means data is retained in RAM as long as the computer is on, but it is lost when the computer is turned off.

**memory management unit (work with Paging)**
MMU divides the virtual address space (the range of addresses used by the processor) into pages, each having a size which is a power of 2, usually a few kB, but they may be much larger. The bottom bits of the address (the offset within a page) are left unchanged. The upper address bits are the virtual page numbers. performing the **translation of virtual memory addresses to physical addresses**.

### 2. Virtual Memory 虚拟内存
**Virtual memory is a memory management technique where secondary memory (disk) can be used as if it were a part of the main memory.**
Virtual memory uses hardware and software to allow a computer to compensate for physical memory shortages, by temporarily **transferring data from random access memory (RAM) to disk storage**.
There are two ways in which virtual memory is handled: **paging and segmentation**.

CPU虚拟化技术
Turning a single CPU (or a small set of them) into a seemingly infinite number of CPUs and thus allowing many programs to seemingly run at once is what we call virtualizing the CPU
CPU的虚拟化技术可以单CPU模拟多CPU并行，允许一个平台同时运行多个操作系统，并且应用程序都可以在相互独立的空间内运行而互不影响，从而显著提高计算机的工作效率；

Benefits:
1.	handle twice as many addresses as main memory  
2.	it allows us to have memory **protection**, because each virtual address is translated to a physical address.  

Cons:
1.	The use of virtual memory **slows** a computer because data must be mapped between virtual and physical memory.  
2.	**Thrashing** can happen if the amount of RAM is too small, which will make the computer perform slower.  

#### Paging
Paging is a memory management technique in which **process address space is broken into blocks of the same size called pages** (size is power of 2, between 512 bytes and 8192 bytes). The size of the process is measured in the number of pages.  
Similarly, **main memory is divided into small fixed-sized blocks of (physical) memory called frames** and the size of a frame is kept the same as that of a page to have optimum utilization of the main memory and to avoid external fragmentation.

Address Translation
Page address is called **logical address** and represented by page number and the offset.
\begin{equation}
Logical Address = Page number + page offset
\end{equation}
Frame address is called **physical address** and represented by a frame number and the offset.
\begin{equation}
Physical Address = Frame number + page offset
\end{equation}
**page map table**: translate the virtual addresses that the OS and applications use into the physical addresses that the MMU (memory management unit) uses.

![Paging](/img/2-paging.png)

#### Segmentation
Segmentation divides virtual memory into segments of different lengths. Segments not in use in memory can be moved to virtual memory space on the hard drive.  
Segmentation memory management works very similar to paging but here segments are of **variable-length** where as in paging pages are of fixed size. For each segment, the table stores the starting address of the segment and the length of the segment. A reference to a memory location includes a value that identifies a segment and an offset.

![Segmentation](/img/3-segmnetation.png)

#### Fragmentation (free memory space in pieces, need compaction)
As processes are loaded and removed from memory, the free memory space is broken into little pieces. It happens after sometimes that processes cannot be allocated to memory blocks considering their small size and memory blocks remains unused. This problem is known as Fragmentation.

![Fragmentation](/img/4-fragmentation.png)

#### Thrashing
thrashing or disk thrashing describes when **a hard drive is being overworked by moving information between the system memory and virtual memory excessively**. Thrashing occurs when the system does not have enough memory, the system swap file is not properly configured, too much is running at the same time, or has low system resources. When thrashing occurs, the computer hard drive is always working and system performance decreases. Thrashing is serious because of the amount of work the hard drive has to do, and if left unfixed can cause an early hard drive failure.

How to eliminate thrashing  
1. Increase the amount of RAM in the computer.  
2. Decrease the number of programs being run on the computer.  
3. Adjust the size of the swap file.  

#### Context Switch
context switch is the process of **storing the state of a process or thread**, so that it can be restored and resume execution at a later point. This allows multiple processes to share a single central processing unit (CPU), and is an essential feature of a **multitasking** operating system.

### 3. Page Replacement Algorithm
**page fault**: A page fault occurs when a program attempts to access a block of memory that is **not stored in the physical memory, or RAM**. The fault notifies the operating system that it **must locate the data in virtual memory**, then transfer it from the storage device, such as an HDD or SSD, to the system RAM.  
1. FIFO  
2. Optimal Page  
3. LRU  
4. LFU  
cannot understand???	

### 4. Stack, heap, PCB
1. Stack  
The process Stack contains the temporary data such as method/function parameters, return address and local variables.  
栈区（stack）：又编译器自动分配释放，存放函数的参数值，局部变量的值等，其操作方式类似于数据结构的栈。 stack由系统自动分配，系统收回。栈由系统自动分配，速度快，但是程序员无法控制。
2. Heap  
This is dynamically allocated memory to a process during its run time.  
堆区（heap）：一般是由程序员分配释放，若程序员不释放的话，程序结束时可能由OS回收，值得注意的是他与数据结构的堆是两回事，分配方式倒是类似于数据结构的链表。heap需要程序员自己申请，C++用new分配，用delete释放。 堆是有程序员自己分配，速度较慢，容易产生碎片，不过用起来方便。
3. Text  
This includes the current activity represented by the value of Program Counter and the contents of the processor's registers.  
4. Data  
This section contains the global and static variables.  

| Comparison | Stack | Heap |
| ------------- |:-------------:| -----:|
|data structures| linear，implemented by: (1) array (2) linked list | hierarchical, implemented by: array and trees |
|Access time & scope |	Faster, local variables only, alive within **function scope**  | Slower, can access **global** variables |
|Space | by **OS** efficiently, memory is allocated in a contiguous block, limit of space size | by programmer, not efficiently, Memory can become fragmented as blocks of memory first allocated and then freed |
|Deallocation|  Automatically done by compiler instructions | manually release |
|Main issue|	Shortage of memory	| Memory **fragmentation** |
You should use heap when you require to allocate a large block of memory. For example, you want to create a large size array or big structure to keep that variable around a long time then you should allocate it on the heap. However, If you are working with relatively small variables that are only required until the function using them is alive. Then you need to use the stack, which is faster and easier.

**Process Control Block (PCB)**: A Process Control Block is a data structure maintained by the Operating System for every process. The PCB is identified by an integer process ID (PID). A PCB keeps all the information needed to keep track of a process
