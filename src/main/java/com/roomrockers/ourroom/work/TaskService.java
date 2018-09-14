package com.roomrockers.ourroom.work;

import java.util.List;

public interface TaskService {
	
	public int saveTask(Task task);
	public Task getTask(int id);
	public List<Task> getAllTask();
	
}
