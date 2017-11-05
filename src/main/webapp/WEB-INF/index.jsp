<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title> Spring MVC</title>
        <%@include file="/public/header.jsp" %>
    </head>
    <body>
        <div class="container">
            <div class="col-md-12">
                <h1>Spring MVC - Validación de Funcionalidades</h1>

                <ul class="nav nav-tabs">
                    <li class="nav-item">
                        <a class="nav-link active" id="home-tab" data-toggle="tab" href="#basico">Básico</a>
                    </li>

                    <li class="nav-item">
                        <a class="nav-link" id="profile-tab" data-toggle="tab" href="#mapping">RequestMapping</a>
                    </li>

                    <li class="nav-item">
                        <a class="nav-link" id="contact-tab" data-toggle="tab" href="#data">Data</a>
                    </li>

                    <li class="nav-item">
                        <a class="nav-link" id="contact-tab" data-toggle="tab" href="#vistas">Vistas y Otros</a>
                    </li>

                    <li class="nav-item">
                        <a class="nav-link" id="contact-tab" data-toggle="tab" href="#model">Objeto Model</a>
                    </li>

                    <li class="nav-item">
                        <a class="nav-link" id="contact-tab" data-toggle="tab" href="#session">Session</a>
                    </li>

                    <li class="nav-item">
                        <a class="nav-link" id="contact-tab" data-toggle="tab" href="#crud">CRUD</a>
                    </li>
                </ul>
                <div class="tab-content" id="myTabContent">
                    <%@include file="_includes/basico.jsp" %>
                    <%@include file="_includes/mapping.jsp" %>
                    <%@include file="_includes/data.jsp" %>
                    <%@include file="_includes/vistas.jsp" %>
                    <%@include file="_includes/model.jsp" %>
                    <%@include file="_includes/session.jsp" %>
                    <%@include file="_includes/crud.jsp" %>
                </div>
            </div>

        </div>
        <%@include file="/public/footer.jsp" %>
    </body>
</html>
