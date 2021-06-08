<%@page import="com.example.demo.SearchPage" %>
<%@ page import="com.example.demo.models.Info" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head></head>
<body>
<form action = "search-page" method = "POST">
    insert category : <input type = "text" name = "category">
    <tr />
    <input type = "submit" value = "Submit" />
</form>
</body>
</html>