<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
	<title>Title</title>
</head>
<body>
${text}<br/>
<c:forEach items="${list}" var="item">
	${item}<br/>
</c:forEach>
</body>
</html>