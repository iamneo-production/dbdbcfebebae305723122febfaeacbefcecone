package home.coder.project.workspace.springapp.src.service;

import home.coder.project.workspace.springapp.src.model.Medicine;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class MedicineService {

    public interface MedicineService {
        boolean addMedicine(Medicine medicine);
    
        boolean updateMedicine(int medicineId, Medicine updatedMedicine);
    }

    
}
