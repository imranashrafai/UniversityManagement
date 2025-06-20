# University Management System (Java Desktop Application)

## Overview

The **University Management System** is a Java-based desktop application designed to manage academic and administrative operations within a university or college setting. Built using Java and Swing for the GUI, the system streamlines processes such as student and teacher management, fee handling, exam records, and leave applications. This modular, object-oriented application offers a user-friendly interface to enhance institutional efficiency and digitalization.

## Features

### 👨‍🎓 Student Management
- Add, update, and view student details
- Submit and manage student fee records
- View examination results and mark sheets
- Apply for student leave and view leave status

### 👩‍🏫 Teacher Management
- Add, update, and view teacher details
- Manage teacher leave requests
- Access subject allocation and examination responsibilities

### 🧾 Fee & Examination Modules
- Define and update fee structure
- Record and manage student fee payments
- Enter and update marks for examinations
- Maintain detailed exam and results history

### 🔐 Authentication & Dashboard
- Secure login system for authenticated access
- Role-based dashboard interface (Admin, Student, Teacher)
- Modular access to key functionalities

### 📊 Additional Features
- Comprehensive GUI using Java Swing
- JDBC-based connectivity with relational database
- Modular structure with over 20 Java classes for maintainability

## Project Structure

```plaintext
├── AddStudent.java
├── AddTeacher.java
├── Conn.java
├── DashBoard.java
├── EnterMarks.java
├── ExaminationDetails.java
├── FeeStructure.java
├── Login.java
├── Marks.java
├── MyUni.java
├── StudentDetails.java
├── StudentFeeForm.java
├── StudentLeave.java
├── StudentLeaveDetails.java
├── TeacherDetails.java
├── TeacherLeave.java
├── TeacherLeaveDetails.java
├── UpdateStudent.java
├── UpdateTeacher.java
└── About.java
```
## Technologies Used
- Java SE (JDK 8 or above)
- Java Swing for GUI design
- JDBC for database connectivity
- MySQL

## How to Run
# 1. Clone the Repository:
```bash
git clone https://github.com/imranashrafai/UniversityManagement.git
cd UniversityManagement
```
# 2. Configure Database:
- Set up a MySQL or SQLite database and Database in zip format is available in db Folder.  
- Update {Conn.java} with your DB credentials
# 3. Compile and Run:
- Use any Java IDE (e.g., IntelliJ IDEA, Eclipse, NetBeans)
- Or run via terminal:
  
```bash
  javac *.java
  java MyUni
```
## License
This project is licensed under the MIT License.

### Developer
Imran Ashraf
📧 [Email](mailto:imranashraf0k@gmail.com)
🔗 [LinkedIn](https://www.linkedin.com/in/imranashrafai/)
