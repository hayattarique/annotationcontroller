<!DOCTYPE html>
<%@ page isELIgnored="false"%>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Register User2</title>
</head>
<body>
    <h2>Register User2</h2>
    <form action="${pageContext.request.contextPath}/registerUser2.htm">
        Identification Type: <input type="text" name="identificationType"/><br/>
        Identification No: <input type="text" name="identificationNo"/> <br/>
        expiry (MM/DD): <input type="text" name="expiry"/> <br/>
        Issued Authority: <input type="text" name="issuedBy"/><br/>
        <input type="submit" value="Register"/>
    </form>
</body>
</html>