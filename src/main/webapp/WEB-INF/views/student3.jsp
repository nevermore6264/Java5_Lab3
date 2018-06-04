<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 6/4/2018
  Time: 8:55 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page pageEncoding="utf-8" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8"/>
    <title>Spring MVC - Databinding</title>
    <base href="${pageContext.servletContext.contextPath}/">
</head>
<body>
<h3>SINH VIÊN POLY</h3>
<form:form action="student/update.htm" modelAttribute="student">
    <div>Họ và tên</div>
    <form:input path="name"/>
    <div>Điểm</div>
    <form:input path="mark"/>
    <div>Chuyên ngành</div>
    <form:radiobuttons path="major" items="${majors}"/>
    <div>
        <button>Cập nhật</button>
    </div>
</form:form>
</body>
</html>