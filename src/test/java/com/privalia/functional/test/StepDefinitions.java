package com.privalia.functional.test;

import com.privalia.functional.Belly;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.ClassRule;
import org.junit.Rule;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.rules.SpringClassRule;
import org.springframework.test.context.junit4.rules.SpringMethodRule;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

@ContextConfiguration(classes = { Belly.class })
public class StepDefinitions {
    @ClassRule
    public static final SpringClassRule SPRING_CLASS_RULE = new SpringClassRule();

    @Rule
    public final SpringMethodRule springMethodRule = new SpringMethodRule();

    @Autowired
    private Belly subject;

    private int waitingTime;

    @Given("^I have (\\d+) cakes in my belly$")
    public void i_have_cakes_in_my_belly(int cukes) throws Throwable{
        subject.eat(cukes);
    }

    @When("^I wait (\\d+) hour$")
    public void i_wait_hour(int waitingTime) throws  Throwable{
        this.waitingTime = waitingTime;
    }

    @Then("^my belly should (.*)$")
    public void my_belly_should_growl(String expectedSound) throws  Throwable{
        String actualSound = subject.getSound(waitingTime);
        assertThat(actualSound, is(expectedSound));
    }
}
