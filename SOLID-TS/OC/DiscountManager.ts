import { Discount } from "./Discount";
// Discount Manager for handling different discount strategy with unified code.

export class DiscountManager{
    private discount: Discount;

    constructor(discount:Discount){
        this.discount = discount;
    }

    applyDiscount(price:number):void{
        const discountedPrice:number = this.discount.applyDiscount(price);
        console.log("Original Price - ",price);
        console.log("Discounted Price - ",discountedPrice);
    }
}