package com.cams.blaze.conversionRequest;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.Date;

@Entity
@Table(name="BLAZ_AP_CU_PBOC_BASIC_INFO")
public class BlazApCuPbocBasicInfo {

    private String REPORT_ID;
    private String CERTYPE;
    private String CERCODE;
    private Date REQUEST_TIME;
    private Date REPORT_TIME;
    private String SEX;
    private Date BIRTH;
    private String MARRIAGE;
    private String TELEPHONE;
    private String EDUCATION;
    private Integer SCORE;
    private Integer HOUSE_LOAD_NUM;
    private Integer BUS_HOUSELOAD_NUM;
    private Integer OTHER_LOAD_NUM;
    private String FIRST_LOAD_MONTH;
    private Integer CREDIT_ACCOUNTS;
    private String FIRST_CREDIT_MONTH;
    private Integer NEARCREDITCARD_ACCOUNTS;
    private String FIRST_NEARCREDIT_MONTH;
    private Integer BAD_DEBTS_NUM;
    private Integer ASSETS_NUM;
    private Integer SPONSORIAL_NUM;
    private Double BAD_DEBTS_REMAIN;
    private Double ASSETS_REMAIN;
    private Integer SPONSORIAL_REMAIN;
    private Integer LOAD_OVERDUE_NUM;
    private Integer CREDIT_OVERDUE_ACCOUNTS;
    private Integer NEARCREDIT_60D_ACCOUNTS;
    private Integer LOAD_OVERDUE_MONTHS;
    private Integer CREDIT_OVERDUE_MONTHS;
    private Integer NEARCREDIT_60D_MONTHS;
    private Double LOAD_OVERDUE_MAX_SUM;
    private Double CREDIT_OVERDUE_MAX_SUM;
    private Double NEARCREDIT_60D_MAX_SUM;
    private Integer LOAD_OVERDUE_MAX_MONTH;
    private Integer CREDIT_OVERDUE_MAX_MONTH;
    private Integer NEARCREDIT_60D_MAX_MONTH;
    private Integer LOAD_CORPORATION_NUM;
    private Integer LOAD_ORGANIZATION_NUM;
    private Integer LOAD_NUM;
    private Double LOAD_CONTRACT_SUM;
    private Double LOAD_REMAIN;
    private Double LOAD_LAST6M_REPAY;
    private Integer CRED_ISSUING_CORPORATION_NUM;
    private Integer CRED_ISSUING_ORGANIZATION_NUM;
    private Integer CRED_ACCOUNTS;
    private Double CRED_EXTENSION_SUM;
    private Double CRED_SINGLE_MAX_EXTENSION;
    private Double CRED_SINGLE_MIN_EXTENSION;
    private Double CRED_USED_EXTENSION;
    private Double CRED_LAST6M_AVG_USEDEXTENSION;
    private Integer SCRED_ISSUING_CORPORATION_NUM;
    private Integer SCRED_ISSUING_ORGANIZATION_NUM;
    private Integer SCRED_ACCOUNTS;
    private Double SCRED_EXTENSION_SUM;
    private Double SCRED_SINGLE_MAX_EXTENSION;
    private Double SCRED_SINGLE_MIN_EXTENSION;
    private Double SCRED_USED_EXTENSION;
    private Double SCRED_LAST6M_AVG_USEDEXTENSION;
    private Integer SECURED_NUM;
    private Double SECERED_MONEY;
    private Double SECERED_CAPITAL;

    public String getREPORT_ID() {
        return REPORT_ID;
    }

    public void setREPORT_ID(String REPORT_ID) {
        this.REPORT_ID = REPORT_ID;
    }

    public String getCERTYPE() {
        return CERTYPE;
    }

    public void setCERTYPE(String CERTYPE) {
        this.CERTYPE = CERTYPE;
    }

    public String getCERCODE() {
        return CERCODE;
    }

    public void setCERCODE(String CERCODE) {
        this.CERCODE = CERCODE;
    }

    public Date getREQUEST_TIME() {
        return REQUEST_TIME;
    }

    public void setREQUEST_TIME(Date REQUEST_TIME) {
        this.REQUEST_TIME = REQUEST_TIME;
    }

    public Date getREPORT_TIME() {
        return REPORT_TIME;
    }

    public void setREPORT_TIME(Date REPORT_TIME) {
        this.REPORT_TIME = REPORT_TIME;
    }

    public String getSEX() {
        return SEX;
    }

    public void setSEX(String SEX) {
        this.SEX = SEX;
    }

