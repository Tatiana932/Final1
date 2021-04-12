<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<%@include file="nav_bar.jsp" %>
<!DOCTYPE html>
<html>
    <head>
        <link rel="stylesheet" href="../CSS/styles.css">
        <link rel="stylesheet" type="text/css" href="https://cdn.datatables.net/1.10.23/css/jquery.dataTables.css">
        <script type="text/javascript" charset="utf8" src="https://cdn.datatables.net/1.10.23/js/jquery.dataTables.js"></script>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <script>
            $(document).ready(function () {
                $('#all-teachers').DataTable();
            });
        </script>
    </head>
    <body>

        <div class="w-100 p-2 border">
                <table class="table table-striped" id="all-teachers">
                    <thead>
                        <tr>
                            <th scope="col">#</th>
                            <th scope="col">Name</th>
                            <th scope="col">Lastname</th>
                            <th scope="col">Mail</th>
                            <th scope="col">Phone</th>
                            <th scope="col">Subject</th>
                            <th scope="col">OPTIONS</th>
                        </tr>
                    </thead>
                    <tbody>
                        <c:forEach items="${teachers}" var="teacher" >
                            <tr>

                                <td scope="row"><c:out value="${teacher.th_id}"/></td>
                                <td scope="row"><c:out value="${teacher.th_name}"/></td>
                                <td scope="row"><c:out value="${teacher.th_lastname}"/></td>
                                <td scope="row"><c:out value="${teacher.th_mail}"/></td>
                                <td scope="row"><c:out value="${teacher.th_phone}"/></td>
                                <td scope="row"><c:out value="${teacher.th_subject}"/></td>
                                <td>
                                    <a href="update.htm?id=${teacher.th_id}" class="btn btn-warning btn-sm">Edit</a>
                                    <a href="delete.htm?id=${teacher.th_id}" class="btn btn-warning btn-sm">Delete</a>
                                </td>
                            </tr>
                        </c:forEach>
                    </tbody>
                </table>
            </div>
        </div>
    </body>
</html>
