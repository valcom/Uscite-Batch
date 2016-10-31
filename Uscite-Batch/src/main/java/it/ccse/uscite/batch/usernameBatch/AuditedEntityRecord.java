package it.ccse.uscite.batch.usernameBatch;

public class AuditedEntityRecord extends EntityRecord {
	private Long timestamp;
	
	private long idRevisione;

	public Long getTimestamp() {
		return timestamp;
	}

	public void setTimestamp(Long timestamp) {
		this.timestamp = timestamp;
	}

	public long getIdRevisione() {
		return idRevisione;
	}

	public void setIdRevisione(long idRevisione) {
		this.idRevisione = idRevisione;
	}

	@Override
	public String toString() {
		return "AuditedEntityRecord [timestamp=" + timestamp + ", idRevisione=" + idRevisione + ", getUsername()="
				+ getUsername() + ", getId()=" + getId() + "]";
	}
}
