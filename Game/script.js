const board = document.getElementById('board');
const statusText = document.getElementById('status');
const resetButton = document.getElementById('reset');
const resultScreen = document.getElementById('resultScreen');
const resultMessage = document.getElementById('resultMessage');
const playAgainButton = document.getElementById('playAgain');

let currentPlayer = 'X';
let gameActive = true;
const gameState = Array(9).fill(null);

const winningCombinations = [
    [0, 1, 2],
    [3, 4, 5],
    [6, 7, 8],
    [0, 3, 6],
    [1, 4, 7],
    [2, 5, 8],
    [0, 4, 8],
    [2, 4, 6]
];

// Create game board
function createBoard() {
    gameState.forEach((_, index) => {
        const cell = document.createElement('div');
        cell.classList.add('cell');
        cell.dataset.index = index;
        board.appendChild(cell);
    });
}

// Check if a player has won
function checkWinner() {
    let roundWon = false;
    for (let combination of winningCombinations) {
        const [a, b, c] = combination;
        if (gameState[a] && gameState[a] === gameState[b] && gameState[a] === gameState[c]) {
            roundWon = true;
            break;
        }
    }

    if (roundWon) {
        showResultScreen(`Player ${currentPlayer} wins!`);
        gameActive = false;
        return true;
    }

    if (!gameState.includes(null)) {
        showResultScreen("It's a draw!");
        gameActive = false;
        return true;
    }

    return false;
}

// Handle cell click
function handleCellClick(event) {
    const clickedCell = event.target;
    const cellIndex = clickedCell.dataset.index;

    if (gameState[cellIndex] || !gameActive) return;

    gameState[cellIndex] = currentPlayer;
    clickedCell.textContent = currentPlayer;
    clickedCell.classList.add('taken');

    if (!checkWinner()) {
        currentPlayer = currentPlayer === 'X' ? 'O' : 'X';
        statusText.textContent = `Player ${currentPlayer}'s turn`;
    }
}

// Reset game
function resetGame() {
    currentPlayer = 'X';
    gameActive = true;
    gameState.fill(null);
    statusText.textContent = `Player X's turn`;
    board.innerHTML = '';
    createBoard();
    resultScreen.style.display = 'none';
}

// Show result screen
function showResultScreen(message) {
    resultMessage.textContent = message;
    resultScreen.style.display = 'flex';
}

// Initialize game
createBoard();
board.addEventListener('click', handleCellClick);
resetButton.addEventListener('click', resetGame);
playAgainButton.addEventListener('click', resetGame);
