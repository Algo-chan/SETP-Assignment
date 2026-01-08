`Library Management System 
Git & GitHub Workflow`

1. Group Members
   Name                 	ID	     GitHub Account
   
Muhammad Abdulgefar .... 	DDU1601169 ...... 	Algo-chan

Tamrat Dalasa -----   DDU1600691 -----   Eyhio-byte

Wendayew Fkadu ----- RMD2489	-----     QXQQW

Tsagahun Fikru  ----DDU1600722   -----  tsega45789

Habib Abdu  ----- DDU1501192 -----   Hab199


2. Version Control Steps

# This project uses Git and GitHub to manage the Library Management System code. The workflow ensures collaborative development, proper tracking of changes, and safe merging of new features.

**Step 1:** Initialize Local Repository

Open the project folder in VS Code and initialize Git:

git init


Create a .gitignore file to ignore compiled Java files:

*.class


Stage and commit all initial files:

git add .
git commit -m "Initial commit - Java code generated from UML"

**Step 2:** Link to Remote Repository

#  Create a repository on GitHub and connect it to the local repository:

git remote add origin https://github.com/Algo-chan/LibrarySystem.git
git push -u origin main

**Step 3:** Create a Feature Branch

Create a separate branch for implementing Loan functionality:

git checkout -b LoanManagement

**Step 4:** Implement Features and Commit

# Make changes to the Loan class (methods like borrowBook and returnBook) and add validations. Stage and commit:

git add Loan.java
git commit -m "Complete Loan class with borrow and return functionality"


Push the branch to GitHub:

git push -u origin LoanManagement

**Step 5:** Create Pull Request and Merge On GitHub:

# Open a Pull Request (PR) from LoanManagement to main.

Review and approve the changes.

Merge the PR into the main branch.

**Step 6: Update Local Main Branch**

# After merging, synchronize the local main branch with remote:

git checkout main
git pull origin main
