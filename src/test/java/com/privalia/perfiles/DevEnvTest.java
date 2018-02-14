package com.privalia.perfiles;

import com.privalia.presentation.annotations.SpringConfiguration;
import org.junit.Before;
import org.junit.ClassRule;
import org.junit.Rule;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.rules.SpringClassRule;
import org.springframework.test.context.junit4.rules.SpringMethodRule;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import static org.junit.Assert.assertEquals;

@ContextConfiguration(classes={DevEnvConfig.class})
@ActiveProfiles("dev")
public class DevEnvTest {

    @ClassRule
    public static final SpringClassRule SPRING_CLASS_RULE = new SpringClassRule();

    @Rule
    public final SpringMethodRule springMethodRule = new SpringMethodRule();

    DevEnvConfig expected;

    @Autowired
    User subject;

    @Before
    public void setUp(){
        expected = new DevEnvConfig();
    }

    @Test
    public void testIsCorrect(){
        assertEquals(expected.user(), subject);
    }
}
