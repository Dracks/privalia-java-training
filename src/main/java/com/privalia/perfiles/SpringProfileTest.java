package com.privalia.perfiles;

import com.privalia.generics.PrincipalAnnotationGenerics;
import lombok.Cleanup;

import java.io.IOException;

public class SpringProfileTest extends PrincipalAnnotationGenerics {
    public SpringProfileTest(String dev) {
        super(dev);
    }

    private void run(){
        User user = ctx.getBean(User.class);
        System.out.println(user.toString());
    }
    public static void main(String[] args){
        @Cleanup SpringProfileTest profile = new SpringProfileTest("prod");
        profile.run();

    }
}
