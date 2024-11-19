import { Discount } from "./Discount";
// Tired discount strategy for applying discount in different price tiers

export class TieredDiscount implements Discount {

    applyDiscount(price: number): number {
        let discountedPrice: number = 0;
        if (price > 500) {
            discountedPrice = price - (price * 0.05)   // 5% discount
        } 
        else if (price > 1000) {
            discountedPrice = price - (price * 0.20);   // 20% discount
        }
        else if (price > 2000) {
            discountedPrice = price - (price * 30);   // 30% discount
        }

        return discountedPrice;
    }

}