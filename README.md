# Dice Rolling Simulator

This Java program simulates rolling two six-sided dice **36,000 times**, calculates the **sum of each roll**, and displays the **frequency of each possible sum (2–12)**. Users are prompted with the option to run the simulation multiple times via the console.

> **Course**: CSIS 212-B02  
> **Author**: David Lyman  
> **Assignment**: 5  
> **Citation**: [Oracle Random Class](https://docs.oracle.com/javase/8/docs/api/java/util/Random.html)

---

## 📁 Project Structure

Dice Rolling/
├── DiceRolling.java // Main class for simulating dice rolls
├── DiceRolling.class // Compiled Java class file
├── .gitattributes
└── README.md // Project documentation

---

## 💡 Features

- Simulates **rolling two dice 36,000 times**
- Calculates and stores the **sum of each roll** (ranging from 2 to 12)
- Displays a **frequency distribution table**
- Prompts user to rerun the simulation
- Uses `Random` class for generating dice rolls

---

## 🛠️ Getting Started

### ✅ Prerequisites

- Java Development Kit (JDK) 8 or later
- Terminal or IDE for compilation and execution

### 📦 How to Run

1. Clone or download this repository.
2. Open a terminal in the project directory.
3. Compile the program:

   ```bash
   javac DiceRolling.java
4. Run the program:

   ```bash
   java dicerolling.DiceRolling
Make sure your file is inside a folder named dicerolling/ to match the declared package.

---

📄 Sample Output

Sum	Frequency
2	1001
3	2046
4	3059
5	4002
6	5014
7	5979
8	4971
9	4025
10	2962
11	1986
12	955

David Lyman – Assignment 5
Do you want to run again? Type yes or no:

---

🧠 Concepts Demonstrated
Arrays: For tracking frequency of roll sums

Random number generation: Simulating dice rolls

Loops: For repeated execution of simulations

Conditionals: To prompt user for reruns

Formatted output: Clear tabular display of results

---

📜 License
This project is for academic purposes and is not licensed for commercial distribution.
