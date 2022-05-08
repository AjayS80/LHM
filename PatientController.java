package LHM.Controller;

import LHM.Entity.Patient;
import LHM.Service.PatientService;
import org.springframework.web.bind.annotation.*;


@RestController
public class PatientController{
private PatientService service;
@PostMapping("/addPatient")
public Patient addNewPatient(@RequestBody Patient s){
    return service.addNewUser(s);
}

@GetMapping("/getPatientById ")
public Patient findPatientByID(@PathVariable Long id){
    return service.getPatient(id);
}
}