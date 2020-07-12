/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package opencloseprinciple;

/**
 *
 * @author wuser
 */ 
public class Circle implements Shape{
    public double radius;
    public double calculateArea(){
        return (22/7)*radius*radius;
    }
}