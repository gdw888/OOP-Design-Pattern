package com.gdw888.designpattern.memento;

import java.util.LinkedList;

public class MementoApp {
	private WorkflowDesigner workflowDesigner;
	private LinkedList<WorkFlowCommand> cmds;
	
	public MementoApp() {
		workflowDesigner = new WorkflowDesigner();
		cmds = new LinkedList<>();
	}
	
	public void undoLastCmd() {
		if (!cmds.isEmpty())
		cmds.pollLast().undo();
	}

	public void createWorkFlow(String workFlowName) {
		WorkFlowCommand cmd = new CreateWorkFlowCommand(workflowDesigner, workFlowName);
		cmds.add(cmd);
		cmd.execute();
	}
	
	public void addWorkFlow(String step) {
		WorkFlowCommand cmd = new AddWorkFlowCommand(workflowDesigner, step);
		cmds.add(cmd);
		cmd.execute();
	}
	
	public void removeWorkFlow(String step) {
		WorkFlowCommand cmd = new RemoveWorkFlowCommand(workflowDesigner, step);
		cmds.add(cmd);
		cmd.execute();
	}
	
	public void printWorkFlow() {
		System.out.println(workflowDesigner.toString());
	}

	public static void main(String[] args) {
		
		MementoApp memento = new MementoApp();
		
		memento.createWorkFlow("My memento");
		memento.printWorkFlow();
		
		memento.addWorkFlow("Step1");
		memento.addWorkFlow("Step2");
		memento.addWorkFlow("Step3");
		memento.printWorkFlow();
		
		memento.undoLastCmd();
		memento.printWorkFlow();
		
		memento.removeWorkFlow("Step1");
		memento.printWorkFlow();
		
		memento.undoLastCmd();
		memento.printWorkFlow();
		
		memento.undoLastCmd();
		memento.printWorkFlow();
		
		memento.undoLastCmd();
		memento.printWorkFlow();
		
		memento.undoLastCmd();
		memento.printWorkFlow();
		
		memento.undoLastCmd();
		memento.printWorkFlow();
		
		memento.addWorkFlow("Step1");
		memento.addWorkFlow("Step2");
		memento.addWorkFlow("Step3");
		memento.printWorkFlow();
		
		memento.undoLastCmd();
		memento.printWorkFlow();
		
		memento.createWorkFlow("My memento");
		memento.printWorkFlow();
		
		memento.undoLastCmd();
		memento.printWorkFlow();
	}
	
	

}
