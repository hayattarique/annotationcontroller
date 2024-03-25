<!DOCTYPE html>
<%@ page isELIgnored="false"%>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Register User1</title>
</head>
<body>
    <h2>Register User1</h2>
    <form action="${pageContext.request.contextPath}/registerUser1.htm">
        Email Address/Username: <input type="text" name="emailAddress"/><br/>
        Password: <input type="password" name="password"/> <br/>
        Re-Password: <input type="password" name="repassword"/> <br/>
        First Name: <input type="text" name="firstName"/><br/>
        Last Name: <input type="text" name="lastName"/><br/>
        <input type="submit" value="Next"/>
    </form>
</body>
</html>