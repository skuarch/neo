<%-- 
    Document   : message
    Created on : 27/02/2013, 04:09:57 PM
    Author     : skuarch
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="s" uri="/struts-tags"%>

<!DOCTYPE html>
<html>
    <head>

        <s:include value="/pages/global/defaultHeader.jsp"/>

    </head>
    <body>

        <s:include value="/pages/global/navigation.jsp" />

        <div class="container">
            <h1><s:property value="getText('global.application.name')" /></h1>

            <s:property value="message" />

            <s:include value="/pages/global/footer.jsp"/>
        </div>               

    </body>
</html>
