const fruitForm = document.getElementById('fruitForm');
const nameInput = document.getElementById('nameInput');
const fruitList = document.getElementById('fruitList');

// Function to render fruits
function renderFruits(fruits) {
    fruitList.innerHTML = '';
    fruits.forEach(fruit => {
        const li = document.createElement('li');
        li.textContent = fruit.name;
        fruitList.appendChild(li);
    });
}

// Function to fetch fruits
async function fetchFruits() {
    try {
        const response = await fetch('/fruits');
        const data = await response.json();
        renderFruits(data);
    } catch (error) {
        console.error('Error fetching fruits:', error);
    }
}

// Function to add a fruit
async function addFruit(event) {
    event.preventDefault();

    const name = nameInput.value.trim();
    if (!name) return;

    try {
        const response = await fetch('/fruits', {
            method: 'POST',
            headers: {
                'Content-Type': 'application/json'
            },
            body: JSON.stringify({ name })
        });

        if (response.ok) {
            fetchFruits();
            nameInput.value = '';
        } else {
            console.error('Failed to add fruit:', response.statusText);
        }
    } catch (error) {
        console.error('Error adding fruit:', error);
    }
}

// Event listener for form submission
fruitForm.addEventListener('submit', addFruit);

// Fetch fruits when the page loads
fetchFruits();