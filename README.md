# 🚆 Train Consist Management App

## 👤 Author

**Kaustubh Chauhan**

---

## 📌 Project Overview

The **Train Consist Management App** is a console-based Java application that simulates how a railway system manages train consist formation — the ordered arrangement of bogies attached to an engine.

Each use case introduces new data structures to solve real-world constraints.

---

## 🎯 Use Case 4: Maintain Ordered Train Consist (LinkedList)

### ✅ Objective

* Maintain strict ordering of bogies
* Insert bogies at specific positions
* Remove bogies efficiently
* Simulate real train chaining behavior

---

## ⚠️ Problem in UC3

* Used `HashSet`
* Ensured uniqueness but:

    * ❌ No ordering guarantee
    * ❌ Cannot represent real train sequence

Real-world requirement:

```
Engine → Passenger → Cargo → Guard
```

---

## ⚙️ Solution: LinkedList

Why `LinkedList`?

* Maintains order
* Efficient insertion/removal
* Models node-based chaining (like real train bogies)

---

## ⚙️ Features Implemented

* Ordered bogie insertion
* Middle insertion (Pantry Car)
* Removal of head and tail bogies
* Final consist display

---

## 🧠 Concepts Used

### 🔹 LinkedList

* Doubly linked structure
* Each node → data + next + previous

### 🔹 add()

```java
trainConsist.add("Sleeper");
```

### 🔹 add(index, element)

```java
trainConsist.add(2, "Pantry");
```

### 🔹 addFirst() / addLast()

* Insert at beginning or end

### 🔹 removeFirst() / removeLast()

```java
trainConsist.removeFirst();
trainConsist.removeLast();
```

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

Initial Train Consist:
[Engine, Sleeper, AC, Cargo, Guard]

After inserting Pantry at position 2:
[Engine, Sleeper, Pantry, AC, Cargo, Guard]

After removing first and last bogie:
[Sleeper, Pantry, AC, Cargo]

Final Train Consist:
[Sleeper, Pantry, AC, Cargo]

Order preserved using LinkedList.
```

---

## 🚀 Key Learning Outcomes

* Understand importance of order in real systems
* Learn LinkedList vs ArrayList trade-offs
* Practice insertion/deletion operations
* Visualize node-based data structures

---

## 🔮 Future Scope

* Combine LinkedList + HashSet (ordered + unique IDs)
* Create Bogie classes (OOP model)
* Add validation for sequence rules
* Build full train simulation system

---

## 📎 Notes

* This is **UC4**, extending UC3
* Same file name used for version-controlled branching
* Focus shifts from uniqueness → ordering

---

**Built for practical Java learning and system-level thinking.**
