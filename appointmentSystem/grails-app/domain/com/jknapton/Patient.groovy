package com.jknapton

class Patient {

    String patientName;
    String patientAddress;
    String patientResidence;
    Date patientDob;
    String patientID;
    Date dateRegistered;
    String patientPhone;


    static hasMany = [doctors:Doctor, prescriptions:Prescription, surgeries:Surgery]
    static belongsTo = [Doctor, Surgery]
 
String toString() {
    return patientName;
}


    static constraints = {
        patientName blank: false, nullable: false;
        patientAddress blank: false, nullable: false;
        patientResidence blank: false, nullable: false;
        patientDob blank: false, nullable: false;
        patientID blank: false, nullable: false;
        dateRegistered blank: false, nullable: false;
        patientPhone blank: false, nullable: false;
    }
}
