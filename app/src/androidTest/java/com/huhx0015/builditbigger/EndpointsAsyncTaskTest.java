package com.huhx0015.builditbigger;

import android.support.test.runner.AndroidJUnit4;
import android.util.Log;
import org.junit.Test;
import org.junit.runner.RunWith;
import static org.junit.Assert.assertTrue;

/** ------------------------------------------------------------------------------------------------
 *  [EndpointsAsyncTaskTest] CLASS
 *  DESCRIPTION: EndpointsAsyncTaskTest is a test class that tests the EndpointsAsyncTask to trigger
 *  a joke request from the backend.
 *  ------------------------------------------------------------------------------------------------
 */

@RunWith(AndroidJUnit4.class)
public class EndpointsAsyncTaskTest {

    /** CLASS VARIABLES ________________________________________________________________________ **/

    // LOGGING VARIABLES
    private static final String LOG_TAG = EndpointsAsyncTaskTest.class.getSimpleName();

    /** TEST METHODS ___________________________________________________________________________ **/

    @Test
    public void testDoInBackground() throws Exception {

        EndpointsAsyncTask task = new EndpointsAsyncTask(new EndpointsAsyncTask.Callback() {
            @Override
            public void onTaskFinished(String result) {
                Log.i(LOG_TAG, "testDoInBackground(): EndpointsAsyncTask test complete. The joke result is: " + result);
                assertTrue("testDoInBackground(): ERROR: Joke was: " + result, result.contains("Why"));
            }
        });
        task.execute();
    }
}