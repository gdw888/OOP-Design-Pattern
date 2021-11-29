package com.gdw888.designpattern.memento;

import java.util.ArrayList;
import java.util.List;

public class Workflow {

	private String workFlowName;
	private List<String> workflow;
	
	
	public Workflow(String name) {
		workflow = new ArrayList<>();
		workFlowName = name;
	}
	
	public Workflow() {
		workflow = new ArrayList<>();
	}

	public List<String> getWorkflow() {
		return workflow;
	}

	public void setWorkflow(List<String> workflow) {
		this.workflow = workflow;
	}

	public String getWorkFlowName() {
		return workFlowName;
	}

	public void setWorkFlowName(String workFlowName) {
		this.workFlowName = workFlowName;
	}
	
	public void addStep(String step) {
		workflow.add(step);
	}
	
	public void removeStep(String step) {
		if (workflow.contains(step))
			workflow.remove(step);
	}

	@Override
	public String toString() {
		return "Workflow [workFlowName=" + workFlowName + ", workflow=" + workflow + "]";
	}
}
