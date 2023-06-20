//clase que hereda de personajes y donde se seguiran las especificaciones pedidas solo para los de tipo com.Pastori.Rol.java.Bestia.
public class Bestia extends Personaje {

    private Tipo tipo;

    enum Tipo{
        ORCOS,
        TRASGOS;
    }

    public Bestia(String nombre, int puntosVida, int resistencia, Tipo tipo) {
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

    //Lanzar 1 dado para el ataque de las bestias sacando números aleatorios del 0 a 90
    public int lanzarDados() {
        int dado1 = (int) (Math.random() * 90) * 1;

        return dado1;
    }

    //ataque de las bestias restando el resultado del lanzamiento de dados a la resistencia del personaje
    public void ataque(Heroe heroe) {
        int ataque = lanzarDados();
        int resistencia = heroe.getResistencia();
        int herida = ataque - resistencia;

        //Si el daño(herida) realizado es menor que 0 la bestia no podrá atacar porque la resistencia del defensor es mayor que la potencia de ataque
            if (herida <= 0){
                System.out.println("El ataque no se puede producir porque la resistencia del defensor es mayor que la potencia de ataque");;
            }

        System.out.println("Potencia de ataque : " + ataque + "\n" + " puntos " + "resitencia " + resistencia + "\n" + "herida: " + herida );

    }
}
