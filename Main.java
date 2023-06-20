import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        //Declaración de lista de bestias con su correspondiente información de cada una de ellas
        List<Bestia> bestias = new ArrayList<>();
        Bestia lurtz = new Bestia("Lurtz", 200, 60, Bestia.Tipo.ORCOS);
        Bestia shagrat = new Bestia("Shagrat", 220, 50, Bestia.Tipo.ORCOS);
        Bestia ugluk = new Bestia("Uglúk", 120, 30, Bestia.Tipo.TRASGOS);
        Bestia mauhur = new Bestia("Mauhúr", 100, 30, Bestia.Tipo.TRASGOS);

        //Declaración de lista de heroes con su correspondiente información de cada uno de ellos
        List<Heroe> heroes = new ArrayList<>();
        Heroe legolas = new Heroe("Légolas", 150, 30, Heroe.Tipo.ELFOS);
        Heroe aragorn = new Heroe("Aragorn", 150, 50, Heroe.Tipo.HUMANOS);
        Heroe boromir = new Heroe("Boromir", 100, 60, Heroe.Tipo.HUMANOS);
        Heroe gandalf = new Heroe("Gandalf", 300, 30, Heroe.Tipo.HUMANOS);
        Heroe frodo = new Heroe("Frodo", 20, 30, Heroe.Tipo.HOBBITS);

        bestias.add(lurtz);
        bestias.add(shagrat);
        bestias.add(ugluk);
        bestias.add(mauhur);

        heroes.add(legolas);
        heroes.add(aragorn);
        heroes.add(boromir);
        heroes.add(gandalf);
        heroes.add(frodo);

        //Creación de bucle de batalla por turnos
        Turno turno = new Turno(heroes, bestias);
        while (!bestias.isEmpty() && !heroes.isEmpty()) {
            int j = 0;
            j = j + 1;
            System.out.println("com.Pastori.Rol.java.Turno " + j + "\n");
            for (int i = 0; i < bestias.size(); i++) {
                turno.ataque(bestias.get(i), heroes.get(i));
            }
        }
    }
}
