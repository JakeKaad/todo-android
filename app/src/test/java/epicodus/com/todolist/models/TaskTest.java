package epicodus.com.todolist.models;



import android.app.Activity;
import android.content.Context;
import android.widget.Button;
import android.widget.TextView;

import com.activeandroid.ActiveAndroid;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.robolectric.Robolectric;
import org.robolectric.RobolectricTestRunner;
import org.robolectric.annotation.Config;
import org.robolectric.shadows.ShadowActivity;
import org.robolectric.util.ActivityController;


import epicodus.com.todolist.R;
import epicodus.com.todolist.ui.MainActivity;
import java_cup.Main;

import static junit.framework.Assert.assertNotNull;
import static junit.framework.Assert.assertTrue;
import static junit.framework.TestCase.assertEquals;

/**
 * Created by jake on 6/17/15.
 */
@RunWith(RobolectricTestRunner.class)
@Config(sdk = 18, manifest = "src/main/AndroidManifest.xml" )
public class TaskTest  {
    private ActivityController<?> mController;
    private Activity mActivity;

//    @Before
//    public void setup() throws Exception {
//        mController = Robolectric.buildActivity(MainActivity.class);
//        mActivity = (MainActivity) mController.create().get();
//    }

    @Test
    public void getDescription_returnsADescription() {
        Activity activity = Robolectric.setupActivity(MainActivity.class);
        Button results = (Button) activity.findViewById(R.id.newTaskButton);
//        Task testTask = new Task();
//        testTask.setDescription("Wash the dishes");
//
//        assertEquals(testTask.getDescription(), "Wash the dishes");
        assertEquals("No tasks yet.", results.getText().toString());
    }
}
