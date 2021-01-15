
var student = {
    firstName : "Raj",
    lasName : "Singh",
    age: 21,
    gender : "Male",
    rollNo : 101,
    dob: "05-02-1999",
    occupation: "student"
    
}

function call(){
    var letters = /^[A-Za-z]+$/;
    var fname = document.forms["myForm"]["fname"].value;
    if(!fname.match(letters))
     {
        alert("invalid name");
        return false;
     }
    var lname = document.forms["myForm"]["lname"].value;
    if(!lname.match(letters))
     {
        alert("invalid last name");
        return false;
     }
    var age = document.forms["myForm"]["age"].value;

    var gender = document.forms["myForm"]["gender"].value;

    var roll = document.forms["myForm"]["roll"].value;

    var dob = document.forms["myForm"]["dob"].value;

    document.getElementById("ans1").innerHTML = fname;
    document.getElementById("ans2").innerHTML = lname;
    document.getElementById("ans3").innerHTML = age;
    document.getElementById("ans4").innerHTML = gender;
    document.getElementById("ans5").innerHTML = roll;
    document.getElementById("ans6").innerHTML = dob;
    document.getElementById("ans7").innerHTML = occupation;

    alert("Thankyou "+fname+" we will get back to you soon")
    return false;
}