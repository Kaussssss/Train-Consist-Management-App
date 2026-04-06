# 🚆 Train Consist Management App

## 👤 Author

**Kaustubh Chauhan**

---

## 📌 Project Overview

The **Train Consist Management App** simulates railway system operations using Java collections, OOP, streams, and now **input validation using Regular Expressions (Regex)**.

---

## 🎯 Use Case 11: Validate Train ID & Cargo Codes (Regex)

### ✅ Objective

* Validate input formats
* Enforce strict business rules
* Prevent invalid data entry

---

## ⚠️ Problem in UC10

* Data processing works but:

  * ❌ Assumes all inputs are valid
  * ❌ No format validation
  * ❌ Risk of corrupted data

---

## ⚙️ Solution: Regular Expressions (Regex)

Why Regex?

* Enforces strict input format
* Prevents invalid data entry
* Ensures system reliability

---

## ⚙️ Features Implemented

* Train ID validation
* Cargo code validation
* Pattern matching using regex
* User input handling

---

## 🧠 Concepts Used

### 🔹 Regex Patterns

```java
TRN-\\d{4}
PET-[A-Z]{2}
```

---

### 🔹 Pattern Class

```java
Pattern.compile(regex)
```

---

### 🔹 Matcher Class

```java
pattern.matcher(input)
```

---

### 🔹 matches()

```java
matcher.matches()
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

```text
=== Train Consist Management App ===

Enter Train ID (format: TRN-1234): TRN-1234
Enter Cargo Code (format: PET-AB): PET-XY

Train ID is VALID ✅
Cargo Code is VALID ✅

System ready for validated processing...
```

---

## 🚀 Key Learning Outcomes

* Understand regex-based validation
* Use Pattern and Matcher classes
* Enforce strict input formats
* Improve data integrity

---

## 🧪 Test Case Coverage

* Valid Train ID → accepted
* Invalid Train ID → rejected
* Valid Cargo Code → accepted
* Invalid Cargo Code → rejected
* Case sensitivity enforced
* Exact pattern matching ensured
* Empty input handled safely

---

## 🔮 Future Scope

* Add validation for bogie IDs
* Implement input sanitization
* Combine validation + processing pipeline
* Build user-friendly CLI interface

---

## 📎 Notes

* This is **UC11**, extending UC10
* Same file maintained for branch-based workflow
* Shift: **Data processing → Data validation**

---

**Built for robust Java systems with strong input validation.**
