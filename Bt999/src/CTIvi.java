/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author admin
 */
public class CTIvi {
    private String[] channelList;
    private boolean isOn;
    private String currentChannel;
    private int currentIndex = 0;

    public CTIvi() {
        isOn=false;
        channelList = new String[]{"VTV1", "VTV2", "VTV3"};   
        currentChannel="VTV1";
        currentIndex=0;
    }

    public CTIvi(String[] channelList) {
        this.channelList = channelList;
        isOn=false;
        if(channelList.length > 0) {
            currentChannel = channelList[0];
            currentIndex = 0;
        }
    }
    
    
    
}
