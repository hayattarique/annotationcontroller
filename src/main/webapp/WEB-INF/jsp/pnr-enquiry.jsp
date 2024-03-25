<!DOCTYPE html>
<%@ page isELIgnored="false"%>
<html lang="en">
<head>
<meta charset="UTF-8">
<title>PNR Enquiry</title>
<head>
  <body>
     <h2>PNR Enquiry</h2>
        <form action="${pageContext.request.contextPath}/getPNRStatus.htm">
          PNR No: <input type="text" name="pnrNo"/><br/>
          <input type="submit" value="Get ticket Status"/>
        </form>
  </body>
 </html>