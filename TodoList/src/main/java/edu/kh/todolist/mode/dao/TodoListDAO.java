package edu.kh.todolist.mode.dao;

import java.util.List;

import edu.kh.todolist.model.dto.Todo;

public interface TodoListDAO {
	
	/** TodoList를 파일로 저장하는 메서드
	 * @throws Exception 
	 * 
	 */
	void saveFile() throws Exception;

	List<Todo> todoListFullView();

	int todoAdd(Todo todo) throws Exception;
	
}
