package com.privalia.aspectos.annotations;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class ValidarMaterial {
    @Before("execution( * com.privalia.aspectos.annotations.Compra.compra(..) )")
    public void comprobarCantidad(){
        System.out.println("Se comprueba que la cantidad es correcta");
    }

    @After("execution( * com.privalia.aspectos.annotations.Compra.compra(..) )")
    public void empaquetar(){
        System.out.println("Se empaqueta la mercancia");
    }

    @AfterThrowing("execution( * com.privalia.aspectos.annotations.Compra.compra(..) )")
    public void ponerReclamacion(){
        System.out.println("Se reclaman los defectos detectados");
    }
}
