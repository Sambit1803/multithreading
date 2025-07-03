package com.sambit.multithreading.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

@Service
public class LockedCounterService {

    private int counter = 0;
    private final Lock lock = new ReentrantLock();
    private static final Logger logger = LoggerFactory.getLogger(LockedCounterService.class);

    public void increment(String threadName) {
        logger.info("{} trying to acquire lock...", threadName);
        lock.lock(); // 🔐 Acquire the lock
        try {
            logger.info("{} acquired lock", threadName);
            int local = counter;
            Thread.sleep(5000); // simulate time-consuming work
            counter = local + 1;
            logger.info("{} incremented counter to: {}", threadName, counter);
        } catch (InterruptedException e) {
            logger.error("Exception Occurred", e);
        } finally {
            lock.unlock(); // 🔓 Release the lock
            logger.info("{} released lock", threadName);
        }
    }

    public int getCounter() {
        return counter;
    }
}
