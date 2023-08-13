
## Conversor de monedas, temperatura y distancia 

Este repositorio contiene un conjunto de clases en Java que implementan varios tipos de conversores, un conversor de divisas, un conversor de temperaturas y un conversor de distancias. Estos conversores utilizan interfaces de ventana emergente para permitir al usuario realizar conversiones de manera interactiva.

## Cómo usar

1. Clona este repositorio en tu máquina local o descarga los archivos directamente.
2. Abre el proyecto en tu entorno de desarrollo Java preferido.

## Conversor de Divisas

La clase `CurrencyConverter` implementa un conversor de divisas que permite al usuario convertir entre diferentes tipos de moneda. Proporciona opciones para convertir desde y hacia la moneda Balboa (moneda de Panamá), así como otras monedas populares como el Dólar, Euro, Libra Esterlina, Yen Japonés y Won Sur-Coreano.

## Conversor de Temperaturas

La clase `TemperatureConverter` implementa un conversor de temperaturas que permite al usuario convertir entre Celsius y Fahrenheit, y viceversa. El usuario puede seleccionar y proporcionar la temperatura que desea convertir.

## Conversor de Distancias

La clase `DistanceConverter` implementa un conversor de distancias que permite al usuario convertir entre millas y kilómetros, y viceversa. Al igual que en los otros conversores, el usuario puede seleccionar la dirección de la conversión y proporcionar la distancia a convertir.

## Ejecución

El punto de entrada del programa se encuentra en la clase `MainConverter`, que presenta al usuario un menú de opciones para seleccionar el tipo de conversor que desea utilizar. Una vez que se realiza una selección, se invoca la clase correspondiente para realizar la conversión. El usuario puede continuar realizando conversiones o salir del programa en cualquier momento.

## Requisitos

- Java SE Development Kit (JDK)
- Un entorno de desarrollo Java (Eclipse, IntelliJ, NetBeans, etc.)

## Notas

- Este proyecto utiliza ventanas emergentes para interactuar con el usuario.
- Las tasas de conversión en el conversor de divisas se basan en valores aproximados.
- Las fórmulas de conversión en los conversores de temperaturas y distancias están implementadas de acuerdo con las fórmulas estándar.
- Se proporcionan mensajes de error para manejar entradas inválidas.

¡Disfruta utilizando estos conversores interactivos en Java! 

