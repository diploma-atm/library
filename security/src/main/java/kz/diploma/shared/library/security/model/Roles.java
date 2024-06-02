package kz.diploma.shared.library.security.model;

public enum Roles {
    CLIENT("CLIENT"), ADMIN("ADMIN");

    public final String name;

    Roles(String name) {
        this.name = name;
    }
}
