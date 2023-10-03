package home.coder.project.workspace.springapp.src.controller;

import home.coder.project.workspace.springapp.src.model.Medicine;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/medicines")
public class MedicineController {

    @Autowired
    private MedicineService medicineService;

    @PostMapping("/")
    public boolean addMedicine(@RequestBody Medicine medicine) {
        return medicineService.addMedicine(medicine);
    }

    @PutMapping("/{medicineId}")
    public boolean updateMedicine(@PathVariable int medicineId, @RequestBody Medicine updatedMedicine) {
        return medicineService.updateMedicine(medicineId, updatedMedicine);
    }
}