# 🚆 Train Consist Management App

## 👤 Author

**Kaustubh Chauhan**

---

## 📌 Project Overview

The **Train Consist Management App** is a console-based Java application that simulates how railway systems manage train consists — collections of bogies attached to an engine.

Each use case introduces a new data structure or concept aligned with real-world constraints.

---

## 🎯 Use Case 3: Track Unique Bogie IDs (Set – HashSet)

### ✅ Objective

* Store bogie IDs uniquely
* Prevent duplicate entries
* Demonstrate automatic deduplication using Set

---

## ⚠️ Problem in UC2

* Used `ArrayList`
* Allowed duplicate bogie entries
* Violates real-world railway rules (IDs must be unique)

Example issue:

```
BG101, BG101 ❌
```

---

## ⚙️ Features Implemented

* Unique bogie ID tracking using `HashSet`
* Duplicate insertion attempts handled automatically
* Fast lookup using hashing
* Displays only unique bogies

---

## 🧠 Concepts Used

### 🔹 Set Interface

* Does NOT allow duplicates
* No index-based access

### 🔹 HashSet

* Implements Set
* Uses hashing for fast operations
* Automatically removes duplicates

### 🔹 add()

```java
bogieIDs.add("BG101");
```

### 🔹 contains()

```java
bogieIDs.contains("BG101");
```

### 🔹 Automatic Deduplication

* Duplicate values are ignored internally
* No manual validation needed

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

Bogie IDs after insertion (duplicates attempted):
[BG101, BG102, BG103]

Does BG101 exist? true

Final Unique Bogie IDs:
[BG101, BG102, BG103]

System ensures no duplicate bogie IDs.
```

---

## 🚀 Key Learning Outcomes

* Understand difference between List and Set
* Enforce uniqueness constraints
* Learn when to use HashSet in real systems
* Prevent duplicate data issues

---

## 🔮 Future Scope

* Map bogie IDs to bogie objects (HashMap)
* Add validation rules for IDs
* Integrate with passenger/goods bogies
* Build full train composition system

---

## 📎 Notes

* This is **UC3**, building on UC2
* Same file name used for branch-based development
* Focus shifts from dynamic storage → data integrity

---

**Built for practical Java + real-world system modeling.**
