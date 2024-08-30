<%@page import="com.board.db.MemberDao"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%    
MemberDao dao = new MemberDao();
HttpSession httpSession = request.getSession();

String email = request.getParameter("email");
String password = request.getParameter("password");

if (dao.checkLogin(email, password)) {
    httpSession.setAttribute("email", email);

    out.println("<script type='text/javascript'>");
    out.println("alert('환영합니다, " + email + "!');");
    out.println("window.location.href = 'main.jsp';");
    out.println("</script>");
} else {
    out.println("<script type='text/javascript'>");
    out.println("alert('로그인 실패!');");
    out.println("window.location.href = 'main.jsp';");
    out.println("</script>");
}
%>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

</body>
</html>