package com.cg.hims.service;

import java.util.List;
import java.util.Optional;

import com.cg.hims.entities.Quote;

public interface IQuoteService {
	
	public Quote addQuote(Quote quote);

	public Quote updateQuote(Quote quote);

	public  Optional<Quote> findQuoteById(int quoteId);

	public void removeQuote(int id);

	public List<Quote> viewAllQuotes();
	
	public List<Quote> getAllQuotesByPremiumType(String prumtype);
	
	
	

}
