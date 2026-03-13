Automatización Web - SauceDemo con Serenity BDD
Descripción

Este proyecto contiene la automatización de pruebas funcionales para la aplicación web SauceDemo utilizando el framework Serenity BDD con el patrón Screenplay, Cucumber y Selenium WebDriver.

El objetivo es validar el flujo de compra básico dentro de la aplicación, específicamente la gestión del carrito de compras.

Tecnologías utilizadas

Java

Serenity BDD

Selenium WebDriver

Cucumber

Screenplay Pattern

Maven

IntelliJ IDEA

GitHub

Estructura del proyecto

El proyecto sigue la arquitectura basada en el patrón Screenplay.

src
├── main
└── test
├── java
│ └── org.example
│ ├── questions
│ ├── stepdefinitions
│ ├── tasks
│ └── ui
└── resources
└── features

Descripción de carpetas

tasks
Contiene las acciones que el actor realiza en la aplicación.

questions
Permite validar resultados en la interfaz.

ui
Contiene los localizadores de los elementos de la página.

stepdefinitions
Implementa los pasos definidos en los archivos feature.

features
Contiene los escenarios escritos en lenguaje Gherkin.

Escenario automatizado

Feature: Gestión del carrito de compras

Scenario: Agregar y eliminar producto del carrito

Given el usuario abre la pagina de SauceDemo
When inicia sesion con usuario "standard_user" y password "secret_sauce"
And agrega un producto al carrito
Then el contador del carrito debe ser "1"
When abre el carrito
Then el producto debe estar visible en el carrito

Ejecución del proyecto

Para ejecutar las pruebas desde Maven:

mvn clean verify

Después de la ejecución se generará el reporte de Serenity en:

target/site/serenity/index.html

Reportes

Serenity genera reportes automáticos con:

Evidencias de ejecución

Capturas de pantalla

Resultado de escenarios

Detalle de pasos ejecutados

Aplicación utilizada

https://www.saucedemo.com/

Autor

Roberto Pacco Ramos

Proyecto desarrollado como parte de la capacitación en Automatización de Pruebas Web.
