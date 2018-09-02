package empire.anookinov.empirepetclinic.services;

import empire.anookinov.empirepetclinic.model.Owner;

public interface OwnerService extends CrudService<Owner, Long> {

    Owner findByLastName(String lastName);

}
