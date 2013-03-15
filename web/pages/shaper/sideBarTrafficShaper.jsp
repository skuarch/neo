<%@taglib prefix="s" uri="/struts-tags" %>
<div class="row-fluid">
    <div class="span3">
        <div class="well sidebar-nav">

            <ul class="nav nav-list">                  
                
                <li>
                    <a href="trafficShaperConfiguration">
                        <s:property value="getText('shaper.overview')" />
                    </a>
                </li>   
                

                <li class="nav-header"><!-- manage -->
                    <s:property value="getText('shaper.manage')" />
                </li>
                <li>
                    <a href="chains">
                        <s:property value="getText('shaper.manage.chains')" />
                    </a>
                </li>                
                <li>
                    <a href="filters">
                        <s:property value="getText('shaper.manage.filters')" />
                    </a>
                </li>
                <li>
                    <a href="trafficShaperConfiguration">
                        <s:property value="getText('shaper.manage.pipes')" />
                    </a>
                </li><!-- manage -->


                <li class="nav-header"><!-- settings -->
                    <s:property value="getText('shaper.settings')" />
                </li>
                <li>
                    <a href="trafficShaperConfiguration">
                        <s:property value="getText('shaper.settings.targets')" />
                    </a>
                </li>
                <li>
                    <a href="trafficShaperConfiguration">
                        <s:property value="getText('shaper.settings.ports')" />
                    </a>
                </li>
                <li>
                    <a href="trafficShaperConfiguration">
                        <s:property value="getText('shaper.settings.protocols')" />
                    </a>
                </li>
                <li>
                    <a href="trafficShaperConfiguration">
                        <s:property value="getText('shaper.settings.service.level')" />
                    </a>
                </li>
                <li>
                    <a href="trafficShaperConfiguration">
                        <s:property value="getText('shaper.settings.options')" />
                    </a>
                </li><!-- /settings -->            



                <li class="nav-header"><!-- monitoring -->
                    <s:property value="getText('shaper.monitoring')" />
                </li>
                <li>
                    <a href="trafficShaperConfiguration">
                        <s:property value="getText('shaper.monitoring.chains')" />
                    </a>
                </li><li>
                    <a href="trafficShaperConfiguration">
                        <s:property value="getText('shaper.monitoring.pipes')" />
                    </a>
                </li><li>
                    <a href="trafficShaperConfiguration">
                        <s:property value="getText('shaper.monitoring.bandwidth')" />
                    </a>
                </li><!-- /monitoring -->



                <li class="nav-header"><!-- rules -->
                    <s:property value="getText('shaper.rules')" />
                </li>
                <li>
                    <a href="trafficShaperConfiguration">
                        <s:property value="getText('shaper.rules.show')" />
                    </a>
                </li>
                <li>
                    <a href="trafficShaperConfiguration">
                        <s:property value="getText('shaper.rules.load')" />
                    </a>
                </li>
                <li>
                    <a href="trafficShaperConfiguration">
                        <s:property value="getText('shaper.rules.unload')" />
                    </a>
                </li>
                <li>
                    <a href="trafficShaperConfiguration">
                        <s:property value="getText('shaper.rules.load.ruleset')" />
                    </a>
                </li>
                <li>
                    <a href="trafficShaperConfiguration">
                        <s:property value="getText('shaper.rules.unload.ruleset')" />
                    </a>
                </li><!-- /rules -->


                <li class="nav-header"><!-- other -->
                    <s:property value="getText('shaper.other')" />
                </li>
                <li>
                    <a href="trafficShaperConfiguration">
                        <s:property value="getText('shaper.other.save.configuration')" />
                    </a>
                </li>
                <li>
                    <a href="trafficShaperConfiguration">
                        <s:property value="getText('shaper.other.restore.configuration')" />
                    </a>
                </li>   
                <li>
                    <a href="trafficShaperConfiguration">
                        <s:property value="getText('shaper.other.reset.configuration')" />
                    </a>
                </li><!-- /other -->               

            </ul>
        </div><!--/.well -->
    </div><!--/span-->