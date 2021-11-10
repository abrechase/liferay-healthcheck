package com.github.lgdd.liferay.health.internal;

import org.apache.felix.dm.ComponentDeclaration;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CircularDependency {

    private List<ComponentDeclaration> m_components = new ArrayList<>();

    void addComponent(ComponentDeclaration component) {
        m_components.add(component);
    }

    public List<ComponentDeclaration> getComponents() {
        return Collections.unmodifiableList(m_components);
    }

    @Override
    public String toString() {
        String result = "";
        for(ComponentDeclaration c : m_components) {
            result += " -> " + c.getName();
        }
        return result;
    }
}