package com.privalia.perfiles;

import org.junit.Before;
import org.junit.ClassRule;
import org.junit.Rule;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.rules.SpringClassRule;
import org.springframework.test.context.junit4.rules.SpringMethodRule;

import static org.junit.Assert.assertEquals;

@ContextConfiguration(classes={ProdEnvConfig.class})
@ActiveProfiles("prod")
public class ProdEnvTest {

    @ClassRule
    public static final SpringClassRule SPRING_CLASS_RULE = new SpringClassRule();

    @Rule
    public final SpringMethodRule springMethodRule = new SpringMethodRule();

    ProdEnvConfig expected;

    @Autowired
    User subject;

    @Before
    public void setUp(){
        expected = new ProdEnvConfig();
    }

    @Test
    public void testIsCorrect(){
        assertEquals(expected.user(), subject);
    }
}
