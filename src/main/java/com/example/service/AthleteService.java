package com.example.service;

import com.example.domain.Atleta;
import com.example.repository.AtletaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;


@Service
public class AthleteService {
    @Autowired
    private AtletaRepository atletaRepository;
/*
    private String Nombre;
    private String Apellido;
    private String Nacionalidad;
    private LocalDate Nacimiento;
 */
    public void createAthlete(){
        Atleta atleta1 = new Atleta("Juan", "Vicente", "Escandinava", LocalDate.of(1978, 2, 11));
        atletaRepository.save(atleta1);
        Atleta atleta2 = new Atleta("Antonio", "García", "Soviética", LocalDate.of(1916, 3, 12));
        atletaRepository.save(atleta2);
        Atleta atleta3 = new Atleta("Adolfo", "Sánchez", "China", LocalDate.of(1927, 12, 14));
        atletaRepository.save(atleta3);
        Atleta atleta4 = new Atleta("Fernando", "Cervilla", "Española", LocalDate.of(1839, 10 , 20));
        atletaRepository.save(atleta4);
        Atleta atleta5 = new Atleta("Víctor", "Tejo", "Norcoreana", LocalDate.of(1923, 6, 7));
        atletaRepository.save(atleta5);
        Atleta atleta6 = new Atleta("José", "Loscos", "Surcoreana", LocalDate.of(1908, 4, 2));
        atletaRepository.save(atleta6);
        Atleta atleta7 = new Atleta("Axel", "Obiol", "Danesa", LocalDate.of(1972, 3, 4));
        atletaRepository.save(atleta7);
        Atleta atleta8 = new Atleta("Alex", "Rafel", "Andorrana", LocalDate.of(1901, 1, 17));
        atletaRepository.save(atleta8);
        Atleta atleta9 = new Atleta("Óscar", "Vanderhoff", "Francesa", LocalDate.of(1956, 11, 12));
        atletaRepository.save(atleta9);
        Atleta atleta10 = new Atleta("Carlos", "Tapero", "Alemana", LocalDate.of(1975, 11, 20));
        atletaRepository.save(atleta10);
        Atleta atleta11 = new Atleta("Miriam", "Lorca", "Británica", LocalDate.of(1946, 11, 17));
        atletaRepository.save(atleta11);
        Atleta atleta12 = new Atleta("Raquel", "Valle-Inclán", "Argentina", LocalDate.of(1924, 4, 18));
        atletaRepository.save(atleta12);
        Atleta atleta13 = new Atleta("Marcos", "Caballero", "Uruguaya", LocalDate.of(1997, 3, 12));
        atletaRepository.save(atleta13);

    }
    public void testAthlete(){
        System.out.println(atletaRepository.findByNacionalidadIs("Andorrana"));
        System.out.println(atletaRepository.findByNacimientoBefore(LocalDate.of(1997, 3, 12)));
    }
}
