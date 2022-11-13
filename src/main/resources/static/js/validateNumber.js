$('#policyNumberFormInput').keypress(function (evt) {
    if (evt != null && evt.originalEvent != null && /\D/.test(evt.originalEvent.key)) {
        evt.preventDefault();
        evt.stopImmediatePropagation();
        if (!$('#numbersAllowed').length) {
            $('#policyDiv').after('<span id="numbersAllowed">Only Numbers Allowed</span>')
            setTimeout(function (){
                $('#numbersAllowed').remove();
            }, 3000)
        }
        return false;
    }
});
