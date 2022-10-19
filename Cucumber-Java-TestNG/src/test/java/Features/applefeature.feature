Feature: Apple Airpods Web Page

@SmokeTest
Scenario Outline: Apple Airpods keyword tests

Given user is already on apple website
When title is Apple
Then search for "<airpod>"
When title is AirPods - Apple
Then print welcome to the airpods official webpage

#In Examples the first row should have the variable name defined in above cucumber annotations/steps

Examples:
| airpod|
| airpo |
| AIRPO |  