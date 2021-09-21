# ParachOut
Juego Programacion Avanzada Taller Unlam

Consigna <br />
Introducción <br />
Durante el taller desarrollaremos un juego a elección de cada uno de los equipos que implemente la forma de juego de desplazamiento constante, pero con elementos de multijugador. <br />

El juego puede orientarse al movimiento continuo vertical:<br />
- Road fighter <br />
- 1943<br />

También puede orientarse al movimiento continuo horizontal:<br />
- Jetpack Joyride<br />
- Flappy Bird<br />
- Geometry Dash<br />
- Dinosaur Game<br />

Y si es el jugador el que mantiene ese movimiento continuo también cuenta:<br />
- Super Mario Run<br />


En las clases del taller se les proveerá de herramientas para poder realizarlo en Java, con las buenas prácticas que irán adquiriendo.<br />


Metodología de trabajo<br />

La realización del juego, tendrá tres etapas con sus respectivas entregas:<br />

| Fecha | Contenido de la entrega                                                                                        |<br />
|-------|----------------------------------------------------------------------------------------------------------------|<br />
| 02/10 | Diagrama de clases del modelo del juego, implementado y testeado (código)                                      |<br />
| 30/10 | Posibilidad de interactuar con los elementos del juego en tiempo real en un entorno simulado, de forma gráfica |<br />
| 04/12 | Capacidad de ser jugado a través de cliente-servidor                                                           |<br />


Se espera que las prácticas de programación sean buenas, y adecuadas al conocimiento adquirido en la materia.<br />
Esto incluye evitar el código aglomerado, tener una buena interacción de clases, no duplicar funcionalidades, tener el código indentado y prolijo, entre otras.<br />


---<br />

Mecánica del juego<br />

La mecánica del juego como mencionamos anteriormente, es con desplazamiento constante y debe mantener las siguientes reglas:<br />
* La mecánica del juego debe elegirse de uno o más juegos del estilo anteriormente mencionado<br />
* Una partida debe contar como mínimo con 2 participantes (1 humano) y soportar al menos 4 jugadores humanos<br />
* Una partida debe contar con múltiples rondas, o con una única ronda, si la misma es suficientemente larga, y no repetitiva<br />
* Una partida debe tener un fin claro, donde se declaren uno o varios ganadores<br />
* El mapa puede ser finito o infinito, autogenerado o con mapas creados<br />
* Todos los jugadores deben estar jugando e interactuando con el entorno al mismo tiempo de una u otra forma<br />


Requisitos generales<br />

1. Como usuario quiero ingresar al juego con mi nombre de usuario y contraseña, para poder jugar contra otros jugadores en una sala<br />
2. Como usuario quiero seleccionar una sala de las existentes, para poder ingresar y jugar con los participantes (*1)<br />
3. Como usuario quiero crear nuevas salas para que ingresen otros jugadores (*2)<br />
4. Como usuario quiero poder salir de una sala, incluso si en la misma el juego se encuentra en ejecución<br />
5. Como usuario quiero poder identificar cada jugador (saber quién lo maneja, y ver su puntaje)<br />

Notas:<br />
(*1) Una sala puede estar activa para que ingresen jugadores mientras un juego no esté activo en la misma. Aún así, debe aparecer en la lista de juegos como que el juego ya inició<br />
(*2) La partida podrá ser iniciada por el creador de la sala, o cuando todos los jugadores estén listos, o cualquier otra condición que consideren<br />



Ocultar/mostrar consigna<br />
¡Atención! Esta tarea se resuelve por equipos. La estás resolviendo junto a Mauro Maurin L., Ivana R., Marco V., Juan Pablo L., Nicolas S., Joela K., Pablo Ignacio M., Diego M. para el equipo NullPointerException.<br />
