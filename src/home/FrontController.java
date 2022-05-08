package home;


import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/front/*")
public class FrontController extends HttpServlet {
	
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	
		System.out.println("공통처리");
		
		// 요청을 처리해주세요.
		
		String requestUri = req.getRequestURI();
		String[] uriBits = requestUri.split("/");
		String module = uriBits[3];
		String result = null;
				
		if(module.equals("article")) {
			ArticleController articleController = new ArticleController();
			result = articleController.doService(req, resp);
			
		} else if(module.equals("member")) {
			MemberController memberController = new MemberController();
			result = memberController.doService(req, resp);
		}
		
		String viewPath = "/WEB-INF/" + result + ".jsp";
		
		RequestDispatcher requestDispatcher = req.getRequestDispatcher(viewPath);
		requestDispatcher.forward(req, resp);

	}

}
