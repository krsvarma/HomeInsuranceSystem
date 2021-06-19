package com.cg.hims.entities;

import javax.persistence.Entity;
import javax.persistence.Id;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import org.springframework.stereotype.Component;



@Component
@Entity
public class Property {
	@Id
	
	@Min(1)
	private int propertyId;

	@NotNull
	@Min(50000)
	private int marketValue;

	@NotNull
	@Min(2000)
	private int yearBuilt;
	
	private int squareFootage;
	
	@NotNull
	@Min(10)
	private double dwellingStyle;
	
	@NotEmpty(message = "roofMaterial is required")
	private String roofMaterial ;
	
	@NotEmpty(message = "garageType is required")
	private String garageType;
	
	private int fullBathCount;
	
	private int halfBathCount;
	
	private String hasSwimmingPool;



	public Property() {
		super();
		// TODO Auto-generated constructor stub
	}



	public Property(@Min(1) int propertyId, @NotNull @Min(50000) int marketValue, @NotNull @Min(2000) int yearBuilt,
			int squareFootage, @NotNull @Min(10) double dwellingStyle,
			@NotEmpty(message = "roofMaterial is required") String roofMaterial,
			@NotEmpty(message = "garageType is required") String garageType, int fullBathCount, int halfBathCount,
			String hasSwimmingPool) {
		super();
		this.propertyId = propertyId;
		this.marketValue = marketValue;
		this.yearBuilt = yearBuilt;
		this.squareFootage = squareFootage;
		this.dwellingStyle = dwellingStyle;
		this.roofMaterial = roofMaterial;
		this.garageType = garageType;
		this.fullBathCount = fullBathCount;
		this.halfBathCount = halfBathCount;
		this.hasSwimmingPool = hasSwimmingPool;
	}



	public int getPropertyId() {
		return propertyId;
	}



	public void setPropertyId(int propertyId) {
		this.propertyId = propertyId;
	}



	public int getMarketValue() {
		return marketValue;
	}



	public void setMarketValue(int marketValue) {
		this.marketValue = marketValue;
	}



	public int getYearBuilt() {
		return yearBuilt;
	}



	public void setYearBuilt(int yearBuilt) {
		this.yearBuilt = yearBuilt;
	}



	public int getSquareFootage() {
		return squareFootage;
	}



	public void setSquareFootage(int squareFootage) {
		this.squareFootage = squareFootage;
	}



	public double getDwellingStyle() {
		return dwellingStyle;
	}



	public void setDwellingStyle(double dwellingStyle) {
		this.dwellingStyle = dwellingStyle;
	}



	public String getRoofMaterial() {
		return roofMaterial;
	}



	public void setRoofMaterial(String roofMaterial) {
		this.roofMaterial = roofMaterial;
	}



	public String getGarageType() {
		return garageType;
	}



	public void setGarageType(String garageType) {
		this.garageType = garageType;
	}



	public int getFullBathCount() {
		return fullBathCount;
	}



	public void setFullBathCount(int fullBathCount) {
		this.fullBathCount = fullBathCount;
	}



	public int getHalfBathCount() {
		return halfBathCount;
	}



	public void setHalfBathCount(int halfBathCount) {
		this.halfBathCount = halfBathCount;
	}



	public String getHasSwimmingPool() {
		return hasSwimmingPool;
	}



	public void setHasSwimmingPool(String hasSwimmingPool) {
		this.hasSwimmingPool = hasSwimmingPool;
	}



	@Override
	public String toString() {
		return "Property [propertyId=" + propertyId + ", marketValue=" + marketValue + ", yearBuilt=" + yearBuilt
				+ ", squareFootage=" + squareFootage + ", dwellingStyle=" + dwellingStyle + ", roofMaterial="
				+ roofMaterial + ", garageType=" + garageType + ", fullBathCount=" + fullBathCount + ", halfBathCount="
				+ halfBathCount + ", hasSwimmingPool=" + hasSwimmingPool + "]";
	}
	


	

}