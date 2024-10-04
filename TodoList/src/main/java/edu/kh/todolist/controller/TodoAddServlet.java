package edu.kh.todolist.controller;

import java.io.IOException;

import edu.kh.todolist.service.TodoListService;
import edu.kh.todolist.service.TodoListServiceImpl;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@WebServlet("/todo/add")
public class TodoAddServlet extends HttpServlet{

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		/* 할 일 추가 -> 파일에 입력 받은 데이터 저장 */
		try {
			
			// 1. TodoListServiceImpl 객체 생성
			TodoListService service = new TodoListServiceImpl();
			
			// 2. 요청 시 전달 받은 파라미터 얻어오기 (title, detail)
			String title = req.getParameter("title");
			String detail = req.getParameter("detail");
			
			// 3. 서비스 호출 시 매개변수로 파라미터 전달, 결과 반환 받기
			int index = service.todoAdd(title, detail);
			//    성공 시 추가된 index번호 / 실패 시 -1 반환
			
			// 4. 성공 / 실패 메세지 세팅
			String message = null;
			if(index > -1) message = "추가 성공!";
			else message = "추가 실패...";
			
			// 5. 기존 req를 사용할 수 없기 때문에 session 을 이용해서 값 세팅
			HttpSession session = req.getSession();
			session.setAttribute("message", message);
			
			// 6. 메인 페이지로 redirect(재요청)
			resp.sendRedirect("/");
			// -> resp.sendRedirect("/main");
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
}
