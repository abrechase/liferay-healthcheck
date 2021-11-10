package com.github.lgdd.liferay.health.internal;

import org.apache.felix.dm.ComponentDeclaration;
class ComponentNode extends DependencyGraphNode {

    private ComponentDeclaration m_componentDeclaration;

    public ComponentNode(ComponentDeclaration componentDeclaration) {
        m_componentDeclaration = componentDeclaration;
    }

    public ComponentDeclaration getComponentDeclaration() {
        return m_componentDeclaration;
    }

    @Override
    public String toString() {
        return m_componentDeclaration.getName();
    }

}