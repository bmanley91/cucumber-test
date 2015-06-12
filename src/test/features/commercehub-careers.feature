Feature: Commercehub Careers

  CommerceHub.com has a listing of the company's job openings.

  Scenario: QA Engineer Openings

    Given I am at the CommerceHub home page
     When I click the Company link on the navigation bar
     Then The Careers link is present on the page
     When I click the Careers link
     Then The current job openings are listed
      And A post for "QA Engineer" is present