<%@taglib prefix="s" uri="/struts-tags" %>

<s:form action="saveChain" name="saveChain" method="POST" enctype="application/x-www-form-urlencoded" theme="simple" onsubmit="return false;" >
    <table>
        <tbody>
            <tr>
                <td>
                    <label class="label">
                        <s:property value="getText('shaper.form.edit.chains.id')" />
                    </label>
                </td>
                <td>
                    <s:textfield name="id" key="shaper.form.edit.chains.id" readonly="true" />                
                </td>
            </tr>
            <tr>
                <td>
                    <label class="label">
                        <s:property value="getText('shaper.form.edit.chains')" /> 
                    </label>
                </td>
                <td>
                    <s:textfield name="chain" key="shaper.form.edit.chains" readonly="true" />
                </td>
            </tr>
            <tr>
                <td>
                    <label class="label">
                        <s:property value="getText('shaper.form.edit.chains.status')" /> 
                    </label>
                </td>
                <td>
                    <s:radio label="enabled" name="enabled" list="statusRadios" value="defaultValueStatus"/>    
                </td>
            </tr>
            <tr>
                <td>
                    <label class="label">
                        <s:property value="getText('shaper.form.edit.chains.select.service.level')" /> 
                    </label>
                </td>
                <td>
                    <s:select key="shaper.form.edit.chains.select.service.level" list="serviceLevel" name="serviceLevel" value="defaultValueServiceLevel"/>    
                </td>
            </tr>
            <tr>
                <td>
                    <label class="label">
                        <s:property value="getText('shaper.form.edit.chains.select.fallback')" /> 
                    </label>
                </td>
                <td>
                    <s:select key="shaper.form.edit.chains.select.fallback" list="fallbacks" name="fallback" value="defaultValueFallback"/>
                </td>
            </tr>
            <tr>
                <td>
                    <label class="label">
                        <s:property value="getText('shaper.form.edit.chains.select.source')" /> 
                    </label>
                </td>
                <td>
                    <s:select key="shaper.form.edit.chains.select.source" list="source" name="source" value="defaultValueSource"/>
                </td>
            </tr>
            <tr>
                <td>
                    <label class="label">
                        <s:property value="getText('shaper.form.edit.chains.select.direction')" /> 
                    </label>
                </td>
                <td>
                    <s:select key="shaper.form.edit.chains.select.direction" list="direction" name="direction" value="defaultValueDirection"/>
                </td>
            </tr>
            <tr>
                <td>
                    <label class="label">
                        <s:property value="getText('shaper.form.edit.chains.select.destination')" /> 
                    </label>
                </td>
                <td>
                    <s:select key="shaper.form.edit.chains.select.destination" list="destination" name="destination" value="defaultValueDestination"/>    
                </td>
            </tr>
            <tr>
                <td>
                    <div id="message"></div>
                </td>
                <td>
                    <input type="button" id="submitForm" onclick="editChain();" value="<s:property value="getText(\'shaper.form.edit.chains.submit\')"/>" class="btn btn-large btn-primary"> 
                </td>
            </tr>
        </tbody>
    </table>       

</s:form>


