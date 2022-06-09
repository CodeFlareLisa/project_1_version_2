function setFormMessage(formElement, type, message){
    const messageElement = formElement.querySelector(".form__message");

    messageElement.textContent = message;
    messageElement.classList.remove("form__message--success", "form__message--error");
    messageElement.classList.add('form__message--${type}');

setFormMessage(loginform, "success", "You're logged in!");

document.addEventListener("DOMContentLoader", () => {
 const loginform = document.querySelector("#login");
 const createAccountForm = document.querySelector("#createAccount");

 document.querySelector("#linkCreateAccount").addEventListener("click", e => {
     e.preventDefault();
    loginform.classList.add("form--hidden");
    createAccountForm.classList.remove("form--hidden");
 })

 document.querySelector("#linkLogin").addEventListener("click", e => {
     e.preventDefault();
    loginform.classList.remove("form--hidden");
    createAccountForm.classList.add("form--hidden");
})})
loginform.addEventListener("submit", e => {
    e.preventDefault();

    // perform your AJAX/Fetch login

    setFormMessage(loginform, "error", "Invalid username/password combination");
    });
};