package LHM.Controller;

import LHM.Entity.Facility;
import LHM.Service.FacilityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class FacilityController {
    @Autowired
    private FacilityService service;
    @PostMapping("/addFacility")
    public Facility addNewFacility(@RequestBody Facility f){
        return service.addNewFacility(f);
    }
    @GetMapping("/getFacilities")
    public List<Facility> getFacilities(){
        return service.getAllFacility();
    }

}
