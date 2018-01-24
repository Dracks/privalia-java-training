# Model

Tot objecte hauria de tenir un Unic Identifier. (gid=> Global Id)

Arquitectura amb PrivaliaObject amb gid, i fer que totes les classes heredin d'aquí.
Per generar el UUID, es pilla de java.util.UUID.randomUUID()


## Constructors
constructor de classes (Inicialitzador static)
> Es single thread.
>
> S'executa el primer cop que s'accedeixi a la clase. Sigui per crear un objecte nou o per accedir a un metode static

constructor d'objecte


#Java

En Java Web, tenim variables d'applicació, son variables que conté el servidor web. 

## Compilats Java
- jar
- war
- ear
- apk

## Interficies

Té l'interficia clonnable, que permet clonar l'objecte.

### Interficies funcionals
Poder afegir implementacions a les interficies. Exemple: Runnable

## Classpath
afegir les coses que han de ser facils per localitzar

## Anotacions
Es creen amb @interface.
Poden tenir atributs amb default values.


Es poden applicar anotacions a la mateixa anotació

## Inicialitzadors statics
No poden llençar "unmanaged exceptions", això implica que s'ha de fer un wrapping the l'excepció llençada.  (Checked vs unchecked exceptions)


## Try with resources
A partir de java 8, es poden utilitzar el try with resources, sempre i quant l'objecte tingui implementada l'interficie closable

#JUnit

Té la funcionalitat d'"expected exception" per validar que s'esta llençant una excepció

# Maven

## Archetipes
Manera de generar una estructura de la nostra infraestructura. 


## Useful things Maven:
[Phases maven](https://maven.apache.org/guides/introduction/introduction-to-the-lifecycle.html)

mvn clean install -U

Borrar la cache:
mvn dependency:purge-local-repository clean install -U

## Scopes
test: per testing
provided: Perque utilitzi la que et proporcioni. 

## Settings
settings.xml > permet configurar el mvn. 


# Log4J
Tutorial:
https://www.adictosaltrabajo.com/tutoriales/log4j/

PropertyConfigurator.configure <= permet indicar on esta i com es diu el fitxer de configuració de log4j

# Spring

## Log
Per fer el log, spring utilitza una façana per encapsular la majoria de frameworks de logs. Aquesta es diu slf4j

spring-boot per defecte utilitza logback, però spring-data amb hibernate utilitza log4j

# Spring-boot

[spring boot initializr](http://start.pring.io)

# Altres

## Lombock
@Data en el objecte, et proporciona getters and setters, el constructor el equals, el canEquals, hashcode y el toString


## POJOS
Plain old Java Objects

## Reflexión
Spring utilitza "Reflexión" en català, introspecció.