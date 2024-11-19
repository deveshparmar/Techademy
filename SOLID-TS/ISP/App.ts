import { BankHandler } from "./BankHandler";
import { CreditCardHandler } from "./CreditCardHandler";
import { UPIHandler } from "./UPIHandler";

// CreditCardHandler instance and use its methods
const creditCardHandler = new CreditCardHandler();
creditCardHandler.validateCardDetails("1234567812345678", "12/25");
creditCardHandler.authorize(100);
creditCardHandler.process(100);
creditCardHandler.chargeInterest(100);
creditCardHandler.refund(50);

// UPIHandler instance and use its methods
const payPalHandler = new UPIHandler();
payPalHandler.linkUPIAccount("abc@upi");
payPalHandler.validateUPIAccount("abc@upi");
payPalHandler.authorize(200);
payPalHandler.process(200);
payPalHandler.refund(100);

// BankHandler instance and use its methods
const bankTransferHandler = new BankHandler();
bankTransferHandler.initiateTransfer("1234567890", "0011223344");
bankTransferHandler.verifyBankDetails("1234567890");
bankTransferHandler.authorize(500);
bankTransferHandler.process(500);
bankTransferHandler.refund(200);
