package ru.timur.project.Hubr.enums;

public enum Role {
    ADMIN("ROLE_ADMIN"), USER("ROLE_USER");

    private String role;


    Role(String role) {
        this.role = role;
    }

    public String getRole() {
        return this.role;
    }

}
