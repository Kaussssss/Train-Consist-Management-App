# 🚆 Train Consist Management App

## 👤 Author

**Kaustubh Chauhan**

---

## 📌 Project Overview

The **Train Consist Management App** simulates railway bogie management using Java collections, OOP, and modern Stream API operations.

This use case introduces **aggregation using reduce()** to compute total seating capacity.

---

## 🎯 Use Case 10: Count Total Seats in Train (reduce)

### ✅ Objective

* Aggregate seating capacities
* Compute total number of seats
* Use functional programming instead of loops

---

## ⚠️ Problem in UC9

* Data is grouped but:

  * ❌ No numerical insight
  * ❌ No total capacity calculation
  * ❌ No analytics for planning

---

## ⚙️ Solution: map() + reduce()

Why reduce?

* Combines multiple values → single result
* Perfect for totals, sums, metrics

---

## ⚙️ Features Implemented

* Extract capacity using map()
* Aggregate values using reduce()
* Display total seating capacity
* Preserve original data

---

## 🧠 Concepts Used

### 🔹 map()

```java id="dwrm6h"
.map(b -> b.capacity)
```

---

### 🔹 reduce()

```java id="x0y9nm"
.reduce(0, Integer::sum)
```

---

### 🔹 Method Reference

```java id="3uq3fc"
Integer::sum
```

---

### 🔹 Stream Pipeline

* List → Stream → Map → Reduce → Result

---

## 🛠️ How to Run

1. Compile:

```bash id="5f7tqj"
javac TrainConsistApp.java
```

2. Run:

```bash id="q6w2tf"
java TrainConsistApp
```

---

## 🖥️ Sample Output

```id="v8c9gh"
=== Train Consist Management App ===

All Bogies:
Sleeper (72)
AC Chair (56)
First Class (24)
Luxury (80)

Total Seating Capacity: 232

Original List (Unchanged):
Sleeper (72)
AC Chair (56)
First Class (24)
Luxury (80)

System ready for capacity analytics...
```

---

## 🚀 Key Learning Outcomes

* Understand aggregation using reduce()
* Extract data using map()
* Perform numeric analysis on collections
* Replace loops with functional pipelines

---

## 🧪 Test Case Coverage

* Multiple bogies → correct sum
* Single bogie → same capacity returned
* Empty list → returns 0
* All bogies included in sum
* map() correctly extracts values
* Original list unchanged

---

## 🔮 Future Scope

* Average capacity calculation
* Max/min capacity detection
* Total capacity by category
* Dashboard analytics system

---

## 📎 Notes

* This is **UC10**, extending UC9
* Same file naming for Git branches
* Shift: **Data structuring → Data analytics**

---

**Built for real-world Java analytics and functional programming mastery.**
