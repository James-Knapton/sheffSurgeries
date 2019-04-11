package com.jknapton

class Doctor {

	String doctorName;
	String qualification;
	String position;
	String doctorEmail;
	String doctorUsername;
	String doctorPassword;
	String doctorOffice;
	String doctorPhone;
	String bio;

	String toString(){
	    return doctorName;
	}
    
    static hasMany = [appointments:Appointment, nurses:Nurse, patients:Patient, 		prescriptions:Prescription, surgeries:Surgery]
    static belongsTo = [Patient, Surgery]
    

    static constraints = {
        doctorName blank: false, nullable: false;
        qualification blank: false, nullable: false;
        position blank: false, nullable: false;
        doctorEmail blank: false, nullable: false, email: true;
        doctorUsername blank: false, nullable: false, unique: true;
        doctorPassword blank: false, nullable: false;
        doctorOffice blank: false, nullable: false;
        doctorPhone blank: false, nullable: false;
        bio blank: false, nullable: false, widget: 'textarea';
        }
}
