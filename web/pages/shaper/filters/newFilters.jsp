<%-- 
    Document   : chains
    Created on : 5/03/2013, 01:22:09 PM
    Author     : skuarch
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html>
<html>
    <head>
        <s:include value="/pages/global/defaultHeader.jsp" />        
    </head>
    <body onload="ajaxNewFiltersForm();">
        
        <s:include value="/pages/global/navigation.jsp" />

        <div class="container-fluid">
            
            <s:include value="/pages/shaper/filters/sideBarFilters.jsp" />

            <div class="span9">
                <h1><s:property value="getText('shaper.filters.new.title')" /></h1>
                <hr />
                
                <div id="formFilters">                   
                    
                    
                </div>                
                
                <s:include value="/pages/global/footer.jsp" />
            </div>
        </div>

    </body>
</html>
