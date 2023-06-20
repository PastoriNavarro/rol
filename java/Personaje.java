package com.Pastori.Rol.java;

//Super clase donde se crean los personajes predefinidos que sirven para cualquier tipo de luchador
public abstract class Personaje {
    private String nombre;
    private int puntosVida;
    private int resistencia;

    public Personaje(String nombre, int puntosVida, int resistencia) {
        this.nombre = nombre;
        this.puntosVida = puntosVida;
        this.resistencia = resistencia;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getPuntosVida() {
        return puntosVida;
    }

    public void setPuntosVida(int puntosVida) {
        this.puntosVida = puntosVida;
    }

    public int getResistencia() {
        return resistencia;
    }

    public void setResistencia(int resistencia) {
        this.resistencia = resistencia;
    }

    public void quitarVida(int herida) {
        this.puntosVida = this.puntosVida-herida;
    }

    //Método para comprobar si un personaje está muerto, es decir, cuando se quede sin puntos de vida.
    public boolean estaMuerto(){
        boolean res = false;
        if(puntosVida <=0){
            res = true;
        }
        return res;
    }

    //Método usado para reducir armadura del contrincante en alguno de los casos que nos piden en el enunciado
    public void reduceArmadura(){
        this.resistencia = this.resistencia - ((this.resistencia*100)/10);
    }
}
