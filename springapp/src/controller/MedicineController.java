package home.coder.project.workspace.springapp.src.controller;

import home.coder.project.workspace.springapp.src.model.Medicine;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/medicines")
public class MedicineController{
    @PostMapping()
    public boolean addMedicine(Medicine medicine){
        return medicines.add(medicine);
    }

    @PutMapping("/{medicineId}")
    public List<Medicine> updateMedicine(int medicineId){
        
    }
}