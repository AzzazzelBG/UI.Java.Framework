# Registraion form test cases

**Create new valid user from Login page**
1. Depends on **Open the Book store login page** (should be executed first)
2. Click the "New User" button.
3. Fill-in the form with valid data:
    - firstName: John
    - lastName: Dow
    - userName: johndow
    - password: Johnd0w!2
4. Handle the captcha checkbox.
5. Click on "Register" button.
6. Verify alert popup with text "User Register Successfully.".

**Try to create user with short password**
1. Execute **Open the Book store login page**
2. Click the "New User" button.
3. Fill-in the form with invalid password:
    - firstName: Baj
    - lastName: Ivan
    - userName: bajivan
    - password: baj
4. Handle the captcha checkbox.
5. Click on "Register" button.
6. Verify a red error message starting with "Passwords..." appears.

**Try to create a user without all fileds filled-in**
1. **Open the Book store login page**
2. Click the "New User" button.
3. Fill-in the form with missing field for first name:
    - firstName: 
    - lastName: Ivan
    - userName: bajivan
    - password: baj
4. Handle the captcha checkbox.
5. Verify the "Firs Name" input field has red boarder.


