$('#surnameFormInput').keypress(function (evt) {
    if (evt != null && evt.originalEvent != null && !/[A-Za-z]/.test(evt.originalEvent.key)) {
        evt.preventDefault();
        evt.stopImmediatePropagation();
        if (!$('#validationSurname').length) {
            $('#surnameDiv').after('<span id="validationSurname">Only Alphabetic characters Allowed</span>')
            setTimeout(function (){
                $('#validationSurname').remove();
            }, 3000)
        }
        return false;
    }
});
