<%@ page contentType="text/html; charset=UTF-8"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%><%--配置标签库--%>
<%--form中 默认commandName="command"，于是path就可以直接引用po中的域--%>
<html>
<head>
  <title>Spring MVC表单处理(复选框)</title>
</head>
<body>

<h2>用户信息 - </h2>
<form:form method="POST" action="/addUser" >
  <table>
    <tr>
      <td><form:label path="username">用户名：</form:label></td>
      <td><form:input path="username" /></td>
    </tr>
    <tr>
      <td><form:label path="password">密码：</form:label></td>
      <td><form:password path="password" /></td>
    </tr>
    <tr>
      <td><form:label path="address">地址：</form:label></td>
      <td><form:textarea path="address" rows="5" cols="30" /></td>
    </tr>
    <tr>
      <td><form:label path="receivePaper">是否订阅：</form:label></td>
      <td><form:checkbox path="receivePaper" /></td>
    </tr>
    <tr>
      <td><form:label path="favoriteFrameworks">喜欢的框架和技术：</form:label></td>
      <td><form:checkbox path="favoriteFrameworks" value="springmvc"/>springmvc</td><%--会执行User.java中的set函数--%>
      <td><form:checkbox path="favoriteFrameworks" value="springBoot"/>springBoot</td>
      <td><form:checkbox path="favoriteFrameworks" value="struts2"/>struts2</td>
      <td><form:checkbox path="favoriteFrameworks" value="apache hadoop"/>apache hadoop</td>
    </tr>
    <tr>
      <td colspan="2">
        <input type="submit" value="提交"/>
      </td>
    </tr>
  </table>
</form:form>
</body>
</html>