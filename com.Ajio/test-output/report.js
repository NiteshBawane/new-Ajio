$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("login.feature");
formatter.feature({
  "line": 1,
  "name": "Ajio website",
  "description": "",
  "id": "ajio-website",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 3,
  "name": "Searching Jeans",
  "description": "",
  "id": "ajio-website;searching-jeans",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 5,
  "name": "user should be on Home page",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "user enter Jeans in searchBox",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "user click on  search button",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "user will see the number of jeans",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginStepdef.user_should_be_on_Home_page()"
});
formatter.result({
  "duration": 10160765800,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepdef.user_enter_Jeans_in_searchBox()"
});
formatter.result({
  "duration": 145388400,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepdef.user_click_on_search_button()"
});
formatter.result({
  "duration": 2443489700,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepdef.user_will_see_the_number_of_jeans()"
});
formatter.result({
  "duration": 344213700,
  "status": "passed"
});
});