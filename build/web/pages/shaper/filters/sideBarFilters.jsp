<%@taglib prefix="s" uri="/struts-tags" %>
<div class="row-fluid">
    <div class="span3">
        <div class="well sidebar-nav">
            <ul class="nav nav-list">                            
                <li>
                    <a href="trafficShaper">
                        <s:property value="getText('shaper.return')" />
                    </a>                    
                    <a href="newFilters">
                        <s:property value="getText('shaper.filters.new')" />
                    </a>
                </li>                            
            </ul>
        </div><!--/.well -->
    </div><!--/span-->