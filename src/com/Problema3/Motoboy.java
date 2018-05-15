/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Problema3;

/**
 *
 * @author daniel
 */
public class Motoboy {
    
    private static Motoboy m;

    private Motoboy() {
        
    }
    
    public static Motoboy getInstance() {
        if (m == null) {
            m = new Motoboy();
        }
        return m;
    }
    
}
