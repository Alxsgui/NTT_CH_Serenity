
## **Conclusiones**

* Serenity Screenplay promueve la escritura de pruebas de una manera clara y legible. El enfoque centrado en actores, las tareas y las habilidades hace que el código sea más comprensible tanto para los desarrolladores como para otros miembros del equipo.
* El patrón de diseño predefinido permite una estructura clara en la cual cada parte de la automatización tiene su lugar reservado:
    * Features: Contienen las características a evaluar, así como los escenarios que componen la funcionalidad, además incluyen los tags necesarios para realizar pruebas por áreas
    * UserInterfaces: Contiene el modelado de la página identificando a cada elemento web de interés con un nombre apropiado, así como con su locator único, priorizando el uso de ids sobre otro tipo de identificación como xPath
    * Tasks: Contienen las acciones a realizar sobre cada página por ejemplo p´resionar un botón, hacer hover sobre un elemento entre otros.
    * glue: Contiene el código que ejecuta las acciones definidas en el archivo feature.
* SerenityScreenplay incluye una librería encargada de la identificación de la versión del navegador lo que disminuye el trabajo y optimiza el tiempo del equipo de pruebas al identificar y manejar el driver adecuado para cada navegador.
* La Automatización d Opencart de abstracta presento facilidad debido a que la gran parte de sus elementos web poseían un ID, esto facilitó la correcta selección de locators para la ejecución del proceso de automatización.
* En el desarrollo de este caso se identificó que las pruebas deben ser ejecutadas en modo incognito, de no hacerlo se presentan dos elementos nuevos que interfieren con la ejecución del proceso:
    * Se muestra en la parte inferior derecha un botón que impide que el proceso de automatización encuentre el locator checkout.
    * Al registrar los datos de compra, el navegador despliega un pop-up para guardar los datos.
 
  ## **Recomendación**
* Si la historia de usuario necesitase evaluar los puntos de la última conclusión, los elementos web mencionados en el punto anterior se deben identificar y agregar como tareas para su automatización.
