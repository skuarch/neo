<%-- 
    Document   : login
    Created on : 25/02/2013, 05:45:47 PM
    Author     : skuarch
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="s" uri="/struts-tags" %>

<!DOCTYPE html>
<html>
    <head>

        <s:include value="/pages/global/defaultHeader.jsp"/>
        <link rel="stylesheet" href="css/login.css" type="text/css" />        

    </head>
    <body>
        <div class="container">
            <div class="content">
                <div class="row">                    
                    <div class="login-form">

                        <h2><s:property value="getText('global.application.name')" /></h2>                        

                        <s:form action="authentication" method="post" enctype="application/x-www-form-urlencoded">
                            <s:textfield name="username" key="login.username" />
                            <s:password name="password" key="login.password" />
                            <s:submit name="submit" key="login.submit" cssClass="btn btn-large btn-primary" />
                        </s:form>

                    </div>
                </div>
            </div>
        </div> <!-- /container -->
    </body>
</html>
