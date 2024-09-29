# Profile interactions test cases

**Buy a book**
1. Run **Login with valid user** (Login TCs) test to login.
2. Navigate to "/books" page.
3. Click on "You Don't Know JS" book.
4. Ensure you are redirected to another page.
5. Buy the book.
6. Validate successfull message appears.

**Delete all books**
1. Run **Login with valid user**
2. Go to "/books" page.
3. Buy 2 books- "Learning JavaScript Design Patterns" and "Git Pocket Guide".
4. Navigate back to "/profile" page.
5. Validate the 2 books are displayed in the table.
6. Click the "Delete All Books" button.
7. Validate there are no books listed in the table.

**Delete Account** (runs after every login with valid user tests)
1. Run **Login with valid user**.
2. Click on the "Delete Account" button.
3. Ensure "User Deleted." message appears in the alert window.
4. Try to login agian with the already deleted user.
5. Validate "Invalid username or password!" message appears after clicking the "Login" button.