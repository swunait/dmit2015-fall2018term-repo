DMIT2015 Fall 2018 Term Repository
==================================
This repository contains projects for demos, exercises, and assignments.
From your VM you can manage GIT repositories using either commands from a Terminal session or using the Eclipse IDE.

Cloning a remote repository using GIT commands
----------------------------------------------
To clone this repository using commands from your VM:
1. Open a Terminal session (Ctrl+Alt+T)
2. From the Terminal session, type the following commands:

	mkdir -p ~/git
	cd ~/git
	git clone https://github.com/swunait/dmit2015-fall2018term-repo.git dmit2015-instructor-repository

Eclipse IDE - Importing Existing Projects
-----------------------------------------
To import an existing project to your Eclipse IDE workspace:
1.	Open Eclipse IDE and from the menu select `File | Import`.
2.	The import dialog opens. Select `General | Existing Projects into` then click `Next`.
3.	Change the root directory to `~/git/my-dmit2015-repository/dmit2015-demo` then click `Finish`.

Creating a local repository using GIT commands
----------------------------------------------
To create a local repository to store all your projects in your VM:
1.  Open a browser and navigate your remote GIT repository provider (ex. github.com) and create a new private repository named `my-dmit2015-repository`. 
Copy the URL of the GIT repository to the clipboard.
2.	Open a Terminal session (Ctrl+Alt+T)
3.	From the Terminal session, type the following commands:

	mkdir -p ~/git/my-dmit2015-repository
	cd ~/git/my-dmit2015-repository
	git init
	git remote add origin https://github.com/yourAccountName/my-dmit2015-repository.git


Committing and Pushing a project using GIT commands
---------------------------------------------------
To commit and push a project to your own private GIT repository using GIT commands:
1. Open a Terminal session (Ctrl+Alt+T)
2. From the Terminal session, type the following commands:

	cd ~/git/my-dmit2015-repository
	git add your-project-name
	git commit -m "my commit message"
	git remote add origin https://github.com/yourAccountName/my-dmit2015-repository.git
	git push
	
Committing and Pushing a project using Eclipse IDE
---------------------------------------------------
To commit and push a project to your own private GIT repository using the Eclipse IDE:
1. 	In Project Explorer view, right-mouse click on your project name and select from the context menu `Team | Commit`
2.	In the `GIT Staging` view, drag the files you to commit/push `Unstaged Changes` to `Staged Changes`
3.	Enter a commit message.
4.	Click on `Commit and Push...`

Fetching and downloading content from a remote repository using Eclipse IDE
-----------------------------------------------------------------------------
To download new content from a remote using the Eclipse IDE:
1. 	In Project Explorer view, right-mouse click on your project name and select from the context menu `Team | Push`

