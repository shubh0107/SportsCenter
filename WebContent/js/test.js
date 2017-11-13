function validateform(){  

var firstpassword=document.f1.pass.value;  

var secondpassword=document.f1.cnfpass.value;

var name=document.f1.fn.value;

var fname=document.f1.ftn.value;

var num=document.f1.roll.value;

var email=document.f1.email.value;

var cnum=document.f1.contactno.value;

var regex = /^[a-zA-Z ]*$/;

var mailformat = /^\w+([\.-]?\w+)*@\w+([\.-]?\w+)*(\.\w{2,3})+$/;

if(firstpassword != secondpassword){  

           document.f1.cnfpass.focus();

           document.getElementById("err").innerHTML = "Passwords are not matching, re-enter passwords";

           return false; 

}  

if(!name.match(regex))

{

           document.getElementById("nerr").innerHTML = "Not a valid name! Enter only alphabets and spaces";

           return false;

}

if(!fname.match(regex))

{

           document.getElementById("fnerr").innerHTML = "Not a valid name! Enter only alphabets and spaces";

           return false;

}

if (isNaN(num)){  

          document.getElementById("rerr").innerHTML="Enter a valid roll number";  

          return false;  

        }  

 if (!email.match(mailformat))  

{

        document.getElementById("emerr").innerHTML="Enter a valid email address";  

    return (false);  

}  

if (isNaN(cnum)){  

          document.getElementById("crerr").innerHTML="Enter a valid mobile number";  

          return false;  

        }

}

