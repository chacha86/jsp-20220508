package home;
import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import home.db.DBUtil;
import home.db.article.Article;
import home.db.article.ArticleMapper;

public class ArticleController {
	// === 게시물기능 ===
	ArticleMapper mapper;
	
	public ArticleController() {
		DBUtil db = new DBUtil();
		mapper = db.getArticleMapper();
	}
	
	public String doService(HttpServletRequest req, HttpServletResponse resp) {
		
		String action = req.getRequestURI(); // /web-test/article/list
		String result = null;
		
		if(action.equals("/web-test/front/article/list")) {
			result = articleList(req, resp);
			
		} else if(action.equals("/web-test/front/article/addArticle")) {
			result = insertArticle();
			
		} else if(action.equals("/web-test/front/article/addReply")) {
			result = insertReply();
			
		}
		
		return result;
	}
	
	// 게시물 목록	
	public String articleList(HttpServletRequest req, HttpServletResponse resp) {
		
		ArrayList<Article> articles = mapper.selectArticleList();
		req.setAttribute("articles", articles);
		
		return "list";
	}
	
	// 게시물 등록
	public String insertArticle() {
		return "insertArticle";
	}
	
	// 댓글 등록
	public String insertReply() {
		return "insertReply";
	}
}
