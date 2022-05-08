package home;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import home.db.DBUtil;
import home.db.member.Member;
import home.db.member.MemberMapper;

public class MemberController {

	MemberMapper mapper;

	public MemberController() {
		DBUtil db = new DBUtil();
		mapper = db.getMemberMapper();
	}

	public String doService(HttpServletRequest req, HttpServletResponse resp) {

		String action = req.getRequestURI(); // /web-test/article/list
		String result = null;

		if (action.equals("/web-test/front/member/list")) {
			result = memberList(req, resp);

		} else if (action.equals("/web-test/front/member/login")) {
			result = login(req, resp);

		} else if (action.equals("/web-test/front/member/signup")) {
			result = signup(req, resp);

		}

		return result;
	}

	public String memberList(HttpServletRequest req, HttpServletResponse resp) {

		ArrayList<Member> members = mapper.getMemberList();
		req.setAttribute("members", members);
		
		return "member_list";
	}

	public String login(HttpServletRequest req, HttpServletResponse resp) {

		return "login";
	}

	public String signup(HttpServletRequest req, HttpServletResponse resp) {

		return "signup";
	}
}
