package com.cg.hims.entities;

 

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

 

 

 

import org.springframework.stereotype.Component;

 

 

 

import com.fasterxml.jackson.annotation.JsonIgnore;

 

 

 

 

 

@Component
@Entity
public class Policy {
    @Id
    @NotNull
    @Min(1)
    private int policyId;
    @Pattern(regexp="^(0?[1-9]|[12][0-9]|3[01])[\\/\\-](0?[1-9]|1[012])[\\/\\-]\\d{4}$", message="policyEffectiveDate is invalid")
    @NotEmpty(message = "policyEffectiveDate is required")
    private String policyEffectiveDate;
    @Pattern(regexp="^(0?[1-9]|[12][0-9]|3[01])[\\/\\-](0?[1-9]|1[012])[\\/\\-]\\d{4}$", message="policyEndDate is invalid")
    @NotEmpty(message = "policyEndDate is required")
    private String policyEndDate;
    @Min(1)
    private int policyTerm;
    @Size(min=3, max=50)
    @Pattern(regexp="[a-zA-Z]{4,}(?:[a-zA-Z]+){0,2}$", message="Policy Status is invalid")
    private String policyStatus;
    @JsonIgnore
    @OneToOne(cascade=CascadeType.ALL)
    @JoinColumn(name="quote_id")
    private Quote quote;
    
    @JsonIgnore
    @ManyToOne
    @JoinColumn(name="agentId")
    private Agent agent;
    
    @JsonIgnore
    @ManyToOne
    @JoinColumn(name="policyHolderId")
    private PolicyHolder policyholder;
    
    public Policy() {
        super();
        // TODO Auto-generated constructor stub
    }

 

 

 

    public Policy(@NotNull @Min(1) int policyId,
            @Pattern(regexp = "^(0?[1-9]|[12][0-9]|3[01])[\\/\\-](0?[1-9]|1[012])[\\/\\-]\\d{4}$", message = "policyEffectiveDate is invalid") @NotEmpty(message = "policyEffectiveDate is required") String policyEffectiveDate,
            @Pattern(regexp = "^(0?[1-9]|[12][0-9]|3[01])[\\/\\-](0?[1-9]|1[012])[\\/\\-]\\d{4}$", message = "policyEndDate is invalid") @NotEmpty(message = "policyEndDate is required") String policyEndDate,
            @Min(1) int policyTerm,
            @Size(min = 3, max = 50) @Pattern(regexp = "[a-zA-Z]{4,}(?:[a-zA-Z]+){0,2}$", message = "policyStatus is invalid") String policyStatus,
            Quote quote, Agent agent, PolicyHolder policyholder) {
        super();
        this.policyId = policyId;
        this.policyEffectiveDate = policyEffectiveDate;
        this.policyEndDate = policyEndDate;
        this.policyTerm = policyTerm;
        this.policyStatus = policyStatus;
        this.quote = quote;
        this.agent = agent;
        this.policyholder = policyholder;
    }

 

 

 

    public int getPolicyId() {
        return policyId;
    }

 

 

 

    public void setPolicyId(int policyId) {
        this.policyId = policyId;
    }

 

 

 

    public String getPolicyEffectiveDate() {
        return policyEffectiveDate;
    }

 

 

 

    public void setPolicyEffectiveDate(String policyEffectiveDate) {
        this.policyEffectiveDate = policyEffectiveDate;
    }

 

 

 

    public String getPolicyEndDate() {
        return policyEndDate;
    }

 

 

 

    public void setPolicyEndDate(String policyEndDate) {
        this.policyEndDate = policyEndDate;
    }

 

 

 

    public int getPolicyTerm() {
        return policyTerm;
    }

 

 

 

    public void setPolicyTerm(int policyTerm) {
        this.policyTerm = policyTerm;
    }

 

 

 

    public String getPolicyStatus() {
        return policyStatus;
    }

 

 

 

    public void setPolicyStatus(String policyStatus) {
        this.policyStatus = policyStatus;
    }

 

 

 

    public Quote getQuote() {
        return quote;
    }

 

 

 

    public void setQuote(Quote quote) {
        this.quote = quote;
    }

 

 

 

    public Agent getAgent() {
        return agent;
    }

 

 

 

    public void setAgent(Agent agent) {
        this.agent = agent;
    }

 

 

 

    public PolicyHolder getPolicyholder() {
        return policyholder;
    }

 

 

 

    public void setPolicyholder(PolicyHolder policyholder) {
        this.policyholder = policyholder;
    }

 

 

 

    @Override
    public String toString() {
        return "Policy [policyId=" + policyId + ", policyEffectiveDate=" + policyEffectiveDate + ", policyEndDate="
                + policyEndDate + ", policyTerm=" + policyTerm + ", policyStatus=" + policyStatus + ", quote=" + quote
                + ", agent=" + agent + ", policyholder=" + policyholder + "]";
    }
    
}