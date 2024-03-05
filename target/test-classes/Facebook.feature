Feature: To validate the login functionality of Facebook application

Scenario: To validate Signin with valid email or phone number and invalid password
Given To laucnch the firefox browser and maximize the window
When To launch the url of Facebook application

#Two dimensional map data
And To pass valid Email or mobile phone number in text box
| row/column  |             A                 | B   | 
| 1           |priyanAbisha2123@gmail.com     |9765321032| 
| 2           |shanmugapriyan2352002@gmail.com     |1234567890|


#One dimensioanl map data
And To pass valid password in Password text box
|password1|shan@1234|
|password2|efgh254300|
|password3|ijkl78945|

And To check whether navigate the homepage or not
Then To close the browser

