$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/Features/customerRegistration.feature");
formatter.feature({
  "name": "Customer Registration",
  "description": "",
  "keyword": "Feature"
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "user is on marketplace",
  "keyword": "Given "
});
formatter.match({
  "location": "stepDefinition.customerRegistrationStep.user_is_on_marketplace()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "To verify Customer Registration with Email",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "user click on email",
  "keyword": "When "
});
formatter.match({
  "location": "stepDefinition.customerRegistrationStep.user_click_on_email()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enter firstname",
  "keyword": "And "
});
formatter.match({
  "location": "stepDefinition.customerRegistrationStep.user_enter_firstname()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enter lastname",
  "keyword": "And "
});
formatter.match({
  "location": "stepDefinition.customerRegistrationStep.user_enter_lastname()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enter number",
  "keyword": "And "
});
formatter.match({
  "location": "stepDefinition.customerRegistrationStep.user_enter_number()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enter emailid",
  "keyword": "And "
});
formatter.match({
  "location": "stepDefinition.customerRegistrationStep.user_enter_emailid()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enter password",
  "keyword": "And "
});
formatter.match({
  "location": "stepDefinition.customerRegistrationStep.user_enter_password()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enter confirmpassword",
  "keyword": "And "
});
formatter.match({
  "location": "stepDefinition.customerRegistrationStep.user_enter_confirmpasswordString()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user click create Account",
  "keyword": "And "
});
formatter.match({
  "location": "stepDefinition.customerRegistrationStep.user_click_create_Account()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});