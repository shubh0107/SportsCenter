function validateName() {
	var name = document.signUpForm.user_name.value;
	var regex = /^[a-zA-Z ]*$/;

	if (!name.match(regex))

	{
		document.getElementById("nameError").innerHTML = "Name has numbers?! Only alphabets allowed.";
	} else
		document.getElementById("nameError").innerHTML = "";

}

function validateEmail() {
	var email = document.signUpForm.user_email.value;
	var mailformat = /^\w+([\.-]?\w+)*@\w+([\.-]?\w+)*(\.\w{2,3})+$/;

	if (!email.match(mailformat))

	{
		document.getElementById("emailError").innerHTML = "Enter a valid email address";
	} else
		document.getElementById("emailError").innerHTML = "";

}

function validatePassword() {

	var firstpassword = document.signUpForm.user_password.value;

	var secondpassword = document.signUpForm.confirm_password.value;

	if (firstpassword != secondpassword) {

		document.getElementById("passError").innerHTML = "Passwords don't match. Re-enter password.";
	} else
		document.getElementById("passError").innerHTML = "";

}

function validateForm() {

	var firstpassword = document.signUpForm.user_password.value;

	var secondpassword = document.signUpForm.confirm_password.value;

	var name = document.signUpForm.user_name.value;

	var email = document.signUpForm.user_email.value;

	var regex = /^[a-zA-Z ]*$/;

	var mailformat = /^\w+([\.-]?\w+)*@\w+([\.-]?\w+)*(\.\w{2,3})+$/;

	if (firstpassword != secondpassword) {

		return false;
	}

	if (!name.match(regex))

	{
		return false;
	}

	if (!fname.match(regex))

	{
		return false;
	}

	
	if (!email.match(mailformat))

	{
		return (false);
	}

	

}
