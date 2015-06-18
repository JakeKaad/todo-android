package epicodus.com.todolist;

import com.activeandroid.ActiveAndroid;

import org.junit.runners.model.InitializationError;
import org.robolectric.RobolectricTestRunner;

import epicodus.com.todolist.ui.MainActivity;

/**
 * Created by jake on 6/17/15.
 */
public class TestRunner extends RobolectricTestRunner {
    /**
     * Creates a runner to run {@code testClass}. Looks in your working directory for your AndroidManifest.xml file
     * and res directory by default. Use the {@link Config} annotation to configure.
     *
     * @param testClass the test class to be run
     * @throws InitializationError if junit says so
     */
    public TestRunner(Class<?> testClass) throws InitializationError {
        super(testClass);
    }
}
