package com.advindiancoder;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Doctor {
    private String name;
    private String specialization;

    public Doctor(String name, String specialization) {
        this.name = name;
        this.specialization = specialization;
    }

    public String getName() {
        return name;
    }

    public String getSpecialization() {
        return specialization;
    }
}

class Patient {
    private String name;
    private int age;
    private String gender;

    public Patient(String name, int age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getGender() {
        return gender;
    }
}

class Appointment {
    private Doctor doctor;
    private Patient patient;
    private String date;

    public Appointment(Doctor doctor, Patient patient, String date) {
        this.doctor = doctor;
        this.patient = patient;
        this.date = date;
    }

    public Doctor getDoctor() {
        return doctor;
    }

    public Patient getPatient() {
        return patient;
    }

    public String getDate() {
        return date;
    }
}

class Hospital {
    private String name;
    private List<Doctor> doctors;
    private List<Patient> patients;
    private List<Appointment> appointments;

    public Hospital(String name) {
        this.name = name;
        doctors = new ArrayList<>();
        patients = new ArrayList<>();
        appointments = new ArrayList<>();
    }

    public void addDoctor(Doctor doctor) {
        doctors.add(doctor);
    }

    public void addPatient(Patient patient) {
        patients.add(patient);
    }

    public void bookAppointment(String doctorName, String patientName, String appointmentDate) {
        Doctor doctor = getDoctorByName(doctorName);
        if (doctor == null) {
            System.out.println("Doctor not found.");
            return;
        }

        Patient patient = getPatientByName(patientName);
        if (patient == null) {
            System.out.println("Patient not found.");
            return;
        }

        Appointment appointment = new Appointment(doctor, patient, appointmentDate);
        appointments.add(appointment);
        System.out.println("Appointment booked successfully.");
    }

    public void showAppointments() {
        if (appointments.isEmpty()) {
            System.out.println("No appointments scheduled.");
        } else {
            for (Appointment appointment : appointments) {
                System.out.println("Doctor: " + appointment.getDoctor().getName()
                        + ", Patient: " + appointment.getPatient().getName()
                        + ", Date: " + appointment.getDate());
            }
        }
    }

    private Doctor getDoctorByName(String name) {
        for (Doctor doctor : doctors) {
            if (doctor.getName().equals(name)) {
                return doctor;
            }
        }
        return null;
    }

    private Patient getPatientByName(String name) {
        for (Patient patient : patients) {
            if (patient.getName().equals(name)) {
                return patient;
            }
        }
        return null;
    }

	public String getName() {
		// TODO Auto-generated method stub
		return null;
	}
}

public class HospitalManagementApp {
    public static void main(String[] args) {
        Hospital hospital = new Hospital("MyHospital");

        Doctor doctor1 = new Doctor("Dr. Smith", "Cardiology");
        Doctor doctor2 = new Doctor("Dr. Johnson", "Dermatology");
        Doctor doctor3 = new Doctor("Dr. Williams", "Orthopedics");

        hospital.addDoctor(doctor1);
        hospital.addDoctor(doctor2);
        hospital.addDoctor(doctor3);

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Welcome to " + hospital.getName() + " Hospital Management System");
            System.out.println("1. Book an appointment");
            System.out.println("2. View appointments");
            System.out.println("3. Exit");
            System.out.print("Enter your choice (1-3): ");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume the newline character

            if (choice == 1) {
                System.out.print("Enter doctor's name: ");
                String doctorName = scanner.nextLine();
                System.out.print("Enter patient's name: ");
                String patientName = scanner.nextLine();
                System.out.print("Enter appointment date (YYYY-MM-DD): ");
                String appointmentDate = scanner.nextLine();
                hospital.bookAppointment(doctorName, patientName, appointmentDate);
            } else if (choice == 2) {
                System.out.println("Appointments:");
                hospital.showAppointments();
            } else if (choice == 3) {
                System.out.println("Exiting the program...");
                break;
            } else {
                System.out.println("Invalid choice. Please enter a valid option.");
            }
        }
    }
}
