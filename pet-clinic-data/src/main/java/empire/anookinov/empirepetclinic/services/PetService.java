package empire.anookinov.empirepetclinic.services;

import empire.anookinov.empirepetclinic.model.Pet;

import java.util.Set;

public interface PetService {

    Pet findById(Long id);

    Pet saveOwner(Pet pet);

    Set<Pet> findAll();
}
