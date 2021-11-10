package com.github.lgdd.liferay.health.internal;

public class MissingDependency {
    private final String name;
    private final String type;
    private final String bundleName;

    public MissingDependency(String name, String type, String bundleName) {
        this.name = name;
        this.type = type;
        this.bundleName = bundleName;
    }
    public String getName() {
        return name;
    }
    public String getType() {
        return type;
    }
    public String getBundleName() {
        return bundleName;
    }

    @Override
    public String toString() {
        return "Missing dependency: "
                + "name = " + name + " "
                + "type = " + type + " "
                + "bundleName = " + bundleName;
    }
}
