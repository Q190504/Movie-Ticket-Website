# Movie Ticket Website

---

# LAB 1 - SE334: PROGRAMMING PARADIGMS - UIT, VNUHCM

---

## Project Information

* Name: Movie Ticket Website
* Author: Huynh Tran Khanh Quynh - 22521230
* Instructor: PhD. Nguyen Duy Khanh

---

## Submission

* GitHub Repository: [Movie Ticket Website](https://github.com/Q190504/Movie-Ticket-Website)
* Acknowledgement: The project utilized ChatGPT to support UI arrangement and CSS, code cleaning and formatting, as well as documentation.

---

## Overview

A web-based cinema ticket booking system built with **Java Spring Boot**, **MySQL**, and **Thymeleaf**. This project demonstrates robust concurrency management, allowing multiple users to book tickets simultaneously while preventing double-booking through synchronized thread control.

---

## Features

- Real-time seat selection with per-ticket granularity
- Prevents double-booking of seats using thread-safe logic
- Cancel ticket using a unique cancellation code
- Multithreaded backend handles concurrent user actions safely

---

## Tech Stack

* Java Spring Boot   
* Thymeleaf Templates
* MySQL              

---

## Getting Started

1. **Clone the repository**
   ```bash
   git clone https://github.com/yourusername/movie-ticket-website.git
   cd movie-ticket-website
   ```

2. **Set up the MySQL database**
    - Create a new database (e.g., `cinema`)
    - **Import the provided `schema.sql`** file to set up the schema and tables

3. **Configure database connection**
   In the `DatabaseConnection` class, update the following with your credentials:
   ```java
   private static final String URL = "jdbc:mysql://localhost:your/database/link";
   private static final String USER = "your_username";
   private static final String PASSWORD = "your_password";
   ```

4. **Run the application and access the website**
   ```
   http://localhost:8080
   ```

---

## Usage Guidelines

### ⓘ Notes

- **Single-instance only**: The app is designed to run **only one instance at a time**. In-app thread locks ensure safe concurrency. Running multiple instances may result in conflicts or corrupted state.
- **Use in-app navigation**: Do **not manually change the browser URL** to navigate between pages. Use only the buttons provided by the app to avoid breaking the internal state.
- **Database setup**: Import the `schema.sql` file before running the app, and configure your database credentials in the `DatabaseConnection` class.

---

## Database Design

### 1. Movie

   Contains information about the movies being shown:

* `movie_id`: Primary key
* `title`: Movie name
* `genre`: Movie genre
* `ticket_price`: ticket price

### 2. Seat

Manage each seat in the screening room:

* `seat_id`: Primary key
* `seat_name`: Seat name (eg: A1, B2)
* `row_label`: Position in row (A, B,...)
* `col_number`: Position in column (1, 2,...)
* `is_available`: Status (available/booked)

### 3. SeatRepository

Manage seats in the screening room:

* `id`: Primary key
* `movie_id`: Foreign key linking to the `Movie` table
* `row_nums`: Total rows
* `col_nums`: Total columns
