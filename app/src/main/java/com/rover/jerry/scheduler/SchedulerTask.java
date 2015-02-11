package com.rover.jerry.scheduler;

/**
 * Created by freelance on 11/02/15.
 */
public interface SchedulerTask {
    /**
     * Performs a single step as requested by scheduler
     */
    public void runStep();

}
