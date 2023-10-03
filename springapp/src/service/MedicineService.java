package home.coder.project.workspace.springapp.src.service;

import home.coder.project.workspace.springapp.src.model.Medicine;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MedicineService {
    private List<Medicine> pharmacySystem = new ArrayList<>();

    @PostMapping("/")
    public boolean addMedicine(@RequestBody Medicine medicine) {
        // Add the medicine to the pharmacy system (in-memory list)
        return pharmacySystem.add(medicine);
    }

    @PutMapping("/{medicineId}")
    public boolean updateMedicine(@PathVariable int medicineId, @RequestBody Medicine updatedMedicine) {
        for (Medicine medicine : pharmacySystem) {
            if (medicine.getMedicineId() == medicineId) {
                // Update the medicine with the new details
                medicine.setMedicineName(updatedMedicine.getMedicineName());
                medicine.setPrice(updatedMedicine.getPrice());
                medicine.setQuantity(updatedMedicine.getQuantity());
                medicine.setDescription(updatedMedicine.getDescription());
                return true; // Successfully updated
            }
        }
        return false; // Medicine not found
    }
}

