RS_Task – JDBC with Oracle Database

This repository contains JDBC-based Java tasks created to understand and practice database connectivity between a Java application and an Oracle database.

The project focuses on implementing real JDBC operations such as connecting to the database, executing SQL queries, handling user input, and processing results using best practices.

📌 Project Objective

The main objective of this project is to:

Learn how Java applications connect to Oracle Database using JDBC

Understand JDBC architecture and flow

Practice CRUD operations using SQL

Handle database resources properly

Gain real-world experience with Java + Oracle integration

🏗 Project Structure
RS_Task
│
├── src/
│   ├── Task1/
│   ├── Task2/
│   ├── Task3/
│   ├── Task8/
│   │   └── Main.java
│
├── README.md
└── .gitignore


Each TaskX folder represents an independent JDBC task, such as:

Establishing database connection

Inserting records

Fetching data using queries

Filtering data based on user input

Handling exceptions and resources

🧠 Technologies Used

Java (Core Java)

JDBC (Java Database Connectivity)

Oracle Database

SQL

IntelliJ IDEA

Git & GitHub

🔗 JDBC Concepts Covered

This project covers the following JDBC concepts:

JDBC Driver loading

DriverManager and Connection

Statement and PreparedStatement

ResultSet and ResultSetMetaData

Executing SELECT, INSERT, UPDATE queries

Handling user input for database queries

Exception handling (SQLException)

Closing resources properly

⚙️ Database Configuration

Before running the project, ensure:

Oracle Database is installed and running

Required tables are created

Oracle JDBC Driver (ojdbc) is added to the project classpath

Example Connection Details (sample):
String url = "jdbc:oracle:thin:@localhost:1521:xe";
String username = "system";
String password = "oracle";


⚠️ Update credentials based on your local database setup.

▶️ How to Run the Project

Clone the repository:

git clone https://github.com/Mahesh-Nikas/RS_Task.git


Open the project in IntelliJ IDEA

Add Oracle JDBC Driver to the project:

File → Project Structure → Libraries → Add ojdbc.jar

Open any task:

src → TaskX → Main.java


Run the Main.java file

🎯 Learning Outcome

By working on this project, you will gain:

Strong understanding of JDBC workflow

Hands-on experience with Oracle SQL from Java

Confidence in writing database-driven Java applications

Practical Git and GitHub usage experience

Better preparation for Java/JDBC interview questions

🚧 Work in Progress

This repository is continuously updated as more JDBC tasks are practiced and improved.
Code may be refactored to improve performance and readability.

👤 Author

Mahesh Nikas
Java Developer (JDBC & Oracle – Learner)

GitHub:
https://github.com/Mahesh-Nikas
