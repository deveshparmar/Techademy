import { UPIPayment } from "./UPIPayment";

// Concrete implementation for UPI Payment handling
export class UPIHandler implements UPIPayment {
    authorize(amount: number): void {
        console.log(`Authorizing UPI payment of $${amount}`);
    }

    process(amount: number): void {
        console.log(`Processing UPI payment of $${amount}`);
    }

    refund(amount: number): void {
        console.log(`Refunding UPI payment of $${amount}`);
    }

    linkUPIAccount(upiId: string): void {
        console.log(`Linking UPI account: ${upiId}`);
    }

    validateUPIAccount(upiId: string): boolean {
        console.log(`Validating UPI account: ${upiId}`);
        // Simulating UPI account validation
        return upiId.endsWith("@upi");
    }
}