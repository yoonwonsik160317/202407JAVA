<%@page import="board.BoardDTO"%>
<%@page import="board.BoardDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
String num = request.getParameter("num");
BoardDAO dao = new BoardDAO();
dao.increaseHits(Integer.parseInt(num));
BoardDTO dto = dao.getOne(Integer.parseInt(num));
request.setAttribute("dto", dto);
%>
<jsp:forward page="view_view.jsp"/>