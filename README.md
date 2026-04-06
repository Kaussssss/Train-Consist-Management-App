# 🚆 Train Consist Management App

## 👤 Author

**Kaustubh Chauhan**

---

## 📌 Project Overview

The **Train Consist Management App** simulates railway system behavior using Java collections, streams, OOP, and validation techniques.

This final use case introduces **safety compliance enforcement using Streams and business rules**.

---

## 🎯 Use Case 12: Safety Compliance Check for Goods Bogies

### ✅ Objective

* Enforce domain-specific safety rules
* Validate cargo assignments
* Prevent unsafe train formations

---

## ⚠️ Problem in UC11

* Input is validated but:

  * ❌ No domain rule enforcement
  * ❌ Unsafe cargo assignments possible
  * ❌ System trusts all data blindly

---

## ⚙️ Solution: Stream Validation + Business Rules

### Safety Rule:

```text
Cylindrical bogie → ONLY Petroleum allowed
```

---

## ⚙️ Features Implemented

* Goods bogie modeling (type + cargo)
* Stream-based validation using `allMatch()`
* Conditional logic enforcement
* Safety result output

---

## 🧠 Concepts Used

### 🔹 allMatch()

```java
.allMatch(b -> condition)
```

---

### 🔹 Lambda Expression

```java
b -> !b.type.equalsIgnoreCase("Cylindrical") || 
     b.cargo.equalsIgnoreCase("Petroleum")
```

---

### 🔹 Short-Circuit Evaluation

* Stops checking as soon as violation is found

---

### 🔹 Business Rule Modeling

* Converts real-world rules → executable logic

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

```text
=== Train Consist Management App ===

Goods Bogies:
Cylindrical -> Petroleum
Box -> Coal
Open -> Grain
Cylindrical -> Petroleum

Train is SAFETY COMPLIANT ✅

System ready for safe train operations...
```

---

## 🚀 Key Learning Outcomes

* Enforce domain rules programmatically
* Use allMatch() for validation
* Apply conditional logic in streams
* Model real-world safety constraints

---

## 🧪 Test Case Coverage

* All valid bogies → safe
* Cylindrical + wrong cargo → unsafe
* Non-cylindrical → flexible
* Mixed valid + invalid → unsafe
* Empty list → safe (no violations)

---

## 🔮 Future Scope

* Add exception handling for violations
* Build validation pipeline
* Integrate passenger + goods system
* Create real-time monitoring dashboard

---

## 📎 Notes

* This is **UC12**, final stage
* Same file name used across branches
* Shift: **Validation → Safety Enforcement**

---

**Built as a complete Java system simulation with real-world constraints.**
