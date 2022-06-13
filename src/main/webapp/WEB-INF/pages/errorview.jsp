<%--
  Created by IntelliJ IDEA.
  User: nnandakrishnan
  Date: 13-06-2022
  Time: 14:26
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

<table>
    <tr style="color: #db071e"><h1>Error Page</h1></tr>
    <c:forEach items="${errorList}" var="error">
        <tr style="color: red">
            <td><c:out value="test ${error.code}"/></td>
        </tr>
    </c:forEach>
</table>

</body>
</html>
