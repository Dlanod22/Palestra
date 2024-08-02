package com.generation.palestra.entities;

import lombok.Data;
import lombok.ToString;

@Data
@ToString(callSuper = true)
public class Cliente extends Persona{
    
    private Corso corso;
    private Scheda scheda;
    private PianoAbbonameto pianoAbbonamento;

    int eta;

    double peso;

    int altezza;

    char sesso;

    String obiettivo;

    
}
