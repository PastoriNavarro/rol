#EL SEÑOR DE LOS ANILLOS

Ha llegado el momento, como dice una gran frase del mundo del cine: un gran poder conlleva una
gran responsabilidad, y este es el momento de mostrar todo aquello que hemos aprendido antes
de lanzarnos al mundo real y ponerlo en práctica en una empresa. Es el momento de nuestro
proyecto final.
DESARROLLO
Para ello vamos a realizar varias clases en Java que permitan la implementación de un sencillo
juego basado en la historia fantástica del libro del Señor de los Anillos.
En el juego existirán diversos personajes clasificados en dos categorías: Héroes y Bestias. En la
parte de los héroes podrán crearse varios tipos de personajes: Elfos, Hobbits y Humanos mientras
que en la parte de las bestias existirán Orcos y Trasgos.
El objetivo del juego es la creación de dos ejércitos de personajes, uno de héroes y otro de bestias,
que se enfrentarán entre ellos, mediante un sistema de turnos, hasta que uno de ellos logre la
victoria. Para ello, cada personaje estará caracterizado por un nombre, unos puntos de vida
(número entero) y un nivel de resistencia de su armadura (número entero). En cada turno un
personaje podrá atacar a un adversario con las siguientes peculiaridades:
• Héroes: su ataque estará basado en la tirada de dos dados con valores entre 0 y 100 de los
cuales se elegirá el valor mayor. Este valor determinará la potencia ofensiva de su ataque en el
turno actual. Este valor determinará la potencia ofensiva de su ataque en el turno actual. Se puede
usar el método random() de la clase estática Math para generar la tirada.
• Bestias: la potencia de su ataque en cada turno estará basado en la tirada de un único dado
con valores entre 0 y 90.
Una vez calculada su potencia ofensiva, se calculará el daño infligido al adversario en función de su
nivel de armadura. Sólo se producirá un daño al adversario si la potencia ofensiva del atacante es
superior al nivel de armadura del defensor. Si es así el daño producido será la diferencia entre la
potencia de ataque y el nivel de armadura del oponente. Además, en cada ataque habrá que tener
en cuenta los siguientes supuestos particulares de cada tipo de personaje:

• Elfos: estos personajes odian especialmente a los Orcos por lo que tendrán un nivel de rabia
superior en su ataque únicamente contra este tipo de bestias, lo que incrementará su potencia
ofensiva, calculada en la tirada de dados, en 10 unidades.
• Hobbits: estos personajes tienen un miedo especial a los Trasgos por lo que siempre que
se enfrenten a uno de ellos perderán 5 unidades en su potencia ofensiva.
• Orcos: estos personajes poseen una fuerza desmesurada por lo que siempre que realicen
un ataque el nivel de armadura que posee su oponente se verá reducido en un 10% (el nivel de
armadura no se reduce de forma permanente sino sólo para el turno actual).
Una vez descrito el proceso de lucha individual entre personajes, a continuación se describirá el
proceso de batalla entre ambos ejércitos. Para ello, se seguirá un sistema basado en turnos en el
que en cada turno un personaje de un ejército atacará a un único adversario del ejército oponente.
Para simplificar el sistema de batalla, se enfrentarán siempre los personajes situados en la misma
posición de cada ejército. Si alguno de los ejércitos dispone de más efectivos que el contrario los
personajes sobrantes no participarán en ese turno de batalla. En cada turno se producirán todos
los enfrentamientos y se disminuirá la vida de cada personaje siguiendo las instrucciones
mencionadas anteriormente.
En el momento en que un personaje llegue a un nivel de vida igual o inferior a cero se producirá su
muerte por lo que se eliminará de su posición y se desplazarán todos sus compañeros en
posiciones posteriores para cubrir la baja. De esa forma alguno de los personajes inactivos podrá
participar en la batalla en los siguientes turnos.

