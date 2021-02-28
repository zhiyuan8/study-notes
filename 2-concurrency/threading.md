# 1. Thread, start, join
** thread.start() ** : Start the thread’s activity. It must be called at most once per thread object.  
** thread.wait() ** : wait for the current thread to complete  
** thread.join() ** : wait for the thread to complete
'''
from threading import Thread
from threading import current_thread

def thread_task(a, b, c, key1, key2):
    print("{0} received the arguments: {1} {2} {3} {4} {5}".format(current_thread().getName(), a, b, c, key1, key2))

myThread = Thread(group=None,  # reserved
                  target=thread_task,  # callable object
                  name="demoThread",  # name of thread
                  args=(1, 2, 3),  # arguments passed to the target
                  kwargs={'key1': 777,
                          'key2': 111},  # dictionary of keyword arguments
                  daemon=None  # set true to make the thread a daemon
                  )

myThread.start()  # start the thread
myThread.join()  # wait for the thread to complete
'''

# 2. Daemon thread 守护线程
A daemon thread in Python runs in the background. The difference between a regular thread and a daemon thread is that a Python program will not exit until all regular/user threads terminate. However, ** a program may exit if the daemon thread is still not finished ** .
Daemon threads are shut-down abruptly. Resources such as open files and database connections may not shut-down properly and daemon threads are not a good choice for such tasks.  
垃圾回收线程就是一个典型的守护线程  

# 3. Lock, RLock, acquire, release
A Lock object is equivalent of a mutex  
RLock: A reentrant lock is defined as a lock which can be reacquired by the same thread. A RLock object carries the notion of ownership. If a thread acquires a RLock object, it can chose to reacquire it as many times as possible.  Note that it is imperative to release the lock as many times as it is locked.

** Lock.acquire() ** : A thread invokes acquire() on the lock object to lock it.
** Lock.release() ** : change the state of the Lock object to unlocked and let other waiting threads to acquire the lock.  

# 5. conditional variable, wait, notify, notify_all
The associated lock must firstly ** acquire() ** , then conditional variable  wait() or notify().  
** cond_var.wait() ** : make a thread sleep and give up resources  
** cond_var.notify() ** : invoked by a thread when a condition becomes true and inform the waiting threads to proceed.  

Ideally, the printer thread should go to sleep so that it doesn't consume any system resources and be woken up when the condition it needs to act upon becomes true. This can be achieved through condition variables.

'''
lock = Lock()
cond_var = Condition(lock) # pass custom lock to condition variable
cond_var.acquire()
cond_var.wait()
'''

Ideal usage of wait
'''
    cond_var.acquire() # 
    while not boolean: # condition is not satisfied
        cond_var.wait() # let thread wait
    cond_var.release() # release thread 
    # do something
'''

Ideal usage of notify
'''
acquire lock
set condition_to_test to true/satisfied
notify
release lock
'''







# 6. Semaphore


producer-consumer problem