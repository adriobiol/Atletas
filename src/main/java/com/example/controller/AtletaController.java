package com.example.controller;

import com.example.domain.Atleta;
import com.example.domain.TipoMedalla;
import com.example.repository.AtletaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

import static java.util.stream.Collectors.groupingBy;


@RestController
@RequestMapping("/athletes")
public class AtletaController {
    @Autowired
    private AtletaRepository atletaRepository;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Atleta createAthlete(@RequestBody Atleta atleta){
        return atletaRepository.save(atleta);
    }

    @GetMapping
    public List<Atleta> getAllAthletes(){
        return atletaRepository.findAll();
    }

    @PutMapping
    public Atleta updateAthlete(@RequestBody Atleta atleta){
        return atletaRepository.save(atleta);
    }

    @DeleteMapping("/{id}")
    public void deleteAthleteID(@PathVariable Long id){
        Atleta atleta = atletaRepository.findOne(id);
        if(atleta != null ) atletaRepository.delete(id);
    }


    @GetMapping("/GroupByNacionality")
    public Map<String, List<Atleta>> getAthleteGroupByNacionality(){
        return atletaRepository
                .findAll()
                .parallelStream()
                .collect(groupingBy(Atleta::getNacionalidad));
    }

    @GetMapping("/GroupByMedalType")
    public Map<TipoMedalla, List<Atleta>> getAthleteGroupByMedalType(){
        return atletaRepository
                .findAll()
                .parallelStream()
                .collect(groupingBy(athlete -> {
                    if(athlete.getMedallas().stream().anyMatch(medal -> medal.getTipo() == TipoMedalla.Oro)){
                        return TipoMedalla.Oro;
                    }else if(athlete.getMedallas().stream().anyMatch(medal -> medal.getTipo() == TipoMedalla.Plata)){
                        return TipoMedalla.Plata;
                    }else if(athlete.getMedallas().stream().anyMatch(medal -> medal.getTipo() == TipoMedalla.Bronce)){
                        return TipoMedalla.Bronce;
                    }else {
                        return TipoMedalla.NULL;
                    }
                }));
    }



}
