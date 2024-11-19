import { Discount } from "./Discount";
// Percentage discount strategy for applying discount according to goven percentage

export class PercentageDiscount implements Discount {
    public readonly percentage: number;

    constructor(percentage: number) {
        this.percentage = percentage;
    }
    applyDiscount(price: number): number {
        return price - (price*(this.percentage)/100);
    }

}