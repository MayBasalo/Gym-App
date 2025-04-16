package org.gym.user.childclasses;

import org.gym.user.User;

import java.util.ArrayList;
import java.util.List;

public class Trainer extends User {

    private List<Integer> assignedClassIds = new ArrayList<>();

    public Trainer(int id, String username, String password, String email, String phoneNumber, String address) {
        super(id, username, password, email, phoneNumber, address, "Trainer");
    }

    public void assignClass(int classId) {
        assignedClassIds.add(classId);
    }

    public List<Integer> getAssignedClassIds() {
        return assignedClassIds;
    }

    public void printTrainerProfile() {
        System.out.println("👨‍🏫 Trainer: " + getUsername());
        System.out.println("Assigned Class IDs: " + assignedClassIds);
    }
}