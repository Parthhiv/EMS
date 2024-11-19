// main.js

// Selecting buttons for each role
const teacherButton = document.getElementById("teacher");
const superintendentButton = document.getElementById("superintendent");
const coeButton = document.getElementById("coe");

// Redirect to login page with role parameter
teacherButton.addEventListener("click", () => {
    window.location.href = "./pages/login.html?role=teacher";
});

superintendentButton.addEventListener("click", () => {
    window.location.href = "./pages/login.html?role=superintendent";
});

coeButton.addEventListener("click", () => {
    window.location.href = "./pages/login.html?role=coe";
});
