import { Payment } from "./Payment";
// UPI Payment-specific interface

export interface UPIPayment extends Payment {
    linkUPIAccount(upiId: string): void;
    validateUPIAccount(upiId: string): boolean;
}