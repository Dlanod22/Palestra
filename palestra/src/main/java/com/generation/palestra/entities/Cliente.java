package com.generation.palestra.entities;

import lombok.Data;
import lombok.ToString;

@Data
@ToString(callSuper = true)
public class Cliente extends Persona
{

    private Corso corso;
    private Scheda scheda;
    private PianoAbbonamento pianoAbbonamento;

    private int eta;

    private double peso;

    private int altezza;

    private char sesso;

    private String obiettivo;

    
}
