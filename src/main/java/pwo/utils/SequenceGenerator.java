/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package pwo.utils;

import java.math.BigDecimal;

/**
 *
 * @author dariusz
 */
public interface SequenceGenerator {

    void reset();

    BigDecimal nextTerm();
    BigDecimal previousTerm();
    BigDecimal getTerm(int i);
}
