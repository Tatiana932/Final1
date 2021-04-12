<%@taglib  prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@include file="nav_bar.jsp" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    </head>
    <body>

        <form:form commandName="teach" method="post">
            <form:errors path="*" element="div" cssClass="alert alert-danger" />

            <div class="form-group">
                <form:label path="th_name">Name: </form:label>
                <form:input cssClass="form-control" path="th_name" />
            </div>
            <div class="form-group">
                <form:label path="th_lastname">Lastname: </form:label>
                <form:input cssClass="form-control" path="th_lastname" />
            </div>
            <div class="form-group">
                <form:label path="th_mail">Mail: </form:label>
                <form:input cssClass="form-control" path="th_mail" />
            </div>
            <div class="form-group">
                <form:label path="th_phone">Phone: </form:label>
                <form:input cssClass="form-control" path="th_phone" />
            </div>
            <div class="form-group">
                <form:label path="th_subject">Subject: </form:label>
                <form:input cssClass="form-control" path="th_subject" />
            </div>

            <form:button value="Update" >Update</form:button>
        </form:form>



        <a href="view_user.htm"><button class="btn btn-primary">Back</button></a>
    </body>
</html>
