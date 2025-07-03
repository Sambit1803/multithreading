# Spring Boot Multithreading Project

This project was created as a **learning exercise** to understand and implement **multithreading in Spring Boot** applications.

## ✨ What It Does

- How to use `ReentrantLock` to control access to a shared resource (`counter`)
- Thread-safe increment operation with explicit lock acquire/release
- Simulating long-running tasks using `Thread.sleep()`
- Logging to show thread behavior

## 🛠️ Tech Stack

- Java
- Spring Boot

## 📘 API Endpoints

- `GET /increment?name=Thread-1` — Triggers counter increment under lock
- `GET /counter` — Returns the current value of the counter

## 🔁 Sample Flow

```bash
curl "http://localhost:8080/increment?name=Thread-1"
curl "http://localhost:8080/increment?name=Thread-2"
```

## 📚 Purpose

This repository is intended **for educational purposes only**. It helps in learning how to manage concurrent tasks, create threads, and handle synchronization in a Spring Boot environment.

## 👨‍💻 Author

**Sambit Pati**  
🔗 [LinkedIn](https://www.linkedin.com/in/sambit1803/)  
📧 sambitsipun@gmail.com
