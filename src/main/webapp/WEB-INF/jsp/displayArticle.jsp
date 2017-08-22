<!DOCTYPE html>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html xmlns:th="http://thymeleaf.org" lang="en">  
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">


<title>Insert title here</title>
</head>
<body>
<h2>Message:${articles}</h2> 

<c:forEach items="${articles}" var="article">
	${article.articleId} ${article.title} ${article.category}
</c:forEach>

</body>
</html>