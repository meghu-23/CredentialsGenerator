# Credentials Generator (Java)

This is a simple Java console application that generates an email ID and a secure password for users based on their name and department.

## 🔧 Features

- Auto-generates email in the format: `firstname + lastname @ department.skit.ac.in`
- Secure random password with:
  - 1 Uppercase letter
  - 1 Lowercase letter
  - 1 Digit
  - 1 Special character
- Password characters are shuffled for better randomness

## 🖥️ Departments Supported

1. CSE  
2. ISE  
3. AIML  
4. Mechanical  

If invalid input is given, defaults to `general`.

## 📦 How to Run

```bash
javac CredentialsGenerator.java
java CredentialsGenerator
