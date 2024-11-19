// Common Payment Method interface

export interface Payment {
    authorize(amount: number): void;
    process(amount: number): void;
    refund(amount: number): void;
}