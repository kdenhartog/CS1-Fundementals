package edu.purdue.cs.cs180.server;

import java.util.ArrayList;
import java.util.Scanner;

import edu.purdue.cs.cs180.channel.Channel;
import edu.purdue.cs.cs180.channel.ChannelException;
import edu.purdue.cs.cs180.channel.MessageListener;
import edu.purdue.cs.cs180.channel.TCPChannel;
import edu.purdue.cs.cs180.common.Message;

/**
 * The server class, a console application, that receives messages from Requests
 * and Responses, regardless of their location and sends replies accordingly.
 * 
 * The protocol as follow: <tt>When it receives a
 * Request: 
 * 	When there are no volunteers available, it replies with a message
 *   that says Searching: 
 * 	When there is a volunteer available, it will send 2
 *   messages, the first to the volunteer as follows: Assigned:The location to go
 *   to, and the second to the student requesting the ride as follows:
 *   Assigned:Help Team X 
 * 
 * Similarly, when it receives a Response message: 
 * 	When there are no students requesting rides, it replies with a message that says
 *   Searching: 
 *  When there is a student requesting a ride, it will send 2
 *   messages, the first to the volunteer as follows: Assigned:The location to go
 *   to, and the second to the student requesting the ride as follows:
 *   Assigned:Help Team X
 * </tt>
 * 
 * @author fmeawad
 * 
 */
public class Server implements MessageListener {

	/**
	 * The server channel.
	 */
	private Channel channel = 8264; //port number

	/**
	 * The server constructor only needs a port.
	 * 
	 * @param port
	 */
	private static String fcfs = "FCFS"; //string for first come first serve
	private static String closest = "Closest";// String for closest
	private static String urgency = "Urgency"; // String for urgency
	private static ArrayList<String> methods = new ArrayList<String>();// Arraylist that stores the type of request inputted by the user
	private static ArrayList<String> names = new ArrayList<String>(); // Store the name of the studen
	private static ArrayList<String> locationsForPickup = new ArrayList<String>();// stores the locations of pickup 
	private static String pickRequest; //string to declare type of request
	
	public Server(int port, String pickrequest) {
		String[] request = new String[3];
		if(pickrequest.equals(fcfs){
			
		}
		channel = new TCPChannel(port);
		channel.setMessageListener(this);
		
		
	}
	// figure out which request type to choose based on what the server recieves
	public void setAlgorithm(){
		if(pickRequest.equals("FCFS"){
			methods.remove(0);
		}
		else if(pickRequest.equals("Closest"))
		{
			methods.remove();  
		}
		else if(pickRequest.equals("Urgency"))
		{
			methods.remove();
		}
	}

	/**
	 * Maintains the pending requests.
	 */
	private ArrayList<Message> pendingRequesters = new ArrayList<Message>();
	/**
	 * Maintains the pending responses.
	 */
	private ArrayList<Message> pendingResponders = new ArrayList<Message>();
	
	

	/**
	 * Handles the messages, called from messageReceived. Designed to handle one
	 * of 2 scenarios. If we receive a request, or if we receive a response, the
	 * caller should maintain the from and to relation appropriately.
	 * 
	 * @param message
	 * @param from
	 * @param to
	 */
	//handles the messsage that was recieved frrom the request activity
	private void messageHandler(Message message, ArrayList<Message> from,	
			ArrayList<Message> to) {
		assert (message != null);
		assert (from != null);
		assert (to != null);
		if (from.size() > 0) {
			Message responderMessage = from.remove(0);
			try {
				channel.sendMessage(
						new Message(Message.Type.Assigned, message.getInfo(),
								responderMessage.getClientID()).toString(),
						responderMessage.getClientID());
              
				channel.sendMessage(new Message(Message.Type.Assigned,
						responderMessage.getInfo(), message.getClientID())
						.toString(), message.getClientID());
				methods.add(responderMessage.getType().toString());  // adds the type of request to the methods array to store it 
			   
				
			
			} catch (ChannelException e) {
				e.printStackTrace();
				System.exit(1);
			}
		} else {
			to.add(message);
			try {
				channel.sendMessage(new Message(Message.Type.Searching, "",
						message.getClientID()).toString(), message
						.getClientID());
			} catch (ChannelException e) {
				e.printStackTrace();
				System.exit(1);
			}
		}
	}

	/**
	 * Handle messages received.
	 */
	@Override
	public void messageReceived(String messageString, int clientID) {
		assert (messageString != null);
		System.out.println(clientID + ": " + messageString); // For debugging
																// only, not
																// required.
		Message message = new Message(messageString, clientID);
		switch (message.getType()) {
		case Request:
			messageHandler(message, pendingResponders, pendingRequesters);
			break;
		case Response:
			messageHandler(message, pendingRequesters, pendingResponders);
			break;
		default:
			System.err.println("Unexpected message of type "
					+ message.getType());
			break;
		}
	}

	/**
	 * The server expects a port number as an argument.
	 * 
	 * @param args Expects a port number.
	 */
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in); // reads in which type of request to choose
		System.out.println("choose FCFS, Closest, or Urgency");
		String pickRequest = sc.next();
		
		
		new Server(Integer.parseInt(args[0]), pickRequest);
	}
}
