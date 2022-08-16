package com.kurdestan_parking.parking;

import com.kurdestan_parking.Parking;


import java.util.List;

public interface IParkingService {

    Parking save(Parking parking);
    Parking update(Parking parking);
    void delete(Long id);
    Parking getById(Long id);
    List<Parking> getAll();
    List<Parking> filterByTaradod(Long pelak );



}
