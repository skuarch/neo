<%@page contentType="text/html" pageEncoding="UTF-8" %>
<%@taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
    <head>   

        <s:include value="/pages/global/defaultHeader.jsp"/>

    </head>

    <body>

        <s:include value="/pages/global/navigation.jsp" />      

        <div class="container-fluid">            

            <s:include value="sideBarDashboard.jsp" />

            <div class="span9">

                <h1><s:property value="getText('dashboard.title')" /></h1>   
                <hr />

                <s:include value="/pages/global/footer.jsp"/>

            </div> <!-- /span9 -->

        </div> <!-- /container -->       

    </body>
</html>
