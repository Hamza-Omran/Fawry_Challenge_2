# Bookstore – Java Console App

This is a Java-based console application that simulates a simple bookstore. It allows adding books, listing them, and purchasing different types like paper books, eBooks, and demo books (which are not for sale). The project demonstrates core object-oriented programming principles such as inheritance, abstraction, and interfaces.

---

## Project Overview

The goal of this project is to simulate a bookstore system while practicing Java OOP concepts. We've also included mock services for shipping and email delivery, depending on the type of book being purchased.

---

## Project Structure

The project is organized into four main packages:

### 1. `com.mycompany.booksstore`
- `bookstore.java`: Main method for running and testing the system. It creates sample books, adds them to the inventory, and simulates purchases.
- `clsInventory.java`: Manages the list of books. Supports adding books, printing inventory, buying books, and handling logic for book types and availability.

### 2. `com.mycompany.booksstore.ShippmentService`
- `clsShipmmentService.java`: A simple class that simulates the shipping process for paper books.

### 3. `EmailService`
- `clsEmailService.java`: Simulates sending an email with an eBook purchase.

### 4. `com.mycompany.booksstore.Books`
- `clsBook`: Abstract base class for all book types.
- `clsPaidBook`: Abstract class for books that can be purchased.
- `clsPaperBook`: Represents a physical book with quantity control and shipping.
- `clsEBook`: Represents an electronic book, delivered by email.
- `clsDemoBook`: Represents books for showcase only (not for sale).
- Interfaces:
  - `interQuantityBook` – For books with limited quantity (paper books)
  - `interEFile` – For books with downloadable file types (eBooks)
  - `interNotForSale` – Marks books as not available for purchase

---

## Class Hierarchy

Below is the hierarchy showing how classes extend and implement each other:

```

\[clsBook] (abstract)
│
├── \[clsPaidBook] (abstract)
│   │
│   ├── clsPaperBook
│   │     └── implements interQuantityBook
│   │
│   └── clsEBook
│         └── implements interEFile
│
└── clsDemoBook
└── implements interNotForSale

```

**Services:**

```

clsShipmmentService
└── Accepts clsBook and simulates physical delivery

clsEmailService
└── Accepts clsBook and simulates email delivery

```

**Interfaces:**

- `interQuantityBook` – defines quantity management (used by `clsPaperBook`)
- `interEFile` – defines file-related behavior (used by `clsEBook`)
- `interNotForSale` – marker interface (used by `clsDemoBook`)

---

## Features

- Add books of different types to an inventory.
- Print detailed information about all books in the inventory.
- Buy books and simulate either shipping or email delivery based on book type.
- Handle invalid or not-for-sale purchases gracefully.
- Track and reduce quantity for paper books.

---

## How to Run the Project

1. Clone or download the repository.
2. Open the project in NetBeans or any compatible Java IDE.
3. Run `bookstore.java`.
4. The application will:
   - Add several books to the inventory
   - Print the full inventory
   - Simulate buying some books
   - Print the updated inventory again

---

## Screenshots

Add your console output screenshots to a `screenshots/` folder and reference them like below.

### 1st Image
`(Output Screenshots/1.png)`

### 2nd Image
`(Output Screenshots/2.png)`

### 3rd Image
`(Output Screenshots/3.png)`

### 4th Image
`(Output Screenshots/4.png)`

### 5th Image
`(Output Screenshots/5.png)`

---
