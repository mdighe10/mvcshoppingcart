package org.azure.springmvcshoppingcart.dao;

import org.azure.springmvcshoppingcart.entity.Account;

public interface AccountDAO {
 
    
    public Account findAccount(String userName );
    
}