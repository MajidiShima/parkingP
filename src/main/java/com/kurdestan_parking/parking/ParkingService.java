package com.kurdestan_parking.parking;

import com.kurdestan_parking.Parking;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
@AllArgsConstructor


public class ParkingService implements IParkingService{

    @Override
    public Parking save(Parking parking) {
        return null;
    }

    @Override
    public Parking update(Parking parking) {
        return null;
    }

    @Override
    public void delete(Long id) {

    }

    @Override
    public Parking getById(Long id) {
        return null;
    }

    @Override
    public List<Parking> getAll() {
        return null;
    }

    @Override
    public List<Parking> filterByTaradod(Long pelak) {
        return null;
    }
}
