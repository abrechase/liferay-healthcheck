package com.github.lgdd.liferay.health.internal;

import org.apache.felix.dm.ComponentDependencyDeclaration;

class DependencyNode extends DependencyGraphNode {

    private ComponentDependencyDeclaration m_dependencyDeclaration;

    public DependencyNode(ComponentDependencyDeclaration dependencyDeclaration) {
        m_dependencyDeclaration = dependencyDeclaration;
    }

    public ComponentDependencyDeclaration getDependencyDeclaration() {
        return m_dependencyDeclaration;
    }

    public boolean isUnavailableRequired() {
        return m_dependencyDeclaration.getState() == ComponentDependencyDeclaration.STATE_UNAVAILABLE_REQUIRED;
    }

    public boolean isUnavailableOptional() {
        return m_dependencyDeclaration.getState() == ComponentDependencyDeclaration.STATE_UNAVAILABLE_OPTIONAL;
    }

    public boolean isUnavailable() {
        return m_dependencyDeclaration.getState() == ComponentDependencyDeclaration.STATE_UNAVAILABLE_OPTIONAL
                || m_dependencyDeclaration.getState() == ComponentDependencyDeclaration.STATE_UNAVAILABLE_REQUIRED;
    }

    @Override
    public String toString() {
        return m_dependencyDeclaration.getName();
    }
}