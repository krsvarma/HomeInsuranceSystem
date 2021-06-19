package com.cg.hims.entities;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import org.springframework.stereotype.Component;

@Component
@Entity
public class Quote {
	
	@Id
	private int quoteId;
	
	@NotEmpty(message = "premiumtype should not be empty")
	private String premiumType;
	@NotNull
	@Min(2)
	@Max(8)
	private int premium;
	@NotNull
	@Min(2)
	@Max(8)
	private int dwellingCoverage;
	@NotNull
	@Min(2)
	@Max(8)
	private int detachedStructureCoverage;
	@NotNull
	@Min(2)
	@Max(8)
	private int personalPropertyCoverage;
	@NotNull
	@Min(2)
	@Max(8)
	private int additionalLivingExpense;
	@NotNull
	@Min(2)
	@Max(8)
	private int medicalExpense;
	@NotNull
	@Min(2)
	@Max(8)
	private int deductibleAmount;
	
	
	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="propertyId")
	private Property property;


	public Quote() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Quote(int quoteId, @NotEmpty(message = "premiumtype should not be empty") String premiumType,
			@NotNull @Min(2) @Max(8) int premium, @NotNull @Min(2) @Max(8) int dwellingCoverage,
			@NotNull @Min(2) @Max(8) int detachedStructureCoverage,
			@NotNull @Min(2) @Max(8) int personalPropertyCoverage, @NotNull @Min(2) @Max(8) int additionalLivingExpense,
			@NotNull @Min(2) @Max(8) int medicalExpense, @NotNull @Min(2) @Max(8) int deductibleAmount,
			Property property) {
		super();
		this.quoteId = quoteId;
		this.premiumType = premiumType;
		this.premium = premium;
		this.dwellingCoverage = dwellingCoverage;
		this.detachedStructureCoverage = detachedStructureCoverage;
		this.personalPropertyCoverage = personalPropertyCoverage;
		this.additionalLivingExpense = additionalLivingExpense;
		this.medicalExpense = medicalExpense;
		this.deductibleAmount = deductibleAmount;
		this.property = property;
	}


	public int getQuoteId() {
		return quoteId;
	}


	public void setQuoteId(int quoteId) {
		this.quoteId = quoteId;
	}


	public String getPremiumType() {
		return premiumType;
	}


	public void setPremiumType(String premiumType) {
		this.premiumType = premiumType;
	}


	public int getPremium() {
		return premium;
	}


	public void setPremium(int premium) {
		this.premium = premium;
	}


	public int getDwellingCoverage() {
		return dwellingCoverage;
	}


	public void setDwellingCoverage(int dwellingCoverage) {
		this.dwellingCoverage = dwellingCoverage;
	}


	public int getDetachedStructureCoverage() {
		return detachedStructureCoverage;
	}


	public void setDetachedStructureCoverage(int detachedStructureCoverage) {
		this.detachedStructureCoverage = detachedStructureCoverage;
	}


	public int getPersonalPropertyCoverage() {
		return personalPropertyCoverage;
	}


	public void setPersonalPropertyCoverage(int personalPropertyCoverage) {
		this.personalPropertyCoverage = personalPropertyCoverage;
	}


	public int getAdditionalLivingExpense() {
		return additionalLivingExpense;
	}


	public void setAdditionalLivingExpense(int additionalLivingExpense) {
		this.additionalLivingExpense = additionalLivingExpense;
	}


	public int getMedicalExpense() {
		return medicalExpense;
	}


	public void setMedicalExpense(int medicalExpense) {
		this.medicalExpense = medicalExpense;
	}


	public int getDeductibleAmount() {
		return deductibleAmount;
	}


	public void setDeductibleAmount(int deductibleAmount) {
		this.deductibleAmount = deductibleAmount;
	}


	public Property getProperty() {
		return property;
	}


	public void setProperty(Property property) {
		this.property = property;
	}


	@Override
	public String toString() {
		return "Quote [quoteId=" + quoteId + ", premiumType=" + premiumType + ", premium=" + premium
				+ ", dwellingCoverage=" + dwellingCoverage + ", detachedStructureCoverage=" + detachedStructureCoverage
				+ ", personalPropertyCoverage=" + personalPropertyCoverage + ", additionalLivingExpense="
				+ additionalLivingExpense + ", medicalExpense=" + medicalExpense + ", deductibleAmount="
				+ deductibleAmount + ", property=" + property + "]";
	}


	
}