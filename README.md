# 🚆 Train Consist Management App

## 👤 Author

**Kaustubh Chauhan**

---

## 📌 Project Overview

The **Train Consist Management App** is a console-based Java application that simulates how a railway system manages a train consist — a structured collection of bogies attached to an engine.

This project incrementally builds functionality using real-world railway scenarios.

---

## 🎯 Use Case 2: Add Passenger Bogies (ArrayList Operations)

### ✅ Objective

* Dynamically add passenger bogies
* Remove bogies from the train
* Check existence of bogies
* Display updated train consist

---

## ⚠️ Problem in UC1

* Train consist was empty
* No way to:

    * Add bogies
    * Remove bogies
    * Check contents

UC2 solves this using **ArrayList operations**

---

## ⚙️ Features Implemented

* Dynamic insertion of passenger bogies
* Removal of specific bogies
* Existence check using `contains()`
* Maintains insertion order
* Displays real-time updates of train consist

---

## 🧠 Concepts Used

### 🔹 ArrayList

* Dynamic resizing
* Allows runtime insertion/deletion

### 🔹 add()

```java
passengerBogies.add("Sleeper");
```

### 🔹 remove()

```java
passengerBogies.remove("AC Chair");
```

### 🔹 contains()

```java
passengerBogies.contains("Sleeper");
```

### 🔹 CRUD Operations

* Create → add()
* Read → display list
* Delete → remove()
* Check → contains()

---

## 🛠️ How to Run

1. Compile:

```bash
javac TrainConsistApp.java
```

2. Run:

```bash
java TrainConsistApp
```

---

## 🖥️ Sample Output

```
=== Train Consist Management App ===

Passenger Bogies after addition:
[Sleeper, AC Chair, First Class]

After removing AC Chair:
[Sleeper, First Class]

Does Sleeper exist? true

Final Passenger Bogie List:
[Sleeper, First Class]

System ready for further operations...
```

---

## 🚀 Key Learning Outcomes

* Understand dynamic data structures
* Perform CRUD operations using ArrayList
* Learn how real-world systems manage collections
* Visualize train bogie attachment/detachment

---

## 🔮 Future Scope

* Convert bogies into objects (OOP)
* Add Goods Bogies
* Track capacity and cargo
* Build menu-driven system
* Implement safety validation logic

---

## 📎 Notes

* This is **UC2**, building on UC1
* Uses same file structure for version control across branches

---

**Built for practical Java learning and system design understanding.**
