package com.gdw888.designpattern.memento;

public class AddWorkFlowCommand extends AbstractWorkFlowCommand{

	public AddWorkFlowCommand(WorkflowDesigner workflow, String step) {
		super(workflow, step);
	}

	@Override
	public void execute() {
		saveMemento();
		this.workflow.addStep(step);
	}
}
