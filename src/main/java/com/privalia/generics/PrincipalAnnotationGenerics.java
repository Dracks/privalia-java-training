package com.privalia.generics;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.io.Closeable;
import java.io.IOException;

public class PrincipalAnnotationGenerics{
    protected final AnnotationConfigApplicationContext ctx;

    public PrincipalAnnotationGenerics(){
        ctx = new AnnotationConfigApplicationContext();
        ctx.scan(this.getClass().getPackage().getName());
        ctx.refresh();
    }

    public PrincipalAnnotationGenerics(String profile){
        ctx = new AnnotationConfigApplicationContext();
        ctx.getEnvironment().setActiveProfiles(profile);
        ctx.scan(this.getClass().getPackage().getName());
        ctx.refresh();
    }

    public void close() {
        ctx.close();
    }
}
