<!DOCTYPE html>
<html>
<head>
 <link rel="stylesheet" type="text/css"
       href="${pageContext.request.contextPath}/resources/css/my-test.css">
    <script src="${pageContext.request.contextPath}/resources/js/simple-test.js"></script>
</head>
<body>

Hello World of Spring!

<br><br>

Student name: ${param.studentName}

<br><br>

The message: ${message}

<br><br>

<img src="${pageContext.request.contextPath}/resources/images/spring-logo.png" alt="springLogo" width="200" height="200">
<br>
<br>

<input type="button" onclick="doSomeWork()" value="Click Me"/>

</body>

</html>






