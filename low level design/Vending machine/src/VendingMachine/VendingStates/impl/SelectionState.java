package VendingMachine.VendingStates.impl;

import VendingMachine.VendingMachine;
import VendingMachine.Coin;
import VendingMachine.Items;
import VendingMachine.VendingStates.States;

import java.util.List;

public class SelectionState implements States{
    @Override
    public void clickOnInsertCoinButton(VendingMachine machine) throws Exception {
        
    }

    @Override
    public void clickOnStartProductSelectionButton(VendingMachine machine) throws Exception {

    }

    @Override
    public void insertCoin(VendingMachine machine, Coin coin) throws Exception {

    }

    @Override
    public void chooseProduct(VendingMachine machine, int code) throws Exception {

    }

    @Override
    public int getChange(int returnChangeMoney) throws Exception {
        return 0;
    }

    @Override
    public void updateInventory(VendingMachine machine, Items item, int code) throws Exception {

    }

    @Override
    public List<Coin> refundFullMoney(VendingMachine machine) throws Exception {
        return null;
    }

    @Override
    public Items dispenseProduct(VendingMachine machine, int code) throws Exception {
        return null;
    }
}
