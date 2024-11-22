package com.hexaware.loanmanagementsystem.service;

import java.util.List;
import com.hexaware.loanmanagementsystem.entity.Loan;
import com.hexaware.loanmanagementsystem.exceptions.InvalidLoanException;

public interface ILoanSystemService {

    // Apply for a loan
    void applyLoan(Loan loan) throws InvalidLoanException, Exception;

    // Calculate interest for a loan
    double calculateInterest(int loanId) throws InvalidLoanException;

    // Get loan status
    String loanStatus(int loanId) throws InvalidLoanException;

    // Calculate EMI for a loan
    double calculateEMI(int loanId) throws InvalidLoanException;

    // Handle loan repayment
    void loanRepayment(int loanId, double amount) throws InvalidLoanException, InvalidLoanException;

    // Get all loans
    List<Loan> getAllLoans() throws Exception;

    // Get loan by ID
    Loan getLoanById(int loanId) throws InvalidLoanException;
}
