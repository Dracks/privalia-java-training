package com.privalia.aspectos.annotations;

import com.privalia.generics.PrincipalAnnotationGenerics;
import lombok.Cleanup;

import java.io.IOException;

public class Principal  extends PrincipalAnnotationGenerics {

    public void run(String[] args){
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
    public static void main(String[] args){
        try (Principal p = new Principal()){
            p.run(args);
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
