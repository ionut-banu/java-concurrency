package com.ionut.basics;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

class ThreadCreationTest {

    @Test
    void testThreadCreation() {
        ThreadCreation threadCreation = new ThreadCreation();
        Thread thread = threadCreation.createThread();

        assertTrue(thread.isAlive(), "Thread is not alive");
    }

    @Test
    void testThreadCreationWithRunnable() {
        ThreadCreation threadCreation = new ThreadCreation();
        Thread thread = threadCreation.createThreadUsingRunnable();

        assertTrue(thread.isAlive(), "Thread is not alive");
    }

}