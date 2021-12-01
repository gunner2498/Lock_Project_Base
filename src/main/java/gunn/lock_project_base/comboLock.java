/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gunn.lock_project_base;

/*

Name; Gavin Gunn
Class; Grade 12 Com Studies
Date; 01/12/21
Assignment#; 3
Description; A lock Object
 */
public class comboLock {

    private int combo1;
    private int combo2;
    private int combo3;
    private boolean locked = false;

    public comboLock() {
        combo1 = 0;
        combo2 = 0;
        combo3 = 0;
    }

    public comboLock(int c1, int c2, int c3) {
        setCombo(c1, c2, c3);
    }

    public boolean isLocked() {
        return locked;
    }

    public void setCombo(int c1, int c2, int c3) {

        combo1 = c1;
        combo2 = c2;
        combo3 = c3;
    }

    public boolean checkCombo(int c1, int c2, int c3) {
        if (c1 == combo1 && c2 == combo2 && c3 == combo3) {
            locked = false;
            return true;
        } else {
            return false;
        }
    }

    public void lock() {
        locked = true;
    }
}
