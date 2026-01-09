# RS_Task – JDBC with Oracle Database

A hands-on JDBC project covering database connectivity between Java applications and Oracle Database through 8 practical tasks.

---

## About This Project

This repository contains 8 JDBC tasks that I created while learning how to connect Java applications with Oracle Database. Each task focuses on different aspects of database operations - from basic connection setup to handling complex queries with user input.

The project follows a step-by-step approach, making it easier to understand JDBC concepts through practical implementation.

---

## What You'll Learn

- How to connect Java applications with Oracle Database
- JDBC architecture and workflow
- Performing CRUD operations (Create, Read, Update, Delete)
- Handling database resources properly
- Working with PreparedStatement to prevent SQL injection
- Managing exceptions and closing connections safely

---

## Project Structure

```
RS_Task/
│
├── src/
│   ├── Task1/          → JDBC Connection Setup
│   ├── Task2/          → Insert Records into Database
│   ├── Task3/          → Fetch Data using SELECT Query
│   ├── Task4/          → Fetch Multiple Records using ResultSet
│   ├── Task5/          → PreparedStatement Usage
│   ├── Task6/          → User Input Based Query Execution
│   ├── Task7/          → Exception Handling & Resource Management
│   └── Task8/          → Complete JDBC Flow (End-to-End)
│
├── README.md
└── .gitignore
```

---

## Task Details

### Task 1: JDBC Connection Setup
Learn how to establish a connection with Oracle Database using JDBC Driver, DriverManager, and Connection object.

### Task 2: Insert Records into Database
Practice inserting data into database tables using Statement and PreparedStatement.

### Task 3: Fetch Data using SELECT Query
Retrieve data from database and access column values using ResultSet.

### Task 4: Fetch Multiple Records using ResultSet
Learn to iterate through multiple records returned by a SELECT query.

### Task 5: PreparedStatement Usage
Use parameterized queries to prevent SQL injection and make your code more secure.

### Task 6: User Input Based Query Execution
Take user input using Scanner class and execute dynamic queries based on that input.

### Task 7: Exception Handling & Resource Management
Properly handle SQLException and close database resources using try-catch-finally blocks.

### Task 8: Complete JDBC Flow (End-to-End)
Build a complete application that demonstrates the entire JDBC workflow from connection to query execution.

---

## Technologies Used

- **Java** - Core programming language
- **JDBC** - Java Database Connectivity API
- **Oracle Database** - Database management system
- **SQL** - Structured Query Language
- **IntelliJ IDEA** - IDE for development
- **Git & GitHub** - Version control

---

## Database Setup

Before running the tasks, make sure you have:

1. Oracle Database installed and running on your system
2. Created the required tables in your database
3. Downloaded Oracle JDBC Driver (ojdbc.jar)

### Connection Configuration

Here's how the database connection is configured:

```java
String url = "jdbc:oracle:thin:@localhost:1521:xe";
String username = "system";
String password = "oracle";

Connection connection = DriverManager.getConnection(url, username, password);
```

Make sure to update the username, password, and database URL according to your setup.

---

## How to Run

**Step 1: Clone the repository**
```bash
git clone https://github.com/Mahesh-Nikas/RS_Task.git
cd RS_Task
```

**Step 2: Open in IntelliJ IDEA**
- Launch IntelliJ IDEA
- Click on "Open" and select the project folder

**Step 3: Add JDBC Driver**
- Go to File → Project Structure → Libraries
- Click the + button and add your ojdbc.jar file

**Step 4: Run a task**
- Navigate to src → TaskX → Main.java
- Right-click on Main.java and select "Run"

---

## Key JDBC Concepts Covered

**Core Components:**
- Loading and registering JDBC driver
- Creating database connections with DriverManager
- Using Statement vs PreparedStatement
- Working with ResultSet to process query results

**Database Operations:**
- Executing SELECT queries to retrieve data
- INSERT operations to add new records
- UPDATE operations to modify existing data
- Passing parameters safely to SQL queries

**Best Practices:**
- Handling SQLException properly
- Closing database connections, statements, and result sets
- Preventing SQL injection attacks
- Writing clean and maintainable code

---

## What I Learned

Working through these 8 tasks helped me:

- Understand how JDBC connects Java with databases
- Get comfortable writing SQL queries in Java
- Learn to handle database errors and exceptions
- Build confidence in creating database-driven applications
- Prepare better for technical interviews

---

## Current Status

This project is actively maintained as I continue learning. I regularly update the code to:
- Add new tasks and examples
- Improve code quality and structure
- Fix any issues or bugs
- Apply better practices as I learn them

---

## Contributing

If you find any issues or have suggestions for improvement:
- Open an issue on GitHub
- Submit a pull request
- Share your feedback

All contributions are welcome!

---

## Author

**Mahesh Nikas**  
Java Developer | Learning JDBC & Oracle

GitHub: [github.com/Mahesh-Nikas](https://github.com/Mahesh-Nikas)

---

