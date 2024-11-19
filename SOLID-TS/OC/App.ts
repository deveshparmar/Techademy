import { BulkDiscount } from "./BulkDiscount";
import { Discount } from "./Discount";
import { DiscountManager } from "./DiscountManager";
import { PercentageDiscount } from "./PercentageDiscount";
import { TieredDiscount } from "./TieredDiscount";

const percentageDiscount: Discount = new PercentageDiscount(15);  // applying 15% discount
const tieredDiscount: Discount = new TieredDiscount();
const bulkDiscount: Discount = new BulkDiscount(6); // bulk discount for schools > 5 

let manager:DiscountManager;

manager = new DiscountManager(percentageDiscount);
manager.applyDiscount(2000);

manager = new DiscountManager(tieredDiscount);
manager.applyDiscount(2000);

manager = new DiscountManager(bulkDiscount);
manager.applyDiscount(2000);