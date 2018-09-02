package empire.anookinov.empirepetclinic.services;

import empire.anookinov.empirepetclinic.model.Vet;

import java.util.Set;

public interface VetService {

    Vet findById(Long id);

    Vet save(Vet vet);

    Set<Vet> findAll();
}
