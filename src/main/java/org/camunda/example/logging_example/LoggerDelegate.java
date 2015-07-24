package org.camunda.example.logging_example;

import java.util.logging.Logger;

import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;
import org.slf4j.LoggerFactory;

/**
 * This is an empty service implementation illustrating how to use a plain Java
 * class as a BPMN 2.0 Service Task delegate.
 */
public class LoggerDelegate implements JavaDelegate {

  private final Logger LOGGER = Logger.getLogger(LoggerDelegate.class.getName());
  org.slf4j.Logger slf4jLogger = LoggerFactory.getLogger(LoggerDelegate.class);


  public void execute(DelegateExecution execution) throws Exception {

    LOGGER.info("\n\n  ... LoggerDelegate invoked by "
            + "processDefinitionId=" + execution.getProcessDefinitionId()
            + ", activtyId=" + execution.getCurrentActivityId()
            + ", activtyName='" + execution.getCurrentActivityName() + "'"
            + ", processInstanceId=" + execution.getProcessInstanceId()
            + ", businessKey=" + execution.getProcessBusinessKey()
            + ", executionId=" + execution.getId()
            + " \n\n");

    slf4jLogger.info("slf4j message, yay");

  }

}
