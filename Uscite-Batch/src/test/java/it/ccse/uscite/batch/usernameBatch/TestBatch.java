/**
 * 
 */
package it.ccse.uscite.batch.usernameBatch;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.batch.core.BatchStatus;
import org.springframework.batch.core.JobExecution;
import org.springframework.batch.core.JobParameters;
import org.springframework.batch.core.JobParametersBuilder;
import org.springframework.batch.test.JobLauncherTestUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.annotation.DirtiesContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @author valer
 *
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations =  {"classpath:/spring/testContext.xml"} )
//@Transactional
public class TestBatch {

	@Autowired
	private JobLauncherTestUtils jobLauncherTestUtils;

	
	@Test
	@DirtiesContext
	public void testLanchJob() throws Exception{
		JobParametersBuilder paramBuilder = new JobParametersBuilder (jobLauncherTestUtils.getUniqueJobParameters());

		JobParameters jobParameters = paramBuilder.addString("timestamp", "0").toJobParameters();

	    JobExecution exec = jobLauncherTestUtils.launchJob(jobParameters);

	    assertEquals(BatchStatus.COMPLETED, exec.getStatus());
		
	}
	
}
