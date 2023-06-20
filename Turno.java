import java.util.List;

public class Turno {

    //declaración de listas de heroes y bestias sobre las que vamos a trabajar creando turnos para luchar
    private final List<Heroe> heroes;
    private final List<Bestia> bestias;

    public Turno(List<Heroe> heroes, List<Bestia> bestias) {
        this.heroes = heroes;
        this.bestias = bestias;
    }

    //ataque de heroes a bestias separados por los distintos tipos de heroes que se piden y sus distintas formas de atacar
    public void ataque(Bestia bestia, Heroe heroe) {
        int ataqueH = heroe.lazarDados();
        int resistenciaB = bestia.getResistencia();
        int heridaH = ataqueH - resistenciaB;

        switch (heroe.getTipo()){
            case ELFOS:
                if(bestia.getTipo() == Bestia.Tipo.ORCOS){
                    heridaH = heridaH + 10;
                }
                break;
            case HOBBITS:
                if(bestia.getTipo() == Bestia.Tipo.TRASGOS){
                    heridaH = heridaH - 5;
                }
        }

        System.out.println("Lucha entre " + heroe + " y " + bestia);

        //Si el daño(herida)infringido es menor o igual a 0 nos dice que el ataque no se puede producir
        if (heridaH <= 0) {
            System.out.println("\tEl ataque no se puede producir porque la resistencia del defensor es mayor que la potencia de ataque");

            //Si el ataque se produce porque no se cumple la condición anterior, nos da toda la información del ataque
        } else {
            bestia.quitarVida(heridaH);
            System.out.println("\t" + heroe.getNombre() + " saca: " + ataqueH + " puntos de potencia de ataque y le quita: " + heridaH + " puntos de vida a " + bestia.getNombre());
        }
//Nos lanza un mensaje por consola si la bestia muere y nos da el nombre de la bestia que muere
        if(bestia.estaMuerto()){
            System.out.println("\t¡Muere " + bestia.getNombre() + "!");
            bestias.remove(bestia);
        }
        //Si las listas de bestias o heroes no están vacías sigue el ataque
        if(!bestias.isEmpty() && !heroes.isEmpty()) {
            int ataqueB = bestia.lanzarDados();
            int resistenciaH = heroe.getResistencia();
            int heridaB = ataqueB - resistenciaH;

            //Reduccion armadura ataque orcos
            if (bestia.getTipo() == Bestia.Tipo.ORCOS){
                heroe.reduceArmadura();
            }

            //Si el daño(herida)infringido es menor o igual a 0 nos dice que el ataque no se puede producir
            if (heridaB <= 0) {
                System.out.println("\tEl ataque no se puede producir porque la resistencia del defensor es mayor que la potencia de ataque");
                System.out.println("\n");
                //Si el ataque se produce porque no se cumple la condición anterior, nos da toda la información del ataque
            } else {
                heroe.quitarVida(heridaH);
                System.out.println("\t" + bestia.getNombre() + " saca: " + ataqueB + " puntos de potencia de ataque y le quita: " + heridaB + " puntos de vida a " + heroe.getNombre());
                System.out.println("\n");
            }
            //Nos lanza un mensaje por consola si el heroe muere y nos da el nombre del que muere
            if (heroe.estaMuerto()) {
                System.out.println("\t¡Muere " + heroe.getNombre() + "!");
                heroes.remove(heroe);
            }
        }
        //Si la lista de bestias se vacía, ganan los héroes
        if(bestias.isEmpty()){
            System.out.println("¡¡VICTORIA DE LOS HÉROES!!");
            //Si la lista de héroes se vacía, ganan las bestias
        } else if(heroes.isEmpty()) {
            System.out.println("¡¡VICTORIA DE LAS BESTIAS!!");
        }
    }
}
