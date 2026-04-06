# 🚆 Train Consist Management App

## 👤 Author

**Kaustubh Chauhan**

---

## 📌 Project Overview

The **Train Consist Management App** simulates railway train composition using Java collections and OOP concepts. This use case introduces **functional-style filtering using the Stream API**.

---

## 🎯 Use Case 8: Filter Passenger Bogies Using Streams

### ✅ Objective

* Filter bogies based on capacity
* Use Stream API for clean, declarative logic
* Preserve original data while generating filtered results

---

## ⚠️ Problem in UC7

* Sorting works but:

  * ❌ Cannot selectively extract bogies
  * ❌ Requires verbose loops for filtering
  * ❌ Harder to maintain logic

---

## ⚙️ Solution: Stream API

Why Streams?

* Declarative → focus on **what**, not how
* Cleaner and more readable
* No manual loops needed

---

## ⚙️ Features Implemented

* Convert list → stream
* Apply filtering condition (capacity > 60)
* Collect results into a new list
* Preserve original list

---

## 🧠 Concepts Used

### 🔹 stream()

```java
bogies.stream()
```

---

### 🔹 filter()

```java
.filter(b -> b.capacity > 60)
```

---

### 🔹 collect()

```java
.collect(Collectors.toList())
```

---

### 🔹 Lambda Expressions

* Short, functional logic definition

---

### 🔹 Declarative Programming

* Focus on result, not iteration

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

All Bogies:
Sleeper (72 seats)
AC Chair (56 seats)
First Class (24 seats)
Luxury (80 seats)

Filtered Bogies (Capacity > 60):
Sleeper (72 seats)
Luxury (80 seats)

Original List After Filtering (Unchanged):
Sleeper (72 seats)
AC Chair (56 seats)
First Class (24 seats)
Luxury (80 seats)

System ready for advanced filtering and analytics...
```

---

## 🚀 Key Learning Outcomes

* Understand Stream API basics
* Apply filtering using lambda expressions
* Maintain immutability of original data
* Write clean, readable, modern Java code

---

## 🧪 Test Case Coverage

* Capacity > threshold → included
* Capacity = threshold → excluded
* Capacity < threshold → excluded
* Multiple matches handled
* Empty list handled
* Original list unchanged

---

## 🔮 Future Scope

* Chain multiple stream operations (filter + sort)
* Group bogies by type
* Aggregate total capacity
* Build analytics dashboard

---

## 📎 Notes

* This is **UC8**, extending UC7
* Same file maintained for branch-based workflow
* Shift: **OOP → Functional Programming (Streams)**

---

**Built for modern Java development and clean data processing.**
