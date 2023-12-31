package pl.edu.pb.sm_3_todo;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class TaskStorage {
    private static final TaskStorage taskStorage=new TaskStorage();
    private final List<Task> tasks;
    public static TaskStorage getInstance(){return taskStorage;}
    private TaskStorage(){
        tasks=new ArrayList<Task>();
        for(int i=1;i<=120;i++){
            Task task=new Task();
            task.setName("Zadanie numer "+i);
            task.setDone(i%5==0);
            tasks.add(task);
        }
    }
    public List<Task> getTasks(){
        return tasks;
    }
    public Task getTaskByUUID(UUID id){
        for(Task task:tasks){
            if(task.getId().equals(id)) return task;
        }
        return null;
    }
}
