package com.gdw888.designpattern.memento;

public class RemoveWorkFlowCommand extends AbstractWorkFlowCommand {

	public RemoveWorkFlowCommand(WorkflowDesigner workflow, String step) {
		super(workflow, step);
	}

	@Override
	public void execute() {
		saveMemento();
		this.workflow.removeStep(step);
	}
}
