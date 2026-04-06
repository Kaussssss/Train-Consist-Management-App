# 🚆 Train Consist Management App

## 👤 Author

**Kaustubh Chauhan**

---

## 📌 Project Overview

The **Train Consist Management App** is a console-based Java application that simulates how a railway system manages train consist formation — including structure, ordering, uniqueness, and now **attribute mapping**.

Each use case builds toward a realistic system design.

---

## 🎯 Use Case 6: Map Bogie to Capacity (HashMap)

### ✅ Objective

* Associate each bogie with its capacity
* Store data using key–value mapping
* Enable efficient lookup and analysis

---

## ⚠️ Problem in UC5

* Used `LinkedHashSet`
* Maintained order + uniqueness but:

  * ❌ No data association
  * ❌ Cannot store capacity
  * ❌ Cannot perform validation or analytics

---

## ⚙️ Solution: HashMap

Why `HashMap`?

* Stores **key–value pairs**
* Fast lookup → O(1)
* Perfect for mapping:

```text
Bogie → Capacity
```

---

## ⚙️ Features Implemented

* Bogie-capacity mapping
* Key–value storage
* Iteration over entries
* Fast retrieval using keys

---

## 🧠 Concepts Used

### 🔹 Map Interface

* Represents key–value relationships
* Keys must be unique

### 🔹 HashMap

* Backed by hashing
* Fast insertion and lookup

### 🔹 put()

```java
bogieCapacityMap.put("Sleeper", 72);
```

### 🔹 get()

```java
bogieCapacityMap.get("Sleeper");
```

### 🔹 entrySet()

```java
for (Map.Entry<String, Integer> entry : bogieCapacityMap.entrySet())
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

Bogie Capacity Mapping:
Bogie: Sleeper | Capacity: 72
Bogie: AC Chair | Capacity: 54
Bogie: First Class | Capacity: 24

Capacity of Sleeper: 72

System ready for analytics and validation...
```

---

## 🚀 Key Learning Outcomes

* Understand key–value data modeling
* Learn HashMap operations
* Enable fast lookup using keys
* Move from simple collections → structured data systems

---

## 🔮 Future Scope

* Map bogie ID → Bogie Object (advanced modeling)
* Add validation rules (max capacity limits)
* Integrate passenger + goods bogies
* Perform analytics (total capacity, load distribution)

---

## 📎 Notes

* This is **UC6**, extending UC5
* Same file name used for branch-based development
* Focus shifts from structure → data association

---

**Built for real-world Java system design and scalable data modeling.**
