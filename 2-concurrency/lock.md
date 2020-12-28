
# 1. Deadlock, live-lock, Starvation， critical session， race condition
** Deadlock ** : Deadlocks occur when two or more threads aren't able to make any progress because ** the resource required by the first thread is held by the second and the resource required by the second thread is held by the first ** .
** live-lock ** : A live-lock occurs when two threads continuously react in response to the actions by the other thread without making any real progress. A process seems to be running and not deadlocked but in reality, isn't making any progress. 两人过桥，两人不断上下移动但是每次都堵住对方，没有死锁但是都过不了桥。  
** Starvation ** : athread can experience starvation when ** it never gets CPU time or access to shared resources ** . Other greedy threads continuously hog shared system resources not letting the starving thread make any progress.  
** Critical section ** ： any piece of code that has the possibility of being executed concurrently by more than one thread of the application and exposes any shared data or resources used by the application for access.
** race condition ** : ** two or more threads can access shared data and they try to change it at the same time ** . Because the thread scheduling algorithm can swap between threads at any time, you don't know the order in which the threads will attempt to access the shared data. Therefore, the result of the change in data is dependent on the thread scheduling algorithm, i.e. both threads are "racing" to access/change the data.

# 2. Reentrant Lock 重入锁
Reentrant locks allow for re-locking or re-entering of a synchronization lock. It allows reentry by a thread already holding the lock. 
```
  ordinary_lock = RLock() # if using Lock(), won't work
  ordinary_lock.acquire()
  ordinary_lock.acquire()
  print("{0} exiting".format(current_thread().getName()))
  ordinary_lock.release()
  ordinary_lock.release()
```

# 3. Mutex 排它锁
** Mutural Exclusion ** . A mutex allows only a single thread to access a resource. Once a thread acquires a mutex, all other threads attempting to acquire the same mutex are blocked until the first thread releases the mutex. 
![Mutex](/img/8-Mutex.png)

# 4. Semaphore 信号量
Semaphore is used for ** limiting numbers of access to a collection of resources ** . Think of semaphore as having a limited number of permits to give out. If a semaphore has given out all the permits it has, then any new thread that comes along requesting a permit will be blocked till an earlier thread with a permit returns it to the semaphore.  
** A mutex is owned by the thread ** acquiring it till the point the owning-thread releases it, whereas for a semaphore there's ** no notion of ownership** . 
A semaphore with a single permit is called a binary semaphore and is often thought of as equivalent to a mutex.
![Mutex](/img/7-Semaphore.png)








https://www.cnblogs.com/zhang-qc/p/8877730.html
　　Java中锁的种类有：

自旋锁：让当前线程不停地的在循环体内执行实现的，当循环的条件被其他线程改变时 才能进入临界区。由于自旋锁只是将当前线程不停地执行循环体，不进行线程状态的改变，所以响应速度更快。但当线程数不停增加时，性能下降明显，因为每个线程都需要执行，占用CPU时间。如果线程竞争不激烈，并且保持锁的时间段。适合使用自旋锁。
阻塞锁：让线程进入阻塞状态进行等待，当获得相应的信号（唤醒，时间） 时，才可以进入线程的准备就绪状态，准备就绪状态的所有线程，通过竞争，进入运行状态。
重入锁：同一线程外层函数获得锁之后 ，内层递归函数仍然有获取该锁的代码。java下的ReentrantLock和synchronized都是重入锁。
　　从宏观上分为如下两种：

乐观锁：乐观思想，即认为读多写少，遇到并发写的可能性低，每次去拿数据的时候都认为别人不会修改，所以不会上锁，但是在更新的时候会判断一下在此期间别人有没有去更新这个数据，采取在写时先读出当前版本号，然后加锁操作（比较跟上一次的版本号，如果一样则更新），如果失败则要重复读-比较-写的操作。
悲观锁：悲观思想，即认为写多，遇到并发写的可能性高，每次去拿数据的时候都认为别人会修改，所以每次在读写数据的时候都会上锁，这样别人想读写这个数据就会block直到拿到锁。java中的悲观锁就是Synchronized,AQS框架下的锁则是先尝试cas乐观锁去获取锁，获取不到，才会转换为悲观锁，如RetreenLock。　　


