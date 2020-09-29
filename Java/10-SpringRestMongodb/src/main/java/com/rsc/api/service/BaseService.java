package com.rsc.api.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public abstract class BaseService {

	@Autowired
	private SequenceGeneratorService seqService;

	public SequenceGeneratorService getSeqService() {
		return seqService;
	}

	public void setSeqService(SequenceGeneratorService seqService) {
		this.seqService = seqService;
	}
}
