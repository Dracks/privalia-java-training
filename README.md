# AOP (Programació orientada a aspectes)

Permet interceptar dades entrants de metodes, la sortida i excepcions. 

> Poder utilitzar expresions regulars per triar metodes.

Spring porta el aspecte transactional.

JUnit és el clar exemple de Programació orientada aspectes: SetUp, TearDown... 

# Cucumber

Cucumber per defecte no és compatible amb spring, per lo que s'ha d'afegir l'extension. 

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

# Gradle

Requereix tenir el spring-boot-gradle-plugin

Es pot configurar en el jar, el Main-Class del manifest. 

Els plugins de gradle, afegeixen tasques.

# Grovy

Permet configurar el logback, y també fer coses a gradle. 


#Java

En Java Web, tenim variables d'applicació, son variables que conté el servidor web. 

## Classpath

Pots tenir un classpath de compilat i de sistema operatiu, perque vagi a buscar 
les llibreries en el sistema.

## Compilats Java
- jar
- war
- ear
- apk

## Interficies

Té l'interficia clonnable, que permet clonar l'objecte.

Java8 permet metodes statics dins de les interficies. (i implementar-los max. 1 d'objecte i d'estatic)

### Interficies funcionals
Poder afegir implementacions a les interficies. Exemple: Runnable

Han d'incloure un metode abstracte com a mínim. 
Per implementar el metode, s'ha de ficar la paraula reservada default.


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

## Try catch ours
Catch té la opcio de ficar opcional. 

## Futurable
Classes per portar les promeses aquí. 

#JUnit

Té la funcionalitat d'"expected exception" per validar que s'esta llençant una excepció

# Kafka 

Sistema de cues, mirar en el quickstart: https://kafka.apache.org/quickstart
# Maven

## Execucions

La configuració d'execució de parametres, es poden configurar 3 parametres:

+ id: El id d'execució
+ goal: Per indicar el llenguatge amb el que ha d'executar el programa
+ mainClass: La clase principal d'executar el main

s'ha d'executar sempre dins de target, i s'executa així:
    mvn exec:java@config

## Run concrete tests
Testeja una clase
> mvn test -Dtest=$classNameTest 

Testejar un metode
>mvn test -Dtest=$className#$functionName

Testejar una categoria
> mvn test -Dtest.categories=slowTests

Es classifica com:
```
@Category(SlowTest.class)
@Test
public void b(){

}
```

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

Tutorial interessant: http://www.mkyong.com/tutorials/spring-tutorials/

## Arrancar configuracio de beans

hi han les dos opcions ClassPathXmlApplicationContext i AnnotationConfigApplicationContext

## Condicionals

S'ha d'iplementar l'interficie condició. I podrem treure les propietats del context. 

En el Readme de l'app és recomenable indicar tots els parametres de la linia de comandes. 

## Configuracio

Per l'xml es pot fer herencia, polimorfisme etc...

També es poden instanciar classes del JDK.

## Deploy sobre servidors externs

S'ha de canviar el jar a war, i pujar el war dins de l'app. També seria bo fer un exclude de totes les 
llibreries de servidors. I s'afegeix el plugin de maven: maven-war-plugin.

## Jerarquia de carpetas

Por estructura de proyecto, las dependencias se autoinyectan por la jerarquia de carpetas

## Log
Per fer el log, spring utilitza una façana per encapsular la majoria de frameworks de logs. Aquesta es diu slf4j

spring-boot per defecte utilitza logback, però spring-data amb hibernate utilitza log4j

## Marques:
En spring s'han de marcar les classes segons la capa on estan. Son informatives i a vegades afegeixen funcionalitat. 

+ @Repository: Capa Dao
+ @Service: Classe negocy
+ @RestController: Servei Rest
+ @Controller: Implementant Spring MVC, el controlador de la capa de presentació

Per separat
+ @Configuration: Per la configuració
+ @Component: Objectes generals 

Si el component no té un value, t'agafa per defecte el mateix nom de la clase però la primera lletra en minuscules

## Profiles

Serveixen per seleccionar el codi que s'executa, triar classes, etc. es configuren per el config.properties

Es pot configurar els profiles de forma programativa i al executar-ho per comanda. Programativament és fa de la seguent forma:
```
context.getEnvironment().setActiveProfiles("live", "linux");
```

Tota applicació web, té un fitxer web.xml, que en springboot no es veu, però es poden configurar moltes propietats web. 


Per els units tests, es faria a treves d'@ActiveProfiles("test-profile").

l'@Profile, es pot executar a nivell de metode. 

## Scopes

Spring permet tenir diferents scopes, si no es fica res, utilitza l'scope singleton

Els scopes per defecte d'spring son:

+ singleton : By default
+ prototype
+ request
+ session
+ global session

## SPEL

Es un llenguatge propi de confdiguració que s'utilitza també en els condicionals. 

Pots arribar a configurar les regles a nivell del XML. 


