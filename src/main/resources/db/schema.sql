CREATE database IF NOT EXISTS cinema;

use cinema;

-- Movies table
CREATE TABLE IF NOT EXISTS Movie (
                                     movie_id     INTEGER PRIMARY KEY AUTO_INCREMENT,
                                     title        TEXT    NOT NULL,
                                     genre        TEXT,
                                     ticket_price REAL    NOT NULL
);

-- Seats table
-- seat “id” (e.g. 'A1')
CREATE TABLE IF NOT EXISTS Seat (
                                    seat_id     INTEGER PRIMARY KEY AUTO_INCREMENT,
                                    seat_name 	TEXT NOT NULL CHECK(length(seat_name) = 3),
    row_label   TEXT    NOT NULL CHECK(length(row_label) = 1),
    col_number  INTEGER NOT NULL,
    is_available INTEGER NOT NULL DEFAULT 1 CHECK (is_available IN (0, 1)),    -- 1 = available, 0 = sold/blocked
    cancel_code TEXT
    );

-- Tickets table
-- Each ticket refers to exactly one movie and one seat.
CREATE TABLE IF NOT EXISTS Ticket (
                                      ticket_id     INTEGER PRIMARY KEY AUTO_INCREMENT,
                                      movie_id      INTEGER NOT NULL,
                                      seat_id       INTEGER NOT NULL,
                                      FOREIGN KEY (movie_id) REFERENCES Movie(movie_id)
    ON DELETE CASCADE
    ON UPDATE NO ACTION,
    FOREIGN KEY (seat_id)  REFERENCES Seat(seat_id)
    ON DELETE RESTRICT
    ON UPDATE NO ACTION,
    UNIQUE (movie_id, seat_id) -- prevents duplicate tickets for the same seat & movie
    );

-- SeatRepository table
CREATE TABLE IF NOT EXISTS SeatRepository (
                                              id INTEGER PRIMARY KEY AUTO_INCREMENT,
                                              movie_id INTEGER NOT NULL,
                                              row_nums INTEGER NOT NULL,
                                              column_nums INTEGER NOT NULL,
                                              FOREIGN KEY (movie_id) REFERENCES Movie(movie_id)
    );