🧥 Fitting Room Management System (Java)
📌 Overview

The Fitting Room Management System is a Java project that simulates managing fitting room availability in a store. It tracks how many fitting rooms are currently in use, enforces capacity limits, and prevents invalid operations such as overfilling or releasing rooms when none are occupied.

This project demonstrates object-oriented design, state management, and unit testing using JUnit.

⚙️ Features

Initialize a fitting room with a fixed capacity

Add customers only if space is available

Remove customers safely without going below zero

Prevent exceeding maximum capacity

Track current occupancy at all times

Fully tested with JUnit

🛠️ Tech Stack

Java

JUnit 5

Object-Oriented Programming (OOP)

🧪 Testing

The project includes comprehensive unit tests (FittingRoomTest.java) that verify:

Correct initialization of capacity

Proper handling of adding/removing customers

Edge cases (full room, empty room)

Correct occupancy tracking

All tests pass successfully.

📂 Project Structure
src/
 ├── FittingRoom.java
 └── FittingRoomTest.java

🚀 How to Run

Clone the repository:

git clone https://github.com/yourusername/fitting-room-management.git


Open the project in IntelliJ IDEA (or another Java IDE)

Run FittingRoomTest.java to execute unit tests

Modify or extend FittingRoom.java to add more functionality

📚 What I Learned

Designing classes with clear responsibilities

Enforcing constraints through program logic

Writing effective unit tests with JUnit

Handling edge cases and invalid states safely

🌱 Possible Improvements

Add multiple fitting rooms

Add a queue system for waiting customers

Create a simple UI or console interface

Log usage statistics

👤 Author

Chaya M. Goldstein
Computer Science Student @ Touro University
Aspiring Software Engineer
