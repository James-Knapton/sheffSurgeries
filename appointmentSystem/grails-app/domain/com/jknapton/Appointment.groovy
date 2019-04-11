package com.jknapton

class  Appointment {

    String appointmentDay;
    Date appointmentDate;
    String appointmentTime;
    int appointmentDuration;
    String roomNumber;

    static belongsTo = [Doctor, Surgery]
    static hasMany = [surgeries:Surgery, doctors:Doctor]
   

    String toString(){
        return appointmentDate;
    }

    static constraints = {
        appointmentDay blank: false, nullable: false;
        appointmentDate blank: false, nullable: false;
        appointmentTime blank: false, nullable: false;
        appointmentDuration blank: false, nullable: false;
        roomNumber blank: false, nullable: false;
    
    }
}
