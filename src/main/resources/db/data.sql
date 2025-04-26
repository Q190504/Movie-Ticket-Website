INSERT INTO Movie (title, genre, ticket_price)
VALUES ('Gai Con Vượt Ngàn Chông Gai The Movie', 'Documentary', 220);

INSERT INTO SeatRepository (movie_id, row_nums, column_nums)
VALUES (1, 10, 10);

-- Insert Seats for a 10x10 layout (rows: 10, columns: 10)
INSERT INTO Seat (seat_name, row_label, col_number, is_available, cancel_code)
VALUES 
    ('A1', 'A', 1, 1, NULL), ('A2', 'A', 2, 1, NULL), ('A3', 'A', 3, 1, NULL), ('A4', 'A', 4, 1, NULL), ('A5', 'A', 5, 1, NULL),
    ('A6', 'A', 6, 1, NULL), ('A7', 'A', 7, 1, NULL), ('A8', 'A', 8, 1, NULL), ('A9', 'A', 9, 1, NULL), ('A10', 'A', 10, 1, NULL),
    ('B1', 'B', 1, 1, NULL), ('B2', 'B', 2, 1, NULL), ('B3', 'B', 3, 1, NULL), ('B4', 'B', 4, 1, NULL), ('B5', 'B', 5, 1, NULL),
    ('B6', 'B', 6, 1, NULL), ('B7', 'B', 7, 1, NULL), ('B8', 'B', 8, 1, NULL), ('B9', 'B', 9, 1, NULL), ('B10', 'B', 10, 1, NULL),
    ('C1', 'C', 1, 1, NULL), ('C2', 'C', 2, 1, NULL), ('C3', 'C', 3, 1, NULL), ('C4', 'C', 4, 1, NULL), ('C5', 'C', 5, 1, NULL),
    ('C6', 'C', 6, 1, NULL), ('C7', 'C', 7, 1, NULL), ('C8', 'C', 8, 1, NULL), ('C9', 'C', 9, 1, NULL), ('C10', 'C', 10, 1, NULL),
    ('D1', 'D', 1, 1, NULL), ('D2', 'D', 2, 1, NULL), ('D3', 'D', 3, 1, NULL), ('D4', 'D', 4, 1, NULL), ('D5', 'D', 5, 1, NULL),
    ('D6', 'D', 6, 1, NULL), ('D7', 'D', 7, 1, NULL), ('D8', 'D', 8, 1, NULL), ('D9', 'D', 9, 1, NULL), ('D10', 'D', 10, 1, NULL),
    ('E1', 'E', 1, 1, NULL), ('E2', 'E', 2, 1, NULL), ('E3', 'E', 3, 1, NULL), ('E4', 'E', 4, 1, NULL), ('E5', 'E', 5, 1, NULL),
    ('E6', 'E', 6, 1, NULL), ('E7', 'E', 7, 1, NULL), ('E8', 'E', 8, 1, NULL), ('E9', 'E', 9, 1, NULL), ('E10', 'E', 10, 1, NULL),
    ('F1', 'F', 1, 1, NULL), ('F2', 'F', 2, 1, NULL), ('F3', 'F', 3, 1, NULL), ('F4', 'F', 4, 1, NULL), ('F5', 'F', 5, 1, NULL),
    ('F6', 'F', 6, 1, NULL), ('F7', 'F', 7, 1, NULL), ('F8', 'F', 8, 1, NULL), ('F9', 'F', 9, 1, NULL), ('F10', 'F', 10, 1, NULL),
    ('G1', 'G', 1, 1, NULL), ('G2', 'G', 2, 1, NULL), ('G3', 'G', 3, 1, NULL), ('G4', 'G', 4, 1, NULL), ('G5', 'G', 5, 1, NULL),
    ('G6', 'G', 6, 1, NULL), ('G7', 'G', 7, 1, NULL), ('G8', 'G', 8, 1, NULL), ('G9', 'G', 9, 1, NULL), ('G10', 'G', 10, 1, NULL),
    ('H1', 'H', 1, 1, NULL), ('H2', 'H', 2, 1, NULL), ('H3', 'H', 3, 1, NULL), ('H4', 'H', 4, 1, NULL), ('H5', 'H', 5, 1, NULL),
    ('H6', 'H', 6, 1, NULL), ('H7', 'H', 7, 1, NULL), ('H8', 'H', 8, 1, NULL), ('H9', 'H', 9, 1, NULL), ('H10', 'H', 10, 1, NULL),
    ('I1', 'I', 1, 1, NULL), ('I2', 'I', 2, 1, NULL), ('I3', 'I', 3, 1, NULL), ('I4', 'I', 4, 1, NULL), ('I5', 'I', 5, 1, NULL),
    ('I6', 'I', 6, 1, NULL), ('I7', 'I', 7, 1, NULL), ('I8', 'I', 8, 1, NULL), ('I9', 'I', 9, 1, NULL), ('I10', 'I', 10, 1, NULL),
    ('J1', 'J', 1, 1, NULL), ('J2', 'J', 2, 1, NULL), ('J3', 'J', 3, 1, NULL), ('J4', 'J', 4, 1, NULL), ('J5', 'J', 5, 1, NULL),
    ('J6', 'J', 6, 1, NULL), ('J7', 'J', 7, 1, NULL), ('J8', 'J', 8, 1, NULL), ('J9', 'J', 9, 1, NULL), ('J10', 'J', 10, 1, NULL);
