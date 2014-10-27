package org.exoplatform.samples.scheduler;

import org.quartz.Job;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;


/**
 * DumbJob for executing a defined dumb job.
 *
 */
public class DumbJob implements Job
{

  /**
   * The job of the DumbJob will be done by executing this method.
   *
   * @param context
   * @throws JobExecutionException
   */

  public void execute(JobExecutionContext context) throws JobExecutionException {

    System.out.println(">>>>> DumbJob is executing...");

  }
}
