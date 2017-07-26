package com.udacity.gradle.testing;//import android.app.Application;

import android.support.test.InstrumentationRegistry;
import android.support.test.runner.AndroidJUnit4;
import android.util.Log;

import com.udacity.gradle.builditbigger.MainActivity;
import com.udacity.gradle.builditbigger.TheAsyncTask;

import org.junit.Test;
import org.junit.runner.RunWith;

import java.util.concurrent.TimeUnit;

import static junit.framework.Assert.assertNotNull;
import static junit.framework.Assert.assertTrue;




@RunWith(AndroidJUnit4.class)
public class Testjoke
{
    @Test
    public void doInBackground() throws Exception {
        try {
            MainActivity mainActivity = new MainActivity();
            InstrumentationRegistry.getTargetContext();
            TheAsyncTask theAsyncTask = new TheAsyncTask(mainActivity, null);
            theAsyncTask.execute();
            String running_result = theAsyncTask.get(25, TimeUnit.SECONDS);
            assertNotNull(running_result);
            assertTrue(running_result.length() > 0);
        } catch (Exception e) {

            Log.e("Testjoke", "DoInBackground : End");
        }
    }


}