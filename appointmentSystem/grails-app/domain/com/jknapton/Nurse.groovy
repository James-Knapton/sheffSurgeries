package com.jknapton

class Nurse {
    String nurseName;
    String qualification;
    String nurseEmail;
    String nurseOffice;
    String nursePhone;

String toString(){
    return nurseName;
}
    
    static hasMany = [surgeries:Surgery, doctors:Doctor]
    static belongsTo = [Surgery, Doctor]
 

    static constraints = {
        nurseName blank: false, nullable: false;
        qualification blank: false, nullable: false;
        nurseEmail blank: false, nullable: false, email: true;
        nurseOffice blank: false, nullable: false;
        nursePhone blank: false, nullable: false;
    }
}