    public Date getBIRTH() {
        return BIRTH;
    }

    public void setBIRTH(Date BIRTH) {
        this.BIRTH = BIRTH;
    }

    public String getMARRIAGE() {
        return MARRIAGE;
    }

    public void setMARRIAGE(String MARRIAGE) {
        this.MARRIAGE = MARRIAGE;
    }

    public String getTELEPHONE() {
        return TELEPHONE;
    }

    public void setTELEPHONE(String TELEPHONE) {
        this.TELEPHONE = TELEPHONE;
    }

    public String getEDUCATION() {
        return EDUCATION;
    }

    public void setEDUCATION(String EDUCATION) {
        this.EDUCATION = EDUCATION;
    }

    public Integer getSCORE() {
        return SCORE;
    }

    public void setSCORE(Integer SCORE) {
        this.SCORE = SCORE;
    }

    public Integer getHOUSE_LOAD_NUM() {
        return HOUSE_LOAD_NUM;
    }

    public void setHOUSE_LOAD_NUM(Integer HOUSE_LOAD_NUM) {
        this.HOUSE_LOAD_NUM = HOUSE_LOAD_NUM;
    }

    public Integer getBUS_HOUSELOAD_NUM() {
        return BUS_HOUSELOAD_NUM;
    }

    public void setBUS_HOUSELOAD_NUM(Integer BUS_HOUSELOAD_NUM) {
        this.BUS_HOUSELOAD_NUM = BUS_HOUSELOAD_NUM;
    }

    public Integer getOTHER_LOAD_NUM() {
        return OTHER_LOAD_NUM;
    }

    public void setOTHER_LOAD_NUM(Integer OTHER_LOAD_NUM) {
        this.OTHER_LOAD_NUM = OTHER_LOAD_NUM;
    }

    public String getFIRST_LOAD_MONTH() {
        return FIRST_LOAD_MONTH;
    }

    public void setFIRST_LOAD_MONTH(String FIRST_LOAD_MONTH) {
        this.FIRST_LOAD_MONTH = FIRST_LOAD_MONTH;
    }

    public Integer getCREDIT_ACCOUNTS() {
        return CREDIT_ACCOUNTS;
    }

    public void setCREDIT_ACCOUNTS(Integer CREDIT_ACCOUNTS) {
        this.CREDIT_ACCOUNTS = CREDIT_ACCOUNTS;
    }

    public String getFIRST_CREDIT_MONTH() {
        return FIRST_CREDIT_MONTH;
    }

    public void setFIRST_CREDIT_MONTH(String FIRST_CREDIT_MONTH) {
        this.FIRST_CREDIT_MONTH = FIRST_CREDIT_MONTH;
    }

    public Integer getNEARCREDITCARD_ACCOUNTS() {
        return NEARCREDITCARD_ACCOUNTS;
    }

    public void setNEARCREDITCARD_ACCOUNTS(Integer NEARCREDITCARD_ACCOUNTS) {
        this.NEARCREDITCARD_ACCOUNTS = NEARCREDITCARD_ACCOUNTS;
    }

    public String getFIRST_NEARCREDIT_MONTH() {
        return FIRST_NEARCREDIT_MONTH;
    }

    public void setFIRST_NEARCREDIT_MONTH(String FIRST_NEARCREDIT_MONTH) {
        this.FIRST_NEARCREDIT_MONTH = FIRST_NEARCREDIT_MONTH;
    }

    public Integer getBAD_DEBTS_NUM() {
        return BAD_DEBTS_NUM;
    }

    public void setBAD_DEBTS_NUM(Integer BAD_DEBTS_NUM) {
        this.BAD_DEBTS_NUM = BAD_DEBTS_NUM;
    }

    public Integer getASSETS_NUM() {
        return ASSETS_NUM;
    }

    public void setASSETS_NUM(Integer ASSETS_NUM) {
        this.ASSETS_NUM = ASSETS_NUM;
    }

    public Integer getSPONSORIAL_NUM() {
        return SPONSORIAL_NUM;
    }

    public void setSPONSORIAL_NUM(Integer SPONSORIAL_NUM) {
        this.SPONSORIAL_NUM = SPONSORIAL_NUM;
    }

    public Double getBAD_DEBTS_REMAIN() {
        return BAD_DEBTS_REMAIN;
    }

    public void setBAD_DEBTS_REMAIN(Double BAD_DEBTS_REMAIN) {
        this.BAD_DEBTS_REMAIN = BAD_DEBTS_REMAIN;
    }

