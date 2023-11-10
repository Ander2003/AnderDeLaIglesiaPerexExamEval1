package com.example.anderdelaiglesiaperexexameval1;

import java.io.Serializable;

public class Lugar implements Serializable {

        private String titulo;
        private String descripcion;
        private int puntuacion;
        private int imagenResourceId;

    public Lugar(String titulo, String descripcion,  int puntuacion, int imagenResourceId) {
            this.titulo = titulo;
            this.descripcion = descripcion;
            this.puntuacion = puntuacion;
            this.imagenResourceId = imagenResourceId;
        }

        public String getTitulo() {
            return titulo;
        }

        public String getDescripcion() {
            return descripcion;
        }

        public int getImagenResourceId() {
            return imagenResourceId;
        }

        public int getPuntuacion() {
            return puntuacion;
        }
}
