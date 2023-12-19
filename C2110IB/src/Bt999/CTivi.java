/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bt999;

/**
 *
 * @author admin
 */
public class CTivi {
    String[] channelList;
    boolean isOn;
    String currentChannel;

    public CTivi() {
        isOn=false; 
        channelList = new String[] {"VTV1","VTV2","VTV3" };
        currentChannel="VTV1";
    }

    public CTivi(String[] channelList) {
        this.channelList = channelList;
        isOn=false;
        
        currentChannel =this.channelList[0];
    }
    
    
    
}
