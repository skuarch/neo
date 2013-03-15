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
        <script src="js/shaper/chains/chainsNewFunctions.js" ></script>
    </head>
    <body onload="ajaxNewChainForm();">

        <s:include value="/pages/global/navigation.jsp"/>


        <div class="container-fluid">

            <s:include value="/pages/shaper/chains/sideBarNewChain.jsp"/>

            <div class="span9">

                <h1><s:property value="getText('shaper.chains.new.title')" /></h1>
                <hr/>

                <div id="resultNew">

                </div>

                <s:include value="/pages/global/footer.jsp" />
            </div>

        </div>

    </body>
</html>
