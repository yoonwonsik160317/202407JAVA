<%@page import="java.util.HashMap"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    <% 
    HashMap<String, Integer> cart = (HashMap<String, Integer>) session.getAttribute("cart");

    if (cart == null) {
        cart = new HashMap<>();
    }

    request.setCharacterEncoding("UTF-8");
    String product = request.getParameter("product");
  // int price = Integer.parseInt(request.getParameter("price"));

    if (cart.containsKey(product)) {
        cart.put(product, cart.get(product) + 1);
    } else {
        cart.put(product, 1);
    }

    session.setAttribute("cart", cart);
    response.sendRedirect("cart.jsp");

    %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

</body>
</html>