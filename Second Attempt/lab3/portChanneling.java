/**
* A program that builds a personal network of nearby people so that devices can communicate and share screens in a read only format on a wifi network
*
* @author Kyle Den Hartog
* @date started: 9/22/14
* 
* App Name: unKown
*/

public class portChanneling {
    Port portList[] = new Port();
    public static void main(String[] args){
    
    
    
    }   //ends main
    
    /**
    * tells the device what port to communicate with the router on
    *
    * @param  router_Port   the port assigned by the router open for media communication
    * @param  device_Port   defaulted to 0, return value
    * @return     device_Port
    */
    public int[] connect(int[] router_Port[], int device_Port){
    device_Port = router_Port;
    return device_Port;
    }   //ends connect
    
    /**
    
    
    * finds an open port to communicate with new device 
    *
    * @param    portList[]   a list of all ports
    * @param    usedPorts[]  a list of all ports currently in use
    * @return   the port chosen
    */
    public int[] findPort(int[] usedPorts[]){
    
    }   //ends findPort()
    
    /**
    * A method to send data
    *
    * @param    d the file recieved
    */
    public void data_Recieved(data d){
    // put your code here
    return y;
    }   //ends data_Recieved()
    
    /**
    * A method to recieve data
    *
    * @param    d the file you wish to send
    */
    public void sent_Data(data d){
    // put your code here
    return y;
    }   //ends sent_Data()
    
    /**
    * A method to draw screen in native format
    * 
    * @param    screenShare - the screen to be shared with all other devices
    */
    public int share_Screen(Screen screenShare){
    // put your code here
    return y;
    }   //ends share_Screen()

}   //ends class