package ru.kubantsev.hello.swagger.demo.dto;

import java.util.HashMap;
import java.util.Map;

public enum Profile {

    DEV("dev"),
    PROD("prod");

    public final String label;

    private Profile(String label) {
        this.label = label;
    }

    private static final Map<String, Profile> BY_LABEL = new HashMap<>();

    static {
        for (Profile profile: values()) {
            BY_LABEL.put(profile.label, profile);
        }
    }

    public static Profile getValueOfLabel(String label) {
        return BY_LABEL.get(label);
    }

    @Override
    public String toString() {
        return label;
    }
}
