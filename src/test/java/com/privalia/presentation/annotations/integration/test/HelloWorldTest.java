package com.privalia.presentation.annotations.integration.test;

import com.privalia.presentation.annotations.HelloWorld;
import org.junit.ClassRule;
import org.junit.Rule;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import com.privalia.presentation.annotations.SpringConfiguration;
import org.springframework.test.context.junit4.rules.SpringClassRule;
import org.springframework.test.context.junit4.rules.SpringMethodRule;

import static org.junit.Assert.assertNotNull;

@ContextConfiguration(classes={SpringConfiguration.class})
public class HelloWorldTest {

    @ClassRule
    public static final SpringClassRule SPRING_CLASS_RULE = new SpringClassRule();

    @Rule
    public final SpringMethodRule springMethodRule = new SpringMethodRule();

    @Autowired
    private HelloWorld subject;

    @Test
    public void testDependency(){
        assertNotNull(subject);
    }

}
