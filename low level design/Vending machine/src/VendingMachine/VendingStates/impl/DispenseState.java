package VendingMachine.VendingStates.impl;

import VendingMachine.VendingMachine;
import VendingMachine.Coin;
import VendingMachine.Items;
import VendingMachine.VendingStates.States;

import java.util.List;

public class DispenseState implements States {
    
    DispenseState(VendingMachine machine, int code){
        System.out.println("Currently vending machine is in dispense state");
    }

    @Override
    public void clickOnInsertCoinButton(VendingMachine machine) throws Exception {
        throw new Exception("No coin be inserted in dispense state");
    }

    @Override
    public int getChange(int returnChangeMoney) throws Exception {
        throw new Exception("No change to be returned in dispense state");
    }

    @Override
    public void updateInventory(VendingMachine machine, Items item, int code) throws Exception {
        throw new Exception("Inventory cannot be updated in dispense state");
    }

    @Override
    public List<Coin> refundFullMoney(VendingMachine machine) throws Exception {
        throw new Exception("No money to be refunded in dispense state");
    }

    @Override
    public Items dispenseProduct(VendingMachine machine, int code) throws Exception {
        return null;
    }

    @Override
    public void chooseProduct(VendingMachine machine, int code) throws Exception {
        throw new Exception("No product can be selected in dispense state");
    }

    @Override
    public void insertCoin(VendingMachine machine, Coin coin) throws Exception {
        throw new Exception("No coin be inserted in dispense state");
    }

    @Override
    public void clickOnStartProductSelectionButton(VendingMachine machine) throws Exception {
        throw new Exception("No product to be selected in dispense state");
    }
}
