package com.example.franmay.listview;

import android.os.Parcel;
import android.os.Parcelable;

public class Jugador implements Parcelable {

    int foto;
    String nombre;
    String equipo;
    String pais;
    int indiceEquipo;
    String posicion;
    int indicePosicion;
    int edad;


    public Jugador()
    {
        foto = 0;
        nombre = "";
        equipo = "";
        pais="";
        indiceEquipo = 0;
        posicion = "";
        indicePosicion = 0;
        this.edad = 0;
    }


    public Jugador(int foto, String nombre, String equipo, String pais, int indiceEquipo, String posicion,
                   int indicePosicion, int edad)
    {
        this.foto = foto;
        this.nombre = nombre;
        this.equipo = equipo;
        this.pais = pais;
        this.indiceEquipo = indiceEquipo;
        this.posicion = posicion;
        this.indicePosicion = indicePosicion;
        this.edad = edad;
    }

    protected Jugador(Parcel in) {
        foto = in.readInt();
        nombre = in.readString();
        equipo = in.readString();
        pais = in.readString();
        indiceEquipo = in.readInt();
        posicion = in.readString();
        indicePosicion = in.readInt();
        edad = in.readInt();
    }

    public static final Creator<Jugador> CREATOR = new Creator<Jugador>() {
        @Override
        public Jugador createFromParcel(Parcel in) {
            return new Jugador(in);
        }

        @Override
        public Jugador[] newArray(int size) {
            return new Jugador[size];
        }
    };

    public int getFoto() {
        return foto;
    }

    public String getNombre() {
        return nombre;
    }

    public String getEquipo() {
        return equipo;
    }

    public String getPais() {
        return pais;
    }

    public int getIndiceEquipo() {
        return indiceEquipo;
    }

    public String getPosicion() {
        return posicion;
    }

    public int getIndicePosicion() {
        return indicePosicion;
    }

    public int getEdad() {
        return edad;
    }


    public void setFoto(int foto) {
        this.foto = foto;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEquipo(String equipo) {
        this.equipo = equipo;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public void setIndiceEquipo(int indiceEquipo) {
        this.indiceEquipo = indiceEquipo;
    }

    public void setPosicion(String posicion) {
        this.posicion = posicion;
    }

    public void setIndicePosicion(int indicePosicion) {
        this.indicePosicion = indicePosicion;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }


    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeInt(foto);
        dest.writeString(nombre);
        dest.writeString(equipo);
        dest.writeString(pais);
        dest.writeInt(indiceEquipo);
        dest.writeString(posicion);
        dest.writeInt(indicePosicion);
        dest.writeInt(edad);
    }
}
