# Login test cases

**Login with valid user** (**Create new valid user from Login page** must be executed first)
1. Navigate to "demoqa.com/login" page.
2. Fill in the "UserName" and "Password" fields with the already registered user.
3. Click on the "Login" button.
4. Verify redirection to "/profile" page.

**Try login with not excisting user**
1. Navigate to "demoqa.com/login" page.
2. Fill in the form with:
    - UserName: ala
    - Password: bala
3. Hit the "Login" button.
4. Verify "Invalid username or password!" red text appears.

**Try login without enteryng password**
1.  Navigate to "demoqa.com/login" page.
2. Fill in the form with:
    - UserName: johndow
    - Pasword: 
3. Hit the "Login" button.
4. Verify the "password" field got red border.