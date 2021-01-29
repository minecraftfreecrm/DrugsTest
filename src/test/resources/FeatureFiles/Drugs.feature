Feature: Drugs dot com

Background: Browse to Drugs.com
 Given Browse to Drugs.com
  @Sprint2
  Scenario: User Should able to check Common diseases and conditions
    
    When Click on the right arrow sign
    And Click on Condition & Disease  link
    And Click on any Common  diseases and conditions
    And Scroll down to find the Type 1 Support link
    And Click on the Type 1 Support link
    Then Verify with Related terms title

  @Sprint3
  Scenario: User should able to know details about Drug and Medication
    
    When Click on the Drug and Medications Button
    And Click on any alphabet to Browse Alphabetically
    Then Click on the Medication
    
    
    @Sprint3
    Scenario: User Should able to read expected medicine guide
    
    When Click on More Button
    And Click on the Antibiotics link
    And Click on the medication list
    And Select Drug class from the dropdown
    And Click on the update
    And Click on Medication
    Then Verify with page URL
    
    
    @Sprint3
    Scenario: User should able to check medication price
    
    When Click on the Pricing & Coupon Guide link
    And Click on the medication name
    Then Verify with medication price
    
    @Sprint4
    Scenario: User should able to check the treatment condition
    
    When Click on the Treatment Options link
    And Type the condition
    And Select a condition
    Then Verify with page URL
    
    @Sprint4
    Scenario:User should able to compare two medicine
   
    When Click on the Compare Drugs link
    And Select the medicine
    Then Verify with page URL

    
