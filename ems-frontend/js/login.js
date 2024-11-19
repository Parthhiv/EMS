// login.js

// Function to get the role from the URL
function getRoleFromUrl() {
    const params = new URLSearchParams(window.location.search);
    return params.get("role");
}

// Dynamically update the login title based on the role
document.addEventListener("DOMContentLoaded", () => {
    const role = getRoleFromUrl();
    const loginTitle = document.getElementById("login-title");

    // Set login title based on role
    switch (role) {
        case "teacher":
            loginTitle.textContent = "Teacher Login";
            break;
        case "superintendent":
            loginTitle.textContent = "Superintendent Login";
            break;
        case "coe":
            loginTitle.textContent = "COE Login";
            break;
        default:
            loginTitle.textContent = "Login";
    }
    // window.location.href = `../pages/superintendent.html?username=${username}`;
    // Handle login form submission
    const loginForm = document.getElementById("login-form");
    loginForm.addEventListener("submit", async (event) => {
        event.preventDefault(); // Prevent form submission

        const id = document.getElementById("id").value;
        const password = document.getElementById("password").value;

        // Send credentials to the backend for verification
        // Send credentials to the backend for verification
        try {
            const url = "http://localhost:8080/api/auth/login"; // Update this URL to match your backend endpoint
            const response = await fetch(url, {
                method: "POST",
                headers: {
                    "Content-Type": "application/json",
                },
                body: JSON.stringify({
                    id: id,
                    password: password,
                    role: role, // Sending the role to identify the user type
                }),
            });

            const data = await response.json();
            if (response.ok && data.success) {
                redirectToHomepage(role, id);
            } else {
                alert(data.message || "Invalid credentials. Please try again.");
            }
        } catch (error) {
            console.error("Error during login:", error);
            alert("An error occurred. Please try again later.");
        }

    });
});

// Function to redirect to the homepage based on the role
function redirectToHomepage(role, id) {
    // Check the role and redirect to the corresponding homepage
    if (role === "superintendent") {
        window.location.href = `../pages/superintendent.html?id=${id}`;
    } else if (role === "teacher") {
        window.location.href = `../pages/teacher.html?id=${id}`;
    } else if (role === "coe") {
        // Redirect to the COE homepage without username display
        window.location.href = `../pages/coe.html`;
    } else {
        alert("Invalid role specified.");
    }
}

