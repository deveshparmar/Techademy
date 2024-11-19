import { Payment } from "./Payment";
// Bank Payment-specific interface

export interface BankPayment extends Payment {
    initiateTransfer(accountNumber: string, routingNumber: string): void;
    verifyBankDetails(accountNumber: string): boolean;
}