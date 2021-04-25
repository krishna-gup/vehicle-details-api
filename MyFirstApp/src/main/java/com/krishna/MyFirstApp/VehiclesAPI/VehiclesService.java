package com.krishna.MyFirstApp.VehiclesAPI;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
//import java.util.Arrays;
import java.util.List;
import java.util.Optional;

@Service
public class VehiclesService {

    @Autowired
    private VehiclesRepository vehiclesRepository;

//    private List<Vehicles> vehicles = new ArrayList<>(Arrays.asList(
//            new Vehicles("Krishna","UP32AB1234","BMW",25000.00,true),
//            new Vehicles("Ram","DL1C3452","Maruti",21000.00,true),
//            new Vehicles("Raman","GY12FR1234","Honda",1000.00,true)
//    ));

    public List<Vehicles> getVehicles() {
        //return vehicles;
        List<Vehicles> vehicles = new ArrayList<>();
        vehiclesRepository.findAll()
                .forEach(vehicles::add);
        return vehicles;
    }

    public Optional<Vehicles> getVehiclesById(String id) {
       //return vehicles.stream().filter(t -> t.getRegistrationNumber().equals(id)).findFirst().get();
       return vehiclesRepository.findById(id);
    }

    public void addNewVehicle(Vehicles vehicle) {
        // vehicles.add(vehicle);
        vehiclesRepository.save(vehicle);
    }

    public void updateVehicle(Vehicles vehicle, String id) {
//        for (int i = 0; i < vehicles.size(); i++) {
//            Vehicles veh = vehicles.get(i);
//            if(veh.getRegistrationNumber().equalsIgnoreCase(id))
//                vehicles.set(i,vehicle);
//        }
        vehiclesRepository.save(vehicle);
    }

    public void deleteVehicle(String id) {
//        vehicles.removeIf(t -> t.getRegistrationNumber().equalsIgnoreCase(id));
          vehiclesRepository.deleteById(id);
    }
}
