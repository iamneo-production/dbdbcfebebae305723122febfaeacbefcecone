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
        this.medicineName=medicineName;
    }
    void setPrice(float price){
        this.price=price;
    }
    void setQuantity(int quantity){
        this.quantity=quantity;
    }
    void setDescription(String description){
        this.description=description;
    }
    int getMedicineId(){
        return medicineId;
    }
    String getMedicineName(){
        return medicineName;
    }
    float getPrice(){
        return price;
    }
    int getQuantity(){
        return quantity;
    }
    String getDescription(){
        return description;
    }
}