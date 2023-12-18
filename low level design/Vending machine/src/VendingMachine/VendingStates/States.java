package VendingMachine.VendingStates;

import VendingMachine.VendingMachine;
import VendingMachine.Coin;
import VendingMachine.Items;

import java.util.List;

public interface States {
    
    public void clickOnInsertCoinButton(VendingMachine machine) throws Exception;
    
    public void clickOnStartProductSelectionButton(VendingMachine machine) throws Exception;
    
    public void insertCoin(VendingMachine machine, Coin coin) throws Exception;
    
    public void chooseProduct(VendingMachine machine, int code) throws Exception;
    
    public int getChange(int returnChangeMoney) throws Exception;
    
    public Items dispenseProduct(VendingMachine machine, int code) throws Exception;
    
    public List<Coin> refundFullMoney(VendingMachine machine) throws Exception;
    
    public void updateInventory(VendingMachine machine, Items item, int code) throws Exception;
            
}
