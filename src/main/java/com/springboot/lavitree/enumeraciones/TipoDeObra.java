/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.springboot.lavitree.enumeraciones;

/**
 *
 * @author Emir
 */
public enum TipoDeObra {
    PINTURA, ESCULTURA, FOTOGRAFIA, ILUSTRACION, DIGITAL, INTERVENCION;

    @Override
    public String toString() {
        return name().toLowerCase();
    }
}
