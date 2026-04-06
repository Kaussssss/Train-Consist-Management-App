# 🚆 Train Consist Management App

## 👤 Author

**Kaustubh Chauhan**

---

## 📌 Project Overview

The **Train Consist Management App** is a console-based Java application that simulates how a railway system manages train consist formation — ensuring correct ordering, uniqueness, and operational constraints.

Each use case introduces a new data structure aligned with real-world railway requirements.

---

## 🎯 Use Case 5: Preserve Insertion Order of Bogies (LinkedHashSet)

### ✅ Objective

* Maintain insertion order of bogies
* Prevent duplicate entries
* Ensure predictable and valid train formation

---

## ⚠️ Problem in UC4

* Used `LinkedList`
* Maintained order but:

  * ❌ Allowed duplicates
  * ❌ No enforced uniqueness
  * ❌ Could lead to invalid train composition

---

## ⚙️ Solution: LinkedHashSet

Why `LinkedHashSet`?

* Combines:

  * ✔ **HashSet → uniqueness**
  * ✔ **LinkedList → order preservation**
* Ensures:

  * No duplicate bogies
  * Same order as insertion

---

## ⚙️ Features Implemented

* Ordered bogie insertion
* Duplicate prevention
* Automatic deduplication
* Consistent train formation display

---

## 🧠 Concepts Used

### 🔹 LinkedHashSet

* Maintains insertion order
* Stores unique elements only
* Backed by hash table + linked list

### 🔹 Set Interface

* No duplicate values allowed
* Ensures data integrity

### 🔹 add()

```java
trainFormation.add("Sleeper");
```

### 🔹 contains()

```java
trainFormation.contains("Sleeper");
```

### 🔹 Automatic Deduplication

* Duplicate bogies are ignored internally

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

Train Formation (Insertion Order Preserved):
[Engine, Sleeper, Cargo, Guard]

Does Sleeper exist? true

Final Train Formation:
[Engine, Sleeper, Cargo, Guard]

Duplicates automatically removed. Order preserved.
```

---

## 🚀 Key Learning Outcomes

* Understand hybrid data structures
* Combine ordering + uniqueness
* Learn when to use LinkedHashSet over HashSet/List
* Enforce real-world constraints in systems

---

## 🔮 Future Scope

* Introduce Stack for LIFO bogie removal
* Map bogie IDs to objects using HashMap
* Add validation rules for train formation
* Build full simulation engine

---

## 📎 Notes

* This is **UC5**, extending UC4
* Same file name used for branch-based version control
* Focus shifts from ordering → ordering + uniqueness

---

**Built for real-world Java system design and data structure mastery.**
