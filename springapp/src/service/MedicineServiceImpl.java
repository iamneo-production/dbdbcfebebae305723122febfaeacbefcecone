package com.example.pharmacy.service;

import home.coder.project.workspace.springapp.src.model.Medicine;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Map;

@Service
public class MedicineServiceImpl implements MedicineService {
    private Map<Integer, Medicine> medicineMap = new HashMap<>();
    private int nextMedicineId = 1;
    @Override
    public boolean addMedicine(Medicine medicine) {
        medicine.setMedicineId(nextMedicineId);
        medicineMap.put(nextMedicineId, medicine);
        nextMedicineId++;
        return true;
    }
    @Override
    public boolean updateMedicine(int medicineId, Medicine updatedMedicine) {
        if (medicineMap.containsKey(medicineId)) {
            medicineMap.put(medicineId, updatedMedicine);
            return true;
        }
        return false;
    }
    
}
