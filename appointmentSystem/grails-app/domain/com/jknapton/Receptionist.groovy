package com.jknapton

class Receptionist {
    String receptionistName;
    String receptionistEmail;
    String receptionistUsername;
    String receptionistPassword;
    String receptionistPhone;
    
String toString() {
    return receptionistName;
}
   
    static hasMany = [surgeries:Surgery]
    static belongsTo = [Surgery]
    
    static constraints = { 
        receptionistName blank: false, nullable: false;
        receptionistEmail blank: false, nullable: false, email: true;
        receptionistUsername  blank: false, nullable: false, unique: true;
        receptionistPassword blank: false, nullable: false;
        receptionistPhone blank: false, nullable: false;
    

    }
}
