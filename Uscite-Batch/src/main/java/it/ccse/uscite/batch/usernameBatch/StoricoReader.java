package it.ccse.uscite.batch.usernameBatch;

import java.util.List;

import org.springframework.batch.item.ItemReader;
import org.springframework.batch.item.NonTransientResourceException;
import org.springframework.batch.item.ParseException;
import org.springframework.batch.item.UnexpectedInputException;

public class StoricoReader implements ItemReader<List<AuditedEntityRecord>> {

	private ItemReader<AuditedEntityRecord> itemReader;
	
	@Override
	public List<AuditedEntityRecord> read()
			throws Exception, UnexpectedInputException, ParseException, NonTransientResourceException {
		// TODO Auto-generated method stub
		return null;
	}

	public ItemReader<AuditedEntityRecord> getItemReader() {
		return itemReader;
	}

	public void setItemReader(ItemReader<AuditedEntityRecord> itemReader) {
		this.itemReader = itemReader;
	}

}
