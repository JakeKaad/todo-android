package epicodus.com.todolist.ui;

import android.app.ListActivity;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;

import java.util.ArrayList;

import epicodus.com.todolist.R;
import epicodus.com.todolist.models.Category;
import epicodus.com.todolist.models.Task;

public class CategoryActivity extends ListActivity {
    public static String TAG = CategoryActivity.class.getSimpleName();

    private Category mCategory;
    private ArrayList<String> mTasks;
    private Button mNewTaskButton;
    private EditText mNewTaskText;
    private ArrayAdapter<String> mAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_category);
        String name = getIntent().getStringExtra("categoryName");
        mCategory = Category.find(name);


        mNewTaskButton = (Button) findViewById(R.id.newTaskButton);
        mNewTaskText = (EditText) findViewById(R.id.newTask);

        mTasks = new ArrayList<String>();
        for ( Task task : mCategory.tasks() ) {
            mTasks.add(task.getDescription());
            Log.d(TAG, task.getId().toString());
        }


        mAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, mTasks);
        setListAdapter(mAdapter);

        mNewTaskButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                addTask();
            }
        });
    }

    @Override
    protected void onListItemClick(ListView l, View v, int position, long id) {
        super.onListItemClick(l, v, position, id);
        String thisDescription = mTasks.get(position);
        mTasks.remove(position);
        Task task = Task.find(thisDescription);
        task.delete();
        mAdapter.notifyDataSetChanged();
    }

    private void addTask() {
        String description =  mNewTaskText.getText().toString();
        Task newTask = new Task(description, mCategory);
        newTask.save();
        mTasks.add(description);
        mAdapter.notifyDataSetChanged();
    }
}