EJEMPLO
Imaginemos un ejército de héroes formado por los siguientes personajes:
• Légolas, un elfo con 150 puntos de vida y una armadura de resistencia 30.
• Aragorn, un humano con 150 puntos de vida y una armadura de resistencia 50.
• Boromir, un humano con 100 puntos de vida y una armadura de resistencia 60.
• Gandalf, un humano con 300 puntos de vida y una armadura de resistencia 30.
• Frodo, un hobbit con 20 puntos de vida y una armadura de resistencia 10.
Y por otro lado un ejército de bestias formado por los siguientes personajes:
• Lurtz, un orco con 200 puntos de vida y una armadura de resistencia 60.
• Shagrat, un orco con 220 puntos de vida y una armadura de resistencia 50.
• Uglúk, un trasgo con 120 puntos de vida y una armadura de resistencia 30.
• Mauhúr, un trasgo con 100 puntos de vida y una armadura de resistencia 30.
Un posible discurrir de esta batalla sería el ejemplo que se muestra a continuación. Debido a que
usamos valores aleatorios en los dados, con las mismas condiciones de partida pueden ocurrir
desarrollos completamente diferentes.
Turno 1:
 Lucha entre Legolas (Vida=150 Armadura=30) y Lurtz (Vida=200 Armadura=60)
 Legolas saca 106 y le quita 46 de vida a Lurtz
 Lurtz saca 69 y le quita 42 de vida a Legolas
 Lucha entre Aragorn (Vida=150 Armadura=50) y Shagrat (Vida=220 Armadura=50)
 Aragorn saca 76 y le quita 26 de vida a Shagrat
 Shagrat saca 78 y le quita 33 de vida a Aragorn
 Lucha entre Boromir (Vida=100 Armadura=60) y Uglúk (Vida=120 Armadura=30)
 Boromir saca 99 y le quita 69 de vida a Uglúk
 Uglúk saca 90 y le quita 30 de vida a Boromir
 Lucha entre Gandalf (Vida=300 Armadura=30) y Mauhúr (Vida=100 Armadura=30)
 Gandalf saca 55 y le quita 25 de vida a Mauhúr
 Mauhúr saca 20 y le quita 0 de vida a Gandalf
Turno 2:
 Lucha entre Legolas (Vida=108 Armadura=30) y Lurtz (Vida=154 Armadura=60)
 Legolas saca 91 y le quita 31 de vida a Lurtz
 Lurtz saca 81 y le quita 54 de vida a Legolas
 Lucha entre Aragorn (Vida=117 Armadura=50) y Shagrat (Vida=194 Armadura=50)
 Aragorn saca 50 y le quita 0 de vida a Shagrat
 Shagrat saca 18 y le quita 0 de vida a Aragorn
 Lucha entre Boromir (Vida=70 Armadura=60) y Uglúk (Vida=51 Armadura=30)
 Boromir saca 93 y le quita 63 de vida a Uglúk

 Uglúk saca 36 y le quita 0 de vida a Boromir
 ¡Muere Trasgo Uglúk!
Turno 3:
 Lucha entre Legolas (Vida=54 Armadura=30) y Lurtz (Vida=123 Armadura=60)
 Legolas saca 85 y le quita 25 de vida a Lurtz
 Lurtz saca 38 y le quita 11 de vida a Legolas
 Lucha entre Aragorn (Vida=117 Armadura=50) y Shagrat (Vida=194 Armadura=50)
 Aragorn saca 92 y le quita 42 de vida a Shagrat
 Shagrat saca 66 y le quita 21 de vida a Aragorn
 Lucha entre Boromir (Vida=70 Armadura=60) y Mauhúr (Vida=75 Armadura=30)
 Boromir saca 73 y le quita 43 de vida a Mauhúr
 Mauhúr saca 66 y le quita 6 de vida a Boromir
