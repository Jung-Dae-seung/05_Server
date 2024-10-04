package edu.kh.todolist.service;

import java.util.List;

import edu.kh.todolist.mode.dao.TodoListDAO;
import edu.kh.todolist.mode.dao.TodoListDAOImpl;
import edu.kh.todolist.model.dto.Todo;

public class TodoListServiceImpl implements TodoListService {

	private TodoListDAO dao = null;
	
	// 기본생성자
	public TodoListServiceImpl() throws Exception{
		// TodoListServiceImpl 객체 생성 시
		// TdoListDAO 객체 생성
		dao = new TodoListDAOImpl();
	}
	
	@Override
	public List<Todo> todoListFullView() {
		// DAO 호출
		
		// 할 일 목록 얻어오기 -> 반환
		List<Todo> todoList = dao.todoListFullView();
		
		return todoList;
	}

	@Override
	public int todoAdd(String title, String detail) throws Exception{
		// Todo 객체 만들기
		Todo todo = new Todo(title, detail);
		
		// dao 메서드 호출 -> 반환한 값 -> controller 반환
		return dao.todoAdd(todo);
		
	}

}
