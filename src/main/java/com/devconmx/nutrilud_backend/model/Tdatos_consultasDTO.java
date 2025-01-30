package com.devconmx.nutrilud_backend.model;

import java.time.LocalDateTime;

public class Tdatos_consultasDTO {
    private int id;
    private int nutriologo_id;
    private int paciente_id;
    private double peso;
    private double estatura;
    private double porcentaje_grasa;
    private double porcentaje_musculo;
    private double imc;
    private double circunferencia_cintura;
    private double circunferencia_cadera;
    private double circunferencia_brazo;
    private double pliegue_bicipital;
    private double pliegue_tricipital;
    private double glucosa;
    private double colesterol;
    private double trigliceridos;
    private String presion_arterial;
    private String fecha_medicion;
    private String siguiente_consulta;
    private LocalDateTime created_at;
    private LocalDateTime updated_at;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getNutriologo_id() {
        return nutriologo_id;
    }

    public void setNutriologo_id(int nutriologo_id) {
        this.nutriologo_id = nutriologo_id;
    }

    public int getPaciente_id() {
        return paciente_id;
    }

    public void setPaciente_id(int paciente_id) {
        this.paciente_id = paciente_id;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getEstatura() {
        return estatura;
    }

    public void setEstatura(double estatura) {
        this.estatura = estatura;
    }

    public double getPorcentaje_grasa() {
        return porcentaje_grasa;
    }

    public void setPorcentaje_grasa(double porcentaje_grasa) {
        this.porcentaje_grasa = porcentaje_grasa;
    }

    public double getPorcentaje_musculo() {
        return porcentaje_musculo;
    }

    public void setPorcentaje_musculo(double porcentaje_musculo) {
        this.porcentaje_musculo = porcentaje_musculo;
    }

    public double getImc() {
        return imc;
    }

    public void setImc(double imc) {
        this.imc = imc;
    }

    public double getCircunferencia_cintura() {
        return circunferencia_cintura;
    }

    public void setCircunferencia_cintura(double circunferencia_cintura) {
        this.circunferencia_cintura = circunferencia_cintura;
    }

    public double getCircunferencia_cadera() {
        return circunferencia_cadera;
    }

    public void setCircunferencia_cadera(double circunferencia_cadera) {
        this.circunferencia_cadera = circunferencia_cadera;
    }

    public double getCircunferencia_brazo() {
        return circunferencia_brazo;
    }

    public void setCircunferencia_brazo(double circunferencia_brazo) {
        this.circunferencia_brazo = circunferencia_brazo;
    }

    public double getPliegue_bicipital() {
        return pliegue_bicipital;
    }

    public void setPliegue_bicipital(double pliegue_bicipital) {
        this.pliegue_bicipital = pliegue_bicipital;
    }

    public double getPliegue_tricipital() {
        return pliegue_tricipital;
    }

    public void setPliegue_tricipital(double pliegue_tricipital) {
        this.pliegue_tricipital = pliegue_tricipital;
    }

    public double getGlucosa() {
        return glucosa;
    }

    public void setGlucosa(double glucosa) {
        this.glucosa = glucosa;
    }

    public double getColesterol() {
        return colesterol;
    }

    public void setColesterol(double colesterol) {
        this.colesterol = colesterol;
    }

    public double getTrigliceridos() {
        return trigliceridos;
    }

    public void setTrigliceridos(double trigliceridos) {
        this.trigliceridos = trigliceridos;
    }

    public String getPresion_arterial() {
        return presion_arterial;
    }

    public void setPresion_arterial(String presion_arterial) {
        this.presion_arterial = presion_arterial;
    }

    public String getFecha_medicion() {
        return fecha_medicion;
    }

    public void setFecha_medicion(String fecha_medicion) {
        this.fecha_medicion = fecha_medicion;
    }

    public String getSiguiente_consulta() {
        return siguiente_consulta;
    }

    public void setSiguiente_consulta(String siguiente_consulta) {
        this.siguiente_consulta = siguiente_consulta;
    }

    public LocalDateTime getCreated_at() {
        return created_at;
    }

    public void setCreated_at(LocalDateTime created_at) {
        this.created_at = created_at;
    }

    public LocalDateTime getUpdated_at() {
        return updated_at;
    }

    public void setUpdated_at(LocalDateTime updated_at) {
        this.updated_at = updated_at;
    }
}
