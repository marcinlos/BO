package bo.model;

import java.util.Set;

public class Feat {
	public final String name;
	public final Attributes attributeReq;
	public final Set<Feat> featReq;
	
	public Feat(String name, Attributes attributeReq, Set<Feat> featReq) {
		this.name = name;
		this.attributeReq = attributeReq;
		this.featReq = featReq;
	}
	
}
