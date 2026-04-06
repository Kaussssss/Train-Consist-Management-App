# 🚆 Train Consist Management App

## 👤 Author

**Kaustubh Chauhan**

---

## 📌 Project Overview

The **Train Consist Management App** simulates railway bogie management using Java collections, OOP, and modern functional programming techniques.

This use case introduces **data grouping and categorization using Stream collectors**.

---

## 🎯 Use Case 9: Group Bogies by Type (Collectors.groupingBy)

### ✅ Objective

* Group bogies by category/type
* Convert flat data into structured form
* Enable reporting and analytics

---

## ⚠️ Problem in UC8

* Filtering works but:

  * ❌ Data remains flat
  * ❌ No categorization
  * ❌ Hard to generate reports

---

## ⚙️ Solution: groupingBy()

Why grouping?

* Organizes data into logical categories
* Produces structured output (Map)
* Enables reporting and analytics

---

## ⚙️ Features Implemented

* Convert list → stream
* Group bogies by type (name)
* Store result in Map
* Display structured grouped output
* Preserve original list

---

## 🧠 Concepts Used

### 🔹 groupingBy()

```java
.collect(Collectors.groupingBy(b -> b.name))
```

---

### 🔹 Map Structure

```text
Map<String, List<Bogie>>
```

---

### 🔹 Stream Pipeline

* List → Stream → Group → Map

---

### 🔹 Lambda Classification

```java
b -> b.name
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

All Bogies:
Sleeper (72)
AC Chair (56)
Sleeper (70)
First Class (24)
AC Chair (60)

Grouped Bogies:

Type: Sleeper
  Sleeper (72)
  Sleeper (70)

Type: AC Chair
  AC Chair (56)
  AC Chair (60)

Type: First Class
  First Class (24)

Original List (Unchanged):
Sleeper (72)
AC Chair (56)
Sleeper (70)
First Class (24)
AC Chair (60)

System ready for structured reporting...
```

---

## 🚀 Key Learning Outcomes

* Transform flat data into structured format
* Use groupingBy for categorization
* Understand Map-based aggregation
* Prepare for analytics and reporting systems

---

## 🧪 Test Case Coverage

* Same type → grouped together
* Different types → separate keys
* Multiple items per group handled
* Empty list handled
* Original list unchanged
* Correct Map structure maintained

---

## 🔮 Future Scope

* Nested grouping (type → capacity range)
* Aggregation (total seats per type)
* Sorting within groups
* Dashboard-style analytics

---

## 📎 Notes

* This is **UC9**, extending UC8
* Same file naming for Git branching
* Shift: **Filtering → Aggregation & Structuring**

---

**Built for advanced Java stream processing and data analytics.**
