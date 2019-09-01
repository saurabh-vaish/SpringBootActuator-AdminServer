# SpringBootActuator-AdminServer
spring boot actuator server for monitoring depoly on Heroku server

To deploy app on heroku :- 
1. create an account on heroku 
2. download heroku cli and git cli (if not) then install
3. make a spring boot actuator admin project 
4. make an repo with same name as project and push it 
5. go to project location , open git cli
6. define commands : heroku login --- it will open a browser login into cli
7. after login go to herolu website , login and click on create app
8. define name for app and create 
9. now go to git cli 
If you haven't already, log in to your Heroku account and follow the prompts to create a new SSH public key.

$ heroku login

Clone the repository (not neccassary if already updated)

Use Git to clone  source code to your local machine.

$ heroku git:clone -a reponame
$ cd repo name [not neccassry if u r already in git master folder]

Deploy your changes

Make some changes to the code you just cloned and deploy them to Heroku using Git.

$ git add .
$ git commit -am "make it better"
$ git push heroku master
