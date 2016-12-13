package com.example.service;

import com.example.domain.Medalla;
import com.example.domain.TipoMedalla;
import com.example.repository.AtletaRepository;
import com.example.repository.MedallaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MedalService {
    @Autowired
    private MedallaRepository medallaRepository;
    @Autowired
    private AtletaRepository atletaRepository;
/*
    private TipoMedalla Tipo;
    private String Especialidad;
    private String Competicion;
 */
    public void createMedal(){
        Medalla medalla1 = new Medalla(TipoMedalla.Bronce, "Lanzamiento de peso", "Juegos Olímpicos Atenas");
        medalla1.setAtleta(atletaRepository.findByNombreIs("Axel"));
        medallaRepository.save(medalla1);
        Medalla medalla2 = new Medalla(TipoMedalla.Plata, "Ajedrez", "Juegos Olímpicos de México");
        medalla2.setAtleta(atletaRepository.findByNombreIs("Alex"));
        medallaRepository.save(medalla2);
        Medalla medalla3 = new Medalla(TipoMedalla.Plata, "Carrera de obstáculos", "Juegos Olímpicos de Pekín");
        medalla3.setAtleta(atletaRepository.findByNombreIs("Carlos"));
        medallaRepository.save(medalla3);
        Medalla medalla4 = new Medalla(TipoMedalla.Bronce, "Ajedrez", "Juegos Olímpicos de México");
        medalla4.setAtleta(atletaRepository.findByNombreIs("Óscar"));
        medallaRepository.save(medalla4);
        Medalla medalla5 = new Medalla(TipoMedalla.Plata, "Lanzamiento de peso", "Juegos Olímpicos Atenas");
        medalla5.setAtleta(atletaRepository.findByNombreIs("Marcos"));
        medallaRepository.save(medalla5);
        Medalla medalla6 = new Medalla(TipoMedalla.Oro, "Carrera de obstáculos", "Juegos Olímpicos de México");
        medalla6.setAtleta(atletaRepository.findByNombreIs("Antonio"));
        medallaRepository.save(medalla6);
        Medalla medalla7 = new Medalla(TipoMedalla.Bronce, "Ajedrez", "Juegos Olímpicos de Pekín");
        medalla7.setAtleta(atletaRepository.findByNombreIs("Adolfo"));
        medallaRepository.save(medalla7);
        Medalla medalla8 = new Medalla(TipoMedalla.Oro, "Lanzamiento de peso", "Juegos Olímpicos de México");
        medalla8.setAtleta(atletaRepository.findByNombreIs("Fernando"));
        medallaRepository.save(medalla8);
        Medalla medalla9 = new Medalla(TipoMedalla.Oro, "Carrera de obstáculos", "Juegos Olímpicos de Pekín");
        medalla9.setAtleta(atletaRepository.findByNombreIs("Víctor"));
        medallaRepository.save(medalla9);
    }
    public void testMedal(){

    }
}