    public Double getASSETS_REMAIN() {
        return ASSETS_REMAIN;
    }

    public void setASSETS_REMAIN(Double ASSETS_REMAIN) {
        this.ASSETS_REMAIN = ASSETS_REMAIN;
    }

    public Integer getSPONSORIAL_REMAIN() {
        return SPONSORIAL_REMAIN;
    }

    public void setSPONSORIAL_REMAIN(Integer SPONSORIAL_REMAIN) {
        this.SPONSORIAL_REMAIN = SPONSORIAL_REMAIN;
    }

    public Integer getLOAD_OVERDUE_NUM() {
        return LOAD_OVERDUE_NUM;
    }

    public void setLOAD_OVERDUE_NUM(Integer LOAD_OVERDUE_NUM) {
        this.LOAD_OVERDUE_NUM = LOAD_OVERDUE_NUM;
    }

    public Integer getCREDIT_OVERDUE_ACCOUNTS() {
        return CREDIT_OVERDUE_ACCOUNTS;
    }

    public void setCREDIT_OVERDUE_ACCOUNTS(Integer CREDIT_OVERDUE_ACCOUNTS) {
        this.CREDIT_OVERDUE_ACCOUNTS = CREDIT_OVERDUE_ACCOUNTS;
    }

    public Integer getNEARCREDIT_60D_ACCOUNTS() {
        return NEARCREDIT_60D_ACCOUNTS;
    }

    public void setNEARCREDIT_60D_ACCOUNTS(Integer NEARCREDIT_60D_ACCOUNTS) {
        this.NEARCREDIT_60D_ACCOUNTS = NEARCREDIT_60D_ACCOUNTS;
    }

    public Integer getLOAD_OVERDUE_MONTHS() {
        return LOAD_OVERDUE_MONTHS;
    }

    public void setLOAD_OVERDUE_MONTHS(Integer LOAD_OVERDUE_MONTHS) {
        this.LOAD_OVERDUE_MONTHS = LOAD_OVERDUE_MONTHS;
    }

    public Integer getCREDIT_OVERDUE_MONTHS() {
        return CREDIT_OVERDUE_MONTHS;
    }

    public void setCREDIT_OVERDUE_MONTHS(Integer CREDIT_OVERDUE_MONTHS) {
        this.CREDIT_OVERDUE_MONTHS = CREDIT_OVERDUE_MONTHS;
    }

    public Integer getNEARCREDIT_60D_MONTHS() {
        return NEARCREDIT_60D_MONTHS;
    }

    public void setNEARCREDIT_60D_MONTHS(Integer NEARCREDIT_60D_MONTHS) {
        this.NEARCREDIT_60D_MONTHS = NEARCREDIT_60D_MONTHS;
    }

    public Double getLOAD_OVERDUE_MAX_SUM() {
        return LOAD_OVERDUE_MAX_SUM;
    }

    public void setLOAD_OVERDUE_MAX_SUM(Double LOAD_OVERDUE_MAX_SUM) {
        this.LOAD_OVERDUE_MAX_SUM = LOAD_OVERDUE_MAX_SUM;
    }

    public Double getCREDIT_OVERDUE_MAX_SUM() {
        return CREDIT_OVERDUE_MAX_SUM;
    }

    public void setCREDIT_OVERDUE_MAX_SUM(Double CREDIT_OVERDUE_MAX_SUM) {
        this.CREDIT_OVERDUE_MAX_SUM = CREDIT_OVERDUE_MAX_SUM;
    }

    public Double getNEARCREDIT_60D_MAX_SUM() {
        return NEARCREDIT_60D_MAX_SUM;
    }

    public void setNEARCREDIT_60D_MAX_SUM(Double NEARCREDIT_60D_MAX_SUM) {
        this.NEARCREDIT_60D_MAX_SUM = NEARCREDIT_60D_MAX_SUM;
    }

    public Integer getLOAD_OVERDUE_MAX_MONTH() {
        return LOAD_OVERDUE_MAX_MONTH;
    }

    public void setLOAD_OVERDUE_MAX_MONTH(Integer LOAD_OVERDUE_MAX_MONTH) {
        this.LOAD_OVERDUE_MAX_MONTH = LOAD_OVERDUE_MAX_MONTH;
    }

    public Integer getCREDIT_OVERDUE_MAX_MONTH() {
        return CREDIT_OVERDUE_MAX_MONTH;
    }

