package com.jknapton


class Surgery {
    String name;
    String address;
    String postcode;
    String telephone;
    int numberOfPatients;
    String description;
    String openingTime;
    boolean registeringNewPatients;
  
String toString(){
    return name;
}
    
    static hasMany = [appointments:Appointment, doctors:Doctor, nurses:Nurse, patients:Patient, receptionists:Receptionist]
 

    static constraints = {
        name blank: false, nullable: false;
        address blank: false, nullable: false;
        postcode blank: false, nullable: false;
        telephone blank: false, nullable: false;
        numberOfPatients blank: false, nullable: false;
        description blank: false, nullable: false, widget:'textarea';
        openingTime blank: false, nullable: false;
        registeringNewPatients blank: false, nullable: false;
      
   

    }
}
