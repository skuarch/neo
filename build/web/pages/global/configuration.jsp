<%-- 
    Document   : configuration
    Created on : 26/02/2013, 12:55:04 PM
    Author     : skuarch
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
    <head>

        <s:include value="/pages/global/defaultHeader.jsp"/>

    </head>
    <body>

        <s:include value="/pages/global/navigation.jsp" />        

        <div class="container">

            <h1><s:property value="getText('configuration.title')" /></h1>    
            <hr />

            <h3><s:property value="getText('configuration.language')" /></h3>
            <p><s:property value="getText('configuration.choose.language')" /></p>

            <hr/>

            <h3><s:property value="getText('configuration.settings')" /></h3>
            <s:form action="saveConfiguration" method="post" enctype="application/x-www-form-urlencoded">
                <s:textfield name="remoteServer" key="configuration.remote.server"/>
                <s:textfield name="remoteServerPort" key="configuration.remote.server.port" />
                <s:textfield name="timeWaitMessage" key="configuration.time.wait.message" />
                <s:submit name="submit" key="configuration.save" cssClass="btn btn-large btn-primary" />
            </s:form>            

            <hr/>

            <h3><s:property value ="getText('configuration.title.test')" /> </h3>
            <p>
                <s:property value ="getText('configuration.test.text')" />
                <input type="button" id="configuration.test.button" class="btn btn-large btn-primary" value='<s:property value="getText('configuration.test.button.test')"/>' onclick="javascript:testConfiguration();" />                
            </p>

            <div id="configurationTestResult"></div>

            <s:include value="/pages/global/footer.jsp"/>

        </div> <!-- /container -->

    </body>
</html>