Turno 4:
 Lucha entre Legolas (Vida=43 Armadura=30) y Lurtz (Vida=98 Armadura=60)
 Legolas saca 95 y le quita 35 de vida a Lurtz
 Lurtz saca 47 y le quita 20 de vida a Legolas
 Lucha entre Aragorn (Vida=96 Armadura=50) y Shagrat (Vida=152 Armadura=50)
 Aragorn saca 52 y le quita 2 de vida a Shagrat
 Shagrat saca 65 y le quita 20 de vida a Aragorn
 Lucha entre Boromir (Vida=64 Armadura=60) y Mauhúr (Vida=32 Armadura=30)
 Boromir saca 99 y le quita 69 de vida a Mauhúr
 Mauhúr saca 63 y le quita 3 de vida a Boromir
 ¡Muere Trasgo Mauhúr!
Turno 5:
 Lucha entre Legolas (Vida=23 Armadura=30) y Lurtz (Vida=63 Armadura=60)
 Legolas saca 51 y le quita 0 de vida a Lurtz
 Lurtz saca 18 y le quita 0 de vida a Legolas
 Lucha entre Aragorn (Vida=76 Armadura=50) y Shagrat (Vida=150 Armadura=50)
 Aragorn saca 71 y le quita 21 de vida a Shagrat
 Shagrat saca 87 y le quita 42 de vida a Aragorn
Turno 6:
 Lucha entre Legolas (Vida=23 Armadura=30) y Lurtz (Vida=63 Armadura=60)
 Legolas saca 50 y le quita 0 de vida a Lurtz
 Lurtz saca 38 y le quita 11 de vida a Legolas
 Lucha entre Aragorn (Vida=34 Armadura=50) y Shagrat (Vida=129 Armadura=50)
 Aragorn saca 70 y le quita 20 de vida a Shagrat
 Shagrat saca 71 y le quita 26 de vida a Aragorn
Turno 7:
 Lucha entre Legolas (Vida=12 Armadura=30) y Lurtz (Vida=63 Armadura=60)
 Legolas saca 108 y le quita 48 de vida a Lurtz
 Lurtz saca 39 y le quita 12 de vida a Legolas
 ¡Muere Elfo Legolas!
 Lucha entre Boromir (Vida=61 Armadura=60) y Shagrat (Vida=109 Armadura=50)
 Boromir saca 65 y le quita 15 de vida a Shagrat
 Shagrat saca 44 y le quita 0 de vida a Boromir
Turno 8:
 Lucha entre Aragorn (Vida=8 Armadura=50) y Lurtz (Vida=15 Armadura=60)
 Aragorn saca 91 y le quita 31 de vida a Lurtz
 Lurtz saca 78 y le quita 33 de vida a Aragorn
 ¡Muere Humano Aragorn!
 ¡Muere Orco Lurtz!
Turno 9:
 Lucha entre Boromir (Vida=61 Armadura=60) y Shagrat (Vida=94 Armadura=50)
 Boromir saca 92 y le quita 42 de vida a Shagrat
 Shagrat saca 44 y le quita 0 de vida a Boromir
Turno 10:
 Lucha entre Boromir (Vida=61 Armadura=60) y Shagrat (Vida=52 Armadura=50)
 Boromir saca 29 y le quita 0 de vida a Shagrat
 Shagrat saca 10 y le quita 0 de vida a Boromir
Turno 11:
 Lucha entre Boromir (Vida=61 Armadura=60) y Shagrat (Vida=52 Armadura=50)
 Boromir saca 73 y le quita 23 de vida a Shagrat
 Shagrat saca 21 y le quita 0 de vida a Boromir
Turno 12:
 Lucha entre Boromir (Vida=61 Armadura=60) y Shagrat (Vida=29 Armadura=50)
 Boromir saca 39 y le quita 0 de vida a Shagrat
 Shagrat saca 83 y le quita 29 de vida a Boromir
Turno 13:
 Lucha entre Boromir (Vida=32 Armadura=60) y Shagrat (Vida=29 Armadura=50)
 Boromir saca 91 y le quita 41 de vida a Shagrat
 Shagrat saca 63 y le quita 9 de vida a Boromir
 ¡Muere Orco Shagrat!
¡¡VICTORIA DE LOS HÉROES!!
