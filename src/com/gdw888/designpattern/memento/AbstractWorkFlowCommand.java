package com.gdw888.designpattern.memento;

public abstract class AbstractWorkFlowCommand implements WorkFlowCommand {

	protected WorkflowDesigner.Memento memento;
	protected WorkflowDesigner workflow;
	protected String step;
	
	public AbstractWorkFlowCommand(WorkflowDesigner workflow, String Step) {
		this.workflow = workflow;
		this.step = Step;
	}

	@Override
	public abstract void execute();

	@Override
	public void undo() {
		workflow.setMemento(memento);
	}
	
	public void saveMemento() {
		memento = workflow.getMemento();
	}
}
