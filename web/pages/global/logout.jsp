<%-- 
    Document   : logout
    Created on : 27/02/2013, 06:51:37 PM
    Author     : skuarch
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
    <head>
        <s:include value="/pages/global/defaultHeader.jsp"/>
    </head>
    <body onload="noBack();">

        <div class="container">
            <h1><s:property value="getText('logout.message')" /></h1>

            <s:include value="/pages/global/footer.jsp"/>
        </div>       

    </body>
</html>
