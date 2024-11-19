// discount interface with apply discount method , to be implemented by different discount strategy

export interface Discount{
    applyDiscount(price:number): number
}