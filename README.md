# 🚆 Train Consist Management App

## 👤 Author

**Kaustubh Chauhan**

---

## 📌 Project Overview

The **Train Consist Management App** is a console-based Java application that simulates how railway systems manage train consists — including structure, uniqueness, attribute mapping, and now **intelligent sorting based on business logic**.

---

## 🎯 Use Case 7: Sort Bogies by Capacity (Comparator)

### ✅ Objective

* Represent bogies as objects
* Sort bogies based on seating capacity
* Apply custom business logic using Comparator

---

## ⚠️ Problem in UC6

* Used `HashMap` for storage
* Data available but:

  * ❌ No ordering
  * ❌ No ranking
  * ❌ Hard to analyze capacity efficiently

---

## ⚙️ Solution: Comparator + Object Sorting

Why Comparator?

* Allows **custom sorting logic**
* Separates **data from behavior**
* Enables **business-driven ordering**

---

## ⚙️ Features Implemented

* Bogie class with attributes (name, capacity)
* List of bogie objects
* Sorting using Comparator
* Ascending and descending ordering

---

## 🧠 Concepts Used

### 🔹 Custom Class (Bogie)

```java
class Bogie {
    String name;
    int capacity;
}
```

---

### 🔹 Comparator Interface

* Defines custom comparison logic

---

### 🔹 Lambda Expression

```java
bogies.sort(Comparator.comparingInt(b -> b.capacity));
```

---

### 🔹 Descending Sort

```java
bogies.sort((b1, b2) -> b2.capacity - b1.capacity);
```

---

### 🔹 List Collection

* Stores objects dynamically
* Supports sorting and iteration

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

Before Sorting:
Sleeper (72 seats)
AC Chair (56 seats)
First Class (24 seats)

After Sorting by Capacity (Ascending):
First Class (24 seats)
AC Chair (56 seats)
Sleeper (72 seats)

After Sorting by Capacity (Descending):
Sleeper (72 seats)
AC Chair (56 seats)
First Class (24 seats)

System ready for capacity-based planning...
```

---

## 🚀 Key Learning Outcomes

* Understand object-based data modeling
* Apply custom sorting using Comparator
* Use lambda expressions effectively
* Separate data and business logic cleanly

---

## 🔮 Future Scope

* Extend Bogie into PassengerBogie and GoodsBogie (Inheritance)
* Add sorting by multiple parameters (capacity + type)
* Implement priority-based allocation system
* Integrate with full train simulation engine

---

## 📎 Notes

* This is **UC7**, extending UC6
* Same file naming maintained for branch-based workflow
* Major shift: **Collections → OOP + Business Logic**

---

**Built for advanced Java system design and real-world modeling.**
