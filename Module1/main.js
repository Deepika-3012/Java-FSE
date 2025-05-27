console.log("Welcome to the Community Portal");

window.onload = () => {
  alert("Page Loaded: Welcome to your Local Community Portal!");
};

// Handle Event Registration
function handleSubmit(event) {
  event.preventDefault();
  document.getElementById('confirmation').textContent = "Thank you for registering!";
  return false;
}
