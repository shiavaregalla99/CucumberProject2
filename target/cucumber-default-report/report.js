$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/Features/loginDataDriven.feature");
formatter.feature({
  "name": "Login Functionality with data driven",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Login with invalid Credentials",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@Smoke"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "User enters invalid Usernmae and invalid password and see error message",
  "rows": [
    {},
    {},
    {}
  ],
  "keyword": "When "
});
formatter.match({
  "location": "com.xyz.hrms.Steps.LoginSteps.user_enters_invalid_Usernmae_and_invalid_password_and_see_error_message(io.cucumber.datatable.DataTable)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});