# predictor-tool
Tool to predict weekly matchup results and final season standings in my 30 team NBA dynasty league

![screen shot 2017-02-23 at 3 06 14 pm](https://cloud.githubusercontent.com/assets/25812226/23283801/41b1a16c-f9e5-11e6-8da3-196652cefc96.png)

# Motivation
Playing Fantasy sports is one of my passions. I am involved in multiple leagues, one of which mimics the real life NBA setup
of 30 teams.
Teams make trades among each other but there is no yardstick available to measure the winner or looser of that trade, specific to the
league settings. I thought to myself, what if there is a tool which can quantify these actions in terms of numbers.
If I have such a utility with me, I can evaluate player values and make trades that are to my advantage, or if a trade is offered to me,
quantify if the transaction is beneficial. 
While working on it, I saw the potentinal of using that framework to do other things like predicting a weekly matchup, 
and eventually used the weekly results and extrapolated them to season wise results.

# What does it do?

1. It evaluates the the trade between 2 parties to give a perspective in terms of numbers to tell who won and lost a trade
1. It predicts the winner of a particular matchup based upon the player stats and number of games in the week
1. It predicts the final season ending stats based on the current roster setup and the schedule in terms of opponents for entire season

# How to run it?
##Locally

1. Download the project
1. Set it up as a Java project in eclipse ( JDK 1.5 or above )
1. Use the Lowry.xls file inside test folder and copy it anywhere on your system
1. Use the downloaded location path and update the value of excelFilePath and excelOutFilePath variable inside XLFunctions.java
1. Run UpdateSheets - This will update all 30 teams rosters based on the master sheet in the excel file
1. Run UpdateWeeklyRosters - This will load the weekly schdule of teams from Games sheet and generate a section of weekly stats
1. Run UpdateWeeklyMatchups - This will predict weekly results for each team based on thier opponent for that week into the Notes sheet

##Distributed environment (Docker & DockerCompose)
coming soon.....

# Future Enhacements

1. Convert this project into a standalone utility with a desktop UI
1. Configurations to be done through the UI
1. Update the excel sheet automatically through code instead of updating the sheets manually by integrating with the league website
1. Exposing it as a web service to allow easy access to results
