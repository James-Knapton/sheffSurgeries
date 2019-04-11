
package com.jknapton

class BootStrap {

    def init = { servletContext ->


        // APPOINTMENT INSTANCES
        // **************************

        def aptOne = new Appointment
        (
            appointmentDay: 'Thursday',
            appointmentDate: new Date('11/04/2019'),
            appointmentTime: '09:30',
            appointmentDuration: 60,
            roomNumber: 'A-01').save()

        def aptTwo = new Appointment
        (
            appointmentDay: 'Thursday',
            appointmentDate: new Date('11/04/2019'),
            appointmentTime: '10:30',
            appointmentDuration: 45,
            roomNumber: 'A-02').save()

        // ******************************


        // DOCTOR INSTANCES
        // *****************************

        def James = new Doctor
        (
            doctorName: 'James Knapton',
            qualification: 'MBChB',
            position: 'GP',
            doctorEmail: 'JamesAK@gmail.com',
            doctorUsername: 'JamesK1',
            doctorPassword: 'Knapton1',
            doctorOffice: 'DE-1',
            doctorPhone: '0114 2224 333',
            bio: 'Established GP').save()


        def Chris = new Doctor
        (
            doctorName: 'Chris Matthews',
            qualification: 'MBChB',
            position: 'GP',
            doctorEmail: 'ChrisM@gmail.com',
            doctorUsername: 'ChrisM1',
            doctorPassword: 'Matthews1',
            doctorOffice: 'DE-2',
            doctorPhone: '0114 2225 335',
            bio: 'Established GP').save()

        // *****************************

        // NURSE INSTANCES
        // *****************************

        def Samantha = new Nurse
        (
            nurseName: 'Samantha Halliwell',
            qualification: 'Registered General Nurse',
            nurseEmail: 'SHalliwell@gmail.com',
            nurseOffice: 'NF-1',
            nursePhone: '0114 2226 336').save()

        def Jess = new Nurse
        (
            nurseName: 'Jess Wilde',
            qualification: 'Registered General Nurse',
            nurseEmail: 'JWilde@gmail.com',
            nurseOffice: 'NF-2',
            nursePhone: '0114 2227 337').save()
        // *****************************


        // PATIENT INSTANCES
        // *****************************
        def Aaron = new Patient
        (
            patientName: 'Aaron Franks',
            patientAddress: '22 Westfield Lane, Willows End',
            patientResidence: 'Sheffield',
            patientDob: new Date('01/10/1995'),
            patientID: 'PT-1',
            dateRegistered: new Date('01/01/1996'),
            patientPhone: '0114 2228 338').save()

        def Walter = new Patient
        (
            patientName: 'Walter Harkwright',
            patientAddress: '23 Westfield Lane, Willows End',
            patientResidence: 'Sheffield',
            patientDob: new Date('02/10/1995'),
            patientID: 'PT-2',
            dateRegistered: new Date('02/01/1996'),
            patientPhone: '0114 2229 339').save()

         //*****************************

        // PRESCRIPTION INSTANCES
        // *****************************
        def Paracetamol = new Prescription
        (
            pharmacyName: 'Lloyds Pharmacy',
            prescriptionNumber: 111,
            medicine: 'paracetamol',
            daysSupply: 500,
            totalCost: 5.60,
            dateIssued: new Date('11/04/2019'),
            patientPaying: true).save()

        def Benzodiazepines = new Prescription
        (
            pharmacyName: 'Lloyds Pharmacy',
            prescriptionNumber: 112,
            medicine: 'Benzodiazepines',
            daysSupply: 500,
            totalCost: 5.60,
            dateIssued: new Date('11/04/2019'),
            patientPaying: true).save()

        // *****************************

        // RECEPTIONIST INSTANCES
        // *****************************

         def Audrey = new Receptionist
         (
            receptionistName: 'Audrey Halls',
            receptionistEmail: 'AudreyH@gmail.com',
            receptionistUsername: 'AudreyH1',
            receptionistPassword: 'Halls1',
            receptionistPhone: '0114 2230 340').save()

        def Joan = new Receptionist
        (
            receptionistName: 'Joan Calder',
            receptionistEmail: 'JoanC@gmail.com',
            receptionistUsername: 'JoanC1',
            receptionistPassword: 'Calder1',
            receptionistPhone: '0114 2231 341').save()


        // ****************************

        // SURGERY INSTANCES
        // *****************************

        def Marlophone = new Surgery
        (
            name: 'Marlophone Surgery',
            address: '33 Beck Close, The Rounds',
            postcode: 'S2 4JN',
            telephone: '0114 2240 350',
            numberOfPatients: 100,
            description: 'Well established surgery in Sheffield',
            openingTime: '09:00',
            registeringNewPatients: true).save()


        def Snoqualmine = new Surgery
        (
            name: 'Snoqualmine Surgery',
            address: '13 Twin Peaks, Elishere',
            postcode: 'S5 7VB',
            telephone: '0114 2241 351',
            numberOfPatients: 100,
            description: 'Newly established surgery in Sheffield',
            openingTime: '09:00',
            registeringNewPatients: true).save()

            Snoqualmine.addToReceptionists(Audrey);
            Marlophone.addToReceptionists(Joan);

            Paracetamol.addToSurgeries(Snoqualmine)
            Benzodiazepines.addToSurgeries(Marlophone)

            Snoqualmine.addToPatients(Aaron)
            Marlophone.addToPatients(Walter)

            Aaron.addToSurgeries(Snoqualmine)
            Walter.addToSurgeries(Marlophone)

            Aaron.addToPrescriptions(Paracetamol)
            Walter.addToPrescriptions(Benzodiazepines)

            James.addToPrescriptions(Paracetamol)
            Chris.addToPrescriptions(Benzodiazepines)

            James.addToAppointments(aptOne)
            Chris.addToAppointments(aptTwo)

            James.addToPatients(Aaron)
            Chris.addToPatients(Walter)

            James.addToNurses(Samantha)
            Chris.addToNurses(Jess)

            James.addToSurgeries(Snoqualmine)
            Chris.addToSurgeries(Marlophone)

            Aaron.addToDoctors(James)
            Walter.addToDoctors(Chris)

            aptOne.addToSurgeries(Snoqualmine)
            aptTwo.addToSurgeries(Marlophone)

            Samantha.addToSurgeries(Snoqualmine)
            Jess.addToSurgeries(Marlophone)

            Samantha.addToDoctors(James)
            Jess.addToDoctors(Chris)
        // *****************************

        def destroy = {
        }
    }
}
