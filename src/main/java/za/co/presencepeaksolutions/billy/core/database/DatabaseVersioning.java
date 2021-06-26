/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.co.presencepeaksolutions.billy.core.database;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author clinton
 */
public class DatabaseVersioning {
    private int dbVersion = 0;
    
    private List<String> version = new ArrayList<String>();
    
    DatabaseVersioning()
    {
        // 1. Create Schema
        version.add("CREATE SCHEMA `Billy`");
        
    }
    
}
