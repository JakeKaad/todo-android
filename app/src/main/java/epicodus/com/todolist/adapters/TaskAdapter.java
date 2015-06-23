package epicodus.com.todolist.adapters;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

import java.util.ArrayList;

import epicodus.com.todolist.models.Task;

/**
 * Created by jake on 6/18/15.
 */
public class TaskAdapter extends BaseAdapter {

    private Context mContext;
    private ArrayList<Task> mTasks;

    public TaskAdapter(Context context, ArrayList<Task> tasks) {
        mContext = context;
        mTasks = tasks;
    }

    @Override
    public int getCount() {
        return mTasks.size();
    }

    @Override
    public Object getItem(int position) {
        return mTasks.get(position);
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        return null;
    }


    private static class ViewHolder {
    }
}
