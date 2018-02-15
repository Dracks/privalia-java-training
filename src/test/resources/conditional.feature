Feature: Belly
    Scenario: a few cakes
        Given I have 42 cakes in my belly
        When I wait 1 hour
        Then my belly should growl