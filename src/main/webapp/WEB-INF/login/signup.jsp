<%-- 
    Copyright © 2018 Dennis Schulmeister-Zimolong

    E-Mail: dhbw@windows3.de
    Webseite: https://www.wpvs.de/

    Dieser Quellcode ist lizenziert unter einer
    Creative Commons Namensnennung 4.0 International Lizenz.
--%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<%@taglib tagdir="/WEB-INF/tags/templates" prefix="template"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>

<c:set var="base_url" value="<%=request.getContextPath()%>" />

<template:base>
    <jsp:attribute name="title">
        Registrierung
    </jsp:attribute>

    <jsp:attribute name="head">
        <link rel="stylesheet" href="<c:url value="/css/login.css"/>" />
    </jsp:attribute>

    <jsp:attribute name="menu">
        <div class="menuitem">
            <a href="<c:url value="/logout/"/>">Einloggen</a>
        </div>
    </jsp:attribute>

    <jsp:attribute name="content">
        <div class="row pt-4">
            <div class="signup-form col-6">
                <form action="/WebProjekt/register" method="post">
                    <div class="form-row">
                        <div class="form-group col-md-6">
                            <input type="text" class="form-control" name="first_name" placeholder="Vorname" required="required">
                        </div>

                        <div class="form-group col-md-6">
                            <input type="text" class="form-control" name="last_name" placeholder="Nachname" required="required">
                        </div>
                    </div> 
                    <div class="form-group">
                        <input type="text" class="form-control" name="signup_username" value="Benutzername" required="required">
                    </div>
                    <div class="form-group">
                        <input type="password" class="form-control" name="signup_password1" value="Passwort" required="required">
                    </div>
                    <div class="form-group">
                        <input type="password" class="form-control" name="signup_password2" value="Passwort wiederholen" required="required">
                    </div>        
                    <div class="form-group">
                        <label class="checkbox-inline"><input type="checkbox" required="required"> Ich akzeptiere <a href="#">Nutzungsbedingungen</a> &amp; <a href="#">Datenschutzbestimmungen</a></label>
                    </div>
                    <div class="form-group">
                        <button type="submit" class="btn btn-success btn-lg btn-block">Jetzt Registrieren</button>
                    </div>

                    <%-- Fehlermeldung --%>
                    <c:if test="${!empty signup_form.errors}">
                        <ul class="errors">
                            <c:forEach items="${signup_form.errors}" var="error">
                                <li>${error}</li>
                                </c:forEach>
                        </ul>
                    </c:if>

                </form>
            </div>
        </div>
    </div>
</jsp:attribute>
</template:base>