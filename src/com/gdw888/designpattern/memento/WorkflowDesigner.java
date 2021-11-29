package com.gdw888.designpattern.memento;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class WorkflowDesigner {
	private Workflow workflow;
	
	public WorkflowDesigner(String workFlowName) {
		workflow = new Workflow(workFlowName);
	}
	
	public WorkflowDesigner() {
		workflow = new Workflow();
	}

	public Memento getMemento() {
		if (workflow != null)
			return new Memento(workflow);
		else
			return null;
	}
	
	public void setMemento(Memento memento) {
		List<String> arraylist = new ArrayList<String>();
		Collections.addAll(arraylist, memento.getSteps());
		workflow.setWorkflow(arraylist);
		workflow.setWorkFlowName(memento.getName());
	}
	
	public void addStep(String step) {
		workflow.addStep(step);
	}
	
	public void removeStep(String step) {
		workflow.removeStep(step);
	}
	
	public void setWorkflowName(String name) {
		workflow.setWorkFlowName(name);
	}

	@Override
	public String toString() {
		return "WorkflowDesigner [workflow=" + workflow + "]";
	}

	class Memento{
		private String[] steps;
		private String name;

		private Memento(Workflow workflow) {
			steps = workflow.getWorkflow().toArray(new String[0]);
			name = workflow.getWorkFlowName();		
		}

		private String[] getSteps() {
			return steps;
		}

		private String getName() {
			return name;
		}
	}
}
