<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="s" uri="/struts-tags"%>

<table class="table table-striped table-bordered table-condensed table-hover">
    <thead>
        <tr>
            <th>
                <s:property value="getText('shaper.filters.table.column.0')" />
            </th>            
            <th>
                <s:property value="getText('shaper.filters.table.column.1')" />
            </th>
            <th>
                <s:property value="getText('shaper.filters.table.column.2')" />
            </th>            
        </tr>
    </thead>
    <s:iterator value="tableFilters" var="hashes">
        <tr>
            <td>
                <s:property value="#hashes.id"/>
            </td>
            <td>
                <s:url id="editFiltersLink" action="editFilters">
                    <s:param name="id"  value="#hashes.id" />            
                    <s:param name="filterName"  value="#hashes.filterName" />                    
                </s:url>
                <s:a href="%{editFiltersLink}">
                    <s:property value="#hashes.filterName" /> 
                </s:a>
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
                                <s:a href="%{editFiltersLink}">
                                    <i class="icon-pencil"></i> 
                                    <s:property value="getText('global.button.edit')" />
                                </s:a>
                            </li>                            
                            <li>
                                <a href="javascript:changeStatusFilters('<s:property value="#hashes.id" />', '<s:property value="#hashes.filterName" />', 'disabled');">
                                    <i class="icon-off"></i> 
                                    <s:property value="getText('global.button.disabled')" />
                                </a>
                            </li>                            
                            <li>
                                <a href="javascript:deleteFilters('<s:property value="#hashes.id" />', '<s:property value="#hashes.filterName" />');">
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
                                <a href="javascript:changeStatusFilters('<s:property value="#hashes.id" />', '<s:property value="#hashes.filterName" />', 'enabled');">
                                    <i class="icon-ok"></i> 
                                    <s:property value="getText('global.button.enabled')" />
                                </a>
                            </li>                            
                            <li>
                                <a href="javascript:deleteFilters('<s:property value="#hashes.id" />', '<s:property value="#hashes.filterName" />');">
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