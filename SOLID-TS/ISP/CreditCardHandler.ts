import { CreditCardPayment } from "./CreditCardPayment";

// Concrete implementation for Credit Card Payment handling
export class CreditCardHandler implements CreditCardPayment {
    authorize(amount: number): void {
        console.log(`Authorizing credit card payment of Rs.${amount}`);
    }

    process(amount: number): void {
        console.log(`Processing credit card payment of Rs.${amount}`);
    }

    refund(amount: number): void {
        console.log(`Refunding credit card payment of Rs.${amount}`);
    }

    validateCardDetails(cardNumber: string, expiryDate: string): boolean {
        console.log(`Validating credit card details for card ${cardNumber}`);
        // Simulating card validation
        return cardNumber.length === 16 && expiryDate.length === 5;
    }

    chargeInterest(amount: number): void {
        console.log(`Charging interest on credit card payment of $${amount}`);
    }
}