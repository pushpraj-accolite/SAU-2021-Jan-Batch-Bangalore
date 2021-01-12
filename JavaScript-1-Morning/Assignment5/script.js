function validateForm() {
    var x = document.forms["myForm"]["fname"].value;
    var count = 0;
    if (x == "") {
        alert("Name must be filled out");
        return false;
        count++;
    }

    if (!(/^[a-zA-Z0-9.!#$%&'*+/=?^_`{|}~-]+@[a-zA-Z0-9-]+(?:\.[a-zA-Z0-9-]+)*$/.test(myForm.email.value))) {
        alert("You have entered an invalid email address!")
        count++;
    }
    if (count === 0) {
        var output = [];
        var y = myForm.email.value;
        output.push({ "Name ": x })
        output.push({ "email": y })
        alert(JSON.stringify(output));
        console.log(JSON.stringify(output));
    }
}