    public void setCREDIT_OVERDUE_MAX_MONTH(Integer CREDIT_OVERDUE_MAX_MONTH) {
        this.CREDIT_OVERDUE_MAX_MONTH = CREDIT_OVERDUE_MAX_MONTH;
    }

    public Integer getNEARCREDIT_60D_MAX_MONTH() {
        return NEARCREDIT_60D_MAX_MONTH;
    }

    public void setNEARCREDIT_60D_MAX_MONTH(Integer NEARCREDIT_60D_MAX_MONTH) {
        this.NEARCREDIT_60D_MAX_MONTH = NEARCREDIT_60D_MAX_MONTH;
    }

    public Integer getLOAD_CORPORATION_NUM() {
        return LOAD_CORPORATION_NUM;
    }

    public void setLOAD_CORPORATION_NUM(Integer LOAD_CORPORATION_NUM) {
        this.LOAD_CORPORATION_NUM = LOAD_CORPORATION_NUM;
    }

    public Integer getLOAD_ORGANIZATION_NUM() {
        return LOAD_ORGANIZATION_NUM;
    }

    public void setLOAD_ORGANIZATION_NUM(Integer LOAD_ORGANIZATION_NUM) {
        this.LOAD_ORGANIZATION_NUM = LOAD_ORGANIZATION_NUM;
    }

    public Integer getLOAD_NUM() {
        return LOAD_NUM;
    }

    public void setLOAD_NUM(Integer LOAD_NUM) {
        this.LOAD_NUM = LOAD_NUM;
    }

    public Double getLOAD_CONTRACT_SUM() {
        return LOAD_CONTRACT_SUM;
    }

    public void setLOAD_CONTRACT_SUM(Double LOAD_CONTRACT_SUM) {
        this.LOAD_CONTRACT_SUM = LOAD_CONTRACT_SUM;
    }

    public Double getLOAD_REMAIN() {
        return LOAD_REMAIN;
    }

    public void setLOAD_REMAIN(Double LOAD_REMAIN) {
        this.LOAD_REMAIN = LOAD_REMAIN;
    }

    public Double getLOAD_LAST6M_REPAY() {
        return LOAD_LAST6M_REPAY;
    }

    public void setLOAD_LAST6M_REPAY(Double LOAD_LAST6M_REPAY) {
        this.LOAD_LAST6M_REPAY = LOAD_LAST6M_REPAY;
    }

    public Integer getCRED_ISSUING_CORPORATION_NUM() {
        return CRED_ISSUING_CORPORATION_NUM;
    }

    public void setCRED_ISSUING_CORPORATION_NUM(Integer CRED_ISSUING_CORPORATION_NUM) {
        this.CRED_ISSUING_CORPORATION_NUM = CRED_ISSUING_CORPORATION_NUM;
    }

    public Integer getCRED_ISSUING_ORGANIZATION_NUM() {
        return CRED_ISSUING_ORGANIZATION_NUM;
    }

    public void setCRED_ISSUING_ORGANIZATION_NUM(Integer CRED_ISSUING_ORGANIZATION_NUM) {
        this.CRED_ISSUING_ORGANIZATION_NUM = CRED_ISSUING_ORGANIZATION_NUM;
    }

    public Integer getCRED_ACCOUNTS() {
        return CRED_ACCOUNTS;
    }

    public void setCRED_ACCOUNTS(Integer CRED_ACCOUNTS) {
        this.CRED_ACCOUNTS = CRED_ACCOUNTS;
    }

    public Double getCRED_EXTENSION_SUM() {
        return CRED_EXTENSION_SUM;
    }

    public void setCRED_EXTENSION_SUM(Double CRED_EXTENSION_SUM) {
        this.CRED_EXTENSION_SUM = CRED_EXTENSION_SUM;
    }

    public Double getCRED_SINGLE_MAX_EXTENSION() {
        return CRED_SINGLE_MAX_EXTENSION;
    }

    public void setCRED_SINGLE_MAX_EXTENSION(Double CRED_SINGLE_MAX_EXTENSION) {
        this.CRED_SINGLE_MAX_EXTENSION = CRED_SINGLE_MAX_EXTENSION;
    }

    public Double getCRED_SINGLE_MIN_EXTENSION() {
        return CRED_SINGLE_MIN_EXTENSION;
    }

    public void setCRED_SINGLE_MIN_EXTENSION(Double CRED_SINGLE_MIN_EXTENSION) {
        this.CRED_SINGLE_MIN_EXTENSION = CRED_SINGLE_MIN_EXTENSION;
    }

