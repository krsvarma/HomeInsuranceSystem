package com.cg.hims.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.hims.entities.Quote;
import com.cg.hims.repository.IQuoteRepository;

@Service
public class IQuoteServiceImpl implements IQuoteService {
	
	@Autowired
	private IQuoteRepository quoteRepo;
    
	@Override
	public Quote addQuote(Quote quote) {
		return quoteRepo.save(quote);
	}

	@Override
	public Quote updateQuote(Quote quote) {
		return quoteRepo.save(quote);
	}

	@Override
	public Optional<Quote> findQuoteById(int quoteId) {
		return quoteRepo.findById(quoteId);
	}
	
	@Override
	public void removeQuote(int quoteId) {
		
	       quoteRepo.deleteById(quoteId);
		
	}

	@Override
	public List<Quote> viewAllQuotes() {
		return quoteRepo.findAll();
	}

	@Override
	public List<Quote> getAllQuotesByPremiumType(String prumtype) {
		// TODO Auto-generated method stub
		return quoteRepo.findByPremiumType(prumtype);
	}
	
	
	
}
