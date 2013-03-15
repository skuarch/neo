<%@taglib prefix="s" uri="/struts-tags" %>
<div class="navbar navbar-inverse navbar-fixed-top">
    <div class="navbar-inner">
        <div class="container-fluid">
            <button type="button" class="btn btn-navbar" data-toggle="collapse" data-target=".nav-collapse">
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
            </button>
            <a class="brand" href="#">
                <s:property value="getText('global.application.name')"/>
            </a>
            <div class="nav-collapse collapse">
                <p class="navbar-text pull-right">
                    <s:property value="getText('login.as')" />
                    <a href="#" class="navbar-link">
                        <s:property value="#session.user" />
                    </a>
                </p>
                <ul class="nav">
                    <li>
                        <a href="dashboard">
                            <s:property value="getText('menu.1')" />
                        </a>
                    </li>
                    <li>
                        <a href="configuration">
                            <s:property value="getText('menu.2')" />
                        </a>
                    </li>                    
                    <li class="dropdown">
                        <a href="#" class="dropdown-toggle" data-toggle="dropdown">
                            <s:property value="getText('menu.dropdown.name')" />
                            <b class="caret"></b>
                        </a>
                        <ul class="dropdown-menu">
                            <li>
                                <a href="router">
                                    <s:property value="getText('menu.dropdown.1')" />
                                </a>
                            </li>
                            <li>
                                <a href="ids_ips">
                                    <s:property value="getText('menu.dropdown.2')" />
                                </a>
                            </li>
                            <li>
                                <a href="trafficShaper">
                                    <s:property value="getText('menu.dropdown.3')" />
                                </a>
                            </li>
                            <li>
                                <a href="trafficFilter">
                                    <s:property value="getText('menu.dropdown.4')" />
                                </a>
                            </li>
                            <li class="divider"></li>                            
                            <li><a href="logout">Logout</a></li>
                        </ul>
                    </li>
                </ul>                   
            </div><!--/.nav-collapse -->
        </div>
    </div>
</div> <!-- /navigation -->
