package com.juan.myappjuanipia.model;
//este es el pojo
public class Datos {

    private String nombre;
    private String apellido;
    private String nickname;
    private String edad;
    private String colegio;
    private String genero;
    private String puntaje;

    public Datos(){

    }

    public  Datos(String nombre, String apellido, String nickname, String edad, String colegio, String genero, String puntaje){
        this.nombre = nombre;
        this.apellido = apellido;
        this.nickname = nickname;
        this.edad = edad;
        this.colegio = colegio;
        this.genero = genero;
        this.puntaje = puntaje;
    }
    //REALIZAMOS EL SET PARA AGREGAR DATOS
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public void setApeliido(String apellido){
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
    public void setPuntaje(String puntaje ){
        this.genero = puntaje;
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
    public String getPuntaje(){
        return puntaje;
    }

    @Override
    public String toString() {
        return "Datos{" +
                "nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", nickname='" + nickname + '\'' +
                ", edad='" + edad + '\'' +
                ", colegio='" + colegio + '\'' +
                ", genero='" + genero + '\'' +
                ", puntaje='" + puntaje + '\'' +
                '}';
    }
}
