package interfacesegregationprinciple;


import interfacesegregationprinciple.Athlete;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author wuser
 */public interface JumpingAthlete extends Athlete {
    void highJump();
    void longJump();
}
