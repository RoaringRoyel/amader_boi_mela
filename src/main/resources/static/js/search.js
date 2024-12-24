// Function to fetch data from the Spring Boot backend
async function fetchBooks() {
    try {
        // Replace with the URL of your Spring Boot backend
        const response = await fetch("http://localhost:8080/search/The", {
            method: "GET",
            headers: {
                "Content-Type": "application/json"
            }
        });

        if (!response.ok) {
            throw new Error(`HTTP error! Status: ${response.status}`);
        }

        const books = await response.json();

        // Log the books for debugging
        console.log("Books fetched:", books);

        // Render the books
        renderBooks(books);
    } catch (error) {
        console.error("Error fetching books:", error);

        // Display a fallback error message in the UI
        const container = document.getElementById("cards-container");
        container.innerHTML = `
            <div style="color: red; font-size: 18px;">Error fetching books. Please try again later.</div>
        `;
    }
}

// Function to render books into the DOM
function renderBooks(books) {
    const container = document.getElementById("cards-container");

    // Clear the container
    container.innerHTML = "";

    if (!books || books.length === 0) {
        container.innerHTML = `
            <div style="font-size: 18px; color: gray;">No books found.</div>
        `;
        return;
    }

    books.forEach((book) => {
        const card = `
            <div class="card">
                <img src="https://img.daisyui.com/images/stock/photo-1606107557195-0e29a4b5b4aa.webp"
                     alt="${book.title}" class="card-img">
                <div class="card-content">
                    <h2 class="card-title">${book.title}</h2>
                    <p class="card-description">
                        <strong>Author:</strong> ${book.writter}<br>
                        <strong>Date:</strong> ${new Date(book.date).toLocaleDateString()}
                    </p>
                    <a href="#" class="card-button">Buy Now</a>
                </div>
            </div>`;
        container.innerHTML += card;
    });
}

// Fetch books when the page loads
fetchBooks();
