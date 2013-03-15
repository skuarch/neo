<%-- 
    Document   : editChain
    Created on : 7/03/2013, 10:31:36 AM
    Author     : skuarch
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
    <head>
        <s:include value="/pages/global/defaultHeader.jsp"/>        
    </head>
    <body onload="requestDataEditChain(getURLParameter('id'), getURLParameter('chain'));">

        <s:include value="/pages/global/navigation.jsp"/>


        <div class="container-fluid">

            <s:include value="/pages/shaper/chains/sideBarEditChains.jsp"/>

            <div class="span9">

                <h1><s:property value="getText('shaper.chains.edit.title')" /></h1>
                <hr/>

                <div id="resultEdit">

                </div>

                <s:include value="/pages/global/footer.jsp" />
            </div>

        </div>

    </body>
</html>
