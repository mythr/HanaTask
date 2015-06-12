package com.oscarsilver.hanatask;

import android.location.Location;

import java.util.ArrayList;

/**
 * Created by oscarsilver on 11/06/15.
 */
public class TaskPresenter {

    private ArrayList<Task> taskList;

    public Task create_task(Location loc,
                            String desc,
                            int priority,
                            String duration,
                            String deadline,
                            boolean isRepeatable,
                            boolean isGroup,
                            Task parentGroup){
        return new Task(loc,desc,priority,duration,deadline,isRepeatable,isGroup, parentGroup);
    }

    public void add_task(Task newTask){
        taskList.add(taskList.size(),newTask);
    }

    public void remove_task(Task task){
        int index = taskList.indexOf(task);
        taskList.remove(index);
    }

    public Task fetch_task(){
        Task firstTask = taskList.get(0);
        taskList.remove(taskList.indexOf(firstTask));
        return firstTask;
    }


}
