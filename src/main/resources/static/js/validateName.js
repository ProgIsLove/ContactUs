$('#nameFormInput').keypress(function (evt) {
    if (evt != null && evt.originalEvent != null && !/[A-Za-z]/.test(evt.originalEvent.key)) {
        evt.preventDefault();
        evt.stopImmediatePropagation();
        if (!$('#validationName').length) {
            $('#nameDiv').after('<span id="validationName">Only Alphabetic characters Allowed</span>')
            setTimeout(function (){
                $('#validationName').remove();
            }, 3000)
        }
        return false;
    }
});
