<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<html>
<head><title>Star Trek Random Quote Generator</title></head>
<body>
<!--  
<h3>Hello ${name} ${student}</h3>
<c:forEach var="tempStudent" items="${students_list}">

	${tempStudent} <br>

</c:forEach>-->
<br>
<form><h2>${quote}</h2><input type=button value="Refresh" onClick="window.location.reload()"></form>  
</body>
</html>