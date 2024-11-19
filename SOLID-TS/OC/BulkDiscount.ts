import { Discount } from "./Discount";
// Bulk discount strategy for more number of schools

export class BulkDiscount implements Discount {
    private readonly noOfSchools: number;

    constructor(noOfSchools: number) {
        this.noOfSchools = noOfSchools;
    }
    applyDiscount(price: number): number {
        if (this.noOfSchools > 5) {
            return price - (price * 0.25);
        } else {
            return price
        }
    }

}