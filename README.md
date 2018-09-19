# DMIT2015 Fall 2018 Term Repository
This repository contains projects for demos, exercises, and assignments.

One time instructions to clone instructor repository
----------------------------------------------------
To clone this repoistory from your VM:
1. Open a Terminal session (Ctrl+Alt+T)
2. From the Terminal session, type the following commands to: create the git directory in your home directory, change the current directory to the git directory, and clone this git repository.

  mkdir -p ~/git
  
  cd ~/git
  
  git clone https://github.com/swunait/dmit2015-fall2018term-repo.git dmit2015-instructor-repository
  
3. Open Eclipse IDE and import the dmit2015-demo project into your workspace as follows:
  1) From menu select "File | Import"
  2) Select "General | Existisng Projects into Workspace" then click Next
  3) Change the root directory to "~/git/dmit2015-instructor-repository/dmit2015-demo" then click Finish.
  
4. Open a browser and login to either github.com or bitbucket.org and create a new private repository for this course named my-dmit2015-repository". Copy the URL of the repository to the clipboard.

5. From the Terminal session, type the following commands to: (Change yourAccountName value with your actual github account name)

  mkdir -p ~/git/my-dmit2015-repository
  
  cp -R dmit2015-instructor-repository/dmit2015-exercises my-dmit2015-repository
  
  cd ~/git/my-dmit2015-repository
  
  mv dmit2015-exercises my-dmit2015-exercises
  
  git init
  
  git add my-dmit2015-exercises
  
  git commit -m "first commit"
  
  git remote add origin https://github.com/yourAccountName/my-dmit2015-repository.git
  
  git push -u origin master
    
6. Open Eclipse IDE and import the my-dmit2015-exercises project into your workspace as follows:
  1) From menu select "File | Import"
  2) Select "General | Existisng Projects into Workspace" then click Next
  3) Change the root directory to "~/git/my-dmit2015-repository/my-dmit2015-exercises" then click Finish. If Eclipse reports errors with your project. Select from menu "Project | Clean" to rebuild your project.
    
Commit and Pushing your changes to your own GIT repository
----------------------------------------------------------
1. From the Terminal session, type the following commands to: 

  cd ~/git/y-dmit2015-repository
  
  git add my-dmit2015-exercises
  
  git commit -m "my commit message"
  
  git push -u origin master
  
 
