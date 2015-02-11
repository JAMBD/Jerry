package com.rover.jerry.scheduler;

/**
 * Created by freelance on 11/02/15.
 */
public interface Scheduler {
    /**
     * Register task to be scheduled
     *
     * @param task to schedule
     */
    public void registerTask (SchedulerTask task);

}
