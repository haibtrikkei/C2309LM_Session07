<%--
  Created by IntelliJ IDEA.
  User: BuiThanhHai
  Date: 10/3/2024
  Time: 7:28 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<!doctype html>
<html lang="en">
<head>
    <title>View Student</title>
    <!-- Required meta tags -->
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">

    <!-- Bootstrap CSS -->
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css"
          integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
</head>
<body>
    <div class="container">
        <h1>VIEW STUDENT</h1>
            <table class="table">
                <tr>
                    <td>Avatar: </td>
                    <td><img src="resources/images/${s.imgUrl}"/></td>
                </tr>
                <tr>
                    <td>Roll number: </td>
                    <td>${s.rollNumber}</td>
                </tr>
                <tr>
                    <td>Full name: </td>
                    <td>${s.fullName}</td>
                </tr>
                <tr>
                    <td>Gender:  </td>
                    <td>
                        ${s.gender?"Male":"Female"}
                    </td>
                </tr>
                <tr>
                    <td>Birthday: </td>
                    <td>${s.birthday}</td>
                </tr>
                <tr>
                    <td>Address: </td>
                    <td>${s.address}</td>
                </tr>
                <tr>
                    <td>Class name: </td>
                    <td>${s.className}</td>
                </tr>
            </table>
        <a href="students">Back</a>
    </div>
<!-- Optional JavaScript -->
<!-- jQuery first, then Popper.js, then Bootstrap JS -->
<script src="https://code.jquery.com/jquery-3.3.1.slim.min.js"
        integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo"
        crossorigin="anonymous"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js"
        integrity="sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1"
        crossorigin="anonymous"></script>
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js"
        integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM"
        crossorigin="anonymous"></script>
</body>
</html>
