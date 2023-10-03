package home.coder.project.workspace.springapp.src.controller;

import home.coder.project.workspace.springapp.src.model.Medicine;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.*;

@RestController
@RequestMapping("/medicines")
public class MedicineController {
    private List<Medicine> pharmacySystem = new ArrayList<>();
    @PostMapping("/")
    public boolean addMedicine(@RequestBody Medicine medicine) {
        return pharmacySystem.add(medicine);
    }

    @PutMapping("/{medicineId}")
    public boolean updateMedicine(@PathVariable int medicineId, @RequestBody Medicine updatedMedicine) {
        for (Medicine medicine : pharmacySystem) {
            if (medicine.getMedicineId() == medicineId) {
                medicine.setMedicineName(updatedMedicine.getMedicineName());
                medicine.setPrice(updatedMedicine.getPrice());
                medicine.setQuantity(updatedMedicine.getQuantity());
                medicine.setDescription(updatedMedicine.getDescription());
                return true; 
            }
        }
        return false;
    }
}