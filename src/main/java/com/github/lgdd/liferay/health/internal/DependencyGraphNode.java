package com.github.lgdd.liferay.health.internal;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
class DependencyGraphNode {

    public enum DependencyGraphNodeState {
        UNDISCOVERED,
        DISCOVERED,
        PROCESSED
    };

    private List<DependencyGraphNode> m_successors = new ArrayList<>();
    private List<DependencyGraphNode> m_predecessors = new ArrayList<>();
    private DependencyGraphNodeState m_state = DependencyGraphNodeState.UNDISCOVERED;

    public void addSuccessor(DependencyGraphNode successor) {
        m_successors.add(successor);
        successor.addPredecessor(this);
    }

    private void addPredecessor(DependencyGraphNode predecessor) {
        m_predecessors.add(predecessor);
    }

    public List<DependencyGraphNode> getSuccessors() {
        return Collections.unmodifiableList(m_successors);
    }

    public List<DependencyGraphNode> getPredecessors() {
        return Collections.unmodifiableList(m_predecessors);
    }

    void setState(DependencyGraphNodeState state) {
        m_state = state;
    }

    boolean isDiscovered() {
        return m_state == DependencyGraphNodeState.DISCOVERED;
    }

    boolean isUndiscovered() {
        return m_state == DependencyGraphNodeState.UNDISCOVERED;
    }

    boolean isProcessed() {
        return m_state == DependencyGraphNodeState.PROCESSED;
    }

}