package com.example.pharmacy.service;

import home.coder.project.workspace.springapp.src.model.Medicine;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class MedicineServiceImpl implements MedicineService {
    private List<Medicine> medicines = new ArrayList<>();

    @Override
    public boolean addMedicine(Medicine medicine) {
        medicines.add(medicine);
        return true;
    }

    @Override
    public boolean updateMedicine(int medicineId, Medicine updatedMedicine) {
        for(Medicine medicine: medicines){
            
        }
    }

    
}
