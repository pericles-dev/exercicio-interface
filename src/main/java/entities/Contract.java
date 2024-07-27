package entities;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Contract {
    private Integer number;
    private LocalDate date;
    private Double totalVlue;
    private List<Installment> installments = new ArrayList<>();

    public Contract(Integer number, LocalDate date, Double totalVlue) {
        this.number = number;
        this.date = date;
        this.totalVlue = totalVlue;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public Double getTotalVlue() {
        return totalVlue;
    }

    public void setTotalVlue(Double totalVlue) {
        this.totalVlue = totalVlue;
    }

    public List<Installment> getInstallments() {
        return installments;
    }
}
