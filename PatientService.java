package LHM.Service;

import LHM.Entity.Patient;
import LHM.Repository.PatientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PatientService {
    @Autowired
    private PatientRepository repository;

    public Patient addNewUser(Patient t){
        return repository.save(t);
    }

    public Patient getPatient(Long id){
        return repository.findById(id).orElse(null);
    }

}
