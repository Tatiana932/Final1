<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@include file="nav_bar.jsp" %>
<!DOCTYPE html>
<html>
    <head>
        <link href="../CSS/styles.css" rel="stylesheet">
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    </head>
    <body>

        <div class="container">
                <div class="col">
                    <form:form method="post" commandName="newTeacher">
                        <div class="row">
                            <div class="col">
                                <form:label path="th_name">First Name: </form:label>
                                <form:input path="th_name" cssClass="form-control"/> <br>
                            </div>
                            <div class="col">
                                <form:label path="th_lastname">Lastname: </form:label>
                                <form:input path="th_lastname"  cssClass="form-control"/> <br>
                            </div> 
                        </div>
                        <div class="row">
                            <div class="col"> 
                                <form:label path="th_mail">Mail: </form:label>
                                <form:input path="th_mail" cssClass="form-control"/> <br>
                            </div> 
                            <div class="col"> 
                                <form:label path="th_phone">Phone: </form:label>
                                <form:input path="th_phone" cssClass="form-control"/>  <br>
                            </div> 
                        </div>
                        <div class="form-group"> 
                            <form:label path="th_subject">Subject: </form:label>
                            <form:input path="th_subject" cssClass="form-control"/> <b r>
                        </div>

                        <button class="btn btn-success">Register</button>

                    </form:form>

            </div>
    </body>
</html>
