<%--
  Created by IntelliJ IDEA.
  User: nnandakrishnan
  Date: 13-06-2022
  Time: 10:46
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>Student Form</h1>
<form action="<%=request.getContextPath()%>/app/getStudent" method="post">
    <table>
        <tr>
            <td>Name: </td>
            <td><input type="text" name="name"></td>
        </tr>
        <tr>
            <td>Subject: </td>
            <td><input type="text" name="subject"></td>
        </tr>
        <tr>
            <td>Roll: </td>
            <td><input type="text" name="roll"></td>
        </tr>
        <tr>

            <td colspan="2"><input type="submit" name="submitbtn"></td>
        </tr>
    </table>

</form>
</body>
</html>
