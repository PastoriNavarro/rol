//clase que hereda de personajes y donde se seguiran las especificaciones pedidas solo para los de tipo Héroe.
public class Heroe extends Personaje {

    private Tipo tipo;

    //Declaración de tipos de Héroes utilizando enumeraciones
    enum Tipo{
        HOBBITS,
        HUMANOS,
        ELFOS;
    }

    public Heroe(String nombre, int puntosVida, int resistencia, Tipo tipo) {
        super(nombre, puntosVida, resistencia);
        this.tipo = tipo;
    }

    public Tipo getTipo() {
        return tipo;
    }

    public void setTipo(Tipo tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return getNombre() + " (Vida = " + getPuntosVida() + " Armadura = " + getResistencia() + ")";
    }


    //Ataque de los Héroes tirando dos dados con números aleatorios de 0 a 100 y cogiendo el número mayor
    public int lazarDados() {
        int dado1 = (int) (Math.random() * 100) * 1;
        int dado2 = (int) (Math.random() * 100) * 1;

        return Math.max(dado1, dado2);
    }

    //Ataque de los Héroes restando el número mayor de los dados sacado en el método anterior a la resistencia de cada personaje
    public void ataque(Bestia bestia) {
        int ataque = lazarDados();
        int resistencia = bestia.getResistencia();
        int herida = ataque - resistencia;

        //Si el daño(herida) es menor o igual que 0 no puede atacar
        if (herida <= 0) {
                herida = 0;
            }
        System.out.println(" saca: " + ataque + " puntos de potencia de ataque y le quita: " + herida + " puntos de vida a " + bestia.getNombre() );

    }
}