    public Double getCRED_USED_EXTENSION() {
        return CRED_USED_EXTENSION;
    }

    public void setCRED_USED_EXTENSION(Double CRED_USED_EXTENSION) {
        this.CRED_USED_EXTENSION = CRED_USED_EXTENSION;
    }

    public Double getCRED_LAST6M_AVG_USEDEXTENSION() {
        return CRED_LAST6M_AVG_USEDEXTENSION;
    }

    public void setCRED_LAST6M_AVG_USEDEXTENSION(Double CRED_LAST6M_AVG_USEDEXTENSION) {
        this.CRED_LAST6M_AVG_USEDEXTENSION = CRED_LAST6M_AVG_USEDEXTENSION;
    }

    public Integer getSCRED_ISSUING_CORPORATION_NUM() {
        return SCRED_ISSUING_CORPORATION_NUM;
    }

    public void setSCRED_ISSUING_CORPORATION_NUM(Integer SCRED_ISSUING_CORPORATION_NUM) {
        this.SCRED_ISSUING_CORPORATION_NUM = SCRED_ISSUING_CORPORATION_NUM;
    }

    public Integer getSCRED_ISSUING_ORGANIZATION_NUM() {
        return SCRED_ISSUING_ORGANIZATION_NUM;
    }

    public void setSCRED_ISSUING_ORGANIZATION_NUM(Integer SCRED_ISSUING_ORGANIZATION_NUM) {
        this.SCRED_ISSUING_ORGANIZATION_NUM = SCRED_ISSUING_ORGANIZATION_NUM;
    }

    public Integer getSCRED_ACCOUNTS() {
        return SCRED_ACCOUNTS;
    }

    public void setSCRED_ACCOUNTS(Integer SCRED_ACCOUNTS) {
        this.SCRED_ACCOUNTS = SCRED_ACCOUNTS;
    }

    public Double getSCRED_EXTENSION_SUM() {
        return SCRED_EXTENSION_SUM;
    }

    public void setSCRED_EXTENSION_SUM(Double SCRED_EXTENSION_SUM) {
        this.SCRED_EXTENSION_SUM = SCRED_EXTENSION_SUM;
    }

    public Double getSCRED_SINGLE_MAX_EXTENSION() {
        return SCRED_SINGLE_MAX_EXTENSION;
    }

    public void setSCRED_SINGLE_MAX_EXTENSION(Double SCRED_SINGLE_MAX_EXTENSION) {
        this.SCRED_SINGLE_MAX_EXTENSION = SCRED_SINGLE_MAX_EXTENSION;
    }

    public Double getSCRED_SINGLE_MIN_EXTENSION() {
        return SCRED_SINGLE_MIN_EXTENSION;
    }

    public void setSCRED_SINGLE_MIN_EXTENSION(Double SCRED_SINGLE_MIN_EXTENSION) {
        this.SCRED_SINGLE_MIN_EXTENSION = SCRED_SINGLE_MIN_EXTENSION;
    }

    public Double getSCRED_USED_EXTENSION() {
        return SCRED_USED_EXTENSION;
    }

    public void setSCRED_USED_EXTENSION(Double SCRED_USED_EXTENSION) {
        this.SCRED_USED_EXTENSION = SCRED_USED_EXTENSION;
    }

    public Double getSCRED_LAST6M_AVG_USEDEXTENSION() {
        return SCRED_LAST6M_AVG_USEDEXTENSION;
    }

    public void setSCRED_LAST6M_AVG_USEDEXTENSION(Double SCRED_LAST6M_AVG_USEDEXTENSION) {
        this.SCRED_LAST6M_AVG_USEDEXTENSION = SCRED_LAST6M_AVG_USEDEXTENSION;
    }

    public Integer getSECURED_NUM() {
        return SECURED_NUM;
    }

    public void setSECURED_NUM(Integer SECURED_NUM) {
        this.SECURED_NUM = SECURED_NUM;
    }

    public Double getSECERED_MONEY() {
        return SECERED_MONEY;
    }

    public void setSECERED_MONEY(Double SECERED_MONEY) {
        this.SECERED_MONEY = SECERED_MONEY;
    }

    public Double getSECERED_CAPITAL() {
        return SECERED_CAPITAL;
    }

    public void setSECERED_CAPITAL(Double SECERED_CAPITAL) {
        this.SECERED_CAPITAL = SECERED_CAPITAL;
    }
}
