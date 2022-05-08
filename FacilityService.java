package LHM.Service;

import LHM.Entity.Facility;
import LHM.Repository.FacilityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class FacilityService {
    @Autowired
    public FacilityRepository repository;

    public Facility addNewFacility(Facility f){
        return repository.save(f);
    }

    public List<Facility> getAllFacility(){
        return repository.findAll();
    }

}
