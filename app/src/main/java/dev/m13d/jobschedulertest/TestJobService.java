package dev.m13d.jobschedulertest;

import android.app.job.JobParameters;
import android.app.job.JobService;
import android.util.Log;

public class TestJobService extends JobService {

    private static final String TAG = "TestJobService";
    private boolean jobCancelled = false;

    @Override
    public boolean onStartJob(JobParameters params) {
        return false;
    }

    @Override
    public boolean onStopJob(JobParameters params) {
        return false;
    }
}
