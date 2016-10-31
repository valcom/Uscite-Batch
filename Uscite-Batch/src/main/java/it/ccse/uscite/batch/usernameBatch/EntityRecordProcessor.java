package it.ccse.uscite.batch.usernameBatch;

import org.springframework.batch.item.ItemProcessor;

public class EntityRecordProcessor implements ItemProcessor<AuditedEntityRecord, EntityRecord> {
	
	@Override
	public EntityRecord process(AuditedEntityRecord storico) throws Exception {

		EntityRecord entityRecord = new EntityRecord();
		entityRecord.setId(storico.getId());
		entityRecord.setUsername(storico.getUsername());
		
		return entityRecord;
	}

}
