package edu.dosw.parcial.factoryPhatern;

import java.time.*;

public abstract class EventFactory {

    private int duracion;
    private String titulo;
    private LocalDateTime fecha;
    private Time hora;
    private int cupoMaximo;

    public EventFactory crearEvento(String tipoEvento){

        if(tipoEvento.toUpperCase().equals("CONFERENCIA")) return new ConferenciaEvent();
        if(tipoEvento.toUpperCase().equals("TALLER")) return new TallerEvent();
        if(tipoEvento.toUpperCase().equals("HACKATHON")) return new HackatonEvent();

    }

}
