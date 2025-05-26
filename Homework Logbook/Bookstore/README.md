Book Class is the base class.
Fields: ISBN, title, price, author
Method: display() - Prints the book details

PrintedBook Class represents physical books
- Extra Fields:
  - isHardcover: Boolean indicating hardcover/paperback
  - pages: Number of pages
  - publisher: Publishing house
  - availableCopies: How many copies are available in stock
- Overrides display() to include printed book-specific details.

DigitalBook Class represents eBooks
Represents eBooks.
- Field: sizeKB – Size of the digital file in kilobytes
- Overrides display() to include digital format info.

AudioBook Class represents books in audio format.
- Fields:
  - durationMinutes: Total length of audio in minutes
  - narrator: Person reading the book
- Overrides display() to include audiobook-specific info.

Bookstore Class is the main method which demonstrates the creation and usage of all book types.

1. An array of 5 books is created containing:
   - 2 PrintedBooks
   - 2 DigitalBooks
   - 1 AudioBook
2. A loop checks the type of each book using instanceof and calls the appropriate display() method.




