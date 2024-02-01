#  # NTT Challege QA Automation Serenity
OpenCart automation Screenplay
 
### Realizado por Alex Alvarez - Enero 2024


## **Descripción**
Automatización de compra en e-commerce de [Abstracta](https://opencart.abstracta.us)
Empleando serenenity screenplay con cucumber.

## **Tecnológias**
* JDK : 17.0.10
* Building tool: gradle 7.6.1
* IDE: IntellIJ

## **Implementación**
Clonar el repositorio via Https 

Cargar el proyecto

Implementar dependencias con el comando

gradle build


## **Runner**

En la ruta src/test/java/runner
Se encuentra la clase "runner" emplear este archivo para correr los test.


## **Reportes**
Los reportes se alojan en la siguiente ruta:
target/site/serenity/index.html
Se valida la eficacia de la automatización con un assert simple de presencia del mensaje "Your order has been placed!"
Al finalizar el test en consola se despliega el enlace directo al reporte
