package com.juan.myappjuanipia.model;
//este es el pojo
public class Datos {

    private String nombre;
    private String apellido;
    private String nickname;
    private String edad;
    private String colegio;
    private int puntaje;
    private String genero;


    public Datos(){

    }

    public  Datos(String nombre, String apellido, String nickname, String edad, String colegio, String genero, String puntaje){
        this.nombre = nombre;
        this.apellido = apellido;
        this.nickname = nickname;
        this.edad = edad;
        this.colegio = colegio;
        this.genero = genero;
        try {
            this.puntaje = Integer.parseInt(puntaje);
        } catch (Exception e) {
            this.puntaje = 0;
        }

    }
    //REALIZAMOS EL SET PARA AGREGAR DATOS
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public void setApellido(String apellido){
        this.apellido = apellido;
    }
    public void setNickname(String nickname){
        this.nickname = nickname;
    }
    public void setEdad(String edad ){
        this.edad = edad;
    }
    public void setColegio(String colegio ){
        this.colegio = colegio;
    }
    public void setGenero(String genero ){
        this.genero = genero;
    }
    public void setPuntaje(int puntaje ){
        this.puntaje = puntaje;
    }

//METODOS GET PARA OBTENER EL VALOR DE LAS VARIABL

    public String getNombre(){
        return nombre;
    }
    public String getApellido(){
        return apellido;
    }
    public String getNickname(){
        return nickname;
    }
    public String getEdad(){
        return edad;
    }
    public String getColegio(){
        return colegio;
    }
    public String getGenero(){
        return genero;
    }
    public int getPuntaje(){
        return puntaje;
    }

    @Override
    public String toString() {
        return  "Nombre: " + nombre +
                "\nApellido: " + apellido +
                "\nNickname: " + nickname +
                "\nEdad: " + edad +
                "\nColegio: " + colegio +
                "\nGénero: " + genero +
                "\nPuntaje: " + puntaje;
    }


}
