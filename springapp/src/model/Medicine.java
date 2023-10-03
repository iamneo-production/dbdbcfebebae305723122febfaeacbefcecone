package home.coder.project.workspace.springapp.src.model;

public class Medicine{
    int medicineId,quantity;
    String medicineName,description;
    float price;

    Medicine(){}
    Medicine(int medicineId,String medicineName,float price,int quantity,String description){
        this.medicineId=medicineId;
        this.medicineName=medicineName;
        this.price=price;
        this.quantity=quantity;
        this.description=description;
    }
    void setMedicineId(int medicineId){
        this.medicineId=medicineId;
    }
    void setMedicineName(String medicineName){
        this.medicineId=medicineId;
    }
}