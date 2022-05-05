package hau.case_study_furama_resort.model.bookings;

public class Contract {
    private static final String COMMA = ",";
    private Long someContracts;
    private String bookingCode;
    private Double advanceDepositAmount;
    private Double totalPaymentAmount;
    private String customerCode;

    public Contract(){
    }

    public Contract(Long someContracts, String bookingCode, Double advanceDepositAmount, Double totalPaymentAmount,
                    String customerCode) {
        this.someContracts = someContracts;
        this.bookingCode = bookingCode;
        this.advanceDepositAmount = advanceDepositAmount;
        this.totalPaymentAmount = totalPaymentAmount;
        this.customerCode = customerCode;
    }

    public Long getSomeContracts() {
        return someContracts;
    }

    public void setSomeContracts(Long someContracts) {
        this.someContracts = someContracts;
    }

    public String getBookingCode() {
        return bookingCode;
    }

    public void setBookingCode(String bookingCode) {
        this.bookingCode = bookingCode;
    }

    public Double getAdvanceDepositAmount() {
        return advanceDepositAmount;
    }

    public void setAdvanceDepositAmount(Double advanceDepositAmount) {
        this.advanceDepositAmount = advanceDepositAmount;
    }

    public Double getTotalPaymentAmount() {
        return totalPaymentAmount;
    }

    public void setTotalPaymentAmount(Double totalPaymentAmount) {
        this.totalPaymentAmount = totalPaymentAmount;
    }

    public String getCustomerCode() {
        return customerCode;
    }

    public void setCustomerCode(String customerCode) {
        this.customerCode = customerCode;
    }

    @Override
    public String toString() {
        return "Contract{" +
                "someContracts=" + someContracts +
                ", bookingCode='" + bookingCode + '\'' +
                ", advanceDepositAmount=" + advanceDepositAmount +
                ", totalPaymentAmount=" + totalPaymentAmount +
                ", customerCode='" + customerCode + '\'' +
                '}';
    }
    public String getInFoContract(){
        return this.getSomeContracts() + COMMA + this.getBookingCode() + COMMA + this.getAdvanceDepositAmount() +
                COMMA + this.getTotalPaymentAmount() + COMMA + this.getCustomerCode();
    }
}
