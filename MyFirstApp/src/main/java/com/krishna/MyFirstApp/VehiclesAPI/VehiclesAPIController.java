package com.krishna.MyFirstApp.VehiclesAPI;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class VehiclesAPIController {

    @Autowired
    private VehiclesService vehiclesService;

    @RequestMapping("/vehicles")
    public List<Vehicles> getVehicleDetails() {
        return vehiclesService.getVehicles();
    }

    @RequestMapping("/vehicles/{id}")
    public Optional<Vehicles> getVehiclesById(@PathVariable String id) {
        return vehiclesService.getVehiclesById(id);
    }

    @RequestMapping(method = RequestMethod.POST, value = "/vehicles")
    public void postVehicles(@RequestBody Vehicles vehicle) {
        vehiclesService.addNewVehicle(vehicle);
    }

    @RequestMapping(method = RequestMethod.PUT, value = "/vehicles/{id}")
    public void updateVehicles(@RequestBody Vehicles vehicle, @PathVariable String id) {
        vehiclesService.updateVehicle(vehicle,id);
    }

    @RequestMapping(method = RequestMethod.DELETE, value = "/vehicles/{id}")
    public void deleteVehicle(@PathVariable String id) {
        vehiclesService.deleteVehicle(id);
    }

}
