Feature: Data driven smoke test for facebook login page

Scenario Outline: Test facebook login for set of username and password
  Given Open a "<browserName>" browser and launch facebook login page
  When I enter "<username>" and "<password>"
  Then "<username>" must able to land on the home page

    Examples: 
      | browserName | username                   | password        |
      | chrome      | deepaksharma@gmail.com     | tryingtologin   |
      | firefox     | selenium@example.com       | onemorepassword |
      | CHROME      | urvashideepak@sasp.com     | iloveyou        |
      | FireFox     | urvashideepakkkk@sasp.com  | iloveyouonly    |
