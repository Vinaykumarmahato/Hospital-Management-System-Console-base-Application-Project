
# Project Name

- 🏥 Hospital Management System

## Features

- Book an appointment between a doctor and a patient. 🔥
- Book an appointment between a doctor and a patient. 🚀


## 📚 Classes

- 🩺 Doctor
- name: The name of the doctor.
- specialization: The specialization of the doctor.

## 🏥 Patient
- name: The name of the patient.
- age: The age of the patient.
- gender: The gender of the patient.
## 📅 Appointment
- doctor: The doctor associated with the appointment.
- patient: The patient associated with the appointment.
- date: The date of the appointment.
## 🏥 Hospital
- name: The name of the hospital.
- doctors: A list of doctors in the hospital.
- patients: A list of patients in the hospital.
- appointments: A list of scheduled appointments.

## 🔒 Methods
- addDoctor(Doctor doctor): Adds a doctor to the hospital.
- addPatient(Patient patient): Adds a patient to the hospital.
- bookAppointment(String doctorName, String patientName, String appointmentDate): Books an appointment between a doctor and a patient.
- showAppointments(): Displays all scheduled appointments.
## 🚀 Usage
- Instantiate a Hospital object by providing the hospital name.
- Add doctors to the hospital using the addDoctor() method.
- Add patients to the hospital using the addPatient() method.
- Run the program and choose from the following options:
- Enter 1️⃣ to book an appointment. Provide the doctor's name, patient's name, and appointment date.
- Enter 2️⃣ to view scheduled appointments.
- Enter 3️⃣ to exit the program.

## 🌟 Example

-    public class HospitalManagementApp {
-    public static void main(String[] args) {
-       Hospital hospital = new Hospital("MyHospital");

        // Create doctors
        Doctor doctor1 = new Doctor("Dr. Smith", "Cardiology");
        Doctor doctor2 = new Doctor("Dr. Johnson", "Dermatology");
        Doctor doctor3 = new Doctor("Dr. Williams", "Orthopedics");

        // Add doctors to the hospital
        hospital.addDoctor(doctor1);
        hospital.addDoctor(doctor2);
        hospital.addDoctor(doctor3);

        // ...

        // Run the program and interact with the Hospital Management System
    }
}

## 📄 License
- This project is licensed under the MIT License.

