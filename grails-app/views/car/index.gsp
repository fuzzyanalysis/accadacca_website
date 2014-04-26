<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8"/>
<meta name="layout" content="main"/>
<title>Welcome to Acca Dacca! </title>
</head>
<body>
This is the content of my app

    <table>
        <tr>
            <td>Make</td>
            <td>Model</td>
            <td>Year</td>
        </tr>
        <g:each in="${list}" var="car">
        <tr>
            <td><a href="http://www.dicks.com">${car.make}</a></td>
            <td>${car.model}</td>
            <td>${car.year}</td>
        </tr>
        </g:each>        
    </table>

</body>
</html>