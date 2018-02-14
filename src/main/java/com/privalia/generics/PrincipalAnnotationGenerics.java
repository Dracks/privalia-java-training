package com.privalia.generics;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.io.Closeable;
import java.io.IOException;

public class PrincipalAnnotationGenerics implements Closeable {
    protected final AnnotationConfigApplicationContext ctx;

    public PrincipalAnnotationGenerics(){
        ctx = new AnnotationConfigApplicationContext();
        ctx.scan(this.getClass().getPackage().getName());
        ctx.refresh();
    }

    @Override
    public void close() throws IOException {
        ctx.close();
    }
}
