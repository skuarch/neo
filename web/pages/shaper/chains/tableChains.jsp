<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="s" uri="/struts-tags"%>

<table class="table table-striped table-bordered table-condensed table-hover">
    <thead>
        <tr>
            <th>
                <s:property value="getText('shaper.chains.table.column.0')" />
            </th>            
            <th>
                <s:property value="getText('shaper.chains.table.column.1')" />
            </th>
            <th>
                <s:property value="getText('shaper.chains.table.column.2')" />
            </th>
            <th>
                <s:property value="getText('shaper.chains.table.column.3')" />
            </th>
            <th>
                <s:property value="getText('shaper.chains.table.column.4')" />
            </th>                        
        </tr>
    </thead>
    <s:iterator value="tableChains" var="hashes">        
        <tr>
            <td>    
                <s:property value="#hashes.id" />    
            </td>
            <td>
                <s:url id="editChainLink" action="editChain">
                    <s:param name="id"  value="#hashes.id" />            
                    <s:param name="chain"  value="#hashes.chainName" />                    
                </s:url>
                <s:a href="%{editChainLink}">
                    <s:property value="#hashes.chainName" /> 
                </s:a>
            </td>
            <td>    
                <a href="#">
                    <s:property value="#hashes.serviceLevel" /> 
                </a>
            </td>
            <td>    
                <a href="#">
                    <s:property value="#hashes.serviceLevel" /> 
                </a>    
            </td>
            <td>
                <s:if test="%{#hashes.status==\"Enabled\"}" >
                    <div class="btn-group">
                        <a class="btn btn-success" href="#" data-toggle="dropdown">
                            <i class="icon-white"></i> 
                            <s:property value="getText('global.button.enabled')" />
                        </a>
                        <a class="btn btn-success dropdown-toggle" data-toggle="dropdown" href="#">
                            <span class="caret"></span>
                        </a>
                        <ul class="dropdown-menu">                            
                            <li>
                                <s:a href="%{editChainLink}">
                                    <i class="icon-pencil"></i> 
                                    <s:property value="getText('global.button.edit')" />
                                </s:a>
                            </li>                            
                            <li>
                                <a href="javascript:changeStatusChain(<s:property value="#hashes.id" />, '<s:property value="#hashes.chainName" />', 'disabled');">
                                    <i class="icon-off"></i> 
                                    <s:property value="getText('global.button.disabled')" />
                                </a>
                            </li>                            
                            <li>
                                <a href="javascript:deleteChain(<s:property value="#hashes.id" />, '<s:property value="#hashes.chainName" />');">
                                    <i class="icon-remove"></i> 
                                    <s:property value="getText('global.button.delete')" />
                                </a>
                            </li>                            
                        </ul>
                    </div>
                </s:if>
                <s:else>
                    <div class="btn-group">
                        <a class="btn" href="#" data-toggle="dropdown">
                            <i class="icon-white"></i> 
                            <s:property value="getText('global.button.disabled')" />
                        </a>
                        <a class="btn dropdown-toggle" data-toggle="dropdown" href="#">
                            <span class="caret"></span>
                        </a>
                        <ul class="dropdown-menu">
                            <li>
                                <s:a href="%{editChainLink}">
                                    <i class="icon-pencil"></i> 
                                    <s:property value="getText('global.button.edit')" />
                                </s:a>
                            </li>
                            <li>
                                <a href="javascript:changeStatusChain(<s:property value="#hashes.id" />, '<s:property value="#hashes.chainName" />', 'enabled');">
                                    <i class="icon-ok"></i> 
                                    <s:property value="getText('global.button.enabled')" />
                                </a>
                            </li>                            
                            <li>
                                <a href="javascript:deleteChain(<s:property value="#hashes.id" />, '<s:property value="#hashes.chainName" />');">
                                    <i class="icon-remove"></i> 
                                    <s:property value="getText('global.button.delete')" />
                                </a>
                            </li>                            
                        </ul>
                    </div>
                </s:else>                                
            </td>            
        </tr>
    </s:iterator>
</table>   