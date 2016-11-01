package it.ccse.uscite.batch.usernameBatch;


import org.springframework.batch.item.ItemProcessor;

public class EntityRecordProcessor implements ItemProcessor<AuditedEntityRecord, EntityRecord> {
	private Long maxWaitTime = 5000l;
	
	@Override
	public EntityRecord process(AuditedEntityRecord storico) throws Exception {
		EntityRecord entityRecord = new EntityRecord();
		entityRecord.setId(storico.getId());
		entityRecord.setUsername(storico.getUsername());
		long time = (long)(Math.random()*maxWaitTime);
		Thread.sleep(time);
		return entityRecord;
	}

	public Long getMaxWaitTime() {
		return maxWaitTime;
	}

	public void setMaxWaitTime(Long maxWaitTime) {
		this.maxWaitTime = maxWaitTime;
	}

	
}
