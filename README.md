Version Control Using Git and GitHub – Step-by-Step Commands

Initialize Local Repository

Open the project in VS Code and initialize a local Git repository. This sets up Git tracking in your project folder:

**git init**

Create a .gitignore File

Add a .gitignore file to exclude compiled Java files (*.class) and other unnecessary files from version control.

Stage and Commit Initial Files

Add all project files to Git and commit them as the initial version:

**git add .
git commit -m "Initial commit - Java code generated from UML"**

Link to Remote GitHub Repository

Create a repository on GitHub and link it to your local repository:

**git remote add origin https://github.com/YourUsername/LibrarySystem.git**
**git push -u origin main**

Create a Feature Branch

For implementing the Loan functionality, create a separate branch:

**git checkout -b LoanManagement**

Make Changes, Stage, and Commit

Implement the Loan class functionality and add validations. Stage and commit the changes:

**git add Loan.java**
**git commit -m "updated code"**

Push Feature Branch to GitHub

Push the newly created branch to GitHub for collaboration or PR creation:

**git push -u origin LoanManagement**


Create a Pull Request and Merge

On GitHub, open a Pull Request from LoanManagement to main, review the changes, and merge after approval.

Update Local Main Branch

After merging, pull the latest changes to your local main branch:

**git checkout main
git pull origin main**
