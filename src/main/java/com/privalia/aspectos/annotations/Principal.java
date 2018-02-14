package com.privalia.aspectos.annotations;

import lombok.Cleanup;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Principal {
    public static void main(String[] args){
        @Cleanup AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext();
        ctx.scan("com.privalia.aspectos.annotations");
        ctx.refresh();
        Compra cp = ctx.getBean(Compra.class);

        try {
            System.out.println("Invocamos sin problemas");
            cp.compra(false);
            System.out.println("Invocamos para que se produzca un error");
            cp.compra(true);
        } catch (Exception e) {
            System.out.println("Obtenemos la excepcion " + e);
        }
    }
}
