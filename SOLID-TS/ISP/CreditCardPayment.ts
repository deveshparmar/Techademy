import { Payment } from "./Payment";
// Credit Card Payment-specific interface

export interface CreditCardPayment extends Payment {
    validateCardDetails(cardNumber: string, expiryDate: string): boolean;
    chargeInterest(amount: number): void;
}