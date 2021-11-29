package com.gdw888.designpattern.memento;

public class CreateWorkFlowCommand extends AbstractWorkFlowCommand {

	public CreateWorkFlowCommand(WorkflowDesigner workflow, String step) {
		super(workflow, step);
	}

	@Override
	public void execute() {
		saveMemento();
		this.workflow.setWorkflowName(step);
	}
}
