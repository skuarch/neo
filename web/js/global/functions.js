// global variables
var loaderDiv = "<img class='_1' src='img/ajax-loader.gif'/>";


//==============================================================================
$(document).ready(function() {

    // disable selection **
    /*document.onselectstart = function() {
     return false;
     };
     
     //disable menu **
     $(document).bind("contextmenu", function(e) {
     return false;
     });
     
     // To disable f5 **
     $(document).bind("keydown", function disableF5(e) {
     if (e.which === 116)
     e.preventDefault();
     }); */
    // To re-enable f5
    //$(document).unbind("keydown", disableF5);    

}); // end ready

//==============================================================================
jQuery.i18n.properties({
    name: 'global',
    path: 'js/i18n/',
    mode: 'both'
            //language: 'en'
}); // end i18n

//==============================================================================
function testConfiguration() {

    $('#configurationTestResult').html(jQuery.i18n.prop('configuration.test.button.testing'));
    var button = document.getElementById('configuration.test.button');
    button.disabled = true;
    button.value = jQuery.i18n.prop('configuration.test.button.testing');
    var error404 = jQuery.i18n.prop('test.error.404');

    $.ajax({
        type: "post",
        url: "Tester",
        data: Math.random(),
        error: function(error) {
            $('#configurationTestResult').html(error404);
        },
        success: function(data) {
            $('#configurationTestResult').html(data);
        }
    });

    button.value = jQuery.i18n.prop('configuration.test.button.test');
    button.disabled = false;

} // end testConfiguration


//==============================================================================
function getURLParameter(parameterName) {

    var url = window.location.search.substring(1);
    var parameters = url.split("&");

    for (var i = 0; i < url.length; i++) {
        var parametersName = parameters[i].split("=");
        if (parametersName[0] == parameterName) {
            return parametersName[1];
        }
    }

} // end getURLParameter

//==============================================================================
function requestDataEditChain(id, chain) {

    $("#resultEdit").html(loaderDiv);

    $.ajax({
        type: 'POST',
        url: "requestDataEditChain",
        data: {id: id, chain: chain}
    }).done(function(data) {
        $('#resultEdit').html(data);
    });

} // end requestDataEditChain

//==============================================================================
function editChain() {

    var button = document.getElementById("submitForm");
    button.value = "loading";
    button.disabled = true;

    var form = document.saveChain;

    var id = form.id.value;
    var chain = form.chain.value;
    var status = document.getElementById("saveChain_enabledenabled").checked;
    var serviceLevel = form.serviceLevel.value;
    var fallback = form.fallback.value;
    var source = form.source.value;
    var direction = form.direction.value;
    var destination = form.destination.value;

    $.ajax({
        type: 'POST',
        url: "saveChain",
        data: {id: id,
            chain: chain,
            status: status,
            serviceLevel: serviceLevel,
            fallback: fallback,
            source: source,
            direction: direction,
            destination: destination}
    }).done(function(data) {
        alert(data);
        button.value = "edit";
        button.disabled = false;
    });

} // end editChain

//==============================================================================
function deleteChain(id, chain) {

    $("#resultEdit").html(loaderDiv);

    $.ajax({
        type: 'POST',
        url: "deleteChain",
        data: {id: id, chain: chain}
    }).done(function(data) {
        $('#resultEdit').html(data);
    });

} // end deleteChain

//==============================================================================
function chainsTable() {

    $("#tableChains").html(loaderDiv);

    $.ajax({
        url: "tableChains"
    }).done(function(data) {
        $('#tableChains').html(data);
    });

} // end chainsTable

//==============================================================================
function changeStatusChain(id, chain, status) {

    $("#tableChains").html(loaderDiv);

    $.ajax({
        url: "changeStatusChain",
        data: {id: id, chain: chain, status: status}
    }).done(function(data) {
        chainsTable();
        alert(data);
    });

} // end changeStatusChain


//==============================================================================
function deleteChain(id, chain) {

    $("#tableChains").html(loaderDiv);

    $.ajax({
        type: 'POST',
        url: "deleteChain",
        data: {id: id, chain: chain}
    }).done(function(data) {
        chainsTable();
        alert(data);
    });

} // end deleteChain

//==============================================================================
function ajaxNewChainForm() {

    $("#resultNew").html(loaderDiv);

    $.ajax({
        url: "formNewChain",
        error: function(e) {
            alert("uppps !!!! we have an error please report to administrator");
        }
    }).done(function(data) {
        $("#resultNew").html(data);
    });

} // end ajaxNewChainForm

//==============================================================================
function newChain() {

    var button = document.getElementById("submitForm");
    button.value = "loading";
    button.disabled = true;

    var form = document.saveChain;

    var chain = form.chain.value;
    var status = document.getElementById("saveChain_enabledenabled").checked;
    var serviceLevel = form.serviceLevel.value;
    var fallback = form.fallback.value;
    var source = form.source.value;
    var direction = form.direction.value;
    var destination = form.destination.value;

    if (chain == "" || chain == "undefined" || chain == null || chain == undefined) {
        alert("the name of chain is requiered");
        button.value = "create chain";
        button.disabled = false;
        return;
    }

    $.ajax({
        type: 'POST',
        url: "saveChain",
        data: {id: 0,
            chain: chain,
            status: status,
            serviceLevel: serviceLevel,
            fallback: fallback,
            source: source,
            direction: direction,
            destination: destination},
        error: function(e) {
            alert("uppps !!!! we have an error please report to administrator");
        }
    }).done(function(data) {
        alert(data);
        button.value = "create chain";
        button.disabled = false;
    });

} // end newChain

//==============================================================================
function tableFilters() {
    $("#tableFilters").html(loaderDiv);

    $.ajax({
        url: "tableFilters"
    }).done(function(data) {
        $('#tableFilters').html(data);
    });
}

//==============================================================================
function changeStatusFilters(id, filterName, status) {

    $("#tableFilters").html(loaderDiv);

    $.ajax({
        url: "changeStatusFilters",
        data: {id: id, filterName: filterName, status: status}
    }).done(function(data) {
        chainsTable();
        alert(data);
    });

}

//==============================================================================
function deleteFilters(id, filterName) {

    $("#tableFilters").html(loaderDiv);

    $.ajax({
        type: 'POST',
        url: "deleteFilters",
        data: {id: id, filterName: filterName}
    }).done(function(data) {
        chainsTable();
        alert(data);
    });

} // end deleteChain

//===============================================================================
function ajaxNewFiltersForm() {

    $("#formFilters").html(loaderDiv);

    $.ajax({
        url: "formNewChain",
        error: function(e) {
            alert("uppps !!!! we have an error please report to administrator");
        }
    }).done(function(data) {
        $("#formFilters").html(data);
    });

} // end ajaxNewFiltersForm