## Testing

### Injectar dependencies

* @RunWith(SpreingJUnit4ClassRunner.class), sols permet un runwith per test. Es recomana no utilitzar això. 
* @ClassRule y @Rule que son condicions de JUnit. 

# Spring-boot

[spring boot initializr](http://start.pring.io)

Spring-boot facilita l'incorporació de dependencies, usant grups de dependencies, 
que s'anomenen starters

Porta instalat Tomcat, Jetty i Undertow. El per defecte és Tomcat

Porta moltes default configurations. I en springboot és una màxima __convention over configuration__

Es recomana instalar devtools i actuator.

En h2, un cop ben configurat, et crea una url console, on et pot administrar la base de dades en memoria ram. 
L'unic que s'ha tingut de canviar és la url, que inicialment crea la base de dades test. 


Spring-boot amb l'starter d'h2, implementa hateoas

## base.xml

Es la configuració base de slf4j. 

Proporciona, dos appenders: console-appender.xml y file-appender.xml

## Configuracions

application.properties, o application-{profile}.properties. 
Per defecte t'agafa els valors de l'application.propertires, amb el
 -Dspring.profiles.active=$profile pots indicar més d'un profile perque s'executin.
 Si els application-{profile}.properties no conte valors, els agafa del general. L'ordre d'agafar els valors és
 del primer a l'ultim profile.   

### Configuracions externes

Pots definir on esta el externa.properties amb el -Dconfig.location=$pathExternalProperties. 
Una forma més senzilla és amb el fitxer de properties al costat del compilat, amb el nom application.properties. 

## LLibreries utilitzades:
 + spring cloud config
 + spring data
 + spring security
 + spring hateoas

## Spring cloud config

Montar un microserveis per gestionar totes les configuracions dels servidors. 

Es pot utilitzar una repositori de git. 

Tutorial: https://picodotdev.github.io/blog-bitix/2015/11/configuracion-de-una-aplicacion-en-diferentes-entornos-con-spring-cloud-config/

configurar el yaml, 
Dependencies: 
spring-cloud-config 
spring-cloud-config-server

## Spring HateOAS

Permet autoconfigurar les apis, perque el client no hagi d'anar configurar les URL.

## Spring-Data

Paquet per guardar les dades en base de dades. 

Utilitzarem hibernate per conectarnos a la base de dades. L'hibernate té diferents dialectes, per els diferents SQL.

per fer un update és faria com:
```
@Modifying
@Transactional
@Query("UPDATE...")
int updateProduct(...) 
```
Notar que la funció al contenir el @Modifying et retornarà el numero de updates que es facin. 

```
@DynamicUpdate(value=true)
```
Això permet que nomès s'actualitzin els camps que s'han modificat. és una anotació d'hibernate

## Spring boot actuator

És per treballar amb endpoints, ens proporciona els següents:
- /health
- /env: Ens proporciona els active profiles, contè totes les variables d'entorn. Es poden crear variables d'entorn per
 veureles aqui custom
- beans: Ens diu totes les beans en memoria i quin scope
- trace: Guarda totes les traces de les diferents peticions que rep el servei


Tots els endpoints es poden veure aquí: https://docs.spring.io/spring-boot/docs/current/reference/htmlsingle/#production-ready-endpoints
## Starters

 + starter-web: Permet crear qualsevol tipos de web
 + starter-data-jpa: Java persistance api. 
 + starter-data-rest: Webservices orientats a dades
 + starter-security: Per treballar amb autenticació 
 + spring-boot-devtools: Permet canviar clases del context en runtime. > remote-live-reload (plugin per refrescar en 
 calent el codi)
 + spring-boot-starter-test: per fer els testings. 


Afegir una llibreria de base de dades, implica tenir de configurarla.

## Swagger 

Si vull que la documentació estigui a la documentacio, he de ficar apiModelProperty i especificar la documentación. 

## Validacions

Per fer les validacions automatiques del model, s'ha d'indicar el @Valid en el product rest controller. 

### Validacions en el model. 

Es poden fer tot amb la base dels decorators obtingutx de javax.constraints.validators.

### Validacions custom

Per fer un custom validation, s'ha de fer una clase que implementi la Clase: ConstraintValidator per validar 
la constraint i un decorator 

# Altres
## Hibernate tools

Con Hibernate tools es pot generar la base de dades i els models. 

## JBoss-tools

Jboss tools, porta incorporat una eina per generar la base de dades sql en base a hibernate i
també al reves. 

També s'integra am docker i openshift. 

## Lombock
@Data en el objecte, et proporciona getters and setters, el constructor el equals, el canEquals, hashcode y el toString

Dona una anutació segons el framework de log que necessitis.

## POJOS
Plain old Java Objects

## Reflexión
Spring utilitza "Reflexión" en català, introspecció.

# View Framework

Struts, 
JSF (Standard),
Spring MVC 