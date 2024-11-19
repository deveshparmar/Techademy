import { BankPayment } from "./BankPayment";
// Concrete implementation for Bank Transfer Payment handling

export class BankHandler implements BankPayment {
    authorize(amount: number): void {
        console.log(`Authorizing bank transfer of $${amount}`);
    }

    process(amount: number): void {
        console.log(`Processing bank transfer payment of $${amount}`);
    }

    refund(amount: number): void {
        console.log(`Refunding bank transfer payment of $${amount}`);
    }

    initiateTransfer(accountNumber: string, routingNumber: string): void {
        console.log(`Initiating bank transfer from account ${accountNumber} with routing number ${routingNumber}`);
    }

    verifyBankDetails(accountNumber: string): boolean {
        console.log(`Verifying bank account number: ${accountNumber}`);
        // Simulating bank account verification
        return accountNumber.length === 10;
    }
}